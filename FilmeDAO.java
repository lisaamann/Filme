package filme;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {
    public List<FilmeVO> getAllFilms() {

        List<FilmeVO> filme = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Filme", "admin", "123");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from filme");

            while (rs.next()) {
                int id = rs.getInt("id");
                String titel = rs.getString("titel");
                String land = rs.getString("land");
                int jahr = rs.getInt("jahr");

                FilmeVO film = new FilmeVO(id, titel, land, jahr);
                filme.add(film);

            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {

        }
        return filme;
    }
}
