package task05.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import task05.model.EstateCategory;
import task05.utils.Database;

public class EstateCategoryDao implements ICrudEstateCategoryDao{

	private Connection con = new Database().createConnection();
	private ResultSet rs = null;
	private PreparedStatement pstmt = null;
	
	@Override
	public List<EstateCategory> getAll() {
		List<EstateCategory> estateCategories = new ArrayList<EstateCategory>();
		String sql = "SELECT * FROM estate_category;";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				estateCategories.add(getObjectFromRs(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estateCategories;
	}

	@Override
	public List<String> getAllNames() {
		List<String> estateNames = new ArrayList<String>();
		String sql = "SELECT name FROM estate_category;";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				estateNames.add(rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estateNames;
	}

	@Override
	public EstateCategory getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstateCategory getObjectFromRs(ResultSet rs) {
		EstateCategory estateCategoryObj = null;
		try {
			estateCategoryObj = new EstateCategory(
					rs.getInt("id"),
					rs.getString("name")
					);
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return estateCategoryObj;
	}

}
