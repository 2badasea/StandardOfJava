package ch8;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		int score = 0;
		int sum = 0;

		try (FileInputStream fis = new FileInputStream("score.dat"); 
			 DataInputStream dis = new DataInputStream(fis)) {

			while (true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		} catch (EOFException e) {
			System.out.println("점수의 총합은 " + sum + " 입니다. ");
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
