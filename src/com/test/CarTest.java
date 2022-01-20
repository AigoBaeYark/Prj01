package com.test;

import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.setModel("�ҳ�Ÿ"); // set�� ���ؼ� �Ű����� ����
		car1.setColor("red");
		car1.setCc(2000);
		
		Car car2=new Car();
		car2.setModel("Equus"); // set�� ���ؼ� �Ű����� ����
		car2.setColor("black");
		car2.setCc(4000);
		
		// <���1> ��ü�� ������ ������ ���
		CarTest ctest=new CarTest();
		ctest.sendCar(car1); // car1, car2 ���� ���� (2�� ȣ��)
		ctest.sendCar(car2); // car1, car2�� ��ü
		
		// <���2> ��� ������ ��� (���� ���� �����͸� ����ϴϱ� list�� ���� �����)
		ArrayList<Car> list=new ArrayList<Car>();
		list.add(car1); // list�� car1���
		list.add(car2); // list�� car2���
		
		ctest.sendCarSet(list); // list�� car1, car2�� ������ �� ���� ���� (1�� ȣ��)
		
		//car.model; // private�̱� ������ �̷��� ȣ���� ���� ����
		String model=car1.getModel(); // �̷��� �޼ҵ带 ȣ���ؼ� model ������ ��Ƽ� ����ؾ� ��
//		System.out.println(model); // �ҳ�Ÿ ��µ�(������ �ҳ�Ÿ�� ���������� ������ �ʱⰪ�� null�� ��µ�)
		
	}
	private void sendCar(Car c) { // �Ű������� ���� ���� Ÿ�Ը� ������ ��(�̸��� ���Ƿ� ����) - ���⼭�� car�� c�� ����
		System.out.println(c.getColor());
		System.out.println(c.getModel());
		System.out.println(c.getCc());
	
	}
	
	private void sendCarSet(ArrayList<Car> l) { // list�� l�� ����
		System.out.println("================");
		for (Car car : l) { // car1, car2�� ��������ϱ� for���� 2�� ��
			System.out.println(car.getModel());
			System.out.println(car.getColor());
			System.out.println(car.getCc());
		}
	}
}
