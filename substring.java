public class substring {

    public static void main(String[] args) {
        //.substring() =A method used to extract a portion of a string
        //string.substring(start,end)

        String email ="shahidkx07@gmail.com";

        String username=email.substring(0,email.indexOf("@"));
        System.out.println(username);
        String domain=email.substring(email.indexOf("@"));
        System.out.println(domain);
    }
}