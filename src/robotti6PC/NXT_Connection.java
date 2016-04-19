package robotti6PC;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import lejos.pc.comm.NXTConnector;

public class NXT_Connection {

	private int sonic;
	private String endtime = "";
	private Parser data = new Parser();
	private Reader reader = new Reader();
	private NXTConnector conn = new NXTConnector();
	private DataInputStream dis;
	private DataOutputStream dos;

	public void Connect() {
		boolean connected = conn.connectTo("btspp://");
		// boolean connected = conn.connectTo("usb://");
		if (!connected) {
			System.err.println("Failed to connect to any NXT2.0, Exit");
			System.exit(1);
		}
		dis = new DataInputStream(conn.getInputStream());
		dos = new DataOutputStream(conn.getOutputStream());

		if (!reader.isRunning) {
			reader.start();
		}

	}

	public void setEndTime(String str) {
		endtime = str;
	}

	public String getEndTime() {
		return endtime;
	}

	public void sendPC_Data(int i) {
		try {
			if (i >= 0 && i <= 6) {

				dos.writeUTF("direction," + i);
			}
			dos.flush();
		} catch (IOException ex) {
		}
	}

	private void setSonic(int sonic) {
		this.sonic = sonic;
	}

	public int getSonic() {
		return sonic;
	}

	public class Reader extends Thread {

		boolean isRunning = false;

		@Override
		public void run() {
			isRunning = true;

			while (isRunning) {
				String d;
				try {
					d = dis.readUTF(); // Luetaan robotin datastring
					data.parseData(d); // Pilkkoo datastringin ja asettaa arvot

					if (!(data.getSonic()=="")) {
						System.out.println(data.getSonic());
						setSonic(Integer.parseInt(data.getSonic()));
					}
					
					if (!(data.getEndTime()=="")) {
						System.out.println(data.getEndTime());
						setEndTime(data.getEndTime());
						
					}
					
				} catch (IOException ex) {
				}
			}
		}
	}
}
