package id.ac.sttindonesia.belajarspringboot;

import id.ac.sttindonesia.belajarspringboot.UserEntity;
import id.ac.sttindonesia.belajarspringboot.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Controller
public class UserController
{
  @Autowired private UserService service;

  @GetMapping("/user")
  public String index(Model model)
  {
    List<UserEntity> daftarPengguna = service.listAll();
    model.addAttribute("daftar_pengguna", daftarPengguna);
    
    return "user/user-index";
  }
  @GetMapping("/user/create")
  public String create(Model model)
  {
    model.addAttribute("pengguna", new UserEntity());
    return "user/user-create";
  }
  @PostMapping("/user/store")
  public String store(UserEntity pengguna)
  {
    service.save(pengguna);
    return "redirect:/user";
  }
}