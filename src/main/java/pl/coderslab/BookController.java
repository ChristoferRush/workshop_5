package pl.coderslab;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    private MockBookList mockBookList;

    @RequestMapping("/hello")
    public String hello(){
        return "{hello: world}";
    }

    @RequestMapping("/helloBook")
    public Book helloBook(){
        return new Book(1L, "9788324631766","Thiniking in Java",
                "Bruce Eckel","Helion","programming");
    }
}
