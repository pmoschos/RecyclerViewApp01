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
        Movie movie1 = new Movie("Inception", "A thief enters people's dreams to steal secrets.", "Sci-Fi/Thriller");
        Movie movie2 = new Movie("The Shawshank Redemption", "A man's bond with fellow inmates helps him survive in prison.", "Sci-Fi/Thriller");
        Movie movie3 = new Movie("Pulp Fiction", "Interconnected stories of crime, violence, and redemption in Los Angeles.", "Sci-Fi/Thriller");
        Movie movie4 = new Movie("The Dark Knight", "Batman faces the Joker's chaos in Gotham City.", "Sci-Fi/Thriller");
        Movie movie5 = new Movie("Fight Club", "An insomniac forms an underground fight club as an escape from modern life.", "Sci-Fi/Thriller");
        Movie movie6 = new Movie("The Matrix", "A computer hacker discovers a dystopian reality controlled by intelligent machines.", "Sci-Fi/Thriller");
        Movie movie7 = new Movie("Goodfellas", "The rise and fall of a mob associate in New York City.", "Sci-Fi/Thriller");
        Movie movie8 = new Movie("Schindler's List", "A German businessman saves Jewish lives during the Holocaust.", "Sci-Fi/Thriller");
        Movie movie9 = new Movie("Star Wars", "The Rebel Alliance battles against the Empire's relentless pursuit.", "Sci-Fi/Thriller");
        Movie movie10 = new Movie("The Godfather", "A powerful mafia family's succession struggle and the rise of its new leader.", "Sci-Fi/Thriller");
        Movie movie11 = new Movie("Forrest Gump", "A slow-witted but kind-hearted man witnesses and influences several key historical events.", "Sci-Fi/Thriller");
        Movie movie12 = new Movie("The Lord of the Rings", "A hobbit embarks on a quest to destroy an all-powerful ring.", "Sci-Fi/Thriller");
        Movie movie13 = new Movie("Titanic", "A forbidden love affair unfolds on the ill-fated maiden voyage of the Titanic.", "Sci-Fi/Thriller");
        Movie movie14 = new Movie("The Silence of the Lambs", "An FBI trainee seeks the help of a cannibalistic serial killer to catch another killer.", "Sci-Fi/Thriller");
        Movie movie15 = new Movie("Casablanca", "A cynical expatriate in Morocco rekindles a romance amidst World War II tensions.", "Sci-Fi/Thriller");
        Movie movie16 = new Movie("The Avengers", "A team of superheroes must unite to save Earth from a powerful threat.", "Sci-Fi/Thriller");
        Movie movie17 = new Movie("The Social Network", "The founding of Facebook and the subsequent legal and personal complications.", "Sci-Fi/Thriller");
        Movie movie18 = new Movie("Jurassic Park", "A theme park with genetically re-created dinosaurs turns deadly for its visitors.", "Sci-Fi/Thriller");
        Movie movie19 = new Movie("Inglourious Basterds", "A group of Jewish-American soldiers plans to assassinate high-ranking Nazi officials in WWII.", "Sci-Fi/Thriller");


        arrayList.add(movie1);
        arrayList.add(movie2);
        arrayList.add(movie3);
        arrayList.add(movie4);
        arrayList.add(movie5);
        arrayList.add(movie6);
        arrayList.add(movie8);
        arrayList.add(movie9);
        arrayList.add(movie10);
        arrayList.add(movie11);
        arrayList.add(movie12);
        arrayList.add(movie13);
        arrayList.add(movie14);
        arrayList.add(movie15);
        arrayList.add(movie16);
        arrayList.add(movie17);
        arrayList.add(movie18);
        arrayList.add(movie19);

        myAdapter.notifyDataSetChanged();
    }
}