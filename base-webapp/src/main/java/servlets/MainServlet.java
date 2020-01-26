package servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import persist.ProductRepository;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "MainServlet", urlPatterns = "/")
public class MainServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(MainServlet.class);
    private ProductRepository productRepository;

    @Override
    public void init() throws ServletException {
        this.productRepository = (ProductRepository) getServletContext().getAttribute("productRepository");

        if (productRepository == null) {
            throw new ServletException("ProductRepository not created");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            if (req.getServletPath().equals("/")) {
                req.setAttribute("products", productRepository.findAll());
                getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
//            } else if (req.getServletPath().equals("/create")) {
//                showCreateProductPage(req, resp);
//            } else if (req.getServletPath().equals("/edit")) {
//                showEditProductPage(req, resp);
//            } else if (req.getServletPath().equals("/delete")) {
//                deleteProduct(req, resp);
//            }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
