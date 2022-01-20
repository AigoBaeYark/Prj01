package customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import customer.db.DBCon;
import customer.vo.Member;

public class MemberDao {
	
	@SuppressWarnings("null")
	public Member getMember(String uid) throws Exception{
		System.out.println("getMemeber");
		
		String sql = "select * from member where id = ?";
		
		Connection con = DBCon.getcConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, uid);
		
		ResultSet rs = pstmt.executeQuery();
		Member m = null;

		//데이터 가져오기
		if(rs.next()) {
			m = new Member();
			System.out.println(rs.getString("id")+"1");
			m.setId(rs.getString("id"));
			System.out.println(m.getId()+"2");
			m.setPwd(rs.getString("pwd"));
			m.setName(rs.getString("name"));
			m.setGender(rs.getString("gender"));
			m.setIs_lunar(rs.getString("is_lunar"));
			m.setCphone(rs.getString("cphone"));
			m.setHabit(rs.getString("habit"));
			m.setBirth(rs.getString("birth"));
			m.setRegdate(rs.getDate("regdate"));
		}
		System.out.println("1");
		return m;
	}
	
}
