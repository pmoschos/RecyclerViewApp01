package gr.aueb.cf.recyclerviewapp01.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import gr.aueb.cf.recyclerviewapp01.MainActivity;
import gr.aueb.cf.recyclerviewapp01.R;
import gr.aueb.cf.recyclerviewapp01.activities.SecondActivity;
import gr.aueb.cf.recyclerviewapp01.models.Movie;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private ArrayList<Movie> movies;

    public MyAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Movie movie = movies.get(position);
        holder.titleTV.setText(movie.getTitle());
        holder.descriptionTV.setText(movie.getDescription());
        holder.genreTV.setText(movie.getGenre());

        holder.titleTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(v.getContext(), holder.titleTV.getText().toString(), Toast.LENGTH_LONG).show();
                String movieTitle = holder.titleTV.getText().toString();
                String movieGenre = holder.genreTV.getText().toString();

                Intent intent = new Intent(v.getContext(), SecondActivity.class);
                intent.putExtra("title", movieTitle);
                intent.putExtra("genre", movieGenre);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView titleTV;
        private TextView descriptionTV;
        private TextView genreTV;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTV = itemView.findViewById(R.id.titleTV);
            descriptionTV = itemView.findViewById(R.id.descrTV);
            genreTV = itemView.findViewById(R.id.genreTV);
        }
    }
}
