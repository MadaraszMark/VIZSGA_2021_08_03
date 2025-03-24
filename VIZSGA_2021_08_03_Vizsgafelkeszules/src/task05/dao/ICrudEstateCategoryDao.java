package task05.dao;

import java.sql.ResultSet;
import java.util.List;

import task05.model.EstateCategory;

public interface ICrudEstateCategoryDao {

	List<EstateCategory> getAll();
	List<String> getAllNames();
	EstateCategory getById(int id);
	EstateCategory getObjectFromRs(ResultSet rs);
}
