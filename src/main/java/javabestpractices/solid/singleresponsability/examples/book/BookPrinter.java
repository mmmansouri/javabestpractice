package javabestpractices.solid.singleresponsability.examples.book;

public class BookPrinter {


    public void printBookTextInSystemConsole(Book book){

        System.out.println(book.getText());

    }

    public void printBookTextForHtml(Book book){

        /// code specific for HTML
    }
}
