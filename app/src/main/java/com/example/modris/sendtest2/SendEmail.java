package com.example.modris.sendtest2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;

import java.io.File;


public class SendEmail {

   private String mail;
   private String subj;
   private String mess;
   private String pat;
   private Context con;

    public SendEmail(String mailAdr, String filePath, String subject, String message, Context context) {

         mail = mailAdr;
         subj = subject;
         mess = message;
         pat = filePath;
         con = context;

    }
    public void Send() {
               Intent ok = new Intent(Intent.ACTION_SEND);
        ok.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(pat)));
       ok.setType("text/plain");
               ok.putExtra(Intent.EXTRA_EMAIL, new String[] { mail });
                ok.putExtra(Intent.EXTRA_SUBJECT,subj);
               ok.putExtra(Intent.EXTRA_TEXT, mess);
                ok.setType("message/rfc822");

                con.startActivity(ok);
    }
}






