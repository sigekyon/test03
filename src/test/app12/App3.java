package test.app12;

public class App3 {
	final static long INTERVAL = 1000;
	ResultView resultView = new ResultView();
	ProgressView progressView = new ProgressView();
	int count;
	
	public App3() {
		count = 12;
		resultView.setStartValue(count);
	}
	class ResultView {
		long startTime;
		long stopTime;
		int startValue;
		void update() {
			System.out.println("");
			System.out.println("�J�n�����F" + startTime);
			System.out.println("�J�E���g�F" + startValue);
			System.out.println("�I�������F" + stopTime);
		}

		public long getStartTime() {
			return startTime;
		}

		public void setStartTime(long startTime) {
			this.startTime = startTime;
		}

		public long getStopTime() {
			return stopTime;
		}

		public void setStopTime(long stopTime) {
			this.stopTime = stopTime;
		}

		public int getStartValue() {
			return startValue;
		}

		public void setStartValue(int startValue) {
			this.startValue = startValue;
		}

	}
	class ProgressView {
		int count = 0;
		String printValue = "";
		public void countUp(int v) {
			count += v;
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < v; i++) {
				sb.append(".");
			}
			printValue = sb.toString();
		}
		public void update() {
			System.out.print(printValue);
			if (count % 10 == 0 && count != 0) {
				System.out.println("");
			}
		}
	}

	public void execute() throws Exception {
		resultView.setStartTime(System.currentTimeMillis()); //
		while (count > 0) {
			Thread.sleep(INTERVAL);
			count--;
			progressView.countUp(1); //
			progressView.update(); //
		}
		resultView.setStopTime(System.currentTimeMillis()); //
		resultView.update(); //
	}
	public static void main(String[] args)
	throws Exception {
		App3 app = new App3();
		app.execute();
	}
}
