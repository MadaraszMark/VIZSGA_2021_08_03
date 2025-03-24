package task05.presenter;


import java.util.List;

import task05.dao.EstateCategoryDao;
import task05.dao.EstateDao;
import task05.model.Estate;
import task05.view.IViewListener;
import task05.view.View;

public class EstatePresenter implements IViewListener {

	private final View view;
	private final EstateDao estateDao;
	private final EstateCategoryDao estateCategoryDao;
	
	public EstatePresenter(final View view,
			final EstateDao estateDao,
			final EstateCategoryDao estateCategoryDao) {
		this.view = view;
		view.addListener(this);
		this.estateDao = estateDao;
		this.estateCategoryDao = estateCategoryDao;
		this.fillTableEstate(estateDao.getAll());
	}
	
	public void fillTableEstate(List<Estate> estates) {
		view.setModelToTableEmployee(estates);
	}

	@Override
	public void onButtonClickedCreateFrame() {
		view.setEstateNewFrame(estateCategoryDao.getAllNames());
	}

	@Override
	public void onButtonClickedSaveEstate() {
		estateDao.save(view.getEstateDataFromFrame());
		view.disposeEstateNewFrame();
		view.tableEstateRowsDelete();
		this.fillTableEstate(estateDao.getAll());
	}

	@Override
	public void onButtonClickedCloseEstateNewFrame() {
		view.disposeEstateNewFrame();
	}

	@Override
	public void onButtonClickedExit() {
		System.exit(0);
	}
}
