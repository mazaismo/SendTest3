package com.example.modris.sendtest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.example.modris.sendtest2.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

 class SendEmail extends AppCompatActivity {

    String[] To;
    String Subject;
    String Message;

    SendEmail(String To, String Subject, String Message) {

         this.To[1] = To;
         this.Subject = Subject;
         this.Message = Message;

    }
    public static void Send() {
        SendEmail sm = new SendEmail("brainstormer57@gmail.com", "Test",
                "this is a default message");
                Intent ok = new Intent(Intent.ACTION_SEND);
               ok.putExtra(Intent.EXTRA_EMAIL, sm.To);
                ok.putExtra(Intent.EXTRA_SUBJECT,sm.Subject);
               ok.putExtra(Intent.EXTRA_TEXT, sm.Message);
                ok.setType("message/rfc822");
//        startActivity(Intent.createChooser(ok, "Choose Mail App"));
    }
}






