package com.company.informationapp.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.company.informationapp.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentUnitedKingdom extends Fragment {

    private ImageView imageViewUnitedKingdom;
    private ProgressBar progressBarUnitedKingdom;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmnet_united_kingdom, container, false);
        imageViewUnitedKingdom = view.findViewById(R.id.imageViewUnitedKingdom);
        progressBarUnitedKingdom = view.findViewById(R.id.progressBarUnitedKingdom);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/a/ae/Flag_of_the_United_Kingdom.svg/1920px-Flag_of_the_United_Kingdom.svg.png")
                        .into(imageViewUnitedKingdom, new Callback(){

                    @Override
                    public void onSuccess() {
                        progressBarUnitedKingdom.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarUnitedKingdom.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
