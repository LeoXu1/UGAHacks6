import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainWheel extends Applet {

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
		endList6.add("Do yoga");
		endList6.add("Draw");

		ArrayList<String> list = new ArrayList<String>();
		int count = 0;

		int listChooser = random.nextInt(6);
		switch (listChooser) {
		case 1:
			while (count < 6) {
				list.add(endList1.get(count));
				count++;
			}
			break;
		case 2:
			while (count < 6) {
				list.add(endList2.get(count));
				count++;
			}
			break;
		case 3:
			while (count < 6) {
				list.add(endList3.get(count));
				count++;
			}
			break;
		case 4:
			while (count < 6) {
				list.add(endList4.get(count));
				count++;
			}
			break;
		case 5:
			while (count < 6) {
				list.add(endList5.get(count));
				count++;
			}
			break;
		case 6:
			while (count < 6) {
				list.add(endList6.get(count));
				count++;
			}
			break;
		default:
			while (count < 6) {
				list.add(endList1.get(count));
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

		btnSpin.setBounds(520, 290, 100, 20);
		frame.add(wheel);
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
					if (wheel.isSpinning() == false) {
						wheel.spinStartAsync(180, 3, -40);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		int activityPoint = 0;
		int totalPoints = 0;
		int spinCount = 0;

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
			if (spinCount == 7) {
				totalPoints = 0;
				spinCount = 0;
			}
			switch (wheel.getSelectedString()) {
			case "Recycle":
				activityPoint = 30;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Take the bus":
				activityPoint = 50;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Text a friend":
				activityPoint = 15;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Call your grandparents":
				activityPoint = 20;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Read a book":
				activityPoint = 50;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Take a walk":
				activityPoint = 40;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Use reusable straws":
				activityPoint = 30;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Pick up trash":
				activityPoint = 30;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Eat healthy":
				activityPoint = 45;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Take a shorter shower":
				activityPoint = 35;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Go to bed early":
				activityPoint = 55;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Go vegan":
				activityPoint = 70;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Go vegetarian":
				activityPoint = 60;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Use reusable bags":
				activityPoint = 30;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Grow a plant":
				activityPoint = 60;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Meditate":
				activityPoint = 20;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Volunteer":
				activityPoint = 100;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Ride a bike":
				activityPoint = 40;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Journal":
				activityPoint = 15;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Discover a new hobby":
				activityPoint = 60;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Make a craft out of trash":
				activityPoint = 40;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Donate to a charity":
				activityPoint = 100;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Cook a new meal":
				activityPoint = 35;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Clean":
				activityPoint = 80;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Encourage someone":
				activityPoint = 25;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Unplug nonessential devices":
				activityPoint = 70;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Dance":
				activityPoint = 10;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Write a letter":
				activityPoint = 20;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Give a gift":
				activityPoint = 60;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Go plastic-free":
				activityPoint = 25;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Sing":
				activityPoint = 10;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Turn off your tv":
				activityPoint = 60;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Meet someone new":
				activityPoint = 40;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Call a relative":
				activityPoint = 20;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Do yoga":
				activityPoint = 20;
				totalPoints += activityPoint;
				spinCount++;
				break;
			case "Draw":
				activityPoint = 10;
				totalPoints += activityPoint;
				spinCount++;
				break;
			}
			System.out.println("Daily Points: " + activityPoint + "\nWeekly Total: " + totalPoints);

		}

	}

}
