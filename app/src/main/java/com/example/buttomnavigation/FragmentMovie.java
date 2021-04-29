package com.example.buttomnavigation;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentMovie extends Fragment implements OnItemClickListener<Movie> {

    private RecyclerView rvMovie;
    private ListAdapterMovie listAdapterMovie;

    public static FragmentMovie newInstance() {
        FragmentMovie fragment = new FragmentMovie();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_movie, container, false);
        rvMovie = view.findViewById(R.id.rv_movie);
        listAdapterMovie = new ListAdapterMovie();
        listAdapterMovie.setMovie(DataSourceMovie.getListData());
        rvMovie.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvMovie.setHasFixedSize(true);
        listAdapterMovie.setClickListener(this);
        rvMovie.setAdapter(listAdapterMovie);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onClick(Movie movie) {
        Intent m = new Intent(getActivity(), DetailActivity.class);
        m.putExtra(DetailActivity.detailMovie, movie);
//        m.putExtra("movie", movie);
        startActivity(m);
    }
}