class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();
        for(int i = 0; i<emails.length; i++){
            String[] sep = emails[i].split("@");
            String local = sep[0];
            String domain = sep[1];

            local = local.split("\\+")[0];
            local = local.replace(".","");

            unique.add(local+"@"+domain);
        }
        return unique.size();
        
        
    }
}