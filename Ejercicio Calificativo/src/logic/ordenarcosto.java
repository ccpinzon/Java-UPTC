package logic;

import java.util.Comparator;

public class ordenarcosto implements Comparator<Hadware> {

	@Override
	public int compare(Hadware o1, Hadware o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getPrecio()-o2.getPrecio());
	}

	

	

}
