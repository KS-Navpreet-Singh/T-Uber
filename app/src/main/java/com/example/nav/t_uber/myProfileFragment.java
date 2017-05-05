package com.example.nav.t_uber;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class myProfileFragment extends Fragment {


    public myProfileFragment() {
        // Required empty public constructor

    }


    TextView first_name;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_my_profile, container, false);



        ((TextView)v.findViewById(R.id.textView1)).setText("Email");

        return v;
    }




//----------- change ActionBar title
    public void onResume(){
        super.onResume();

        // Set title bar
        ((activity_student) getActivity())
                .setActionBarTitle("My Profile");

    }





}
