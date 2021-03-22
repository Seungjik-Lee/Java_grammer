
public class Manager {

	public static void main(String[] args) {
		Friend[] friends = new Friend[10];
		friends[0] = new UniFriend("대학교 친구1", "010123123", "컴퓨터");
		friends[1] = new UniFriend("대학교 친구2", "010321321", "컴퓨터");
		friends[2] = new CompFriend("직장 친구1", "010456456", "개발1팀");
		friends[3] = new CompFriend("직장 친구2", "010654654", "개발2팀");

		for (int i = 0; i < friends.length; i++) {
			System.out.println("friends[" + i + "]" + friends);
		}

	}
}
