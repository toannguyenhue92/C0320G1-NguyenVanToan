import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet", urlPatterns = "/product-discount")
public class ProductDiscountServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String productName = request.getParameter("product_name");
        double price = Double.parseDouble(request.getParameter("price"));
        double discount = Double.parseDouble(request.getParameter("discount_percent"));
        double discounted_price = price * (1 - discount / 100);
        double discounted_amount = price - discounted_price;
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print("Sản phẩm: " + productName);
        writer.print(", Số tiền chiết khấu: " + discounted_amount);
        writer.print(", Giá sản phẩm sau khi chiết khấu: " + discounted_price);
    }
}
