class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        
        for(String s : strs) {
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }

        String encoded_string = sb.toString();
        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();

        for(int i = 0; i < str.length(); ) {
            int n = 0;

            while (str.charAt(i) != '#') {
                int digit = str.charAt(i) - '0';
                n = (n * 10) + digit;
                i++;
            }

            StringBuilder sb = new StringBuilder();
            for(int j = i+1; j <= i + n; j++) {
                sb.append(str.charAt(j));
            }

            String temp = sb.toString();
            decoded_strs.add(temp);

            i = i + n + 1;
        }

        return decoded_strs;
    }
}
