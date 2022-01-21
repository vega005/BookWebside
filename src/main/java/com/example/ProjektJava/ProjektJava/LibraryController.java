package com.example.ProjektJava.ProjektJava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class LibraryController {

    Logger logger = LogManager.getLogger(LibraryController.class);

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/search")
    public String contact(Model model) {

        Iterable<Book> book = bookRepository.findAll();
        model.addAttribute("book", book);

        return "search";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        logger.info("go to details, id=" + id);
        Optional<Book> book = bookRepository.findById(id);
        model.addAttribute("book", book);

        return "details";
    }

}
