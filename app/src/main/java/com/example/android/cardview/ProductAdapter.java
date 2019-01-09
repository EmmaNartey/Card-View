package com.example.android.cardview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder>{
    private List<Product> productItemList;
    Context context;

    public ProductAdapter(List<Product> productItemList, Context context) {
        this.productItemList = productItemList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflate the layout file
        View productView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_layout, parent, false);
        return new MyViewHolder(productView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder hoolder, int position) {
        hoolder.textProuctName.setText(productItemList.get(position).getName());
        hoolder.textScores.setText(productItemList.get(position).getScores());
    }

    @Override
    public int getItemCount() {
        return productItemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textProuctName;
        public TextView textScores;

        public MyViewHolder(View view) {
            super(view);
            textProuctName = view.findViewById(R.id.textViewName);
            textScores = view.findViewById(R.id.scoreView);
        }
    }
}
