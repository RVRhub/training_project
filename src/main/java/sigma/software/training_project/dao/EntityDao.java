package sigma.software.training_project.dao;

import sigma.software.training_project.enities.Entity;

import java.util.Set;

public interface EntityDao {
  Entity getEntityById(Integer id);
  Set<Entity> getAllUsers();
  boolean insertEntity();
  boolean updateEntity();
  boolean deleteEntity();
}
