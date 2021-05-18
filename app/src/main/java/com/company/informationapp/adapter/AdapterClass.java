package com.company.informationapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageViewSplash;
        private final TextView textViewSplash;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewSplash = itemView.findViewById(R.id.imageViewSplash);
            textViewSplash = itemView.findViewById(R.id.textViewSplash);
        }
    }
}
