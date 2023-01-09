package coll;
// 770p
// 은행업무

import java.util.LinkedList;
import java.util.Queue;

class Message{
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
		
	}
	
}
public class Queue01 {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두깨"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님 께 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님 께 SMS을 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님 께 카톡을 보냅니다.");
				break;
			default:
				break;
			}
			
		}
		
	}
}
