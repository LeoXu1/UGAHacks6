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

		ArrayList<String> endList1 = new ArrayList<String>();
		endList1.add("Recycle");
		endList1.add("Take the bus");
		endList1.add("Text a friend");
		endList1.add("Call your grandparents");
		endList1.add("Read a book");
		endList1.add("Take a walk");
		ArrayList<String> endList2 = new ArrayList<String>();
		endList2.add("Use reusable straws");
		endList2.add("Pick up trash");
		endList2.add("Eat healthy");
		endList2.add("Take a shorter shower");
		endList2.add("Go to bed early");
		endList2.add("Go vegan");
		ArrayList<String> endList3 = new ArrayList<String>();
		endList3.add("Go vegetarian");
		endList3.add("Use reusable bags");
		endList3.add("Grow a plant");
		endList3.add("Meditate");
		endList3.add("Volunteer");
		endList3.add("Ride a bike");
		ArrayList<String> endList4 = new ArrayList<String>();
		endList4.add("Journal");
		endList4.add("Discover a new hobby");
		endList4.add("Make a craft out of trash");
		endList4.add("Donate to a charity");
		endList4.add("Cook a new meal");
		endList4.add("Clean");
		ArrayList<String> endList5 = new ArrayList<String>();
		endList5.add("Encourage someone");
		endList5.add("Unplug nonessential devices");
		endList5.add("Dance");
		endList5.add("Write a letter");
		endList5.add("Give a gift");
		endList5.add("Go plastic-free");
		ArrayList<String> endList6 = new ArrayList<String>();
		endList6.add("Sing");
		endList6.add("Turn off your tv");
		endList6.add("Meet someone new");
		endList6.add("Call a relative");
		endList6.add("Give a gift");
		endList6.add("Draw");

		ArrayList<String> list = new ArrayList<String>();
		int count = 0;

		int listChooser = random.nextInt(6);
		switch (listChooser) {
		case 1:
			while (count < 6) {
				list.add(endList1.get(random.nextInt(5)));
				count++;
			}
			break;
		case 2:
			while (count < 6) {
				list.add(endList2.get(random.nextInt(5)));
				count++;
			}
			break;
		case 3:
			while (count < 6) {
				list.add(endList3.get(random.nextInt(5)));
				count++;
			}
			break;
		case 4:
			while (count < 6) {
				list.add(endList4.get(random.nextInt(5)));
				count++;
			}
			break;
		case 5:
			while (count < 6) {
				list.add(endList5.get(random.nextInt(5)));
				count++;
			}
			break;
		case 6:
			while (count < 6) {
				list.add(endList6.get(random.nextInt(5)));
				count++;
			}
			break;
		default:
			while (count < 6) {
				list.add(endList1.get(random.nextInt(5)));
				count++;
			}
			break;
		}

		Wheel wheel = new Wheel(list);
		wheel.hasBorders(true);
		wheel.setBounds(100, 100, 400, 400);

		JLabel lbl1 = new JLabel("Activity: ");
		JLabel lbl2 = new JLabel("Angle: ");
		JLabel lbl3 = new JLabel("Speed: ");
		JLabel lblsel = new JLabel("(activity)");
		JLabel lblang = new JLabel("(angle)");
		JLabel lblsp = new JLabel("(speed)");
		JButton btnSpin = new JButton("Spin");

//		lbl1.setBounds(720, 10, 100, 20);
//		lblsel.setBounds(830, 10, 150, 20);
//		lbl2.setBounds(720, 30, 100, 20);
//		lblang.setBounds(830, 30, 150, 20);
//		lbl3.setBounds(720, 50, 100, 20);
//		lblsp.setBounds(830, 50, 150, 20);
		btnSpin.setBounds(520, 290, 100, 20);
		frame.add(wheel);
//		frame.add(lbl1);
//		frame.add(lblsel);
//		frame.add(lbl2);
//		frame.add(lblang);
//		frame.add(lbl3);
//		frame.add(lblsp);
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
				try {
					if (wheel.isSpinning() == false)
						wheel.spinStartAsync(180, 3, -40);
				} catch (Exception e) {
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
			JOptionPane.showMessageDialog(frame, "Activity: " + wheel.getSelectedString());
		}
	}

}
