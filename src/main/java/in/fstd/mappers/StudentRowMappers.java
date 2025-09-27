package in.fstd.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.fstd.beans.Student;

public class StudentRowMappers implements RowMapper<Student>
{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std =new Student();
		std.setRollno(rs.getInt("std_roll"));
		std.setMarks(rs.getFloat("std_marks"));
		std.setName(rs.getString("std_name"));
		return std;
	}
	

}
