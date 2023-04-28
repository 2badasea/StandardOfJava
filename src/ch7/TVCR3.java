package ch7;

class Tv3{
	protected boolean power;
	protected int channel;
	protected int volume;
	
	public void power() { power = !power;}
	public void channelUp() { channel++;}
	public void channelDown() { channel--;} 
	public void volumeUp() { volume++;}
	public void volumeDown() { volume--;}
}

class VCR3{
	protected int counter; // vcr의 카운터
	
	public void play() {};
	public void stop() {};
	public void reset() {};
	public int getCounter() {
		return counter;
	}
	public void setCounter(int c) {
		counter = c;
	}
}

interface IVCR3{
	public void play();
	public void stop();
	public void reset();
	public int getCounter();
	public void setCounter(int c); 
}

public class TVCR3 extends Tv3 implements IVCR3{
	VCR3 vcr = new VCR3();
	
	public void play() {
		vcr.play();
	}

	public void stop() {
		vcr.stop();
	}

	public void reset() {
		vcr.reset();
	}

	public int getCounter() {
		return vcr.getCounter();
	}

	public void setCounter(int c) {
		vcr.setCounter(c);
	}

}
