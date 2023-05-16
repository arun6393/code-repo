
public class Merge2SortedArrays {
	
	public static void main(String args[]) {
		
		int a[]= {3,7,9,12,21};
		int b[]= {6,8,15,18,27};
		
		
		int op[]=new int[a.length+b.length];
		
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
			
			if(a[i]<=b[j]) {
				op[k]=a[i];
				i++;
			}else {
				op[k]=b[j];
				j++;
			}
			
			k++;
			
			
			
		}
		
		if(i<a.length) {
			for(int l=i;l<a.length;l++) {
				op[i]=a[l];
				i++;
			}
		}
		
		if(j<b.length) {
			for(int l=j;l<b.length;l++) {
				op[k]=b[l];
				k++;
			}
		}
		
		
		
		for(int z=0;z<op.length;z++) {
			System.out.println(op[z]);
		}
		
		
	}

}
