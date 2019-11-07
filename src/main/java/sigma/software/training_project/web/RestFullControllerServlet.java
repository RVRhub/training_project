package sigma.software.training_project.web;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sigma.software.training_project.dao.EntityDao;
import sigma.software.training_project.dao.EntityDaoImpl;
import sigma.software.training_project.enities.Entity;

import java.io.IOException;

public class RestFullControllerServlet extends HttpServlet {

  private static final Logger LOG = LoggerFactory.getLogger(RestFullControllerServlet.class);

  private EntityDao entityDao = new EntityDaoImpl();

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String id = request.getParameter("id");
    LOG.info("Get Entity Id: " + id);

    if(id != null){
      Entity entity = entityDao.getEntityById(Integer.parseInt(id));

      String json = "{\n";
      json += "\"id\": \"" + entity.getId() + "\",\n";
      json += "\"title\": \"" + entity.getTitle() + "\",\n";
      json += "\"body\": \"" + entity.getBody() + "\" \n";
      json += "}";
      response.getOutputStream().println(json);
    }
    else{
      //TODO: Need to implement Get All
      response.getOutputStream().println("{}");
    }
  }

  /**
   * Need to implement full RestFull API
   * Methods: GET/POST/PUT/DELETE
   */
}
