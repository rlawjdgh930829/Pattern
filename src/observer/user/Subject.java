package observer.user;

import java.util.ArrayList;
import java.util.List;

import observer.room.Observer;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();

    // 옵저버 추가
    public void attach(Observer observer){
        observers.add(observer);
    }

    // 옵저버 제거
    public void detach(Observer observer){
        observers.remove(observer);
    }

    // 알림
    public void notifyObservers(String msg){
        for (Observer o:observers) {
            o.receive(msg);
        }
    }
}
