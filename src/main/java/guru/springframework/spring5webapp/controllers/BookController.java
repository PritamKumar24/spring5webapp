package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BooKRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BooKRepository booKRepository;

    public BookController(BooKRepository booKRepository) {
        this.booKRepository = booKRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", booKRepository.findAll());

        return "books/list";
    }
}
