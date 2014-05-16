package test.app20;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SampleFinally {
	public void execute() throws IOException {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket();
			Socket s = null;
			try {
				s = ss.accept();
				System.out.println("accept");
			} finally {
				if (s != null) s.close();
			}
		} finally {
			if (ss != null) ss.close();
		}
	}
}
