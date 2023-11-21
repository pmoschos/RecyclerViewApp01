# Movie Catalog App Overview

## MainActivity :clapper:
`MainActivity` serves as the entry point of the app, showcasing a catalog of movies.

### Key Components
- **RecyclerView**: Displays the list of movies.
- **ArrayList<Movie>**: Holds the movie data.
- **MyAdapter**: Custom adapter for the RecyclerView.

### Functionality
- Initializes an `ArrayList` of `Movie` objects.
- Configures the `RecyclerView` with a `LinearLayoutManager`.
- Populates the `RecyclerView` with movie data using `MyAdapter`.

### Movie Data Initialization
- Method `insertData()` populates the `ArrayList` with sample movie data.
- Movies include titles like "Inception", "The Shawshank Redemption", "Pulp Fiction", etc.
- Each `Movie` object contains a title, description, and genre.

## MyAdapter :film_strip:
Custom adapter for the RecyclerView in `MainActivity`.

### ViewHolder Pattern
- **MyViewHolder**: Inner class defining the ViewHolder pattern.
- Holds references to `TextView`s for title, description, and genre.

### Adapter Methods
- `onCreateViewHolder`: Inflates the item view.
- `onBindViewHolder`: Binds movie data to each item view.
- **Event Listener**: On clicking a movie title, it starts `SecondActivity` and passes movie details.

## SecondActivity :memo:
Displays details of a selected movie from `MainActivity`.

### Layout
- Displays the title and genre of the selected movie.
- Utilizes `ConstraintLayout` for positioning elements.

### Functionality
- Receives data (title and genre) from `MainActivity` through an `Intent`.
- Sets the received data to respective `TextView`s.

## XML Layouts :bookmark_tabs:
### MainActivity Layout (`activity_main.xml`)
- Defines a `ConstraintLayout` containing a `RecyclerView`.

### Item View Layout (`item_view.xml`)
- Defines a `LinearLayout` with nested `TextView`s for movie details.

### SecondActivity Layout (`activity_second.xml`)
- `ConstraintLayout` with `TextView`s to display movie title and genre.

## Conclusion :checkered_flag:
This app provides a simple yet effective demonstration of using RecyclerViews in Android to display a list of items and navigate to detailed views upon selection.

---
## Our App 📷

![image](https://github.com/pmoschos/RecyclerViewApp01/assets/133533759/0748d848-c9f9-45a5-bf7e-038520a11130)

