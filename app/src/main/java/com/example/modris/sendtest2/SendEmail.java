package com.example.modris.sendtest2;

import android.content.Intent;
import android.content.Context;
import android.os.StrictMode;
import java.io.File;


public class SendEmail {
    private String mail;
    private String subj;
    private String mess;
    private Context con;
    private  File file;
    

    public SendEmail(String mailAdr, String subject, String message, Context context) {
        mail = mailAdr;
        subj = subject;
        mess = message;
        con = context;
        file = new File(con.getFilesDir(),"fileToSend.txt");
    }


    public void Send() {
    try {
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        Intent sendM = new Intent(Intent.ACTION_SEND);
        sendM.putExtra(Intent.EXTRA_EMAIL, new String[]{mail});
        sendM.putExtra(Intent.EXTRA_SUBJECT, subj);
        sendM.putExtra(Intent.EXTRA_TEXT, mess);
        sendM.putExtra(Intent.EXTRA_STREAM, android.net.Uri.fromFile(file));
        sendM.setType("text/plain");
        sendM.setType("message/rfc822");
        con.startActivity(sendM);
        }
    catch (Exception e){

        }
    }
}


