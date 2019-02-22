package Hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BuddyController {

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