package com.company.informationapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.company.informationapp.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentFrance extends Fragment {

    private ImageView imageViewFrance;
    private ProgressBar progressBarFrance;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmnet_france, container, false);
        imageViewFrance = view.findViewById(R.id.imageViewFrance);
        progressBarFrance = view.findViewById(R.id.progressBarFrance);

        String imageUri = "https://upload.wikimedia.org/wikipedia/en/thumb/c/c3/Flag_of_France.svg/1920px-Flag_of_France.svg.png";
        //"https://upload.wikimedia.org/wikipedia/en/thumb/a/ae/Flag_of_the_United_Kingdom.svg/1920px-Flag_of_the_United_Kingdom.svg.png";
                //
        Picasso.get().load(imageUri)
                        .into(imageViewFrance, new Callback(){

                    @Override
                    public void onSuccess() {
                        progressBarFrance.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarFrance.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }

    public static FragmentFrance newInstance(){
        return new FragmentFrance();
    }
}
