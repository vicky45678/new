package new_work;

public class MethodCaller {
    public static void main(String[] args) {

        int start=1;
        int end=50;
        while (end <= 400) {
            for (int i = start; i <= end; i++) {
                callMethod(i);
            }
            start = end + 1;
            end = end + 50;
            if (end > 400) {
                end = 400;
            }
        }
    }
    
    private static void callMethod(int methodNumber) {
        // Here, you can call the method using methodNumber as the index
        // For example: if (methodNumber == 1) { method1(); }
        // Replace "method1" with the actual name of the method
        System.out.println("Called method: " + methodNumber);
    }
}
