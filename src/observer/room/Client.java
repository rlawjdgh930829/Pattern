package observer.room;

import observer.user.User;

public class Client {
	public static void main(String[] args) {
		User user = new User();
		
		ChatRoom chatRoom = new ChatRoom("채팅방");
		GameRoom gameRoom = new GameRoom("게임방");
        
        user.attach(chatRoom);
        user.attach(gameRoom);

        String msg = "안녕하세요";
        user.notifyObservers(msg);

        user.detach(chatRoom);
        msg = "Hi";
        user.notifyObservers(msg);
	}
}
