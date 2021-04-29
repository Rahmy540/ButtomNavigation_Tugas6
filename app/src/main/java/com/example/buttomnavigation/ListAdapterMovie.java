package com.example.buttomnavigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapterMovie extends RecyclerView.Adapter<ListAdapterMovie.ViewHolder> {
    private List<Movie> listMovie;
    private OnItemClickListener<Movie> clickListener;

    public void setClickListener(OnItemClickListener<Movie> clickListener) {
        this.clickListener = clickListener;
    }

    public void setMovie(ArrayList<Movie> movie) {
        this.listMovie = movie;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_movie, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(listMovie.get(position));
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        Movie movie;
        TextView tvName;
        TextView tvPlayer;
        TextView tvPlot;
        ImageView ivImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvName = itemView.findViewById(R.id.tv_name);
            tvPlayer = itemView.findViewById(R.id.tv_player);
            tvPlot = itemView.findViewById(R.id.tv_plot);
            ivImage = itemView.findViewById(R.id.iv_image);
        }

        public void onBind(Movie movie) {
            this.movie = movie;
            tvName.setText(movie.getName());
            tvPlayer.setText(movie.getPlayer());
            tvPlot.setText(movie.getPlot());
            ivImage.setImageResource(movie.getImage());
        }

        public void onClick(View view) {
            clickListener.onClick(movie);
        }
    }
}