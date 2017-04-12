package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by qwert on 2017-04-07.
 */

public class Fragment2 extends android.app.Fragment {


    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment2, container, false);

        addItemsOnspinner();
        return myView;


    }

    public void addItemsOnspinner() {


            Spinner Main_spinner = (Spinner) myView.findViewById(R.id.spinner1);
            ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.country_name, R.layout.spinner_layout);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            Main_spinner.setAdapter(adapter);

//            Main_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                @Override
//                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                    //각 항목 클릭시 포지션값을 토스트에 띄운다.
//                    //    Toast.makeText(getApplicationContext(), Integer.toString(position), Toast.LENGTH_SHORT).show();
//                }
//
//                @Override
//                public void onNothingSelected(AdapterView<?> parent) {
//
//                }
//            });

        Spinner Main_spinner2  = (Spinner) myView.findViewById(R.id.spinner2);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(getActivity(), R.array.country_name2, R.layout.spinner_layout);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Main_spinner2.setAdapter(adapter2);

        Spinner Main_spinner3  = (Spinner) myView.findViewById(R.id.spinner3);
        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(getActivity(), R.array.country_name3, R.layout.spinner_layout);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Main_spinner3.setAdapter(adapter3);

        Spinner Main_spinner4  = (Spinner) myView.findViewById(R.id.spinner4);
        ArrayAdapter adapter4 = ArrayAdapter.createFromResource(getActivity(), R.array.country_name4, R.layout.spinner_layout);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Main_spinner4.setAdapter(adapter4);






    }
}









