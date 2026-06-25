import java.util.HashMap;
public class duplicate_letters {
    public static void main(String[] args) {
        String s="Shahid Khan";
        int n=s.length();
        HashMap<Character ,Integer> m= new HashMap<>();
        //m.put(curr,m.getOrDefault(curr,0)+1);

        for (int i=0;i<n;i++){
            char letter=s.charAt(i);

            // if(m.containsKey(letter)){
            //     m.put(letter,m.get(letter)+1);
            // }
            // else{
            //     m.put(letter,1);
            // }
            m.put(letter, m.getOrDefault(letter,0)+1);
        }
        for(char x:m.keySet()){
            if(m.get(x)>1){
                System.out.println(x);
            }
        }
    }
}
