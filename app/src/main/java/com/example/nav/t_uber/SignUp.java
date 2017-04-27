package com.example.nav.t_uber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    public Button Tutor;
    public Button Student;


    //After Tutor Sign Up, goes back to main page
    public void tutor() {
        Tutor = (Button) findViewById(R.id.tutor_button);
        Tutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent SignUp_Tutor = new Intent(SignUp.this, MainActivity.class);

                startActivity(SignUp_Tutor);

            }
        });

    }


    //After Student Sign Up, goes back to main page
    public void student() {
        Student = (Button) findViewById(R.id.student_button);
        Student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent SignUp_Student = new Intent(SignUp.this, MainActivity.class);

                startActivity(SignUp_Student);

            }
        });

    }








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        tutor();
        student();

    }
}
