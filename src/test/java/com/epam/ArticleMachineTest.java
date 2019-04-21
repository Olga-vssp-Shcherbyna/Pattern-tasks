package com.epam;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArticleMachineTest {

    ArticleMachine am;
    @Before
    public void setAm() {
        am = new ArticleMachine("1", "2", "3");
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerException() throws CloneNotSupportedException{
        am.getArticle("ar");
    }

    @Test
    public void shouldReturnArticle() throws CloneNotSupportedException{
        assertNotNull(am.getArticle("1"));
    }
}