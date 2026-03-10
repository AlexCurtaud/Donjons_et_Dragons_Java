package Dao;

import Characters.Character;

import java.sql.SQLException;
import java.util.List;

public interface CharacterDao {
    void find(int id) throws SQLException;
    List<Character> findAll() throws SQLException;
    void create(Character player) throws SQLException;
    void update(Character player) throws SQLException;
    void changeHealth(int id) throws SQLException;
}
