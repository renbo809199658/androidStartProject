package com.example.ryan.myapplication;

import android.app.Activity;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class ActionBarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);

        Toast.makeText(this, "yahaha", Toast.LENGTH_LONG).show();
//        getActionBar().hide();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.main);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch  (item.getItemId()) {
            case 1:
            Intent upIntent =  NavUtils.getParentActivityIntent(this);
           if (NavUtils.shouldUpRecreateTask(this,upIntent)){
               TaskStackBuilder.create(this).addNextIntentWithParentStack(upIntent).startActivities();
           } else {
               upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
           }
        }

        item.setOnActionExpandListener(new MenuItem.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem menuItem) {
                return false;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                return false;
            }
        });
        return super.onOptionsItemSelected(item);
    }
}
