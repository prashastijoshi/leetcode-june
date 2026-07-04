// class Solution {
//     public int numUniqueEmails(String[] emails) {
//         Set<String> unique = new HashSet<>();
//         for(int i = 0; i<emails.length; i++){
//             String[] sep = emails[i].split("@");
//             String local = sep[0];
//             String domain = sep[1];

//             local = local.split("\\+")[0];
//             local = local.replace(".","");

//             unique.add(local+"@"+domain);
//         }
//         return unique.size();
        
        
//     }
// }
public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();

        for (String e : emails) {
            int i = 0;
            StringBuilder local = new StringBuilder();
            while (i < e.length() && e.charAt(i) != '@' && e.charAt(i) != '+') {
                if (e.charAt(i) != '.') {
                    local.append(e.charAt(i));
                }
                i++;
            }

            while (i < e.length() && e.charAt(i) != '@') {
                i++;
            }
            String domain = e.substring(i + 1);
            unique.add(local.toString() + "@" + domain);
        }
        return unique.size();
    }
}