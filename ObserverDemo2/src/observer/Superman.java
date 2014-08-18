package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * �W�H
 * @author admin
 *
 */
public class Superman implements Observer {
	
    public void go() {
        System.out.println("Superman fight!!");
    }

	@Override
	public void update(Observable o, Object arg) {
        System.out.println("Superman receive world's message:" + arg.toString());
        go();
	}
}
