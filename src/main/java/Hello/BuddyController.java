package Hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BuddyController {

    @GetMapping("/jsbuddysel")
    public String jsSel(Model model) {
        model.addAttribute("book", new AddressBook());
        return "jsbuddySel";
    }

    @PostMapping("/jsbuddysel")
    public String jsHome(Model model, @ModelAttribute AddressBook book) {
        if(book.getId() == 0){
            return "jsindex";
        } else if(book.getId() == 1){
            return "jsindex1";
        } else if(book.getId() == 2){
            return "jsindex2";
        } else if(book.getId() == 3){
            return "jsindex3";
        } else if(book.getId() == 4){
            return "jsindex4";
        }
        return "jsindex";
    }

    @GetMapping("/homebuddy")
    public String buddyHome(Model model) {
        return "buddyHome";
    }

    @GetMapping("/listbuddy")
    public String buddyList(Model model) {
        return "buddylist";
    }

    @GetMapping("/makebuddy")
    public String buddyForm(Model model) {
        model.addAttribute("buddy", new BuddyInfo());
        return "buddy";
    }

    @PostMapping("/makebuddy")
    public String buddySubmit(Model model, @ModelAttribute BuddyInfo buddy) {
        model.addAttribute("buddy", buddy);
        return "buddyresult";
    }

}