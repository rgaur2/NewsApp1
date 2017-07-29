package com.example.rish.newsapp.Model;

public class News {

    private String author;
    private String title;
    private String desc;
    private String url;
    private String imageurl;
    private String date;


    public News(String author, String title, String desc, String url, String image, String date)
    {
        this.author=author;
        this.title=title;
        this.desc=desc;
        this.url=url;
        this.imageurl=image;
        this.date=date;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}