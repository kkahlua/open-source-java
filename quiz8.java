package hellojava;
import java.util.*;
import java.io.*;

public class quiz8 {
	public static void main(String[] args) {
		Vector<String> v_s = new Vector<String>();
		Vector<Integer> v_i = new Vector<Integer>();
		File f =null;
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");
		Scanner scanner = new Scanner(System.in);
		String fname = scanner.nextLine();
		f= new File(fname);
		int line_num,on_off=1;
		String line;
		try {
			Scanner fscanner= new Scanner(new FileReader(f));
			while(fscanner.hasNext()) {
				line = fscanner.nextLine();
				v_s.add(line);
			}
			fscanner.close();
		}
		catch(Exception e) {
			System.out.println("���� ó��");
			on_off=0;
		}
		while(on_off==1) {
			System.out.print("�˻��� �ܾ ����>> ");
			String word = scanner.nextLine();
			if(word.equals("�׸�")){
				on_off=0;
				continue;
			}
			for(int i=0;i<v_s.size();i++)
			{
				String i_line = v_s.get(i);
				if(word.indexOf(i_line)!=-1)
					v_i.add(i);
			}
			for(int i=0; i<v_i.size(); i++) {
				line_num = v_i.get(i);
				line = v_s.get(line_num);
				System.out.println(line_num+1 + ":" + line);
			}
		}
		scanner.close();
		System.out.println("���α׷��� �����մϴ�.");
	}
}
