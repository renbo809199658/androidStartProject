package com.example.ryan.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.content.*;
import android.widget.EditText;

public class MainActivity extends Activity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }

    public void toActionBarActicity(View view) {
        Intent intent = new Intent(this,ActionBarActivity.class);
        startActivity(intent);
    }
}
