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

public class FragmentJupiter extends Fragment {

    private ImageView imageViewJupiter;
    private ProgressBar progressBarJupiter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_jupiter, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageViewJupiter = view.findViewById(R.id.imageViewJupiter);
        progressBarJupiter = view.findViewById(R.id.progressBarJupiter);

        String imageUri = "https://upload.wikimedia.org/wikipedia/commons/2/2b/Jupiter_and_its_shrunken_Great_Red_Spot.jpg";

        Picasso.get().load(imageUri).into(imageViewJupiter, new Callback() {
            @Override
            public void onSuccess() {
                progressBarJupiter.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarJupiter.setVisibility(View.INVISIBLE);
            }
        });
    }
}
