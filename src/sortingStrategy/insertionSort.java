package sortingStrategy;

import java.util.ArrayList;

public class insertionSort implements sortStrategy {
	@Override
	public void sortList(ArrayList<Integer> numbers) {
		int n=numbers.size();
		for(int i=1;i<n;i++) {
			int key=numbers.get(i);
			int j=i-1;
			while(j>=0 && numbers.get(j)>key) {
				numbers.set(j+1, numbers.get(j));
				j--;
			}
			numbers.set(j+1, key);
		}
	}
}
