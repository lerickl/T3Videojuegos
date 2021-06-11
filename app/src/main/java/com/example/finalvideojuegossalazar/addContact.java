package com.example.finalvideojuegossalazar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class addContact extends AppCompatActivity {
    Button bttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addcontacto);

        Button btn = findViewById(R.id.buttonGuardar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, addcontact));
                // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //         .setAction("Action", null).show();


                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                //setContentView(R.layout.addcontacto);
            }
        });



    }

}
