package com.example.nav.t_uber;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tutor_my_profile_fragment extends Fragment {


    public Tutor_my_profile_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tutor_my_profile, container, false);
    }




    //----------- change ActionBar title
    public void onResume(){
        super.onResume();

        // Set title bar
        ((my_tutor_profile) getActivity())
                .setActionBarTitle("My Profile");

    }

}
