// Add Two Numbers
public class addtwonumbers {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5};
        int[] arr2 = {5,2,5};
        int n = arr1.length;
        int m = arr2.length;
        int maxLength = Math.max(n, m);
        int[] result = new int[maxLength + 1];
        int carry = 0;
        for (int i = 0; i < maxLength; i++) {
            int num1 = (i < n) ? arr1[n - 1 - i] : 0;
            int num2 = (i < m) ? arr2[m - 1 - i] : 0;
            int sum = num1 + num2 + carry;
            result[maxLength - i] = sum % 10;
            carry = sum / 10;
        }
        result[0] = carry;
        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            if (i == 0 && result[i] == 0) {
                continue;
            }
            System.out.print(result[i] + " ");
        }
    }
}