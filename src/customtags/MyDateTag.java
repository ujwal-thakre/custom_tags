package customtags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyDateTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {

		JspWriter out = getJspContext().getOut();
		out.println(
				"<h4> Current Date is: " + new SimpleDateFormat("dd-MM-yyy hh:mm:ss EEE").format(new Date()) + "</h4>");
	}

}
