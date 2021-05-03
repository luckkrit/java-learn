package ch6_9.homework.hwalgo;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HomeworkAlgo {
    public static void main(String[] args) {
//        int[] results = twoSum(new int[]{2, 7, 11, 15}, 9);
//        int[] results = twoSum(new int[]{3, 2, 4}, 6);
//        int[] results = twoSum(new int[]{3, 3}, 6);
//        int[] results = twoSum(new int[]{-3, 4, 3, 90}, 0);
//        System.out.println(Arrays.toString(results));

//        int result = reverse(-123);
//        int result = reverse(120);
//        int result = reverse(1534236469);

//        boolean result = isPalindrome(111);
//        String[] romanNumbers = new String[]{
//                "I",
//                "II",
//                "III",
//        };
//        Map<Integer, Integer> expected = new HashMap<>();
//        for (int i = 0; i < romanNumbers.length; i++) {
//
//            int result = romantToInt(romanNumbers[i]);
//            expected.put(i + 1, result);
////            if (i + 1 != result)
////                System.out.println((i + 1) + " " + romanNumbers[i] + " " + result);
//        }
//        for (int key : expected.keySet()) {
//            if (key != expected.get(key)) {
//                System.out.println(key + " != " + expected.get(key));
//            }
//        }
//        String result = longestCommonPrefix(new String[]{"flower", "flow", "flight"});
//        String result = longestCommonPrefix(new String[]{"dog", "racecar", "car"});
//        String result = longestCommonPrefix(new String[]{"ab", "a"});
//        String result = longestCommonPrefix(new String[]{""});

//        Boolean result = isValid("()");
//        System.out.println(result);
//        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
//        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
//        ListNode result = mergeTwoLists(l1, l2);
//        ListNode temp = result;
//        while (temp.next != null) {
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
//        int[] input = new int[]{1, 1, 2};
//        int result = removeDuplicates(input);
//        System.out.println(result);
//        for (int i = 0; i < input.length; i++) {
//            System.out.println(input[i]);
//        }
//        int[] input = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
//        int result = removeElement(input, 2);
//        for (int i = 0; i < input.length; i++) {
//            System.out.println(input[i]);
//        }
//        int[] input = new int[]{1, 3, 5, 6};
//        int result = searchInsert(input, 7);
//        System.out.println(result);
        String result = countAndSay(5);
        System.out.println(result);
    }

    static int[] twoSum(int[] nums, int target) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int next = nums[j];
                if (current + next == target) {
                    results.add(i);
                    results.add(j);
                }
            }
        }
        return results.stream().mapToInt(i -> i).toArray();
    }

    static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
        }
        String test = String.valueOf(Math.abs(x));
        String result = "";
        for (int i = test.length() - 1; i > -1; i--) {
            result += test.charAt(i);
        }

        try {
            int result2 = Integer.parseInt(result);
            if (isNegative) {
                return -1 * result2;
            }
            return result2;
        } catch (Exception e) {
            return 0;
        }

    }

    static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        try {
            String test = String.valueOf(x);
            StringBuilder result = new StringBuilder();
            for (int i = test.length() - 1; i > -1; i--) {
                result.append(test.charAt(i));
            }
            int test2 = Integer.parseInt(test);
            int result2 = Integer.parseInt(result.toString());
            return test2 == result2;
        } catch (Exception e) {
            return false;
        }
    }

    static int romantToInt(String s) {
        Map<Character, Integer> rules = new HashMap<>();
        rules.put('I', 1);
        rules.put('V', 5);
        rules.put('X', 10);
        rules.put('L', 50);
        rules.put('C', 100);
        rules.put('D', 500);
        rules.put('M', 1000);
        char[] numbers = s.toCharArray();
        List<Integer> queues = new ArrayList<>();
        Pattern pattern = Pattern.compile("I{4,}|X{4,}|C{4,}|M{4,}", Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile("VX|VC|VM|LC|LM|DM", Pattern.CASE_INSENSITIVE);
        Pattern pattern3 = Pattern.compile("IVI|IXI|ILI|ICI|IDI|IMI|XVX|XLX|XCX|CDC|CMC",
                Pattern.CASE_INSENSITIVE);
        Pattern pattern4 = Pattern.compile("[^IVXLCDM]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);
        Matcher matcher3 = pattern3.matcher(s);
        Matcher matcher4 = pattern4.matcher(s);
        boolean matchFound = matcher.find() || matcher2.find() || matcher3.find() || matcher4.find();
        if (matchFound) {
            return -1;
        }
        int comparator = 0;
        for (int i = 0; i < numbers.length; i++) {
            Character key = numbers[i];
            int value = rules.get(key);
            if (comparator == 0) {
                comparator = value;
                queues.add(value);
            } else if (comparator > value) {
                comparator = value;
                queues.add(value);
            } else if (comparator == value) {
                queues.add(value);
            } else {
                comparator = value;
                int previous = queues.get(queues.size() - 1);
                int current = previous - value;
                if (current < 0) current *= -1;
                queues.remove(queues.size() - 1);
                queues.add(current);
            }
        }
        int total = 0;
        for (int i = 0; i < queues.size(); i++) {
            int n = queues.get(i);
            total += n;
            if (i != 0) {
                if (total < 0) total *= -1;
            }
        }
        return total;
    }

    static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int lastIndex = 1;
        int emptyCount = 0;
        HashMap<String, Integer> prefixMap = new HashMap<>();
        for (int i = 0; true; ) {
            if (i < strs.length) {
                String word = strs[i];
                if (word.trim().length() > 0) {
                    if (lastIndex <= word.length()) {
                        String key = word.substring(0, lastIndex);
                        if (prefixMap.containsKey(key)) {
                            int total = prefixMap.get(key);
                            prefixMap.put(key, total + 1);
                        }
                        prefixMap.putIfAbsent(key, 1);
                    } else {
                        break;
                    }
                } else if (word.trim().length() == 0) {
                    emptyCount++;
                    if (emptyCount == strs.length) {
                        break;
                    }
                }
                i++;
            } else {
                i = 0;
                lastIndex++;
            }
        }
        for (String key : prefixMap.keySet()) {
            if (prefixMap.get(key) == strs.length) {
                if (key.length() > prefix.length()) {
                    prefix = key;
                }
            }
        }
        return prefix;
    }

    static boolean isValid(String s) {
        Map<Character, Character> rules = new HashMap<>();
        rules.put('(', ')');
        rules.put('{', '}');
        rules.put('[', ']');
        Stack<Character> keyStack = new Stack<>();
        boolean isValid = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (rules.containsKey(c)) {
                keyStack.push(c);
            } else if (!keyStack.empty()) {
                char popKey = keyStack.pop();
                char value = rules.get(popKey);
                if (value == c) {
                    isValid = isValid && true;
                } else {
                    isValid = isValid && false;
                }
            } else {
                isValid = isValid && false;
            }

        }
        if (keyStack.size() > 0) return false;
        return isValid;
    }

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> values = new ArrayList<>();
        ListNode temp = l1;
        ListNode temp2 = l2;
        if (l1 != null) {

            do {
                if (temp != null) {

                    values.add(temp.val);
                    temp = temp.next;
                    if (temp == null) {
                        break;
                    }
                    if (temp != null && temp.next == null) {
                        values.add(temp.val);
                        break;
                    }
                }
            } while (true);
        }
        if (l2 != null) {

            do {
                if (temp2 != null) {

                    values.add(temp2.val);
                    temp2 = temp2.next;
                    if (temp2 == null) {
                        break;
                    }
                    if (temp2 != null && temp2.next == null) {
                        values.add(temp2.val);
                        break;
                    }
                }
            } while (true);
        }
        values = values.stream().sorted().collect(Collectors.toList());
        if (values.size() == 0) return null;
        ListNode result = new ListNode();
        ListNode next = result;
        for (int i = 0; i < values.size(); i++) {
            Integer n = values.get(i);
            next.val = n;
            if (i < values.size() - 1) {
                if (next.next == null) {
                    next.next = new ListNode();
                    next = next.next;
                }
            }
        }
        return result;
    }

    static int removeDuplicates(int[] nums) {
        if (nums == null) return 0;

        boolean first = false;
        int check = -1;
        int count = 0;
        int[] temp;
        for (int i = 0; i < nums.length; i++) {
            if (!first) {
                first = true;
                check = nums[i];
                count++;
            } else {

                if (check != nums[i]) {
                    check = nums[i];
                    count++;
                }
            }
        }
        first = false;
        temp = new int[count];
        check = -1;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!first) {
                first = true;
                check = nums[i];

                if (j < count) {
                    temp[j] = nums[i];
                    j++;
                }
            } else {

                if (check != nums[i]) {
                    check = nums[i];
                    if (j < count) {
                        temp[j] = nums[i];
                        j++;
                    }
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (i < nums.length) {

                nums[i] = temp[i];
            }
        }
        return count;
    }

    static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                stack.push(i);
                nums[i] = 0;
            }
        }
        result = nums.length - stack.size();
        while (!stack.isEmpty()) {
            int index = stack.pop();
            for (int i = index + 1; i < nums.length; i++) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index = i;
            }
        }
        return result;
    }

    static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        return haystack.indexOf(needle);
    }

    static int searchInsert(int[] nums, int target) {
        if (target == 0) return 0;
        int index = 0;
        List<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toList());
        numbers.add(target);
        numbers = numbers.stream().sorted().collect(Collectors.toList());
        index = numbers.indexOf(target);
        return index;
    }

    static String createCountAndSay(String test) {
        String result = "";
        Character check = test.charAt(0);
        Map<Character, Integer> map = new HashMap<>();
        map.put(check, 1);

        for (int i = 1; i < test.length(); i++) {
            Character l = test.charAt(i);
            if (check != l) {
                if (map.containsKey(check)) {
                    result += String.valueOf(map.get(check)) + check;
                    map.remove(check);
                } else {
                    map.put(check, 1);
                }
                check = l;
                if (!map.containsKey(check)) {
                    map.put(check, 1);
                }
                if (i == test.length() - 1) {

                    result += String.valueOf(map.get(check)) + check;
                    map.remove(check);
                }
            } else {
                if (map.containsKey(check)) {
                    int total = map.get(check) + 1;
                    map.put(check, total);
                } else {
                    map.put(check, 1);
                }
                if (i == test.length() - 1) {

                    result += String.valueOf(map.get(check)) + check;
                    map.remove(check);
                }
            }
        }
        if (test.length() == 1) {

            result += String.valueOf(map.get(check)) + check;
            map.remove(check);
        }
        return result;
    }

    static String countAndSay(int n) {
        if (n < 2) {
            return "1";
        }
        String result = "1";
        for (int i = 0; i < n - 1; i++) {
            result = createCountAndSay(result);
        }
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
