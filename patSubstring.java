class Question {
    public static String charRemove(String str, int p , int q) 
    {  
        return str.substring(p + 1, q + 1);  
    }  
           
    public static void main(String[] args) {
        String s = "abbabbabbabbababa";
        String pattern = "abb";
        String temp = "";
        int ws = 0 ;
        int we = 0;
        int count = 0;
        int key = pattern.length();
        int size = s.length();
        while (we < size)
        {
            temp  = temp +  s.charAt(we);
            if(we - ws + 1 == key)
            {
                if(pattern.equals(temp))
                count++;
                temp = charRemove(s , ws , we);
                ws++;
            }
            we++;
        }
        System.out.println(count);
    }
}

//OUTPUT
//java -cp /tmp/uWvNFmaLEV HelloWorld
//4
