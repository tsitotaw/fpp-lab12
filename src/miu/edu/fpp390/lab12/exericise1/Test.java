package miu.edu.fpp390.lab12.exericise1;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) throws IllegalClosedCurveException {

		

		Triangle t = null;
		try {
			t = new Triangle(4, 5, 13);
		} catch (IllegalTriangleException e) {
			String msg = e.getMessage();
			System.out.println(msg);
			System.exit(0);
		}
	
		try {
			ClosedCurve[] objects = {t, new Square(1), new Rectangle(3, 7), new Circle(-2) };
	
			// compute areas
			for (ClosedCurve cc : objects) {
				String nameOfCurve = getClassNameNoPackage(cc.getClass());
	
				System.out.println("The area of this " + nameOfCurve + " is " + cc.computeArea());
	
			}
		}catch(IllegalClosedCurveException ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static String getClassNameNoPackage(Class aClass) {
		String fullClassName = aClass.getName();
		int index = fullClassName.lastIndexOf('.');
		String className = null;
		String packageName = null;

		// in this case, there is no package name
		if (index == -1) {
			return fullClassName;
		} else {
			// for other apps, may be useful to have this
			packageName = fullClassName.substring(0, index);

			className = fullClassName.substring(index + 1);
			return className;
		}

	}

}
