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

}
