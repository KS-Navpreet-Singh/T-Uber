package com.example.nav.t_uber;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tutor_Requests_Fragment extends Fragment {


    public Tutor_Requests_Fragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_tutor__requests_, container, false);


        return v;


    }


    public void onResume(){
        super.onResume();

        // Set title bar
        ((my_tutor_profile) getActivity())
                .setActionBarTitle("Student Requests");

    }




}
