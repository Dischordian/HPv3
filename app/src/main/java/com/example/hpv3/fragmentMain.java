package com.example.hpv3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class fragmentMain extends Fragment {

    // Set parameters
    Button mainButtonPlot, mainButtonList, mainButtonSet;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        mainButtonPlot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button mainButtonPlot = (Button) getView().findViewById(R.id.main_btn_plot);
                Navigation.findNavController(view).navigate(R.id.main_btn_plot);
                Log.i("Main Fragment","Plot Button Clicked");
            }
        });

        mainButtonList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button mainButtonPlot = (Button) getView().findViewById(R.id.main_btn_list);
                Navigation.findNavController(view).navigate(R.id.main_btn_list);
                Log.i("Main Fragment","List Button Clicked");
            }
        });

        mainButtonSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button mainButtonPlot = (Button) getView().findViewById(R.id.main_btn_set);
                Navigation.findNavController(view).navigate(R.id.main_btn_set);
                Log.i("Main Fragment","Settings Button Clicked");
            }
        });

        return v;

    }

}

