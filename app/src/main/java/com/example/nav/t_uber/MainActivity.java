package com.example.nav.t_uber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public Button Tutor;

        public void init() {
            Tutor = (Button) findViewById(R.id.tutor);
            Tutor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent login_Tutor = new Intent(MainActivity.this, LoginTutor.class);

                    startActivity(login_Tutor);

                }
            });

        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Make an activity to fullscreen --
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //--

        setContentView(R.layout.activity_main);
        init();
    }
}
