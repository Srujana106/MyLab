import java.util.*;

public class SortCharacters {
   
    private static String sortString(String str){

 Map<Character, List<Boolean>> map = new HashMap<>();

	
        for(char c:str.toCharArray()){
            if(Character.isAlphabetic(c)){
                char lowerChar = Character.toLowerCase(c);  
		if(!map.containsKey(lowerChar)) 
			map.put(lowerChar,new ArrayList<>());

                map.get(lowerChar).add(Character.isUpperCase(c));

            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c: "abcdefghijklmnopqrstuvwxyz".toCharArray()){
            if(map.containsKey(c)){
                map.get(c).forEach(isCapital ->
                    {
                            if(isCapital)
                                    sb.append(Character.toUpperCase(c));
                            else sb.append(c);
                            return;
                    });
            }
        }

        return sb.toString();

}
    public static void main(String[] args) {
        if(args.length==0)
            throw new RuntimeException("Arguments should not be empty");
        String str= args[0];

       System.out.println(sortString(str));
    }
}
