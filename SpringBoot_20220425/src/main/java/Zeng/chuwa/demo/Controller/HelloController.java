package Zeng.chuwa.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot!";
    }

    @GetMapping("/books/{id}")
    @ResponseBody
    public Book getOneBook (@PathVariable int id){
        ArrayList<Book> bookList = new ArrayList<Book>();
        ArrayList<String> test = new ArrayList<String>();
        Book book0 = new Book("Algorithm",
                "Professor Algorithm",
                "Computer algorithm in java",
                "ISBN 278801");
        Book book1 = new Book("History",
                "Professor History",
                "About the Western medieval history.",
                "ISBN 123456");
        Book book2 = new Book("Computer",
                "Professor Computer",
                "Java Programming",
                "ISBN 135796");
        Book book3 = new Book("Writing",
                "Professor Writing",
                "English Writing",
                "ISBN 2468012");
        bookList.add(book0);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        Book myBook = bookList.get(id);
        return myBook;
    }

}


