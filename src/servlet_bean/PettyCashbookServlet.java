package pac1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PettyCashbookServlet
 */
@WebServlet("/PettyCashbookServlet")
public class PettyCashbookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PettyCashbookBean pettyCashbookBean = new PettyCashbookBean();

    public PettyCashbookServlet() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int payment;
        String comment;

        try {
        	payment = Integer.parseInt(request.getParameter("payment"));
        	comment = request.getParameter("comment");
        } catch(NumberFormatException e) {
        	getServletContext().getRequestDispatcher("/errorinput.html").forward(request, response);
        	return;
        }

		PaymentRecordBean payRecord = new PaymentRecordBean();
		payRecord.setPayment(payment);
		payRecord.setComment(comment);

		pettyCashbookBean.addPaymentHistoryArray(payRecord);

		HttpSession session = request.getSession();
		session.setAttribute("pettyCashbookBean", pettyCashbookBean);

		getServletContext().getRequestDispatcher("/pettycashbook_output.jsp").forward(request,  response);
	}

}
