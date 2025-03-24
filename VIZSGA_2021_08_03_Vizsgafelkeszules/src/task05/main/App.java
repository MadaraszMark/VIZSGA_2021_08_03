package task05.main;

import javax.swing.SwingUtilities;

import task05.dao.EstateCategoryDao;
import task05.dao.EstateDao;
import task05.presenter.EstatePresenter;
import task05.view.View;

public class App {

	public App() {
		final View view = new View();
		final EstateDao estateDao = new EstateDao();
		final EstateCategoryDao estateCategoryDao = new EstateCategoryDao();
		new EstatePresenter(view, estateDao, estateCategoryDao);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new App();
			}
		});
	}
}
