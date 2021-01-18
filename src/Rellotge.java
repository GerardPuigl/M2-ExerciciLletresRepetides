import java.awt.desktop.ScreenSleepEvent;

public class Rellotge {

	public static void main(String[] args) {
			
		/*Només necessites 3 variables int (hour, minutes, seconds) 
		El rellotge ha de tenir 6 dígits en tot moment: 00:00:00 
		L’aplicació no ha de finalitzar mai. 
		Per que el rellotge trigui un segon has d’implementar:  Thread.sleep(1000);*/
		
		int hour = 0;
		int minutes = 0;
		int seconds = 0;

		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					try {
						Thread.sleep(1000);

						System.out.format("%02d:%02d:%02d\n", hour, minutes, seconds);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					seconds++;
				}
				minutes++;
				seconds = 0;
			}
			minutes = 0;
			hour++;
		}
		hour = 0;
		
	}

}
