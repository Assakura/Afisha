package com.example.helloworld.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.RadioButton;

import java.util.HashSet;
import java.util.Set;

public class MainActivity2 extends Activity {

    public static final String APP_PREFERENCES = "mySettings";
    //public static final String APP_PREFERENCES2 = "mySettings2";
    //public static final String APP_PREFERENCES_PARTITION = "Partition";
    //public static final String APP_PREFERENCES_PLACE = "Place";
    //public static final String APP_PREFERENCES_COST = "Cost";
    //public static final String APP_PREFERENCES_D = "Date_with";
    //public static final String APP_PREFERENCES_DTO = "Date_to";
    static int flag = 0;

    String mas_part;
    //String mas_place;
    //String mas_cost;
    //String mas_date_with;
    //String mas_date_to;

    SharedPreferences mSettings, mSettings2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mSettings = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE);
       /// mSettings2 = getSharedPreferences(APP_PREFERENCES2, MODE_PRIVATE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void SearchPlace(View button)
    {

        //flag++;
        EditText part = (EditText) findViewById(R.id.editText5);  //Раздел
        EditText place = (EditText) findViewById(R.id.editText2);
        EditText pay = (EditText) findViewById(R.id.editText5);
        EditText date_with = (EditText) findViewById(R.id.editText6);
        EditText date_to = (EditText) findViewById(R.id.editText7);

        Set<String> mas_part = new HashSet<String>();
        //Set<String> mas_place = new HashSet<String>();
        //Set<String> mas_cost = new HashSet<String>();
        //Set<String> mas_date_with = new HashSet<String>();
        //Set<String> mas_date_to = new HashSet<String>();

        //Set<String> mas_part2 = new HashSet<String>();

        mas_part = mSettings.getStringSet("Partition", new java.util.HashSet<String>());
        //if (flag > 1)
        //{
            //mas_part = mSettings.getStringSet("Partition", new java.util.HashSet<String>());
            //mas_place = mSettings.getStringSet("Place", new java.util.HashSet<String>());
            //mas_cost = mSettings.getStringSet("Cost", new java.util.HashSet<String>());
           //mas_date_with = mSettings.getStringSet("Date_with", new java.util.HashSet<String>());
           // mas_date_to = mSettings.getStringSet("Date_to", new java.util.HashSet<String>());
        //}

        String s_part = part.getText().toString();
        for (String s: mas_part)
        {
            if (s.equals(s_part))
            {
                //mas_part2.add(s);
                //flag++;
                startActivity(new Intent(this, MainActivity4.class));

            }

        }
        /*if (flag > 0)
        {
            Editor editor = mSettings2.edit();
            editor.putStringSet(APP_PREFERENCES_PARTITION, mas_part2);

            editor.apply();
            startActivity(new Intent(this, MainActivity4.class));
        }*/

        //String s_place = place.getText().toString();
        //String s_pay = pay.getText().toString();
        //String s_date_with = date_with.getText().toString();
        //String s_date_to = date_to.getText().toString();

        /*mas_partition.add(s_part);
        mas_place.add(s_place);
        mas_cost.add(s_pay);
        mas_date_with.add(s_date_with);
        mas_date_to.add(s_date_to);*/

        /*Editor editor = mSettings.edit();
        editor.putStringSet(APP_PREFERENCES_PARTITION, mas_partition);
        editor.putStringSet(APP_PREFERENCES_PLACE, mas_place);
        editor.putStringSet(APP_PREFERENCES_COST, mas_cost);
        editor.putStringSet(APP_PREFERENCES_D, mas_date_with);
        editor.putStringSet(APP_PREFERENCES_DTO, mas_date_to);
        editor.apply();*/

    }
    public void Money(View v)
    {
        RadioButton radio1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton radio2 = (RadioButton) findViewById(R.id.radioButton2);
        radio1.setChecked(true);
        radio2.setChecked(false);
    }

    public void NoMoney(View v)
    {
        RadioButton radio1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton radio2 = (RadioButton) findViewById(R.id.radioButton2);
        radio1.setChecked(false);
        radio2.setChecked(true);
    }
}
