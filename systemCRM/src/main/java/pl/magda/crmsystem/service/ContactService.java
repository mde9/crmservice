package pl.magda.crmsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.magda.crmsystem.model.Contact;
import pl.magda.crmsystem.repository.ContactRepository;


@Service
public class ContactService {
	
	
		@Autowired
		private ContactRepository contactRepository;


		public void addContact(Contact contact){
			
	     
			contactRepository.addContact(contact);
		}

		public List<Contact> findContact(){
			return contactRepository.findContact();
		}
		
		public void deleteContact(Integer idcontact){
			contactRepository.deleteContact(idcontact);
		}
		
		public void editContact(Contact contact){
			contactRepository.editContact(contact);
		}
		public List<Contact> findContactById(Integer idcontact) {
			return contactRepository.findContactById(idcontact);
			
		}
	
}
