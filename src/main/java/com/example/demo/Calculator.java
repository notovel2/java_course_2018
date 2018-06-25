package com.example.demo;

interface OnAddListener {
	void onSuccess(int result);
}

class Main {
	public void add(OnAddListener onAddListener, int a, int b) {
		onAddListener.onSuccess(a+b);
	}
}

public class Calculator implements OnAddListener {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.start();
	}

	private void start() {
		Main main = new Main();
		main.add(this, 1, 2);
	}

	public void onSuccess(int result) {
		System.out.println("XXX=" + result);

	}
}
