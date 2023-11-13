package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ContactModel> elements;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
    }

    private void addData(){
        elements = new ArrayList<>();
        elements.add(new ContactModel("Irfiyanda","081264732662","Not Available","#989342"));
        elements.add(new ContactModel("Faiz","086374312667","Available","#456182"));
        elements.add(new ContactModel("Rama","087899128847","Not Available","#D2532F"));
        elements.add(new ContactModel("Ilham","087125646377","Available","#FF9342"));
        elements.add(new ContactModel("Rozak","0817273614188","Available","#989024"));
        elements.add(new ContactModel("Agung","081726355111","Not Available","#9AD342"));
        elements.add(new ContactModel("Risky","088992727722","Available","#9893D2"));

        ContactAdapter adapter = new ContactAdapter(elements, this, new ContactAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ContactModel item) {
                detail(item);
            }
        });

        RecyclerView recycleView = findViewById(R.id.rvContacts);
        recycleView.setHasFixedSize(true);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
        recycleView.setAdapter(adapter);
    }
    private void detail(ContactModel item){
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("ContactModel", item);
        startActivity(intent);
    }
}