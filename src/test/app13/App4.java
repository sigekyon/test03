package test.app13;

public class App4 {
	final static long INTERVAL = 1000;
	ResultView resultView = new ResultView();
	ProgressView progressView = new ProgressView();
	Observable view = new Observable();
	int count;
	
	App4() {
		count = 12;
		resultView.setStartValue(count);
		view.addObserver(progressView);
		view.addObserver(resultView);
	}
	
	interface Observer {
		void update();
	}

	class Observable {
		java.util.List observers = new java.util.LinkedList();
		void addObserver(Observer o) {
			observers.add(o);
		}
		void notifyObservers() {
			for (int i=0 ; i<observers.size() ; i++) {
				Observer o = (Observer)observers.get(i);
				o.update();
			}
		}
	}
	
	class ProgressView implements Observer{
		int count = 0;
		String printValue = "";
		
		public void countUp(int v) {
			count += v;
			printValue = String.valueOf(count);
		}
		
		public void update() {
			System.out.print("\n\n�o�ߎ��ԁF");
			System.out.print(printValue + "[sec]");
		}
	}
	
	class ResultView implements Observer{
		long startTime;
		long stopTime;
		int startValue;
		
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
		
		public void update() {
			System.out.println("");
			System.out.println("�J�n�����F" + startTime);
			System.out.println("�J�E���g�F" + startValue);
			System.out.println("�I�������F" + stopTime);
		}
		
	}
	
    class RemainView implements Observer {
    	public void update() {
    		System.out.println("�c�莞�ԁF" + count + "[sec]");
    	}
	}

	public void execute() throws Exception {
		resultView.setStartTime(System.currentTimeMillis());
		while (count > 0) {
			Thread.sleep(INTERVAL);
			count--;
			progressView.countUp(1);
			view.notifyObservers();
		}
		resultView.setStopTime(System.currentTimeMillis());
		view.notifyObservers();
	}
	public static void main(String[] args)
	throws Exception {
		App4 app = new App4();
		app.execute();
	}
}
