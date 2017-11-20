package pl.coderslab;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockBookList {

    List<Book> listOfBooks = new ArrayList<>();

    public MockBookList(){
        listOfBooks.add(new	Book(1L,	"9788324631766", "Thiniking in Java",
                "Bruce Eckel", "Helion",	"programming"));
        listOfBooks.add(new	Book(2L,	"9788324627738","Rusz	glowa Java.",
                "Sierra Kathy, Bates	Bert",	"Helion", "programming"));
        listOfBooks.add(new	Book(3L,	"9780130819338", "Java 2. Podstawy",
                "Cay	Horstmann, Gary Cornell", "Helion", "programming"));
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void addBookToList(Book book){
        listOfBooks.add(book);
    }

    public Book getBookFromList(Long id){
        for(Book book : listOfBooks){
            if(book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }

    public void updateBookFromList(Long id, String isbn, String title, String author, String publisher, String type){
        for(Book book : listOfBooks){
            if(book.getId().equals(id)){
                book.setIsbn(isbn);
                book.setTitle(title);
                book.setAuthor(author);
                book.setPublisher(publisher);
                book.setType(type);
            }
        }
    }

    public void removeBookFromList(Long id){
        for(Book book : listOfBooks){
            if (book.getId().equals(id)){
                listOfBooks.remove(book);
            }
        }
    }
}
