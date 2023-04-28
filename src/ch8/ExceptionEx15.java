package ch8;

import java.io.File;

public class ExceptionEx15 {

	public static void main(String[] args) {
		// 커멘드 라인에서 입력받은 값을 이름으로 갖는 파일을 생성
		File f = createFile(args[0]);
		System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
	}
	
	static File createFile(String fileName) {
		try {
				if( fileName == null  || fileName.equals("")) {
					throw new Exception("유효하지 않은 파일입니다."	);
				}
			}catch (Exception e) {
				fileName = "제목없음.txt";
			} finally {
				File f = new File(fileName);   // File클래스의 객체를 생성
				createNewFile(f); 			// 생성된 객체를 이용해서 파일을 생성
				return f;
			}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		}catch(Exception e) {
				// createNewFile 메서드의 끝
		}
	}

}
