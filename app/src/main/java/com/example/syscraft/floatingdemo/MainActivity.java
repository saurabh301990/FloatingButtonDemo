package com.example.syscraft.floatingdemo;

import android.os.Bundle;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.lzp.floatingactionbuttonplus.FabTagLayout;
import com.lzp.floatingactionbuttonplus.FloatingActionButtonPlus;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fab, fab2, fab3, fab4;
    FloatingActionButtonPlus fab5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        fab5 = (FloatingActionButtonPlus) findViewById(R.id.fab5);


        fab5.setOnItemClickListener(new FloatingActionButtonPlus.OnItemClickListener() {
            @Override
            public void onItemClick(FabTagLayout tagView, int position) {
                Log.e("TAG", "Position is :--" + position);

                switch (position) {
                    case 0:
                        Toast.makeText(getApplicationContext(), "Clicked FAB1", Toast.LENGTH_LONG).show();
                        break;

                    case 1:
                        Toast.makeText(getApplicationContext(), "Clicked FAB2", Toast.LENGTH_LONG).show();
                        break;

                    case 2:
                        Toast.makeText(getApplicationContext(), "Clicked FAB3", Toast.LENGTH_LONG).show();
                        break;

                    case 3:
                        Toast.makeText(getApplicationContext(), "Clicked FAB4", Toast.LENGTH_LONG).show();
                        break;

                    case 4:
                        Toast.makeText(getApplicationContext(), "Clicked FAB5", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        /*switch (v.getId()){
            case R.id.fab2:
                Log.e("TAG","CLICKED");
                Toast.makeText(getApplicationContext(),"Clicked FAB2",Toast.LENGTH_LONG).show();
                break;

            case R.id.fab3:
                Log.e("TAG","CLICKED1");
                Toast.makeText(getApplicationContext(),"Clicked FAB2",Toast.LENGTH_LONG).show();
                break;
        }
    }*/
    }
}
