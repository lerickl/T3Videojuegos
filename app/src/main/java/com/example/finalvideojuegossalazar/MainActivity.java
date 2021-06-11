package com.example.finalvideojuegossalazar;

import android.content.Intent;
import android.os.Bundle;

import com.example.finalvideojuegossalazar.Adapters.ContactAdapter;
import com.example.finalvideojuegossalazar.Models.Contacto;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager mLayoutManager;
    private static RecyclerView mRecyclerView;
    private ContactAdapter mContactAdapter;
    private addContact maddContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//recicler view
        mRecyclerView=  findViewById(R.id.ListaContactos);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager= new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

      //  mContactAdapter = new ContactAdapter(GetAnimes());//liststring
        mRecyclerView.setAdapter(mContactAdapter);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//////////////////////////////////////////////////////////////////////////////
        FloatingActionButton fab = findViewById(R.id.addnewcontact);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, addcontact));
               // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
               //         .setAction("Action", null).show();


                Intent intent = new Intent(getApplicationContext(),addContact.class);
                startActivity(intent);

                //setContentView(R.layout.addcontacto);
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
}