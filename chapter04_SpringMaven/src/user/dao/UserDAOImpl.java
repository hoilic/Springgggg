package user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import user.bean.UserDTO;

@Repository
//public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {
public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO {
	@Autowired
	public void setDataSource(BasicDataSource dataSource) {
		super.setDataSource(dataSource);
	}
	
	@Override
	public void write(UserDTO userDTO) {
		/*
		String sql="insert into usertable values(?,?,?)";
		getJdbcTemplate().update(sql
						, userDTO.getName()
						, userDTO.getId()
						, userDTO.getPwd());	
						*/
		String sql="insert into usertable values(:name, :id, :pwd)";
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", userDTO.getName());
		map.put("id", userDTO.getId());
		map.put("pwd", userDTO.getPwd());
		
		getNamedParameterJdbcTemplate().update(sql, map);
	}

	@Override
	public List<UserDTO> getUserList() {
		String sql="select * from usertable";
		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));	
	}

	@Override
	public UserDTO getUser(String id) {
		String sql="select * from usertable where id=?";
		try {return getJdbcTemplate().queryForObject(
				sql, 
				new BeanPropertyRowMapper<UserDTO>(UserDTO.class)
				,id);
			
		} catch (EmptyResultDataAccessException e) {
			return null;
		}			
	}

	@Override
	public void update(Map<String, String> map) {
		String sql="update usertable set name=:name, pwd=:pwd where id=:id";
		//getJdbcTemplate().update(sql, map.get("name"), map.get("pwd"),map.get("id"));
		getNamedParameterJdbcTemplate().update(sql,  map);
	}

	@Override
	public void delete(String id) {
		String sql="delete usertable where id=:id";
		getJdbcTemplate().update(sql, id);		
	}

}
