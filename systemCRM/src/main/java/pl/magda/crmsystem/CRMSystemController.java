package pl.magda.crmsystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.magda.crmsystem.model.Contact;
import pl.magda.crmsystem.model.User;

import pl.magda.crmsystem.service.ContactService;
import pl.magda.crmsystem.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CRMSystemController {

	@Autowired
	private ContactService contactService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginForm(Model model) {

		/*
		 * List<User> listUser = userService.findUser();
		 * 
		 * model.addAttribute("listuser", listUser);
		 */

		User user = new User();

		model.addAttribute("user", user);

		return "login";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String login(User user, Model model) {
		User check;
		try {
			check = userService.checkLogin(user.getLogin(), user.getPassword());

		} catch (Exception e) {
			return "redirect:/";
		}

		model.addAttribute("check", check);

		return "profile";

	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String userList(Model model) {

		List<User> listUser = userService.findUser();

		model.addAttribute("listuser", listUser);

		return "user";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String listContact(Model model) {

		List<Contact> listcontact = contactService.findContact();

		model.addAttribute("listcontact", listcontact);

		return "contact";
	}

	@RequestMapping(value = "/deletecontact", method = RequestMethod.GET)
	public String delete(@RequestParam("idcontact") Integer idcontact, Model model) {

		contactService.deleteContact(idcontact);

		return "redirect:/contact";

	}

	@RequestMapping(value = "/editcontact", method = RequestMethod.GET)
	public String editForm(@RequestParam("idcontact") Integer idcontact, Model model) {

		List<Contact> listContact = contactService.findContactById(idcontact);

		model.addAttribute("contact", listContact.get(0));

		return "editcontact";
	}

	@RequestMapping(value = "/editcontact", method = RequestMethod.POST)
	public String editContact(Contact contact, Model model) {

		contactService.editContact(contact);

		return "redirect:/contact";

	}

	@RequestMapping(value = "/addcontact", method = RequestMethod.GET)
	public String addContac(Model model) {

		Contact contact = new Contact();

		model.addAttribute("contact", contact);

		return "addcontact";
	}

	@RequestMapping(value = "/addcontact", method = RequestMethod.POST)
	public String saveContact(Contact contact, Model model) {

		contactService.addContact(contact);
		

		return "redirect:/contact";

	}

}
