package de.hs_heilbronn.swe1.blog;

import java.util.ArrayList;
import java.util.List;

public class ArticleService {

    // Fake Database
    private List<Article> articles = new ArrayList<>();

    public Article createArticle(final Article article) {

        // save article to database
        articles.add(article);

        return article;
    }

    public Article createArticle(final String title,
                                 final String content,
                                 final Blogger blogger) {


        final Article newArticle = new Article();

        newArticle.setAuthor(blogger);
        newArticle.setTitle(title);
        newArticle.setContent(content);

        // save article to database
        articles.add(newArticle);

        return newArticle;
    }

    public List<Article> getExistingArticles() {

        return articles;
    }

}
