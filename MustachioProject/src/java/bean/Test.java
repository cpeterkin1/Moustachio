/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import bean.entity.Member;
import bean.manager.MemberManager;
import bean.manager.EntityManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Zach
 */
public class Test {
	
	
	
	
	public String output() {
		return "THE BEANS";
	}
	
	
	public String doStuff() {

		
		StringBuilder sb = new StringBuilder();
		
		MemberManager manager = new MemberManager();

		
		return sb.toString();
		
	}
}
