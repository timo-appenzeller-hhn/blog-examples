package de.hs_heilbronn.swe1.blog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArticleTest {

    @Test
    void articleTest() {
        final var article = new Article();

        Assertions.assertNull(article.getAuthor());
        Assertions.assertNull(article.getContent());
        Assertions.assertNull(article.getId());
        Assertions.assertNull(article.getTitle());
    }

    @Test
    void getBloggerName() {

        final var blogger = new Blogger();
        blogger.setFirstName("Timo");
        blogger.setLastName("Appenzeller");

        final var article = new Article();
        article.setAuthor(blogger);


        Blogger authorOfTheArticle = article.getAuthor();

        String fullName =
            authorOfTheArticle.getFirstName() + authorOfTheArticle.getLastName();

        Assertions.assertEquals("TimoAppenzeller", fullName);
    }
}
