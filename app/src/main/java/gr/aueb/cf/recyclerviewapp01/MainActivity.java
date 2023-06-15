package gr.aueb.cf.recyclerviewapp01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import gr.aueb.cf.recyclerviewapp01.adapters.MyAdapter;
import gr.aueb.cf.recyclerviewapp01.models.Movie;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Movie> arrayList;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();

        recyclerView = findViewById(R.id.recyclerView);

        myAdapter = new MyAdapter(arrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(myAdapter);

        insertData();
    }

    private void insertData() {
        Movie movie1 = new Movie("Toy Story 1", "Small description...", "Fantasy");
        Movie movie2 = new Movie("Toy Story 2", "Small description...", "Fantasy");
        Movie movie3 = new Movie("Toy Story 3", "Small description...", "Fantasy");
        Movie movie4 = new Movie("Toy Story 4", "Small description...", "Fantasy");

        arrayList.add(movie1);
        arrayList.add(movie2);
        arrayList.add(movie3);
        arrayList.add(movie4);
        arrayList.add(movie1);
        arrayList.add(movie2);
        arrayList.add(movie3);
        arrayList.add(movie4);
        arrayList.add(movie1);
        arrayList.add(movie2);
        arrayList.add(movie3);
        arrayList.add(movie4);

        myAdapter.notifyDataSetChanged();
    }
}