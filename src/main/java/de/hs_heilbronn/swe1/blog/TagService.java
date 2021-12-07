package de.hs_heilbronn.swe1.blog;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class TagService {

    private final Set<Tag> tagDatabase = new HashSet<>();

    public Tag createTag(final String name) {

        Tag newTag = null;

        // check existing tag in database
        // if a tag exists with the name, use it and do not
        // create a new one.
        for (Tag tag : tagDatabase) {

            if (tag.getName().equals(name)) {
                newTag = tag;
                break;
            }
        }

        if (newTag == null) {
            newTag = new Tag();
            newTag.setName(name);
            newTag.setCreatedDate(LocalDateTime.now());
            tagDatabase.add(newTag);
        }

        return newTag;
    }

    public Set<Tag> getAllExistingTags() {

        return tagDatabase;
    }
}
