package robotti6PC;

import java.util.StringTokenizer;

public class Parser {

	private String sonic;
	private String endtime="";

	private void setSonic(String sonic) {
		this.sonic = sonic;
	}

	public String getSonic() {
		return this.sonic;
	}

	public void setEndTime(String str) {
		this.endtime = str;
	}

	public String getEndTime() {
		return this.endtime;
	}

	public void parseData(String d) {

		String sonic_ = "";

		StringTokenizer st = new StringTokenizer(d, ",");
		
		System.out.println("d:" +d);

		while (st.hasMoreElements()) {
			String tmp1 = st.nextToken();
			String tmp2 = st.nextToken();
			if (tmp1.equals("sonic")) {
				sonic_ = tmp2;
			}
			if (tmp1.equals("endtime")) {
				System.out.println("endtime löytyi: " + tmp2);
				endtime = tmp2;
			}

			setSonic(sonic_);
			setEndTime(endtime);

		}
	}
}
