package com.example.venky.resultstry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Register extends Activity {
    EditText USER_ID;
    String loginid;
    TextView mTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        USER_ID = (EditText) findViewById(R.id.editText1);



            //Bundle extras1 = getIntent().getExtras();
            //String clicked = extras1.getString("result1");
            //mTextview = (TextView) findViewById(R.id.textView9);
            //mTextview.setText(clicked);


        // mTextview = (TextView)findViewById(R.id.textView9);

        //mTextview.setText(getIntent().getStringExtra("result1"));


        Bundle extras = getIntent().getExtras();
        if(extras!=null) {
            String result = extras.getString("result");

            char[][] resp = new char[70][70];
            char strtochar[] = new char[50];
            strtochar = result.toCharArray();
            int j = 0, k = 0;
            int len = result.length();
            for (int i = 0; i < len; i++) {
                if (strtochar[i] == ',') {
                    j++;
                    k = 0;
                } else {
                    resp[j][k] += strtochar[i];
                    k++;
                }
            }
            if (len <= 50) {
                String str100 = String.valueOf(resp[0]);
                TextView t = new TextView(this);
                t = (TextView) findViewById(R.id.textView9);
                t.setText(str100);
            } else {
                String str1 = String.valueOf(resp[0]);
                String str2 = String.valueOf(resp[1]);
                String str3 = String.valueOf(resp[2]);
                String str4 = String.valueOf(resp[3]);
                String str5 = String.valueOf(resp[4]);
                String str6 = String.valueOf(resp[5]);
                String str7 = String.valueOf(resp[6]);

                String str8 = String.valueOf(resp[7]);
                String str9 = String.valueOf(resp[8]);
                String str10 = String.valueOf(resp[9]);
                String str11 = String.valueOf(resp[10]);
                String str12 = String.valueOf(resp[11]);
                String str13 = String.valueOf(resp[12]);
                String str14 = String.valueOf(resp[13]);

                String str15 = String.valueOf(resp[14]);
                String str16 = String.valueOf(resp[15]);
                String str17 = String.valueOf(resp[16]);
                String str18 = String.valueOf(resp[17]);
                String str19 = String.valueOf(resp[18]);
                String str20 = String.valueOf(resp[19]);
                String str21 = String.valueOf(resp[20]);

                String str22 = String.valueOf(resp[21]);
                String str23 = String.valueOf(resp[22]);
                String str24 = String.valueOf(resp[23]);
                String str25 = String.valueOf(resp[24]);
                String str26 = String.valueOf(resp[25]);
                String str27 = String.valueOf(resp[26]);
                String str28 = String.valueOf(resp[27]);

                String str29 = String.valueOf(resp[28]);
                String str30 = String.valueOf(resp[29]);
                String str31 = String.valueOf(resp[30]);
                String str32 = String.valueOf(resp[31]);
                String str33 = String.valueOf(resp[32]);
                String str34 = String.valueOf(resp[33]);
                String str35 = String.valueOf(resp[34]);

                String str36 = String.valueOf(resp[35]);
                String str37 = String.valueOf(resp[36]);
                String str38 = String.valueOf(resp[37]);
                String str39 = String.valueOf(resp[38]);
                String str40 = String.valueOf(resp[39]);
                String str41 = String.valueOf(resp[40]);
                String str42 = String.valueOf(resp[41]);

                String str43 = String.valueOf(resp[42]);
                String str44 = String.valueOf(resp[43]);
                String str45 = String.valueOf(resp[44]);
                String str46 = String.valueOf(resp[45]);
                String str47 = String.valueOf(resp[46]);
                String str48 = String.valueOf(resp[47]);
                String str49 = String.valueOf(resp[48]);

                String str50 = String.valueOf(resp[49]);
                String str51 = String.valueOf(resp[50]);
                String str52 = String.valueOf(resp[51]);
                String str53 = String.valueOf(resp[52]);
                String str54 = String.valueOf(resp[53]);
                String str55 = String.valueOf(resp[54]);
                String str56 = String.valueOf(resp[55]);
                String str57 = String.valueOf(resp[56]);
                String str58 = String.valueOf(resp[57]);

                String str59 = String.valueOf(resp[58]);
                String str60 = String.valueOf(resp[59]);
                String str61 = String.valueOf(resp[60]);


                TextView t = new TextView(this);

                t = (TextView) findViewById(R.id.textview91);
                t.setText(str1);
                t = (TextView) findViewById(R.id.textview92);
                t.setText(str2);
                t = (TextView) findViewById(R.id.textview93);
                t.setText(str3);
                t = (TextView) findViewById(R.id.textview94);
                t.setText(str4);
                t = (TextView) findViewById(R.id.textview95);
                t.setText(str5);
                t = (TextView) findViewById(R.id.textview96);
                t.setText(str6);
                t = (TextView) findViewById(R.id.textview97);
                t.setText(str7);


                t = (TextView) findViewById(R.id.textview81);
                t.setText(str8);
                t = (TextView) findViewById(R.id.textview82);
                t.setText(str9);
                t = (TextView) findViewById(R.id.textview83);
                t.setText(str10);
                t = (TextView) findViewById(R.id.textview84);
                t.setText(str11);
                t = (TextView) findViewById(R.id.textview85);
                t.setText(str12);
                t = (TextView) findViewById(R.id.textview86);
                t.setText(str13);
                t = (TextView) findViewById(R.id.textview87);
                t.setText(str14);

                t = (TextView) findViewById(R.id.textview71);
                t.setText(str15);
                t = (TextView) findViewById(R.id.textview72);
                t.setText(str16);
                t = (TextView) findViewById(R.id.textview73);
                t.setText(str17);
                t = (TextView) findViewById(R.id.textview74);
                t.setText(str18);
                t = (TextView) findViewById(R.id.textview75);
                t.setText(str19);
                t = (TextView) findViewById(R.id.textview76);
                t.setText(str20);
                t = (TextView) findViewById(R.id.textview77);
                t.setText(str21);

                t = (TextView) findViewById(R.id.textview61);
                t.setText(str22);
                t = (TextView) findViewById(R.id.textview62);
                t.setText(str23);
                t = (TextView) findViewById(R.id.textview63);
                t.setText(str24);
                t = (TextView) findViewById(R.id.textview64);
                t.setText(str25);
                t = (TextView) findViewById(R.id.textview65);
                t.setText(str26);
                t = (TextView) findViewById(R.id.textview66);
                t.setText(str27);
                t = (TextView) findViewById(R.id.textview67);
                t.setText(str28);

                t = (TextView) findViewById(R.id.textview51);
                t.setText(str29);
                t = (TextView) findViewById(R.id.textview52);
                t.setText(str30);
                t = (TextView) findViewById(R.id.textview53);
                t.setText(str31);
                t = (TextView) findViewById(R.id.textview54);
                t.setText(str32);
                t = (TextView) findViewById(R.id.textview55);
                t.setText(str33);
                t = (TextView) findViewById(R.id.textview56);
                t.setText(str34);
                t = (TextView) findViewById(R.id.textview57);
                t.setText(str35);

                t = (TextView) findViewById(R.id.textview41);
                t.setText(str36);
                t = (TextView) findViewById(R.id.textview42);
                t.setText(str37);
                t = (TextView) findViewById(R.id.textview43);
                t.setText(str38);
                t = (TextView) findViewById(R.id.textview44);
                t.setText(str39);
                t = (TextView) findViewById(R.id.textview45);
                t.setText(str40);
                t = (TextView) findViewById(R.id.textview46);
                t.setText(str41);
                t = (TextView) findViewById(R.id.textview47);
                t.setText(str42);

                t = (TextView) findViewById(R.id.textview21);
                t.setText(str43);
                t = (TextView) findViewById(R.id.textview22);
                t.setText(str44);
                t = (TextView) findViewById(R.id.textview23);
                t.setText(str45);
                t = (TextView) findViewById(R.id.textview24);
                t.setText(str46);
                t = (TextView) findViewById(R.id.textview25);
                t.setText(str47);
                t = (TextView) findViewById(R.id.textview26);
                t.setText(str48);
                t = (TextView) findViewById(R.id.textview27);
                t.setText(str49);

                t = (TextView) findViewById(R.id.textview31);
                t.setText(str50);
                t = (TextView) findViewById(R.id.textview32);
                t.setText(str51);
                t = (TextView) findViewById(R.id.textview33);
                t.setText(str52);
                t = (TextView) findViewById(R.id.textview34);
                t.setText(str53);
                t = (TextView) findViewById(R.id.textview35);
                t.setText(str54);
                t = (TextView) findViewById(R.id.textview36);
                t.setText(str55);
                t = (TextView) findViewById(R.id.textview37);
                t.setText(str56);

                t = (TextView) findViewById(R.id.textview98);
                t.setText(str57);
                t = (TextView) findViewById(R.id.textview99);
                t.setText(str58);

                t = (TextView) findViewById(R.id.textview18);
                t.setText(str59);
                t = (TextView) findViewById(R.id.textview15);
                t.setText(str60);
                t = (TextView) findViewById(R.id.textview13);
                t.setText(str61);
            }
        }



    }



    public void submit(View view)
    {
        loginid = USER_ID.getText().toString();

        String method = "login";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method, loginid);


    }

}
