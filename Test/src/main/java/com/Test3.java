package com;

@SuppressWarnings("all")
public class Test3 {

    public static void main(String[] args) {
        User[] users = new User[10];
        search(users);
    }

    public static int search(User[] users) {

        int low = 0;
        int high = users.length - 1;
        while (low <= high) {
            int mid = (int) Math.floor((low + high) / 2);
            if (users[mid].getAge() == 20) {
                return mid;
            } else if (users[mid].getAge() < 20 && users[mid].getName().equals("xiaohong")) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
