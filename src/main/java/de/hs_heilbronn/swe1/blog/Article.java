package de.hs_heilbronn.swe1.blog;

import java.util.Set;

public class Article {

    private Integer id;
    private String title;
    private String content;
    private Blogger author;

    private Set<Tag> assignedTags;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public Blogger getAuthor() {
        return author;
    }

    public void setAuthor(final Blogger author) {
        this.author = author;
    }

    public void addTag(final Tag tag) {
        assignedTags.add(tag);
    }

    public void removeTag(final Tag tag) {

        for (Tag existingTag : assignedTags) {
            if (existingTag.getName().equals(tag.getName())) {
                assignedTags.remove(tag);
            }

            assignedTags.removeIf(t ->
                t.getName().equals(tag.getName()));
        }
    }
}
