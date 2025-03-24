package task05.dao;

import java.sql.ResultSet;
import java.util.List;

import task05.model.Estate;

public interface ICrudEstateDao {

	List<Estate> getAll();
	Object getById(int id);
	Object getObjectFromRs(ResultSet rs);
	void save(Estate obj);
}
