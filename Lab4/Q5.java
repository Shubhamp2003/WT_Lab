import java.io.*;;

class Name {
    void print_name(String first_name, String last_name) {
        System.out.println(last_name + " " + first_name);
    }
}

class DisplayName{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first name: ");
        String first_name = br.readLine();
        System.out.print("Enter the last name: ");
        String last_name = br.readLine();
        Name n = new Name();
        n.print_name(first_name, last_name);
    }
}