package com.example.buttomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private Movie movie;
    private TextView tvName;
    private TextView tvPlayer;
    private TextView tvPlot;
    private ImageView ivImage;

    public static String detailMovie = "MOVIE_DETAIL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvName = findViewById(R.id.tv_name);
        tvPlayer = findViewById(R.id.tv_player);
        tvPlot = findViewById(R.id.tv_plot);
        ivImage = findViewById(R.id.iv_image);
    }

    @Override
    protected void onStart() {
        super.onStart();
        movie = getIntent().getParcelableExtra(detailMovie);
        tvName.setText(movie.getName());
        tvPlayer.setText(movie.getPlayer());
        tvPlot.setText(movie.getPlot());
        ivImage.setImageResource(movie.getImage());
        getSupportActionBar().setTitle(movie.getName());
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}