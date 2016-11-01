package com.example.venky.resultstry;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    EditText USER_NAME;
    String name;
    Context ctx;
    //MainActivity(Context ctx){this.ctx = ctx;}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);



    }

    public void user_reg1(View view)
    {
        String clicked = getString(R.string.result1);
        Intent myIntent = new Intent(MainActivity.this,Register.class);
        myIntent.putExtra("result", clicked);
        startActivity(myIntent);
    }

    public void user_reg2(View view)
    {
        String clicked = getString(R.string.result2);
        Intent myIntent = new Intent(MainActivity.this,Register.class);
        myIntent.putExtra("result",clicked);
        startActivity(myIntent);
    }

    public void user_reg3(View view)
    {
        String clicked = getString(R.string.result3);
        Intent myIntent = new Intent(MainActivity.this,Register.class);
        myIntent.putExtra("result", clicked);
        startActivity(myIntent);
    }

    public void user_reg4(View view)
    {
        String clicked = getString(R.string.result4);
        Intent myIntent = new Intent(MainActivity.this,Register.class);
        myIntent.putExtra("result",clicked);
        startActivity(myIntent);
    }

}

