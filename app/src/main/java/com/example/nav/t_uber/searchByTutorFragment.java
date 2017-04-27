package com.example.nav.t_uber;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class searchByTutorFragment extends Fragment {


    public searchByTutorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_by_tutor, container, false);
    }


    //----------- change ActionBar title
    public void onResume(){
        super.onResume();

        // Set title bar
        ((activity_student) getActivity())
                .setActionBarTitle("Search By Tutor");

    }

}

