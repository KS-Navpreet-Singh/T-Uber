package com.example.nav.t_uber;

import android.app.ProgressDialog;
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
    Button sign_Up_Tutor;
    EditText First_Name, Last_Name, Email, Password1, Password2;
    String str_First_Name, str_Last_Name, str_Email, str_Password1, str_Password2;
    String finalResult;
    String HttpURL = "https://people.eecs.ku.edu/~apodgorn/tuber/create_profile.php";
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
        Password1 = (EditText)findViewById(R.id.password1);
        Password2 = (EditText)findViewById(R.id.password2);

        sign_Up_Student = (Button)findViewById(R.id.student_Button);
        sign_Up_Tutor = (Button)findViewById(R.id.tutor_button);


        //Adding Click Listener on button for Student.
        sign_Up_Student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String status = "Student";

                str_First_Name = First_Name.getText().toString();
                str_Last_Name = Last_Name.getText().toString();
                str_Email = Email.getText().toString();
                str_Password1 = Password1.getText().toString();
                str_Password2 = Password2.getText().toString();


                if(TextUtils.isEmpty(str_First_Name) || TextUtils.isEmpty(str_Last_Name) || TextUtils.isEmpty(str_Email) || TextUtils.isEmpty(str_Password1)
                        || TextUtils.isEmpty(str_Password2) ){

                    Toast.makeText(SignUp.this, "Please fill all form fields.", Toast.LENGTH_LONG).show();
                }else{

                    Register(str_First_Name, str_Last_Name, str_Email, str_Password1, str_Password2, status);

                }

            }
        });



    //Adding Click Listener on button for Tutor.
        sign_Up_Tutor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String status = "Tutor";

            str_First_Name = First_Name.getText().toString();
            str_Last_Name = Last_Name.getText().toString();
            str_Email = Email.getText().toString();
            str_Password1 = Password1.getText().toString();
            str_Password2 = Password2.getText().toString();


            if(TextUtils.isEmpty(str_First_Name) || TextUtils.isEmpty(str_Last_Name) || TextUtils.isEmpty(str_Email) || TextUtils.isEmpty(str_Password1)
                    || TextUtils.isEmpty(str_Password2) ){

                Toast.makeText(SignUp.this, "Please fill all form fields.", Toast.LENGTH_LONG).show();
            }else{

                Register(str_First_Name, str_Last_Name, str_Email, str_Password1, str_Password2, status);

            }

        }
    });

}



    public void Register(final String F_Name, final String L_Name, final String email, final String password1, final String password2, final
                         String status){

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

                hashMap.put("l_name",params[1]);

                hashMap.put("email_address",params[2]);

                hashMap.put("password1",params[3]);

                hashMap.put("password2",params[4]);

                hashMap.put("status",params[5]);

                finalResult = httpParse.postRequest(hashMap, HttpURL);

                return finalResult;
            }


        }

        RegisterClass Register = new RegisterClass();
        Register.execute(F_Name,L_Name,email,password1, password2,status);

    }

}
