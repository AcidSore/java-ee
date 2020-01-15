package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import persist.ProductRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "CartController", urlPatterns = "/cart")
public class CartController extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Override
    public void init() throws ServletException {

    }


}
