package observer.room;
// 옵저버 패턴
// 어떤 객체에 이벤트가 발생했을 때 그 객체와 관련된 객체들에게 통지하는 패턴
public class Observer {
	
	public String roomName;

    public void receive(String msg){
        System.out.println(this.roomName + "에서 메시지를 받음: " + msg);
    }
    
}