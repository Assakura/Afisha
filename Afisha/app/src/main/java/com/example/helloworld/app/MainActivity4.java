package com.example.helloworld.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.content.SharedPreferences;
//import android.content.SharedPreferences.Editor;

import java.util.HashSet;
import java.util.Set;

public class MainActivity4 extends Activity {

    /*public static final String APP_PREFERENCES = "mySettings2";
    String mas_part2;
    static int flag = 0;
    SharedPreferences mSettings2;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
       // mSettings2 = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE);

        TextView part = (TextView) findViewById(R.id.textView);
        //EditText part2 = (EditText) findViewById(R.id.editText2);
        //EditText part3 = (EditText) findViewById(R.id.editText3);
        //Set<String> mas_part = new HashSet<String>();

        /*Set<String> mas_part2 = new HashSet<String>();

        mas_part2 = mSettings2.getStringSet("Partition", new java.util.HashSet<String>());
*/
        /*for (String s: mas_part2)
        {
            flag++;
            if (flag>3) break;
            if (flag == 1)
                part.setText(s);
            //else if (flag==2)
            //    part2.setText(s);
            //else
            //    part3.setText(s);
        }*/
        part.setText("Games");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity4, menu);
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

}
