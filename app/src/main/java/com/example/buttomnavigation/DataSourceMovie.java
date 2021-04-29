package com.example.buttomnavigation;

import android.content.Context;

import java.util.ArrayList;

public class DataSourceMovie {
    private static String[] MovieName = {
            "Avengers",
            "Spider-Man",
            "The Lion King",
            "Toy Story",
            "Harry Potter",
            "Hotel Mumbai",
            "Doctor Sleep",
            "Iron Man"
    };
    private static String[] MoviePlayer = {
            "Robert Downey, Chris Evans, Mark Ruffalo, Chris Hemsworth, Jeremy Renner",
            "Tom Holland, Zendaya, J.B Smoove, Samuel L.Jackson, Cobie Smulders, Martin Star",
            "Donald Glover, Beyonce, James Earl Jones, John Oliver, John Kani, Seth Rogen",
            "Tom Hanks, Tim Allen, Don Rickles, Jim Varney, Annie Pottls, John Morris",
            "Daniel Jacob, Rupert Grint, Emma Charlotte, Richard Harris, Ralph Fiennes, Alan",
            "Dev Patel, Armie Hammer, Tilda Cobham, Nazanin Boniadi, Anupham Ker,Jasoon Isaacs",
            "Ewan McGregor, Rebecca Ferguson, Kyliegh Curran, Carl Lumbly, Emily Alyn",
            "Robert Downey, Terrence Howard, Jeff Bridges, Shaun Toub, Gwyneth Paltrow",
    };
    private static String[] MoviePlot = {
            "The Asgardian Loki encounters the Other, the leader of an extraterrestrial race known as the Chitauri.  In exchange for retrieving the Tesseract, a powerful energy source of unknown potential, the Other promises Loki an army with which he can subjugate Earth",
            "On a school trip, high school senior Peter Parker visits a Columbia University genetics lab, where he is bitten by a genetically engineered \"super spider\" that escaped containment, and apparently falls ill after returning home",
            "In the Pride Lands of Africa, a pride of lions rule over the animal kingdom from Pride Rock. King Mufasa and Queen Sarabi present their newborn son, Simba, to the gathering animals by Rafiki the mandrill, the kingdom's shaman and advisor.",
            "A cowboy doll is profoundly threatened and jealous when a new spaceman figure supplants him as top toy in a boy's room. A little boy named Andy loves to be in his room, playing with his toys,especially his doll named Woody ",
            "The central character in the series is Harry Potter, a boy who lives in the fictional town of Little Whinging, Surrey with his aunt, uncle, and cousin – the Dursleys – and discovers at the age of eleven that he is a wizard",
            "The true story of the Taj Hotel terrorist attack in Mumbai. Hotel staff risk their lives to keep everyone safe as people make unthinkable sacrifices to protect themselves and their families.",
            "In 1980, Danny Torrance and his mother Wendy live in Florida, still traumatized by their ordeal at the Overlook hotel. Dick Hallorann, now a benevolent spirit, explains that the hotel's ghosts feed on Danny's psychic ability, his shining.",
            "Tony Stark, who has inherited the defense contractor Stark Industries from his late father Howard Stark, is in war-torn Afghanistan with his friend and military liaison, Lieutenant Colonel James Rhodes,"
    };
    private static int [] MovieImage = {
            R.drawable.avengers,
            R.drawable.spiderman,
            R.drawable.lionking,
            R.drawable.toystory,
            R.drawable.harrypoter,
            R.drawable.hotelmumbai,
            R.drawable.doctorsleep,
            R.drawable.ironman
    };
    public static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();
        for (int position = 0; position < MovieName.length; position++) {
            Movie movie = new Movie();
            movie.setName(MovieName[position]);
            movie.setPlayer(MoviePlayer[position]);
            movie.setPlot(MoviePlot[position]);
            movie.setImage(MovieImage[position]);
            list.add(movie);
        }
        return list;
    }
}
