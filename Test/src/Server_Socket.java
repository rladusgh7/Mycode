import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Socket {
	public static void main(String[] args) {
		ServerSocket serverSocket = null; // serversocket 객체 생성
		Socket socket = null; // socket 객체 생성
		try {
			serverSocket = new ServerSocket(9000); // 9000 번 port 로 설정객체 생성
			System.out.println("1 st"); // 여기까지는 기다리는 동안 실행됨
			socket = serverSocket.accept(); //기다리는곳 여기서 정지 해서 기다림. 받아 들일때까지
			System.out.println("2 st"); //받아들이면 실행
			InputStream in = socket.getInputStream(); //인풋 스트림 생성
			OutputStream out = socket.getOutputStream(); // 아웃풋 스트림 생성
			byte arr[] = new byte[100]; // 총 100 바이트 까지만 받을것이므로
			in.read(arr); //in 객체로 들어온것을 리드로 해서 arr 에 저장함 반대로 생각해야함
			System.out.println(new String(arr)); //출력asdddsaasdasdasd
			String str = "hello world"; // 
			out.write(str.getBytes()); //out 객체로 byte 단위로 출력
		} catch (Exception e) {  
			// TODO: handle exception
		}

		// finally 윗쪽의 예외 처리가 있음에도 불구하고 무조건 실행해주는 구문
		finally {
			try {
				socket.close(); //무조건 닫아주기. 그렇지 않으면 포트 열어져 있음
			} catch (Exception ignored) {

			}
			try {
				serverSocket.close();
			} catch (Exception ignored) {

			}
		}
	}
}
