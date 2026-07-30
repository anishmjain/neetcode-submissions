class Solution {

    // Encodes a list of strings into a single string.
    public String encode(List<String> strs) {

        StringBuilder encodedStr = new StringBuilder();

        for (String str : strs) {
            // Format: length#string
            // Example: "apple" -> "5#apple"
            encodedStr.append(str.length());
            encodedStr.append("#");
            encodedStr.append(str);
        }

        return encodedStr.toString();
    }

    // Decodes the encoded string back into the original list.
    public List<String> decode(String encodedStr) {

        List<String> list = new ArrayList<>();

        int i = 0;

        while (i < encodedStr.length()) {

            // Find the position of '#'
            int j = i;
            while (encodedStr.charAt(j) != '#') {
                j++;
            }

            // Extract the length (handles multiple digits)
            int len = Integer.parseInt(encodedStr.substring(i, j));

            // Move past '#'
            j++;

            // Extract the original string
            String str = encodedStr.substring(j, j + len);
            list.add(str);

            // Move to the next encoded string
            i = j + len;
        }

        return list;
    }
}