package de.hs_heilbronn.swe1.blog;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TagServiceTest {

    private final TagService tagService = new TagService();

    @Test
    void testTagService() {

        final Tag myCreatedTag = tagService.createTag("Software Engineering");

        Assertions.assertEquals("Software Engineering", myCreatedTag.getName());
        Assertions.assertNotNull(myCreatedTag.getCreatedDate());

        final Tag myCreatedTag2 = tagService.createTag("Software Engineering");

        Assertions.assertEquals("Software Engineering", myCreatedTag.getName());
        Assertions.assertEquals(myCreatedTag, myCreatedTag2);

        final Set<Tag> allTags = tagService.getAllExistingTags();

        Assertions.assertEquals(1, allTags.size());

        for (Tag tag : allTags) {
            Assertions.assertEquals("Software Engineering", tag.getName());
        }

    }
}
