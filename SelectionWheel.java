import java.awt.Color;
import java.awt.Font;
import java.awt.Polygon;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SelectionWheel extends JPanel {

	Wheel _wheel;
	Tick tick;

	@Override
	public void setBounds(int x, int y, int width, int height) {
		/*
		 * Adjust the bounds of the wheel and tick based on tick width.
		 */
		super.setBounds(x, y, width, height);
		_wheel.setBounds(0, 0, width - tick.getTickWidth(), height);
		tick.setBounds(width - tick.getTickWidth(), 0, tick.getTickWidth(), height);
	}

	public void hasBorders(boolean borders) {
		/*
		 * Check if the wheel borders are on.
		 */
		_wheel.hasBorders(borders);
	}

	public int getRadius() {
		/*
		 * Get radius of the wheel.
		 */
		return _wheel.getRadius();
	}

	public double getRotationAngle() {
		/*
		 * Get current rotation angle of the wheel.
		 */
		return _wheel.getRotationAngle();
	}

	public void setRotationAngle(double rotationAngle) {
		/*
		 * Set current rotation angle of the wheel.
		 */
		_wheel.setRotationAngle(rotationAngle);
	}

	public Font getWheelFont() {
		/*
		 * Get current font of the wheel.
		 */
		return _wheel.getFont();
	}

	public void setWheelFont(Font font) {
		/*
		 * Set current font of the wheel.
		 */
		super.setFont(font);
		_wheel.setFont(font);
	}

	public ArrayList<String> getListOfStrings() {
		/*
		 * Get the list of strings for the wheel.
		 */
		return _wheel.getListOfStrings();
	}

	public void setListOfStrings(ArrayList<String> list) throws Exception {
		/*
		 * Set the list of strings for the wheel.
		 */
		_wheel.setListOfStrings(list);
	}

	public double getSpinSpeed() {
		/*
		 * Get current spin speed of the wheel.
		 */
		return _wheel.getSpinSpeed();
	}

	public double getMaxSpinSpeed() {
		/*
		 * Get current spin speed limit of the wheel.
		 */
		return _wheel.getMaxSpinSpeed();
	}

	public void setMaxSpinSpeed(double speed) {
		/*
		 * Set current spin speed limit of the wheel.
		 */
		_wheel.setMaxSpinSpeed(speed);
	}

	public double getSpinDeceleration() {
		return _wheel.getSpinDeceleration();
	}

	public void setSpinDeceleration(double deceleration) throws Exception {
		_wheel.setSpinDeceleration(deceleration);
	}

	public ArrayList<Color> getColorScheme() {
		/*
		 * Get color scheme of the wheel.
		 */
		return _wheel.getColorScheme();
	}

	public void setColorScheme(ArrayList<Color> colors) {
		/*
		 * Set color scheme of the wheel.
		 */
		_wheel.setColorScheme(colors);
	}

	public void addColor(Color color) {
		/*
		 * Add new color to the color scheme of the wheel.
		 */
		_wheel.addColor(color);
	}

	public String getSelectedString() {
		/*
		 * Get current string selection for the wheel.
		 */
		return _wheel.getSelectedString();
	}

	public boolean isSpinning() {
		/*
		 * Check if wheel is spinning.
		 */
		return _wheel.isSpinning();
	}

	public void setShape(Wheel.Shape shape) {
		/*
		 * Set shape of the wheel.
		 */
		_wheel.setShape(shape);
	}

	public double getTickWidth() {
		/*
		 * Get tick width.
		 */
		return tick.getTickWidth();
	}

	public void setTickWidth(int width) {
		/*
		 * Set tick width. Resets the bounds of both tick and wheel.
		 */
		tick.setTickWidth(width);
		this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
	}

	public double getTickHeight() {
		/*
		 * Get tick height.
		 */
		return tick.getTickHeight();
	}

	public void setTickHeight(int height) {
		/*
		 * Set tick height.
		 */
		tick.setTickHeight(height);
	}

	public Polygon getTickPolygon() {
		/*
		 * Get tick polygon.
		 */
		return tick.getPolygon();
	}

	public void setTickPolygon(Polygon polygon) {
		/*
		 * Set tick polygon.
		 */
		tick.setPolygon(polygon);
	}

	public SelectionWheel(ArrayList<String> listOfStrings) throws Exception {
		/*
		 * Constructor - initializes tick and wheel.
		 */
		_wheel = new Wheel(listOfStrings);
		_wheel.setLayout(null);
		tick = new Tick();
		tick.setLayout(null);
		this.setLayout(null);
		this.add(_wheel);
		this.add(tick);
	}

	public void spinStartAsync(double speed, int direction, double deceleration) throws Exception {
		/*
		 * Start async wheel spin.
		 */
		_wheel.spinStartAsync(speed, direction, deceleration);
	}

	public void spinStop() {
		/*
		 * Stop spinning.
		 */
		_wheel.spinStop();
	}
}
