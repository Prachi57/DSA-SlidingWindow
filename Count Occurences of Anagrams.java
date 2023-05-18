class Solution {

    int search(String pat, String txt) {
        // code here
        HashMap<Character , Integer> pmap = new HashMap<>();
        HashMap<Character , Integer> tmap = new HashMap<>();
        int plen = pat.length();
        int tlen = txt.length();
        int count = 0;
        for( char c:pat.toCharArray()) 
        {
            pmap.put(c,pmap.getOrDefault(c ,0) + 1);
        }
        for(int i = 0; i<tlen; i++) 
        {
            char c = txt.charAt(i);
            tmap.put(c,tmap.getOrDefault(c,0) + 1);
            if(i >= plen)
            {
                char out = txt.charAt(i-plen);
                if(tmap.get(out) == 1) tmap.remove(out);
                else tmap.put(out,tmap.get(out) - 1);
            }
            if(i >= plen-1 && tmap.equals(pmap)) 
            count++;
        }
        return count;
    }
}
