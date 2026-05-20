package Strings;

public class minWindowString {

        public static String minWindowString(String source, String target) {
            if (source == "" || source == null || target.isEmpty()) {
                return "";
            }
            if (source.length() < target.length()) {
                return "";
            }
            int need[] = new int[128];
            for (char each : target.toCharArray()) {

                need[each] = need[each] + 1;
            }

            int start = 0;
            int count = target.length();
            int minLenght = Integer.MAX_VALUE;

            int l = 0, r = 0;

            while (r < source.length()) {
                char ch = source.charAt(r);

                if (need[ch] > 0) {
                    count--;
                }
                need[ch]--;
                r++;
                while (count == 0) {
                    if (r - l < minLenght) {
                        minLenght = r - l;
                        start = l;

                    }
                    ch = source.charAt(l);
                    need[ch]++;

                    if (need[ch] > 0) {
                        count++;
                    }
                    l++;

                }

            }

            return minLenght == Integer.MAX_VALUE ? "" : source.substring(start, start + minLenght);

        }

        public static void main(String[] args) {
            String source = "ADOBECODEBANC";
            String target = "ABC";
            String ans = minWindowString(source, target);
            System.out.println(ans);

        }
    }

