package com.epam;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        ArticleMachine am = new ArticleMachine("Article 1", "Article 2", "Article 3");
        Article article = am.getArticle("Article 1");
        System.out.println(article.getName());
    }
}
