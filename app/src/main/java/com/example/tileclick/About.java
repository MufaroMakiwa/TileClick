package com.example.tileclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }


    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toastmessage, Toast.LENGTH_LONG);
        toast.show();
    }
}
