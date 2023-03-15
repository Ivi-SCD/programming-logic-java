package dificil;

import java.util.HashMap;
import java.util.Scanner;

public class Moda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sequencia de numeros: (Separados por espaço): ");
        String[] numsStr = sc.nextLine().split(" ");
        int[] nums = new int[numsStr.length];
        for (int i = 0; i < numsStr.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }
        int mode = findMode(nums);
        System.out.println("A moda eh: " + mode);
    }

    public static int findMode(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }
        int mode = nums[0], maxFreq = 1;
        for (int num : freq.keySet()) {
            if (freq.get(num) > maxFreq) {
                maxFreq = freq.get(num);
                mode = num;
            }
        }
        return mode;
    }
}

