import java.util.Arrays;

public class lengthoflongestsubstring {

    public static int lengthOfLongestSubstring(String s) {

        /**
        
        Inital solution 

        Code:

        Map<Character, Integer> map = new HashMap<>();

        int maxLength = 0;
        int strLength = s.length();

        if(strLength==0)
        {
            return 0;
        }

        int p1=0;
        int p2=0;

        while(p2<strLength)
        // Checking that we don't go cross over pointer and execute that way and also ensure larger pointer is always smaller than lenght of the string.
        {
            if(map.containsKey(s.charAt(p2)))
            // Check if we already encountered the elemented if we did then go with below logic
            {
                if(p1<=map.get(s.charAt(p2)))
                // This is cruicial think like we disgarded a n length of the string let's call it dead zone if we are traversing in a direction to the end we enounter a duplicate element now let's go one element ahead of it from it's previous occurance the best case scenrio it fall's under the current length between p1 and p2 the worst thing that can happen is it fall's under dead zone which will give us incorrect calculations.
                {
                p1=map.get(s.charAt(p2))+1;
                // Since we taking the current occurance of the duplicate element we need to disgard the elements till prior occurance.
                }
            }
                map.put(s.charAt(p2),p2);
                // let's expand the links in my chain by adding new element/ new location of the duplicate element once prior occurance is disgarded.
                maxLength=Math.max(maxLength,(p2-p1)+1);
                // we do constant comparision what is max by going against previous max
                // why +1 if the index's are 3 and 1 3-1 =2 but elements at 1,2,3 are 3 right so to solve this +1 is needed.
            ++p2;
        }

        return maxLength;
        
         */

        if(s==null) return 0;

        // Map<Character, Integer> map = new HashMap<>();
        int[] map=new int[256];
        Arrays.fill(map,-1);

        int maxLength = 0;
        int strLength = s.length();

        int p1=0;
        int p2=0;

        while(p2<strLength)
        // Checking that we don't go cross over pointer and execute that way and also ensure larger pointer is always smaller than lenght of the string.
        {
            if(map[(int)s.charAt(p2)]!=-1)
            // Check if we already encountered the elemented if we did then go with below logic
            {
                if(p1<=map[(int)s.charAt(p2)])
                // This is cruicial think like we disgarded a n length of the string let's call it dead zone if we are traversing in a direction to the end we enounter a duplicate element now let's go one element ahead of it from it's previous occurance the best case scenrio it fall's under the current length between p1 and p2 the worst thing that can happen is it fall's under dead zone which will give us incorrect calculations.
                {
                p1=map[(int)s.charAt(p2)]+1;
                // Since we taking the current occurance of the duplicate element we need to disgard the elements till prior occurance.
                }
            }
                map[(int)s.charAt(p2)]=p2;
                // let's expand the links in my chain by adding new element/ new location of the duplicate element once prior occurance is disgarded.
                maxLength=Math.max(maxLength,(p2-p1)+1);
                // we do constant comparision what is max by going against previous max
                // why +1 if the index's are 3 and 1 3-1 =2 but elements at 1,2,3 are 3 right so to solve this +1 is needed.
            ++p2;
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String[] testCases = {
            "",                 // Expected: 0 (Empty string)
            "abcde",            // Expected: 5 (No repeating characters)
            "aaaaa",            // Expected: 1 (All repeating characters)
            "abcabcbb",         // Expected: 3 (Classic example, "abc")
            "pwwkew",           // Expected: 3 (Tricky window movement, "wke")
            "bbbbb",            // Expected: 1 (Another repeating character case)
            " ",                // Expected: 1 (String with a single space)
            "au",               // Expected: 2 (Short string with no repeats)
            "dvdf",             // Expected: 3 (Duplicate 'd' requires window reset, "vdf")
            "abba"              // Expected: 2 (Tests the left pointer logic, "ab")
        };

        for (String variable : testCases)
        System.out.println(lengthOfLongestSubstring(variable));
    }

}
