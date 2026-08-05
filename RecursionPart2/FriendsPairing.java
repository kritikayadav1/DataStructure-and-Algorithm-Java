package RecursionPart2;

public class FriendsPairing {

    public static int friendsPairing(int n) {

        // Base Case
        if (n == 1 || n == 2) {
            return n;
        }

        // Friend remains Single
        int single = friendsPairing(n - 1);

        // Friend makes a Pair
        int pair = (n - 1) * friendsPairing(n - 2);

        // Total Ways
        return single + pair;
    }

    public static void main(String[] args) {

        int n = 4;

        System.out.println("Total Ways = " + friendsPairing(n));
    }
}