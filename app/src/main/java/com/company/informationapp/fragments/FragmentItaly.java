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

public class FragmentItaly extends Fragment {

    private ImageView imageViewItaly;
    private ProgressBar progressBarItaly;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmnet_italy, container, false);
        imageViewItaly = view.findViewById(R.id.imageViewItaly);
        progressBarItaly = view.findViewById(R.id.progressBarItaly);

        String imageUri = "https://th.bing.com/th/id/Ra6a4a8067ff7e9cace5f1401439c7f04?rik=HC12LK%2bQoqEFpg&riu=http%3a%2f%2f4.bp.blogspot.com%2f_nDILVw-w9Qk%2fS-cHPamdLiI%2fAAAAAAAAAFY%2fVwUSLpL6GhU%2fs1600%2fitalie.jpg&ehk=DqgxIqgOzF193rHvrtOgLB8oQ%2bH2DfXquSni2MUjNCQ%3d&risl=&pid=ImgRaw";
        //"https://upload.wikimedia.org/wikipedia/en/thumb/a/ae/Flag_of_the_United_Kingdom.svg/1920px-Flag_of_the_United_Kingdom.svg.png";
                //
        Picasso.get().load(imageUri)
                        .into(imageViewItaly, new Callback(){

                    @Override
                    public void onSuccess() {
                        progressBarItaly.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarItaly.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }

    public static FragmentItaly newInstance(){
        return new FragmentItaly();
    }
}
