package com.example.android.bvpassist;


class Book {

    final String title;
    final String authors;
    final String smallThumbnailLink;


    public Book(
            String title,
            String authors,
            String smallThumbnailLink
    ) {

        this.title = title;
        this.authors = authors;
        this.smallThumbnailLink = smallThumbnailLink;

    }

}
