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

import pl.magda.crmsystem.model.User;


@Repository
public class UserRepository {
	
	private SimpleJdbcInsert UserInsert;
	private JdbcTemplate jdbcTemplate;
	//private RestTemplate restTemplate;

	@Autowired
	public UserRepository(DataSource dataSource){
		UserInsert = new SimpleJdbcInsert(dataSource).withTableName("User");
		jdbcTemplate = new JdbcTemplate(dataSource);
		//restTemplate = new RestTemplate();
	}

	public void addUser(User user) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("idrole",user.getIdrole());
		params.put("login",user.getLogin());
		params.put("password", user.getPassword());
		
		UserInsert.execute(params);
	}

	public List<User> findUser() {
		return jdbcTemplate.query("select * from user", new CustomerMapper());
	}
	
	public void deleteUser(Integer iduser){
		jdbcTemplate.update("delete from user where iduser=?", iduser);
	}
	
	public void editUser(User user){
		jdbcTemplate.update("update user set loggin = ?, password = ?, foto = ? where iduser = ?", 
                user.getLogin(), user.getPassword(), user.getFoto(), user.getIduser());
	}
	
	public User findUserById(Integer iduser) {
		return jdbcTemplate.queryForObject("select * from user where iduser ="+ iduser, new CustomerMapper() );
		
	}
	
	public User checkLogin(String login, String password){
		return jdbcTemplate.queryForObject("select * from user where login =\""+login+"\" and password=\""+password+"\"" , new CustomerMapper());
	}
	
	public class CustomerMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {

			User user = new User(rs.getInt("iduser"),rs.getInt("idrole"), rs.getString("login"), rs.getString("password"), rs.getString("foto"));

			return user;
		}

	}

	

}
