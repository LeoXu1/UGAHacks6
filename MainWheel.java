import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainWheel {

	public static void main(String[] args) throws Exception {

		Random random = new Random();

		int width = 1000, height = 1000;

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ArrayList<String> endList = new ArrayList<String>();
		endList.add("Recycle");
		endList.add("Take the bus");
		endList.add("Text a friend");
		endList.add("Call your grandparents");
		endList.add("Read a book");
		endList.add("Take a walk");
		endList.add("Ride a bike");
		endList.add("Pick up trash");
		endList.add("Eat healthy");
		endList.add("Take a shorter shower");
		endList.add("Go to bed early");
		endList.add("Go vegan");
		endList.add("Go vegetarian");
		endList.add("Use reusable bags");
		endList.add("Use reusable straws");

		ArrayList<String> list = new ArrayList<String>();
		int count = 0;
		while (count < 6) {
			list.add(endList.get(random.nextInt(14)));
			count++;
		}

//		list.add("Recycle");
//		list.add("Take the bus");
//		list.add("Text a friend");
//		list.add("Call your grandparents");
//		list.add("Read a book");
//		list.add("Take a walk");
//		list.add("Ride a bike");
//		list.add("Pick up trash");
//		list.add("Eat healthy");
//		list.add("Take a shorter shower");
//		list.add("Go to bed early");
//		list.add("Go vegan");
//		list.add("Go vegetarian");
//		list.add("Use reusable bags");
//		list.add("Use reusable straws");

		Wheel wheel = new Wheel(list);
		wheel.hasBorders(true);
		wheel.setBounds(100, 100, 400, 400);

		JLabel lbl1 = new JLabel("Selection: ");
		JLabel lbl2 = new JLabel("Angle: ");
		JLabel lbl3 = new JLabel("Speed: ");
		JLabel lblsel = new JLabel("(selection)");
		JLabel lblang = new JLabel("(angle)");
		JLabel lblsp = new JLabel("(speed)");
		JButton btnSpin = new JButton("Spin");

		lbl1.setBounds(720, 10, 100, 20);
		lblsel.setBounds(830, 10, 150, 20);
		lbl2.setBounds(720, 30, 100, 20);
		lblang.setBounds(830, 30, 150, 20);
		lbl3.setBounds(720, 50, 100, 20);
		lblsp.setBounds(830, 50, 150, 20);
		btnSpin.setBounds(720, 70, 100, 20);
		frame.add(wheel);
		frame.add(lbl1);
		frame.add(lblsel);
		frame.add(lbl2);
		frame.add(lblang);
		frame.add(lbl3);
		frame.add(lblsp);
		frame.add(btnSpin);
		frame.setSize(width, height);
		frame.setLayout(null);
		frame.setVisible(true);

		lblsel.setText(wheel.getSelectedString());
		lblang.setText(Double.toString(wheel.getRotationAngle()));
		lblsp.setText(Double.toString(wheel.getSpinSpeed()));

		// wheel.setShape(Wheel.Shape.UMBRELLA);

		btnSpin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				// do everything here...
				try {
					if (wheel.isSpinning() == false)
						wheel.spinStartAsync(180, 1, -5);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		while (true) {
			// wait for action
			while (true) {
				lblsel.setText(wheel.getSelectedString());
				lblang.setText(Double.toString(wheel.getRotationAngle()));
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (wheel.isSpinning())
					break;
			}
			// while spinning
			while (wheel.isSpinning()) {
				lblsel.setText(wheel.getSelectedString());
				lblang.setText(Double.toString(wheel.getRotationAngle()));
				lblsp.setText(Double.toString(wheel.getSpinSpeed()));
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			lblsp.setText(Double.toString(wheel.getSpinSpeed()));
			// show selection
			JOptionPane.showMessageDialog(frame, "Selection: " + wheel.getSelectedString());
		}
	}

}