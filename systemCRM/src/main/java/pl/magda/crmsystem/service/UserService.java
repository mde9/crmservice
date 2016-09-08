package pl.magda.crmsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.magda.crmsystem.model.User;
import pl.magda.crmsystem.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;


	public void addUser(String idrole, String login, String password){
		User user = new User();

      
		userRepository.addUser(user);
	}

	public List<User> findUser(){
		return userRepository.findUser();
	}
	
	public void deleteUser(Integer idUser){
		userRepository.deleteUser(idUser);
	}
	
	public void editUser(User user){
		userRepository.editUser(user);
	}
	public User findUserById(Integer iduser) {
		return userRepository.findUserById(iduser);
		
	}
	
	public User checkLogin(String login, String password){
		return userRepository.checkLogin(login, password);
	}


}
