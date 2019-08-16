package triangleDePascal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
	
	private List<Integer> list;
	private int tmp=0;
	
	Triangle() {
		
	}
	
	public void creationTriangle(int nombreDeLignes) {
		List<Integer> list = Arrays.asList(new Integer[] { 1 });
		System.out.println(list);
		for (int i = 1; i <= nombreDeLignes; i++) {
			list = nouvelleLigne(list);
			System.out.println(list);
		}
	}

	public List<Integer> nouvelleLigne(List<Integer> list) {
		this.list = new ArrayList<>();
		if (list.size()==1) {
			return Arrays.asList(1, 1);
		}
		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				this.list.add(1);
				tmp = 1;
			} else {
				this.list.add(list.get(i)+tmp);
				tmp = list.get(i);
			}
			if(i == (list.size()-1)) {
				this.list.add(1);
			}
		}
		return this.list;
	}

}
