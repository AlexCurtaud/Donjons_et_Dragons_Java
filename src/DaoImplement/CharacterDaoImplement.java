package DaoImplement;

import Characters.Character;
import Characters.Warrior;
import Characters.Wizard;
import DB.DatabaseConnection;
import Dao.CharacterDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class CharacterDaoImplement implements CharacterDao {
    static Connection con = DatabaseConnection.mySqlConnection();

    @Override
    public List<Character> findAll() throws SQLException {
        String query = "SELECT * FROM `character`";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();
        List<Character> players = new ArrayList<>();
        while(rs.next()) {
            Character player = null;
            int id = rs.getInt("Id");
            String type = rs.getString("Type");
            String name = rs.getString("Name");
            int vitality = rs.getInt("Health");
            int OffensiveEquipmentId = rs.getInt("OffensiveEquipment");
            int DefensiveEquipmentId = rs.getInt("DefensiveEquipment");

            switch(type) {
                case "Wizard" :
                    player = new Wizard(name, type, vitality);
                    break;
                case "Warrior" :
                    player = new Warrior(name, type, vitality);
                    break;
                default:
                    System.out.println("error, player type doesn't exist");
            }
            if (player != null) {
                player.setId(id);
                players.add(player);
            }
        }
        return players;
    }

    @Override
    public int create(Character player) throws SQLException {
            String query = "INSERT INTO `character` (Name, Type, Health, Strength) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, player.getName());
            stmt.setString(2, player.getType());
            stmt.setInt(3, player.getHealthStat());
            stmt.setInt(4, player.getAttackStat());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            int generatedId = 0;
            if(rs.next()) {
                System.out.println(rs.getInt(1));
                generatedId = rs.getInt(1);
            }
            System.out.println("Player Saved");
            return generatedId;
    }

    @Override
    public void update(Character player) throws SQLException{
        String query = "UPDATE `character` SET Nom = ? WHERE id=? ";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, player.getName());
        stmt.setInt(2, player.getId());
        stmt.executeUpdate();
    }

    @Override
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM `character` WHERE id=?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.executeUpdate();
    }

    @Override
    public void changeHealth(Character player) throws SQLException{
        String query = "UPDATE `character` SET Health=? WHERE id=?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(1, player.getHealthStat());
        stmt.executeUpdate();
    }
}
