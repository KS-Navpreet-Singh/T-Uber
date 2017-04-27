package com.example.nav.t_uber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public Button Tutor;
    public Button Student;
    public TextView SignUp;


    //Login Tutor page pull up
        public void tutor() {
            Tutor = (Button) findViewById(R.id.tutor);
            Tutor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent login_Tutor = new Intent(MainActivity.this, LoginTutor.class);

                    startActivity(login_Tutor);

                }
            });

        }


//Login Student page pull up
    public void student() {
        Student = (Button) findViewById(R.id.student);
        Student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent login_Student = new Intent(MainActivity.this, LoginStudent.class);

                startActivity(login_Student);

            }
        });

    }


//SignUp page pull up
    public void signup() {
        SignUp = (TextView) findViewById(R.id.signup);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent login_SignUp = new Intent(MainActivity.this, SignUp.class);

                startActivity(login_SignUp);

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
        tutor();
        student();
        signup();
    }
}
