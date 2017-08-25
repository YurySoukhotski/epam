package com.example.yurysoukhotski.helloepam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    private TextView mHelloTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        Toast toast = Toast.makeText(getApplicationContext(),
                "Hello EPAM!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
