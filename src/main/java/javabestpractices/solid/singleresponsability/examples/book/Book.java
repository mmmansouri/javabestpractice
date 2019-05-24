package javabestpractices.solid.singleresponsability.examples.book;

import lombok.Data;
import lombok.NonNull;

@Data
public class Book {

    @NonNull
    private String author;

    @NonNull
    private String name;

    @NonNull
    private String text;


    public void replaceWordInText(String toRelpace, String replacement) {

        StringBuilder stringBuilder = new StringBuilder(this.text);

        int startAt = this.text.indexOf(toRelpace);
        int endAt = startAt + toRelpace.length();

        stringBuilder.delete(startAt, endAt);

        this.text = stringBuilder.replace(startAt, endAt, replacement).toString();

    }

    //This an anti-pattern against the "Single Responsibility Principle", Use BookPrinter Class for the printing feature.
    public void printBookText(){
        System.out.println(this.text);
    }


    //This an anti-pattern against the "Single Responsibility Principle", Use BookLocator Class for the printing feature.
    public void getBookLocation(){
        System.out.println(this.text);
    }

}
