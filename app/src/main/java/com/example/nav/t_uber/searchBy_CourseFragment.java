package com.example.nav.t_uber;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.ProgressDialog;
import java.util.HashMap;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;
/**
 * A simple {@link Fragment} subclass.
 */
public class searchBy_CourseFragment extends Fragment {

    String finalResult;
    String HttpURL = "https://people.eecs.ku.edu/~apodgorn/tuber/find_tutor.php";
    ProgressDialog progressDialog;
    HashMap<String,String> hashMap = new HashMap<>();
    HttpParse httpParse = new HttpParse();

    public void Register(final String dept, final String num){

    }

    public searchBy_CourseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_by__course, container, false);
    }

    //----------- change ActionBar title
    public void onResume(){
        super.onResume();

        // Set title bar
        ((activity_student) getActivity())
                .setActionBarTitle("Search By Course");

    }



}
