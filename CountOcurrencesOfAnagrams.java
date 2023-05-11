class Solution {

    int search(String pat, String txt) {
        
        HashMap<Character , Integer> pat_map = new HashMap<>();
        HashMap<Character , Integer> txt_map = new HashMap<>();
        int plen = pat.length() , tlen = txt.length();
        int count = 0;
        for(char c:pat.toCharArray()) 
        {
            pat_map.put(c,pat_map.getOrDefault(c,0) + 1);
        }
        for(int i = 0; i<tlen; i++) 
        {
            
            char c = txt.charAt(i);
            txt_map.put(c,txt_map.getOrDefault(c,0) + 1);
            if(i >= plen)
            {
                char out = txt.charAt(i-plen);
                if(txt_map.get(out) == 1) txt_map.remove(out);
                else txt_map.put(out, txt_map.get(out) - 1);
            }
            if(i >= plen-1 && txt_map.equals(pat_map)) count++;
        }
        return count;
    }
}
