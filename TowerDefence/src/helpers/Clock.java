package helpers;

import org.lwjgl.Sys;

public class Clock {
	private static boolean paused = false;
	public static long lastFrame, totalTime;
	public static float d = 0, mult = 1;
	
	public static long getTime() {
		return Sys.getTime() * 1000 / Sys.getTimerResolution();
	}
	public static float getDelta() {
		long currentTime = getTime();
		int delta = (int)(currentTime - lastFrame); //time interval between now and last frame
		lastFrame = getTime(); //last frame is now
		return delta * 0.01f;
	}
	public static float Delta() {
		if (paused)//there are no updates going on
			return 0;
		else 
			return d * mult;
	}
	public static float TotalTime() {
		return totalTime;
	}
	public static float Multiplier() {
		return mult;
	}
	public static void update() {
		d = getDelta();
		totalTime += d;
	}
	public static void ChangeMultiplier(int change) {
		if (mult + change < -1 || mult + change > 7) {
			
		}else {
			mult += change;
		}
	}
	public static void Pause() {
		if (paused)
			paused = false;
		else
			paused = true;
	}
}
