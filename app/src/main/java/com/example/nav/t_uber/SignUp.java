package com.example.nav.t_uber;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.util.HashMap;

public class SignUp extends AppCompatActivity {

    Button sign_Up_Student;
    EditText First_Name, Last_Name, Email, Password;
    String str_First_Name, str_Last_Name, str_Email, str_Password;
    String finalResult;
    String HttpURL = "https://people.eecs.ku.edu/~nsingh94/Register.php";
    ProgressDialog progressDialog;
    HashMap<String,String> hashMap = new HashMap<>();
    HttpParse httpParse = new HttpParse();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Assign Id'S
        First_Name = (EditText)findViewById(R.id.FirstName);
        Last_Name = (EditText)findViewById(R.id.LastName);
        Email = (EditText)findViewById(R.id.StudenEmail);
        Password = (EditText)findViewById(R.id.UserPassword);

        sign_Up_Student = (Button)findViewById(R.id.student_Button);


        //Adding Click Listener on button.
        sign_Up_Student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str_First_Name = First_Name.getText().toString();
                str_Last_Name = Last_Name.getText().toString();
                str_Email = Email.getText().toString();
                str_Password = Password.getText().toString();


                if(TextUtils.isEmpty(str_First_Name) || TextUtils.isEmpty(str_Last_Name) || TextUtils.isEmpty(str_Email) || TextUtils.isEmpty(str_Password)){

                    Toast.makeText(SignUp.this, "Please fill all form fields.", Toast.LENGTH_LONG).show();
                }else{

                    Register(str_First_Name, str_Last_Name, str_Email, str_Password);

                }

            }
        });

    }



    public void Register(final String F_Name, final String L_Name, final String email, final String password){

        class RegisterClass extends AsyncTask<String,Void,String> {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();

                progressDialog = ProgressDialog.show(SignUp.this,"Loading Data",null,true,true);
            }

            @Override
            protected void onPostExecute(String httpResponseMsg) {

                super.onPostExecute(httpResponseMsg);

                progressDialog.dismiss();

                Toast.makeText(SignUp.this,httpResponseMsg.toString(), Toast.LENGTH_LONG).show();


            }

            @Override
            protected String doInBackground(String... params) {

                hashMap.put("f_name",params[0]);

                hashMap.put("L_name",params[1]);

                hashMap.put("email",params[2]);

                hashMap.put("password",params[3]);

                finalResult = httpParse.postRequest(hashMap, HttpURL);

                return finalResult;
            }


        }

        RegisterClass Register = new RegisterClass();
        Register.execute(F_Name,L_Name,email,password);

    }

}
