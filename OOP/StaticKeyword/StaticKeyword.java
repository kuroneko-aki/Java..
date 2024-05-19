public class StaticKeyword {
    
    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/ method is creatd and shared
        //          the class "owns" the static member

        Friend friend1 = new Friend("Thor");
        Friend friend2 = new Friend("Zeus");
        Friend friend3 = new Friend("Poseidon");
        Friend friend4 = new Friend("Hercules");

        Friend.displayFriends();

    }
}
