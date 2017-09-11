package com.prakash.service;

import java.util.ArrayList;
import java.util.List;

public class ProductService
{

    List<String> bookList = new ArrayList<String>();
    List<String> movieList = new ArrayList<String>();
    List<String> musicList = new ArrayList<String>();

    public ProductService()
    {
        bookList.add( "Inferno" );
        bookList.add( "Joyland" );
        bookList.add( "The Game of Thrones" );

        musicList.add( "Random Access Memories" );
        musicList.add( "Night Visions" );
        musicList.add( "Unorthodox Jukebox" );

        movieList.add( "Oz the Great and Powerful" );
        movieList.add( "Despicable Me" );
        movieList.add( "Start Trek into Darkness" );

    }

    public List<String> getProductCategories()
    {
        List<String> categories = new ArrayList<String>();
        categories.add( "Books" );
        categories.add( "Music" );
        categories.add( "Movies" );
        return categories;
    }

    public List<String> getProducts( String category )
    {
        if( category.toLowerCase().equals( "books" ) )
            return bookList;
        else if( category.toLowerCase().equals( "music" ) )
            return musicList;
        else if( category.toLowerCase().equals( "movies" ) )
            return movieList;

        return null;
    }

    public boolean addProduct( String category,
                               String product )
    {
        if( category.toLowerCase().equals( "books" ) )
            return bookList.add( product );
        else if( category.toLowerCase().equals( "music" ) )
            return musicList.add( product );
        else if( category.toLowerCase().equals( "movies" ) )
            return movieList.add( product );

        return true;
    }
}
