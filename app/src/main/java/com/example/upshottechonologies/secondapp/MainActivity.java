package com.example.upshottechonologies.secondapp;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener
{

    ListView listView;
    TextView textView;
    ArrayAdapter<String> arrayAdapter;
    Spinner spinner;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview1);
       // spinner = findViewById(R.id.spinner);
       // int ima[]={R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground };
       int ima[] = {R.drawable.a, R.drawable.b, R.drawable.c,R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.a, R.drawable.b};
        final String [] strings = {"Select","Android", "IOS", "WINDOWS", "LINUX", "UNIX", "UBUNTU", "Debian"};
       //arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.list_item_row, R.id.textView, strings);
       //listView.setAdapter(arrayAdapter);
       // arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, strings);
       /* spinner.setAdapter(arrayAdapter);
       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(MainActivity.this, "Selected "+strings[position], Toast.LENGTH_LONG).show();
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });
*/
       myAdapter = new MyAdapter(MainActivity.this, strings, strings, ima);
       listView.setAdapter(myAdapter);
         }
    @Override
    public void onFragmentInteraction(Uri uri){

    }
}
