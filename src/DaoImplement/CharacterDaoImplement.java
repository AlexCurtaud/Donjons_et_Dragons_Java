package DaoImplement;

import Characters.Character;
import DB.DatabaseConnection;
import Dao.CharacterDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CharacterDaoImplement implements CharacterDao {
    static Connection con = DatabaseConnection.mySqlConnection();

    @Override
    public void find(int id) {

    }

    @Override
    public List<Character> findAll() throws SQLException {
        String query = "SELECT * FROM `character`";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        ResultSet result = preparedStatement.executeQuery();
        while(result.next()) {

        }

        System.out.println("Query Successful");
        return stat;
    }

    @Override
    public void create(Character player) {

    }

    @Override
    public void update(Character player) {

    }

    @Override
    public void changeHealth(int id) {

    }
}
