

import services.ProductServiceWs;

import javax.xml.ws.WebServiceClient;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient
public class WsClient {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/base-webapp/ProductRepositoryWs?WSDL");
        ProductServiceWsImpl  productService  = new ProductServiceWsImpl(url);
        ProductServiceWs productServiceWs = productService.getSampleServiceImplPort();
        productServiceWs.findAll();
        }
}
