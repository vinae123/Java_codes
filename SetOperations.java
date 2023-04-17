import java.util.*;

class SetOperations {
    int m, n;
    int[] a;
    int[] b;
    
    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in A: ");
        m = sc.nextInt();
        System.out.print("Enter the number of elements in B: ");
        n = sc.nextInt();
        a = new int[m];
        b = new int[n];
        System.out.print("Enter the elements in A: ");
        for(int i = 0; i < m; i++) {
            a[i] = sc.nextInt();   
        }
        System.out.print("Enter the elements in B: ");
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();   
        }	
    }
    
    public void display(String setName, int[] set) { 
        System.out.print("The elements in " + setName + ": ");
        for(int i = 0; i < set.length; i++) {
            System.out.print(set[i] + " ");   
        }
        System.out.println();
    }
    
    public int[] union() {
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else if (a[i] > b[j]) {
                result[k++] = b[j++];
            } else {
                result[k++] = a[i++];
                j++;
            }
        }
        while (i < m) {
            result[k++] = a[i++];
        }
        while (j < n) {
            result[k++] = b[j++];
        }
        result = Arrays.copyOf(result, k);
        return result;
    }
    
    public int[] intersection() {
        int[] result = new int[Math.min(m, n)];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                result[k++] = a[i++];
                j++;
            }
        }
        result = Arrays.copyOf(result, k);
        return result;
    }
    
    public int[] difference() {
        int[] result = new int[m];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else if (a[i] > b[j]) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        while (i < m) {
            result[k++] = a[i++];
        }
        result = Arrays.copyOf(result, k);
        return result;
    }
}

class SetOperations {
    public static void main(String[] args) {
        SetOperations set = new SetOperations();
        set.getDetails();
        int[] union = set.union();
        set.display("A U B", union);
        int[] intersection = set.intersection();
        set.display("A ∩ B", intersection);
        int[] difference = set.difference();
        set.display("A - B", difference);
    }
}

