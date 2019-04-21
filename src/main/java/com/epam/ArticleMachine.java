package com.epam;

import java.util.ArrayList;

public class ArticleMachine {

    private ArrayList<Article> articles = new ArrayList<Article>();

    public ArticleMachine(String ... articleNames){
        for (String s : articleNames)
            this.articles.add(new Article(s));
    }

    private Article getByName(String name){
        Article article = null;
        for (Article a : articles)
            if (a.getName().equalsIgnoreCase(name))
                article = a;
            return article;
    }

    public Article getArticle(String name) throws CloneNotSupportedException{
        return getByName(name).clone();
    }

}
