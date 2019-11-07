package sigma.software.training_project.dao;

import sigma.software.training_project.enities.Entity;
import sigma.software.training_project.utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

public class EntityDaoImpl implements EntityDao {

  public static final String GET_ENTRIES_BY_ID = "SELECT * FROM public.entries WHERE id =";

  @Override
  public Entity getEntityById(Integer id) {
    Connection connection = ConnectionFactory.getConnection();
    try {
      Statement stmt = connection.createStatement();
      ResultSet rs = stmt
            .executeQuery(GET_ENTRIES_BY_ID + id);
      if(rs.next())
      {
        Entity user = new Entity();
        user.setId( rs.getInt("id") );
        user.setTitle( rs.getString("title") );
        user.setBody( rs.getString("body") );
        return user;
      }
    } catch (SQLException ex) {
      throw new RuntimeException(ex);
    }
    return null;
  }

  @Override
  public Set<Entity> getAllUsers() {
    return null;
  }

  @Override
  public boolean insertEntity() {
    return false;
  }

  @Override public boolean updateEntity() {
    return false;
  }

  @Override
  public boolean deleteEntity() {
    return false;
  }
}
