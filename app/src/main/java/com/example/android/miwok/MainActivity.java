
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Method for opening Numbers
        TextView nm = (TextView) findViewById(R.id.numbers);
        nm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),NumbersActivity.class);
                startActivity(intent);
            }
        });

        //Method for opening phrases
        TextView ph = (TextView) findViewById(R.id.phrases);
        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PhrasesActivity.class);
                startActivity(intent);
            }
        });

        //Method for opening familymembers
        TextView fam = (TextView) findViewById(R.id.family);
        fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),FamilyMembersActivity.class);
                startActivity(intent);
            }
        });

        //Method for opening colours
        TextView col = (TextView) findViewById(R.id.colors);
        col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ColoursActivity.class);
                startActivity(intent);
            }
        });
    }
}
