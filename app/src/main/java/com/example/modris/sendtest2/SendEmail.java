package com.example.modris.sendtest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


 public class SendEmail extends AppCompatActivity {

    private String To;
    String Subject;
    String Message;
//    private Intent ok;

    public SendEmail(String To, String Subject, String Message) {

         this.To= To;
         this.Subject = Subject;
         this.Message = Message;
//         this.ok = ok;

    }
    public void Send() {
               Intent ok = new Intent(Intent.ACTION_SEND);
               ok.putExtra(Intent.EXTRA_EMAIL, new String[] { To });
                ok.putExtra(Intent.EXTRA_SUBJECT,Subject);
               ok.putExtra(Intent.EXTRA_TEXT, Message);
                ok.setType("message/rfc822");
        startActivity(ok);
    }
}






