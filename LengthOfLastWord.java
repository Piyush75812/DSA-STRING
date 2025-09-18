class LengthOfLastWord{
    public static void main(String args[]){
        String str = "Welcome to my profile";
        System.out.println(LengthOfLastWord(str));
    }
    public static int LengthOfLastWord(String s){
        String str = s.trim();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
              
        }
        return count;
    }
}