package com.example.shahzaib.setting_toolbar_clone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Settings");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        MenuItem menuItem = menu.findItem(R.id.searchBtn);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search...");
        searchView.setOnQueryTextListener(this);

        return true;
    }


    //Following methods are responsible for geting the text from Search Box in Toolbar
    @Override
    public boolean onQueryTextSubmit(String query) {
        Toast.makeText(getApplicationContext(), query, Toast.LENGTH_SHORT).show();
        return false;
    }
    @Override
    public boolean onQueryTextChange(String newText) {
        Log.i("1234","UserEntered: "+newText);

        return false;
    }
}
