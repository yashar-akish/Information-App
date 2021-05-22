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

public class FragmentSaturn extends Fragment {

    private ImageView imageViewSaturn;
    private ProgressBar progressBarSaturn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_saturn, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageViewSaturn = view.findViewById(R.id.imageViewSaturn);
        progressBarSaturn = view.findViewById(R.id.progressBarSaturn);

        String imageUri = "https://upload.wikimedia.org/wikipedia/commons/2/29/Saturn_Storm.jpg";

        Picasso.get().load(imageUri).into(imageViewSaturn, new Callback() {
            @Override
            public void onSuccess() {
                progressBarSaturn.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarSaturn.setVisibility(View.INVISIBLE);
            }
        });
    }
}
