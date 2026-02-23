package in.sp.spring.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    private final JdbcTemplate jdbcTemplate;

    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // INSERT
    public void save(int id, String name, int marks) {
        String sql = "insert into student values(?,?,?)";
        int count = jdbcTemplate.update(sql, id, name, marks);

        if (count > 0) {
            System.out.println("✅ Student inserted successfully");
        } else {
            System.out.println("❌ Student insertion failed");
        }
    }

    // UPDATE
    public void updateName(int id, String name) {
        String sql = "update student set name=? where id=?";
        int count = jdbcTemplate.update(sql, name, id);

        if (count > 0) {
            System.out.println("✅ Student updated successfully");
        } else {
            System.out.println("❌ Student not found, update failed");
        }
    }

    // DELETE
    public void deleteById(int id) {
        String sql = "delete from student where id=?";
        int count = jdbcTemplate.update(sql, id);

        if (count > 0) {
            System.out.println("✅ Student deleted successfully");
        } else {
            System.out.println("❌ Student not found, deletion failed");
        }
    }

    // READ
    public void findNameById(int id) {
        String sql = "select name from student where id=?";

        try {
            String name = jdbcTemplate.queryForObject(sql, String.class, id);
            System.out.println("✅ Student Name: " + name);
        } catch (Exception e) {
            System.out.println("❌ Student not found");
        }
    }
}