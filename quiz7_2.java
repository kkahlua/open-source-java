package hellojava;
import java.util.*;

public class quiz7_2 {

	static public class Map {
		private String nation,capital;
		public Map(){
			
		}
		public Map(String nation, String capital) {
			
		}
		public String GetCountry() {
			return nation;
		}
		public String GetCapital() {
			return capital;
		}
	}
	static private Scanner scanner = new Scanner(System.in);
	static private HashMap<String, String> map = new HashMap<String, String>();
	
	static public class Game {
		private void Input() {
			int size = map.size();
			System.out.println("현재 " + size + "개 나라와 수도가 입력되어 있습니다.");
			size++;
			while(true) {
				System.out.print("나라와 수도 입력" + size + ">> ");
				String word1 = scanner.next(); 
				if(word1.equals("그만")) {
					break;
				}
				String word2 = scanner.next();
				if(map.containsKey(word1)) { 
					System.out.println(word1 + "는 이미 있습니다!");
					continue;
				}
				map.put(word1,word2);
				size++;
			}
		}
		private void Quiz() {
			Set<String> keys = map.keySet();
			Iterator<String> it = keys.iterator();
			while(true) {
				String q = it.next();
				String a = map.get(q);
				System.out.print(q + "의 수도는? ");
				String user = scanner.next();
				if(user.equals("그만")) {
					break;
				}
				if(user.equals(a))
					System.out.println("정답!");
				else
					System.out.println("아닙니다!");	
				/*
				int index = (int)(Math.random()*map.size());
				Nation nation = v.get(index);
				String q = nation.GetCountry();
				String a = nation.GetCapital();
				System.out.print(q + "의 수도는? ");
				String user = scanner.next(); 
				if(user.equals("그만")) {
					break;
				}
				if(user.equals(a))
					System.out.println("정답!");
				else
					System.out.println("아닙니다!");	
					*/			
			}	
		}
		public void Start() {
			System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
			while(true) {
				System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
				int menu = scanner.nextInt();
				switch(menu) {
					case 1: Input(); break;
					case 2: Quiz(); break;
					case 3:	System.out.println("게임을 종료합니다."); return;
				}
			}
		}
	}


	public static void main(String[] args) {
		Game game;
		game = new Game();
		game.Start();

	}
}
