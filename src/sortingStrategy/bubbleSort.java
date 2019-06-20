package sortingStrategy;

import java.util.ArrayList;

public class bubbleSort implements sortStrategy {
	@Override
	public void sortList(ArrayList<Integer> numbers) {
		int n=numbers.size();
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(numbers.get(i)>numbers.get(j)) {
					int large=numbers.get(i);
					int small=numbers.get(j);
					numbers.set(i, small);
					numbers.set(j, large);
				}
			}
		}
	}
}
