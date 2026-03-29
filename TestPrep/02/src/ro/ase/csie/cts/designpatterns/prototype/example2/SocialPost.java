package ro.ase.csie.cts.designpatterns.prototype.example2;

import java.util.ArrayList;

public class SocialPost implements Cloneable{
    private String author;
    private String content;
    private ArrayList<String> hashtags;

    public SocialPost(String author, String content, ArrayList<String> hashtags) {
        this.author = author;
        this.content = content;
        this.hashtags = new ArrayList<String>(hashtags);
        System.out.println("Parameterized constructor");
    }

    public void addHashtags(String hashtag) {
        this.hashtags.add(hashtag);
    }

    public ArrayList<String> getHashtags() {
        return hashtags;
    }

    private SocialPost(){
        System.out.println("Default constructor...");
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        SocialPost copy = new SocialPost();
        copy.author = this.author;
        copy.content = this.content;
        copy.hashtags = new ArrayList<String>(this.hashtags);
        System.out.println("Copy done.");
        return copy;
    }
}
