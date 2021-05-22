package com.company.informationapp.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.company.informationapp.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentEarth extends Fragment {

    private ImageView imageViewEarth;
    private ProgressBar progressBarEarth;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_earth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageViewEarth = view.findViewById(R.id.imageViewEarth);
        progressBarEarth = view.findViewById(R.id.progressBarEarth);

        String imageUri = "https://upload.wikimedia.org/wikipedia/commons/9/97/The_Earth_seen_from_Apollo_17.jpg";

        Picasso.get().load(imageUri).into(imageViewEarth, new Callback() {
            @Override
            public void onSuccess() {
                progressBarEarth.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarEarth.setVisibility(View.INVISIBLE);
            }
        });
    }
}
