package com.example.helloworld.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import java.util.HashSet;
import java.util.Set;
//import java.lang.String;


//import android.os.Bundle;


public class MainActivity3 extends Activity {
    public static final String APP_PREFERENCES = "mySettings";
    public static final String APP_PREFERENCES_PARTITION = "Partition";
    public static final String APP_PREFERENCES_PLACE = "Place";
    public static final String APP_PREFERENCES_COST = "Cost";
    public static final String APP_PREFERENCES_D = "Date_with";
    public static final String APP_PREFERENCES_DTO = "Date_to";
    static int flag = 0;

    /*String s_part;
    String s_place;
    String s_pay;
    String s_date_with;
    String s_date_to;*/

    String mas_partition;
    String mas_place;
    String mas_cost;
    String mas_date_with;
    String mas_date_to;

    SharedPreferences mSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mSettings = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity3, menu);
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

    public void AddNote(View button) {

        flag++;
        EditText part = (EditText) findViewById(R.id.editText9);
        EditText place = (EditText) findViewById(R.id.editText2);
        EditText pay = (EditText) findViewById(R.id.editText5);
        EditText date_with = (EditText) findViewById(R.id.editText6);
        EditText date_to = (EditText) findViewById(R.id.editText7);

        Set<String> mas_partition = new HashSet<String>();
        Set<String> mas_place = new HashSet<String>();
        Set<String> mas_cost = new HashSet<String>();
        Set<String> mas_date_with = new HashSet<String>();
        Set<String> mas_date_to = new HashSet<String>();



        if (flag > 1)
        {
        mas_partition = mSettings.getStringSet("Partition", new java.util.HashSet<String>());
        mas_place = mSettings.getStringSet("Place", new java.util.HashSet<String>());
        mas_cost = mSettings.getStringSet("Cost", new java.util.HashSet<String>());
        mas_date_with = mSettings.getStringSet("Date_with", new java.util.HashSet<String>());
        mas_date_to = mSettings.getStringSet("Date_to", new java.util.HashSet<String>());
        }

        String s_part = part.getText().toString();
        String s_place = place.getText().toString();
        String s_pay = pay.getText().toString();
        String s_date_with = date_with.getText().toString();
        String s_date_to = date_to.getText().toString();

        mas_partition.add(s_part);
        mas_place.add(s_place);
        mas_cost.add(s_pay);
        mas_date_with.add(s_date_with);
        mas_date_to.add(s_date_to);

        Editor editor = mSettings.edit();
        editor.putStringSet(APP_PREFERENCES_PARTITION, mas_partition);
        editor.putStringSet(APP_PREFERENCES_PLACE, mas_place);
        editor.putStringSet(APP_PREFERENCES_COST, mas_cost);
        editor.putStringSet(APP_PREFERENCES_D, mas_date_with);
        editor.putStringSet(APP_PREFERENCES_DTO, mas_date_to);
        editor.apply();

        /*Intent intent = new Intent(this, Base.class);
        intent.putExtra("partition", part.getText().toString());
        intent.putExtra("place", place.getText().toString());
        intent.putExtra("pay", pay.getText().toString());
        intent.putExtra("date_with", part.getText().toString());
        intent.putExtra("date_to", part.getText().toString());
        startActivity(intent);*/

        /*DbOpenHelper dbOpenHelper = new DbOpenHelper(TestActivity.this);
        SQLiteDatabase db = dbOpenHelper.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(DbOpenHelper.LOGIN,loginEditText.getText().toString());
        cv.put(DbOpenHelper.PASSW,passEditText.getText().toString());
        db.insert(DbOpenHelper.TABLE_NAME,null,cv);
        db.close();
        loginEditText.setText("");
        passEditText.setText("");*/

   //EditText ed1 = (EditText)findViewById()
}
}
