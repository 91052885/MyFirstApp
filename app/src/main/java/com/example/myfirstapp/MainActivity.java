package com.example.myfirstapp;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private Random rand1;
    private Random rand2;
    private Random rand3;
    private Random rand4;
    private int a;
    private int r;
    private int g;
    private int b;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button Random = (Button) findViewById(R.id.Random);
        Random.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                rand1 = new Random(100);
                a = rand1.nextInt();
                rand2 = new Random(255);
                r = rand2.nextInt();
                rand3 = new Random(255);
                g = rand3.nextInt();
                rand4 = new Random(255);
                b = rand4.nextInt();
                Random.setBackgroundColor(Color.argb(a, r, g, b));
                Toast toast = Toast.makeText(getApplicationContext(), "Please enjoy!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

}
