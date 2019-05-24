package javabestpractices.solid.singleresponsability.examples.book;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {



    @Test
    public void should_replace_text(){

        Book book=new Book("Mohamed Moez MANSOURI","The Book of my Life","Be the Best of Yourself, Work Work Work!");


        String replacement="Dont try to best someone else";
        book.replaceWordInText("Work Work Work","Dont try to best someone else");

        assertTrue(book.getText().contains(replacement));
    }
}