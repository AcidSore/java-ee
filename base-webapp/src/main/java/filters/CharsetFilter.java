package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import javax.servlet.Filter;
import java.util.logging.LogRecord;

@WebFilter("/*")
public class CharsetFilter implements Filter{
    // кодировка
    private String encoding;

    public void init(FilterConfig config) throws ServletException {
        // &#x447;&#x438;&#x442;&#x430;&#x435;&#x43c; &#x438;&#x437; &#x43a;&#x43e;&#x43d;&#x444;&#x438;&#x433;&#x443;&#x440;&#x430;&#x446;&#x438;&#x438;
        encoding = config.getInitParameter("requestEncoding");

        // если не установлена — устанавливаем UTF-8
        if (encoding == null) encoding = "UTF-8";
    }

    public void doFilter(ServletRequest request,
                         ServletResponse response, FilterChain next)
            throws IOException, ServletException {
        request.setCharacterEncoding(encoding);
        next.doFilter(request, response);
    }

    public void destroy() {
    }
}