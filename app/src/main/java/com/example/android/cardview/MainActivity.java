package com.example.android.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ProductAdapter mAdapter;
    private List<Product> mProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        mRecyclerView = (RecyclerView) findViewById(R.id.idRecyclerView);
        //mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //populate the products
        mProductList = new ArrayList<>();
        mProductList.add(new Product("General", "9/10"));
        mProductList.add(new Product("HSE Awareness", "8/10"));
        mProductList.add(new Product("Recreation Rooms", "10/10"));
        mProductList.add(new Product("Fire Prevention and ", "10/10"));
        mProductList.add(new Product("Accommodation Rooms", "8/10"));
        mProductList.add(new Product("Recreation Rooms", "10/10"));
        mProductList.add(new Product("Electricity Generation & Distribution", "10/10"));
        mProductList.add(new Product("Bulk Fuel Storage", "9/10"));
        mProductList.add(new Product("Cooking Gas Storage", "8/10"));

        //set adapter to recyclerview
        mAdapter = new ProductAdapter(mProductList,this);
        mRecyclerView.setAdapter(mAdapter);
    }
}
