package com.example.alfasdk.Fragments;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.alfasdk.Adapters.EventAdapter;
import com.example.alfasdk.R;


public class EventsFragment extends Fragment {

//    @BindView(R.id.events_list)
    ListView eventsListView;

    public EventsFragment() {
        // Required empty public constructor
    }

    public static EventsFragment newInstance() {
        return new EventsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onResume() {

        ActionBar toolbar = ((AppCompatActivity) getActivity()).getSupportActionBar();

        if (toolbar != null) {
            toolbar.setTitle("Message Board");
        }
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_events, container, false);
//        ButterKnife.bind(this, view);
        eventsListView=view.findViewById(R.id.events_list);
        eventsListView.setAdapter(new EventAdapter(getActivity()));

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}
