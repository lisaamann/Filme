package filme;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GenreDAO {
    public List<GenreVO> getAllGenres() {

        List<GenreVO> genre = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Filme", "admin", "123");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from genre");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                GenreVO genre1 = new GenreVO(id, name);
                genre.add(genre1);

            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {

        }
        return genre;
    }

}
