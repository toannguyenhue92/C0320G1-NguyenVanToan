import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet", urlPatterns = "/en-vi")
public class EnglishVietnameseDictionaryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
        String textSearch = request.getParameter("textSearch");
        String result = dictionary.get(textSearch);
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();
        if (result == null) {
            writer.println("Không tìm thấy!");
        } else {
            writer.println("Word: " + textSearch);
            writer.println("Result: " + result);
        }
    }
}
