package com.example.s46c.test_call;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    String number = "18008198";
    Button mybutton;
    Button mybutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting the edittext and button instance
        //edittext1=(EditText)findViewById(R.id.editText1);
        mybutton=(Button)findViewById(R.id.button);
        mybutton1=(Button)findViewById(R.id.button2);

       mybutton.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent callIntent = new Intent(Intent.ACTION_CALL);
               callIntent.setData(Uri.parse("tel:"+number));
               startActivity(callIntent);

           }
       });
       //ket thuc goi
        mybutton1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+number));
                stopService(callIntent);

            }
        });
//Performing action on button click


    }


}
