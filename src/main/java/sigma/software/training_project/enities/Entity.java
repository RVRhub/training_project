package sigma.software.training_project.enities;

import java.util.Objects;

public class Entity {
  private Integer id;
  private String title;
  private String body;

  public Entity() {
  }

  public Entity(Integer id, String title, String body) {
    this.id = id;
    this.title = title;
    this.body = body;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Entity entity = (Entity) o;
    return Objects.equals(id, entity.id) &&
          Objects.equals(title, entity.title) &&
          Objects.equals(body, entity.body);
  }

  @Override public int hashCode() {
    return Objects.hash(id, title, body);
  }

  @Override public String toString() {
    return "Entity{" +
          "id=" + id +
          ", title='" + title + '\'' +
          ", body='" + body + '\'' +
          '}';
  }
}
