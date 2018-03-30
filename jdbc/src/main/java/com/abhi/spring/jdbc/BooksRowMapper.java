package com.abhi.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BooksRowMapper implements RowMapper<ProcedureData> {

	@Override
	public ProcedureData mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProcedureData data = new ProcedureData();
		data.setId(rs.getInt("out_id"));
		data.setName(rs.getString("book_name"));
		return data;
	}

}
