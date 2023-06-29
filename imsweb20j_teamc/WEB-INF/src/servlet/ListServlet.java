
package servlet;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

import bean.Inquiry;
import dao.InquiryDAO;

public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String error = "";
		String cmd = "";
		String sortString = "";

		try {

			//ソートする項目を取得
			String sort = request.getParameter("sort");

			//取得できなかった場合ソート対象はinquiry_idとする
			if(sort == null) {
				sortString = "ソート項目を選択";
				sort = "inquiry_id";
			}

			if(sort.equals("date")) {
				sortString = "受信日時順";
			}else if(sort.equals("category")) {
				sortString = "項目順";
			}else if(sort.equals("status")) {
				sortString = "返信状況順";
			}

			// InquiryDAOをインスタンス化する
			InquiryDAO objDao = new InquiryDAO();

			// 関連メソッドを呼び出し、戻り値としてInquiryオブジェクトのリストを取得する
			ArrayList<Inquiry> list = objDao.selectAll(sort);

			// 取得したListをリクエストスコープに"inquiry_list"という名前で格納する
			request.setAttribute("inquiry_list", list);

			//ソートの文字をリクエストスコープに登録
			request.setAttribute("sortString", sortString);

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、一覧表示はできませんでした。";
			cmd = "logout";
		} finally {
			// エラーの有無でフォワード先を呼び分ける
			if (error.equals("")) {
				// エラーが無い場合はlist.jspにフォワード
				request.getRequestDispatcher("/view/list.jsp").forward(request, response);
			} else {
				// エラーが有る場合はerror.jspにフォワードする
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}
		}

	}
}
