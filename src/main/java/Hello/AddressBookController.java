package Hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddressBookController {

    @GetMapping("/makebook")
    public String greetingForm(Model model) {
        model.addAttribute("book", new AddressBook());
        return "book";
    }

    @PostMapping("/makebook")
    public String greetingSubmit(Model model, @ModelAttribute AddressBook book) {
        model.addAttribute("book", book);
        return "result";
    }

}