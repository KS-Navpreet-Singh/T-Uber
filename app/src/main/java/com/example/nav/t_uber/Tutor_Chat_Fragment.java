package com.example.nav.t_uber;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tutor_Chat_Fragment extends Fragment {


    public Tutor_Chat_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tutor__chat_, container, false);
    }



    public void onResume(){
        super.onResume();

        // Set title bar
        ((my_tutor_profile) getActivity())
                .setActionBarTitle("Chat");

    }
}
