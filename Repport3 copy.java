public class Report3 {
    public static void main(String[] args) {
        String sample = "Hansung University is in Seoul, Korea.";

        // 알파벳 개수를 저장할 배열
        int[] counts = new int[26];

        // 문장에서 알파벳 개수 세기
        for (char c : sample.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    counts[c - 'a']++;
                } else if (Character.isUpperCase(c)) {
                    counts[c - 'A']++;
                }
            }
        }

        // 결과 출력
        for (char c = 'a'; c <= 'z'; c++) {
            int lowercaseCount = counts[c - 'a'];
            int uppercaseCount = counts[c - 'a' + 26];
            int totalCount = lowercaseCount + uppercaseCount;

            if (totalCount > 0) {
                System.out.println(c + "=" + lowercaseCount + "개 " + Character.toUpperCase(c) + "=" + uppercaseCount +
                        "개  " + c + "+" + Character.toUpperCase(c) + "의 합은 " + totalCount + "개");
            }
        }
    }
}
