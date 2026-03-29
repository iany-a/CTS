package ro.ase.csie.cts.designpatterns.prototype.example2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<String> tags = new ArrayList<>();
        tags.add("#java");
        SocialPost post1 = new SocialPost("Author1", "Content1", tags);
        SocialPost post2 = (SocialPost) post1.clone();


        post2.addHashtags("#coding");

        System.out.println(post1.getHashtags());
        System.out.println(post2.getHashtags());
    }
}
