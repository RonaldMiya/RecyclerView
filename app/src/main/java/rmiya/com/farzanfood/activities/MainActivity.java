package rmiya.com.farzanfood.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import rmiya.com.farzanfood.R;
import rmiya.com.farzanfood.adapters.FoodAdapter;
import rmiya.com.farzanfood.repositories.FoodRepository;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(
                R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FoodAdapter foodAdapter = new FoodAdapter();
        foodAdapter.setFood(FoodRepository.getList());

        recyclerView.setAdapter(foodAdapter);

    }
}
