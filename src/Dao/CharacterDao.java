package Dao;

import Characters.Character;

import java.sql.SQLException;
import java.util.List;

public interface CharacterDao {
    List<Character> findAll() throws SQLException;
    int create(Character player) throws SQLException;
    void update(Character player) throws SQLException;
    void delete(int id) throws SQLException;
    void changeHealth(Character player) throws SQLException;
}
