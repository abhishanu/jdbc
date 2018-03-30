package com.abhi.spring.jdbc;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class DataBaseTestMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/abhi/spring/jdbc/jdbcConfig.xml");

		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");

		SimpleJdbcCall jdbcCall = (SimpleJdbcCall) applicationContext.getBean("jdbcCall");

		SimpleJdbcCall withProcedureName = jdbcCall.withProcedureName("getBooks");

		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", 12);

		Map<String, Object> out = jdbcCall.execute(in);

		out.get("book_name");
		out.get("out_id");

		System.out.println(out.get("book_name") + "::" + out.get("out_id"));

		System.out.println(out);

		/*
		 * String sql = "insert into book values(?,?,?)";
		 * 
		 * int result = jdbcTemplate.update(sql, new Integer(10), "Java",
		 * "Oracle");
		 * 
		 * 
		 * String sql = "delete from books where id=?"; int result =
		 * jdbcTemplate.update(sql, new Integer(10));
		 * 
		 * if (result == 1) { System.out.println("Data Inserted");
		 * 
		 * String query = "select * from books";
		 * 
		 * BooksRowMapper rowMapper = new BooksRowMapper(); Book books =
		 * jdbcTemplate.queryForObject(sql, rowMapper);
		 * System.out.println(books);
		 * 
		 * } else { System.out.println("Failure"); }
		 */

	}

}
