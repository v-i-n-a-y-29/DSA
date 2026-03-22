public class DefangingIP {
    public static  String defangIPaddr(String address) {
        String defang=address.replace(".","[.]");
        return defang;
    }

    public static void main(String[] args) {
        String address="1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
}
