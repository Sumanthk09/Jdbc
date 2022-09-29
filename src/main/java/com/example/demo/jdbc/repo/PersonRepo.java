package com.example.demo.jdbc.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.jdbc.dto.Person;
@Repository
public class PersonRepo 
{
	@Autowired
	JdbcTemplate jdbcTemplate;

	RowMapper<Person> myrmp=(rs,num)->{
		Person person=new Person(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
		return person;
	};
	public List<Person> FetchAllPersons()
	{
		String sqlquery="select * from persons";
		return jdbcTemplate.query(sqlquery,myrmp);
		
	}
	public void AddPerson(Person p) 
	{
		
		String sqlquery="insert into persons values("+p.getId()+",'"+p.getFname()+"','"+p.getLname()+"','"+p.getAdress()+"','"+p.getCity()+"')";
		jdbcTemplate.update(sqlquery);
	}
	public List<Person> Addallpersons(List<Person> lp) 
	{
		String sqlquery="insert into persons (PersonID,firstName,lastName,address,city) values (?,?,?,?,?)";
		List<Object[]> barg=new ArrayList<>();
		for(Person i:lp)
		{
			Object[] objectarr= {i.getId(),i.getFname(),i.getLname(),i.getAdress(),i.getCity()};
			barg.add(objectarr);
		}
		jdbcTemplate.batchUpdate(sqlquery, barg);
		return this.FetchAllPersons();
	}
	public List<Person> UpdatePerson(Person p)
	{
		String query="Update persons set PersonID="+p.getId()+" where FirstName='"+p.getFname()+"'";
		jdbcTemplate.update(query);
		return this.FetchAllPersons();
	}
}

