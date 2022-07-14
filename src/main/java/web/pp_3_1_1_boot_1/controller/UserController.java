package web.pp_3_1_1_boot_1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.pp_3_1_1_boot_1.model.User;
import web.pp_3_1_1_boot_1.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String allUsers(Model model) {
        model.addAttribute("userList", userService.allUsers());
        return "users";
    }

    @GetMapping("/edit/{id}")
    public String editPage(@PathVariable long id, Model modelMap) {
        modelMap.addAttribute("user", userService.getById(id));
        return "editPage";
    }

    @PostMapping("/edit")
    public String editUser(@ModelAttribute("user") User user) {
        userService.edit(user);
        return "redirect:/users";
    }

    @GetMapping("/add")
    public String addPage() {
        return "editPage";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable long id) {
        userService.delete(userService.getById(id));
        return "redirect:/users";
    }

}

