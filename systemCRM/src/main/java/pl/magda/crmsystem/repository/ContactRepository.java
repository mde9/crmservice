package pl.magda.crmsystem.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import pl.magda.crmsystem.model.Contact;

@Repository
public class ContactRepository {

	private SimpleJdbcInsert contactInsert;
	private JdbcTemplate jdbcTemplate;
	//private RestTemplate restTemplate;

	@Autowired
	public ContactRepository(DataSource dataSource){
		contactInsert = new SimpleJdbcInsert(dataSource).withTableName("contact");
		jdbcTemplate = new JdbcTemplate(dataSource);
		//restTemplate = new RestTemplate();
	}

	public void addContact(Contact contact) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("firstName", contact.getFirstName());
		params.put("lastName", contact.getLastName());
		params.put("companyName", contact.getCompanyName());
		params.put("email", contact.getEmail());
		params.put("phone", contact.getPhone());
		contactInsert.execute(params);
	}

	public List<Contact> findContact() {
		return jdbcTemplate.query("select * from contact", new CustomerMapper());
	}
	
	public void deleteContact(Integer idcontact){
		jdbcTemplate.update("delete from contact where idcontact=?", idcontact);
	}
	
	public void editContact(Contact contact){
		jdbcTemplate.update("update contact set firstName = ?, lastName = ?, companyName = ?, email = ?, phone = ? where idcontact = ?", 
                contact.getFirstName(), contact.getLastName(), contact.getCompanyName(), contact.getEmail(), contact.getPhone(), contact.getIdcontact());
	}
	
	public List<Contact> findContactById(Integer idcontact) {
		return jdbcTemplate.query("select * from contact where idcontact ="+ idcontact, new CustomerMapper() );
		
	}
	
	public class CustomerMapper implements RowMapper<Contact> {

		@Override
		public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {

			Contact contact = new Contact(rs.getInt("idcontact"),rs.getString("firstName"), rs.getString("lastName"), rs.getString("companyName"), rs.getString("email"), rs.getString("phone"));

			return contact;
		}

	}

	
}
