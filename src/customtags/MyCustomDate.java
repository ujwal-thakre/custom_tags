package customtags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyCustomDate extends SimpleTagSupport {

	private String format;
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println(
				"<h4> My Custom Date: " + new SimpleDateFormat(format).format(new Date()) + "</h4>");
	}
	

	public void setFormat(String format) {
		this.format = format;
	}

}
