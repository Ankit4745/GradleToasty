package com.ankit.gradletoasty;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.security.cert.Extension;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}




        public void show_toast(View view){

            switch (view.getId()) {
                case R.id.error:
                    Toasty.error(MainActivity.this, " this is an error toast.", Toast.LENGTH_SHORT, true).show();
                    break;


                case R.id.success:
                    Toasty.success(MainActivity.this, " successful.", Toast.LENGTH_SHORT, true).show();
                    break;


                case R.id.info:
                    Toasty.info(MainActivity.this, " infomation.", Toast.LENGTH_SHORT, true).show();
                    break;

                case R.id.warning:
                    Toasty.warning(MainActivity.this, " warning.", Toast.LENGTH_SHORT, true).show();
                    break;

                case R.id.Image:
                    Toasty.normal(MainActivity.this, " image.", Toast.LENGTH_SHORT, ContextCompat.getDrawable(MainActivity.this,R.drawable.img), true).show();





        }

    }
}