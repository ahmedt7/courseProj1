package sec.project.controller;

import org.hibernate.SQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sec.project.domain.Account;
import sec.project.domain.Contact;
import sec.project.repository.ContactRepository;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;
import java.util.List;
import java.util.Map;

@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;


    //@PostConstruct
    //public void init() {
      //  contactRepository.save(new Contact("Jack", "44566", new Account("notTed", "3345")));
    //}
    @RequestMapping("*")
    public String defaultMapping() {
        return "redirect:/addcontact";
    }

    @RequestMapping(value = "/addcontact", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("contacts", contactRepository.findAll());
        return "addcontact";
    }

    @RequestMapping(value = "/addcontact", method = RequestMethod.POST)
    public String submitForm(@RequestParam String name, @RequestParam String number) {
        contactRepository.save(new Contact(name, number));
        return "redirect:/addcontact";
    }

}
