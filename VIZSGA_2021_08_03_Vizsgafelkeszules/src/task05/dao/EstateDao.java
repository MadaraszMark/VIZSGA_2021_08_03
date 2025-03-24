package task05.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import task05.model.Estate;
import task05.utils.Database;

public class EstateDao implements ICrudEstateDao{

	private Connection con = new Database().createConnection();
	private ResultSet rs = null;
	private PreparedStatement pstmt = null; 
	
	@Override
	public List<Estate> getAll() {
		List<Estate> estates = new ArrayList<Estate>();
		String sql = "SELECT * FROM estate as e"
				+ " INNER JOIN estate_category as ec ON"
				+ " e.category_id = ec.id ORDER BY e.id;"; 
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				estates.add(getObjectFromRs(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return estates;
	}

	@Override
	public Object getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estate getObjectFromRs(ResultSet rs) {
		Estate estateObj = null;
		try {
			estateObj = new Estate(
					rs.getInt("id"),
					rs.getString("name"),
					rs.getInt("size"),
					rs.getInt("room_count"),
					rs.getString("address_city"),
					rs.getString("address_postal_number"),
					rs.getString("address"),
					rs.getInt("price"),
					rs.getInt("category_id"),
					rs.getBoolean("sale"),
					rs.getBoolean("status")
			);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estateObj;
	}

	@Override
	public void save(Estate estateObj) {
		String sql = "INSERT INTO estate (name, size, room_count, "
				+ "address_city, address_postal_number, address, price, category_id, sale, status) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?);";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, estateObj.getName());
			pstmt.setInt(2, estateObj.getSize());
			pstmt.setInt(3,estateObj.getRoomCount());
			pstmt.setString(4,estateObj.getAddressCity());
			pstmt.setString(5,estateObj.getAddressPostalNumber());
			pstmt.setString(6,estateObj.getAddress());
			pstmt.setInt(7,estateObj.getPrice());
			pstmt.setInt(8,estateObj.getCategoryId());
			pstmt.setInt(9,estateObj.isSale() ? 1 : 0);
			pstmt.setInt(10,estateObj.isStatus() ? 1 : 0);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
