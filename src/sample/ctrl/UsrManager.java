package sample.ctrl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.dao.UsrInfo;

/**
 * Servlet implementation class UserManager
 */
@WebServlet("/UsrManager")
public class UsrManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsrManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		if(req.getParameter("reg") != null){
			res.setContentType("text/html; charset=UTF-8");
			PrintWriter out = res.getWriter();
			out.println("工事中・・・3秒後にメニューに遷移します。");
			res.setHeader("Refresh", "3 URL=index.html");
		}
		else if(req.getParameter("view") != null){
			RequestDispatcher dispatch = req.getRequestDispatcher("UsrView.jsp");
			req.setAttribute("AllUsr", getAllUsrData());
			dispatch.forward(req, res);
		}
		else if(req.getParameter("export") != null){
		    export(res,getAllUsrData());
//		    res.sendRedirect("index.html");
		}
		else if(req.getParameter("import") != null){
			res.setContentType("text/html; charset=UTF-8");
			PrintWriter out = res.getWriter();
			out.println("工事中・・・3秒後にメニューに遷移します。");
			res.setHeader("Refresh", "3 URL=index.html");
		}
		else{
			res.setContentType("text/html; charset=UTF-8");
			PrintWriter out = res.getWriter();
			out.println("工事中・・・3秒後にメニューに遷移します。");
			res.setHeader("Refresh", "3 URL=index.html");
		}
	}
	
	public ArrayList<UsrInfo> getAllUsrData(){
		ArrayList<UsrInfo> list = new ArrayList<UsrInfo>();
		UsrInfo u;
//		try(BufferedReader br = new BufferedReader(new FileReader("data/AllUser.csv"));){
		try(BufferedReader br = new BufferedReader(new FileReader("AllUser.csv"));){
			
			String line;
            StringTokenizer token;
            while ((line = br.readLine()) != null) {
                token = new StringTokenizer(line, ",");
                while (token.hasMoreTokens()) {
                	u = new UsrInfo();
                    u.setEmpNum(token.nextToken());
                    u.setLastName(token.nextToken());
                    u.setFirstName(token.nextToken());
                    u.setAccount(token.nextToken());
                    u.setPassword(token.nextToken());
                    list.add(u);
                }
            }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	public void export(HttpServletResponse res, ArrayList<UsrInfo> list){
		int i;
		UsrInfo u;
	    res.setContentType("application/octet-stream;charset=Windows-31J");
	    res.setHeader("Content-Disposition","attachment; filename=AllUser.csv");
	    try{
	    	PrintWriter out=res.getWriter();
	    	for(i = 0; i < list.size(); i++){
	    		u = list.get(i);
                out.print(u.getEmpNum() + ",");
                out.print(u.getLastName() + ",");
                out.print(u.getFirstName() + ",");
                out.print(u.getAccount() + ",");
                out.println(u.getPassword());
            }
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
