package com.example.buttomnavigation;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable{
    private String name;
    private String player;
    private String plot;
    private int image;

    protected Movie(Parcel in) {
        name = in.readString();
        player = in.readString();
        plot = in.readString();
        image = in.readInt();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>(){
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public Movie() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(player);
        dest.writeString(plot);
        dest.writeInt(image);
    }
}