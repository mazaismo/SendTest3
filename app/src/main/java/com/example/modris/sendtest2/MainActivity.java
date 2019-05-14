package com.example.modris.sendtest2;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    SendEmail sm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("main", " 1");

//        Intent ok = new Intent(this, MainActivity.class);


        sm = new SendEmail("brainstormer57@gmail.com", "Test",
                "this is a default message");
        setContentView(R.layout.activity_main);
        EditText Message  = (EditText)findViewById(R.id.txtMsg);
        Button btn = (Button)findViewById(R.id.btnSend);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sm.Send();

            }

        });
    }
}



// objekts on create