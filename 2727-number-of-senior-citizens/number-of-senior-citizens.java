class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String st : details){
            int age = Integer.parseInt(""+st.charAt(11)+st.charAt(12));
            System.out.println(age);
            if(age>60)count++;
        }
        return count;
        
        
    }
}