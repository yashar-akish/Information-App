package com.company.informationapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.company.informationapp.CountriesActivity;
import com.company.informationapp.MainActivity;
import com.company.informationapp.MusiciansActivity;
import com.company.informationapp.PlanetsActivity;
import com.company.informationapp.PresidentsActivity;
import com.company.informationapp.R;
import com.company.informationapp.model.ModelClass;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.CardViewHolder> {

    private final ArrayList<ModelClass> modelList;
    private final Context context;

    public AdapterClass(ArrayList<ModelClass> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.CardViewHolder holder, int position) {
        ModelClass model = modelList.get(position);
        holder.textViewSplash.setText(model.getCategoryName());
        holder.imageViewSplash.setImageResource(
                context.getResources().getIdentifier(
                        model.getImageName(),
                        "drawable",
                        context.getPackageName())
        );

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    Intent intent = new Intent(context, PlanetsActivity.class);
                    context.startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(context, MusiciansActivity.class);
                    context.startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(context, PresidentsActivity.class);
                    context.startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(context, CountriesActivity.class);
                    context.startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageViewSplash;
        private final TextView textViewSplash;
        private CardView cardView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewSplash = itemView.findViewById(R.id.imageViewSplash);
            textViewSplash = itemView.findViewById(R.id.textViewSplash);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
