package task05.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import task05.model.Estate;

public class View {
	
	private final ArrayList<IViewListener> listeners;
	private JScrollPane scrollPane;
	private JTable tableEstate;
	private JFrame estateListFrame;
	
	private JFrame estateNewFrame;
	private JButton btnNewEstate;
	
	private JTextField tfName;
	private JTextField tfSize;
	private JTextField tfRoomCount;
	private JTextField tfAddressCity;
	private JTextField tfAddressPostalNumber;
	private JTextField tfAddress;
	private JTextField tfPrice;
	@SuppressWarnings("rawtypes")
	private JComboBox cbEstateCategory;
	private JCheckBox chBoxSale;
	private JCheckBox chBoxStatus;
	private JButton btnExit;
	private JButton btnClose;
	private JButton btnEstateSave;
	
	private JLabel lblName;
	private JLabel lblSize;
	private JLabel lblRoomCount;
	private JLabel lblAddressCity;
	private JLabel lblAddressPostalNumber;
	private JLabel lblAddress;
	private JLabel lblPrice;
	private JLabel lblEstateCategory;
	private JLabel lblError;


	public View() {
		estateListFrame = new JFrame();
		estateListFrame.setBounds(300, 200, 1020, 650);
		estateListFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		estateListFrame.getContentPane().setLayout(null);
		estateListFrame.setTitle("Ingatlan nyilvántartás");
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(35,21,921,180);
		estateListFrame.getContentPane().add(scrollPane);
		
		tableEstate = new JTable();
		scrollPane.setViewportView(tableEstate);
	
		btnNewEstate = new JButton("Új ingatlan");
		btnNewEstate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				notifyListenersOnButtonClickedCreateFrame();
			}
		}); 
		
		btnNewEstate.setForeground(Color.white);
		btnNewEstate.setBackground(SystemColor.activeCaption);
		btnNewEstate.setFont(new Font("Tahoma",Font.PLAIN, 14));
		btnNewEstate.setBounds(38, 232, 147, 35);
		estateListFrame.getContentPane().add(btnNewEstate);
		
		btnExit = new JButton("KILÉP");
		btnExit.setBackground(Color.RED);
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExit.setBounds(824, 530, 132, 60);
		estateListFrame.getContentPane().add(btnExit);
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				notifyListenersOnButtonClickedExitApplication();
			}
		});
		
		this.listeners = new ArrayList<IViewListener>();
		estateListFrame.setVisible(true);
	}
	
	public void addListener(final IViewListener listener) {
		listeners.add(listener);
	}
	
	public void notifyListenersOnButtonClickedCreateFrame() {
		for (final IViewListener listener : listeners) {
			listener.onButtonClickedCreateFrame();
		}
	}
	
	private void notifyListenersOnButtonClickedSaveEstate() {
		for (final IViewListener listener : listeners) {
			listener.onButtonClickedSaveEstate();
		}
	}
	
	private void notifyListenersOnButtonClickedExitApplication() {
		for (final IViewListener listener : listeners) {
			listener.onButtonClickedExit();
		}
	}
	
	private void notifyListenersOnButtonClickedCloseEstateNewFrame() {
		for (final IViewListener listener : listeners) {
			listener.onButtonClickedCloseEstateNewFrame();
		}
	}
	
	public void setTableCellCenter() {
		DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
		renderer.setHorizontalAlignment(JLabel.CENTER);
		for (int i = 0; i < tableEstate.getColumnCount(); i++) {
			tableEstate.getColumnModel().getColumn(i).setCellRenderer(renderer);
		}
	}
	
	public void setModelToTableEmployee(List<Estate> estates) {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Név");
		model.addColumn("Méret");
		model.addColumn("Cím");
		model.addColumn("Ár (MFt)");
		model.addColumn("Akciós");
		model.addColumn("Állapot");
		
		for (Estate estate : estates) {
			model.addRow(new Object[] {
					estate.getId(), 
					estate.getName(),
					estate.getSize(), 
					estate.getAddressPostalNumber() + ", "+estate.getAddressCity() + ", "+estate.getAddress(), 
					estate.getPrice(),
					estate.getSaleText(),
					estate.getStatusText()
			});
		}
		tableEstate.setModel(model);
		tableEstate.setRowHeight(30);
		setTableCellCenter();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void setEstateNewFrame(List<String> estateCategories) {
		estateNewFrame = new JFrame();
		estateNewFrame.setBounds(900, 100, 600, 900);
		estateNewFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		estateNewFrame.getContentPane().setLayout(null);
		estateNewFrame.setTitle("Új ingatlan");
		estateNewFrame.setVisible(true);
		
		lblName = new JLabel("Név*");
		lblName.setBounds(100,60,190,45);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		estateNewFrame.add(lblName);
		
		tfName = new JTextField();
		tfName.setBounds(280,60,190,45);
		tfName.setHorizontalAlignment(SwingConstants.CENTER);
		tfName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		estateNewFrame.add(tfName);
		
		lblSize = new JLabel("Méret");
		lblSize.setBounds(100,120,190,45);
		lblSize.setFont(new Font("Tahoma", Font.BOLD, 16));
		estateNewFrame.add(lblSize);
		
		tfSize = new JTextField();
		tfSize.setBounds(280,120,190,45);
		tfSize.setHorizontalAlignment(SwingConstants.CENTER);
		tfSize.setFont(new Font("Tahoma", Font.PLAIN, 16));
		estateNewFrame.add(tfSize);
		
		lblRoomCount= new JLabel("Szobák száma");
		lblRoomCount.setBounds(100,180,190,45);
		lblRoomCount.setFont(new Font("Tahoma", Font.BOLD, 16));
		estateNewFrame.add(lblRoomCount);
		
		tfRoomCount = new JTextField();
		tfRoomCount.setBounds(280,180,190,45);
		tfRoomCount.setHorizontalAlignment(SwingConstants.CENTER);
		tfRoomCount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfRoomCount.setToolTipText("pld. 4");
		estateNewFrame.add(tfRoomCount);
		
		lblAddressCity= new JLabel("Város*");
		lblAddressCity.setBounds(100,240,190,45);
		lblAddressCity.setFont(new Font("Tahoma", Font.BOLD, 16));
		estateNewFrame.add(lblAddressCity);
		
		tfAddressCity = new JTextField();
		tfAddressCity.setBounds(280,240,190,45);
		tfAddressCity.setHorizontalAlignment(SwingConstants.CENTER);
		tfAddressCity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		estateNewFrame.add(tfAddressCity);
		
		lblAddressPostalNumber= new JLabel("Irányítószám:");
		lblAddressPostalNumber.setBounds(100,300,190,45);
		lblAddressPostalNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		estateNewFrame.add(lblAddressPostalNumber);
		
		tfAddressPostalNumber= new JTextField();
		tfAddressPostalNumber.setBounds(280,300,190,45);
		tfAddressPostalNumber.setHorizontalAlignment(SwingConstants.CENTER);
		tfAddressPostalNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		estateNewFrame.add(tfAddressPostalNumber);
		                   
		lblAddress= new JLabel("Cím:");
		lblAddress.setBounds(100,360,190,45);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		estateNewFrame.add(lblAddress);
		
		tfAddress= new JTextField();
		tfAddress.setBounds(280,360,190,45);
		tfAddress.setHorizontalAlignment(SwingConstants.CENTER);
		tfAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		estateNewFrame.add(tfAddress);
		
		lblPrice= new JLabel("Ár (MFt):");
		lblPrice.setBounds(100,420,190,45);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
		estateNewFrame.add(lblPrice);
		
		tfPrice= new JTextField();
		tfPrice.setBounds(280,420,190,45);
		tfPrice.setHorizontalAlignment(SwingConstants.CENTER);
		tfPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		estateNewFrame.add(tfPrice);
		
		lblEstateCategory= new JLabel("Kategória:");
		lblEstateCategory.setBounds(100,480,190,45);
		lblEstateCategory.setFont(new Font("Tahoma", Font.BOLD, 16));
		estateNewFrame.add(lblEstateCategory);
		
		cbEstateCategory = new JComboBox();
		cbEstateCategory.setModel(new DefaultComboBoxModel(estateCategories.toArray()));
		cbEstateCategory.setBounds(280,480,190,45);
		cbEstateCategory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		estateNewFrame.add(cbEstateCategory);
		
		chBoxSale = new JCheckBox("Akciós");
		chBoxSale.setBounds(280,540,190,45);
		chBoxSale.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chBoxSale.setSelected(false);
		estateNewFrame.add(chBoxSale);
		
		chBoxStatus = new JCheckBox("Aktív");
		chBoxStatus.setBounds(280,600,190,45);
		chBoxStatus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chBoxStatus.setSelected(true);
		estateNewFrame.add(chBoxStatus);
		
		btnEstateSave = new JButton("MENTÉS");
		btnEstateSave.setBounds(280,660,190,45);
		estateNewFrame.add(btnEstateSave);
		btnEstateSave.setVisible(true);
		
		lblError = new JLabel("");
		lblError.setBounds(100,720,370,45);
		lblError.setFont(new Font("Tahoma", Font.BOLD, 16));
		estateNewFrame.add(lblError);
		lblError.setVisible(false);
		lblError.setHorizontalAlignment(JLabel.CENTER);
		
		btnEstateSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					notifyListenersOnButtonClickedSaveEstate();
				} catch (NumberFormatException e1) {
					lblError.setText("  Hibás vagy hiányzó adat!!!  ");
					lblError.setOpaque(true);
					lblError.setBackground(Color.red);
					lblError.setForeground(Color.white);
					lblError.setVisible(true);
				}
			}
		});
		
		btnClose = new JButton("Bezár");
		btnClose.setBounds(350,780,120,45);
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClose.setBackground(Color.yellow);
		estateNewFrame.add(btnClose);
		btnClose.setVisible(true);
		
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				notifyListenersOnButtonClickedCloseEstateNewFrame();
			}
		});
	}
	
	public Estate getEstateDataFromFrame() {
		Estate estate = new Estate(
				tfName.getText(),
				Integer.parseInt(tfSize.getText()),
				Integer.parseInt(tfRoomCount.getText()),
				tfAddressCity.getText(),
				tfAddressPostalNumber.getText(),
				tfAddress.getText(),
				Integer.parseInt(tfPrice.getText()),
				cbEstateCategory.getSelectedIndex()+1,
				chBoxSale.isSelected(),
				chBoxStatus.isSelected()
		);
		return estate;
	}
	
	public void tableEstateRowsDelete() {
		int rowCount = tableEstate.getModel().getRowCount();
		for (int i = rowCount-1; i >= 0; i--) {
			((DefaultTableModel)tableEstate.getModel()).removeRow(i);
		}
	}
	
	public void disposeEstateNewFrame() {
		estateNewFrame.dispose();
	}
	
}
