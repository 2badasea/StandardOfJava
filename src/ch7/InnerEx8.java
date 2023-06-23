package ch7;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx8 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvetn Occured!!!");
			}
		});  // 익명 클래스의 끝
	}
}
