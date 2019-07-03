package com.example.modris.sendtest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btnSend);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R. id.btnSend){
            sendEmail();

        }

    }

    private void sendEmail(){
        SendEmail sm = new SendEmail("brainstormer57@gmail.com", "test message", "test",  this);
        sm.Send();

    }

}




