package com.bitc.db_test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.bitc.db_test.vo.MemberVO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberDAOImpl implements MemberDAO {

	private final DataSource ds;
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	@Override
	public int insertMember(MemberVO member) {
		int result = 0;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(
				"INSERT INTO tbl_member(userid,userpw,username) VALUES(?,?,?)"
			);
			pstmt.setString(1, member.getUserid());
			pstmt.setString(2, member.getUserpw());
			pstmt.setString(3, member.getUsername());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			result = 0;
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return result;
	}

	@Override
	public MemberVO readMember(String userid) {
		MemberVO member = null;
		String slq = "SELECT *FROM tbl_member WHERE userid= ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(slq);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new MemberVO();
				member.setUno(rs.getInt(1));
				member.setUserid(rs.getString(2));
				member.setUserpw(rs.getString(3));
				member.setUsername(rs.getString(4));
				member.setRegdate(rs.getTimestamp(5));
				member.setUpdatedate(rs.getTimestamp(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				}catch (SQLException e) {}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return member;
	}

	@Override
	public MemberVO readMemberWithPass(String userid, String userpw) {
		return null;
	}

	@Override
	public List<MemberVO> readMemberList() {
		return null;
	}

	@Override
	public Integer readMax() {
		return null;
	}

}
