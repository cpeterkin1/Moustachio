/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import bean.entity.Image;
import bean.manager.EntityManager;
import bean.manager.ImageManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Zach Bolan
 */
@WebServlet("/images/*")
public class ImageServlet extends HttpServlet {

	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String imgId = request.getPathInfo().substring(1);
		
		if (imgId != null) {
			EntityManager<Image> imageManager = new ImageManager();
			Image img = imageManager.findOne("id", imgId);
			byte[] data = img.getData();
			response.setContentType("image/"+img.getMime());
			response.setContentLength(data.length);
			response.getOutputStream().write(data);
		}
	}




}
