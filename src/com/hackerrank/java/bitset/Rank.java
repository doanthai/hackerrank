package com.hackerrank.java.bitset;

import java.util.ArrayList;
import java.util.List;

public class Rank {
  public static int c = 0;

  public static void main(String[] args) {
    List<User> users = mockUser();

    long t = System.currentTimeMillis();
    for (int i = users.size() - 1; i >= 0; i--) {
      for (int j = 1; j <= 4; j ++) {
        checkRank(users.get(i), j, users);
      }
    }
    System.out.println(c);
    System.out.println(System.currentTimeMillis() - t);

    for (User user : users) {
      System.out.println(user.toString());
    }
  }

  public static boolean checkRank(User user, int rank, List<User> users) {
    if (rank == 1 && user.getMoney() > 300) {
      user.setRank(rank);
      return true;
    } else {
      int count = 0;
      for (int i = 0; i < users.size(); i++) {
        c++;
        if (users.get(i).getRank() < rank
            && users.get(i).getParent() == user.id
            && checkRank(users.get(i), rank - 1, users)) count ++;
        if (count == 2) {
          user.setRank(rank);
          return true;
        }
      }
    }
    return false;
  }

  public static List<User> mockUser() {
    ArrayList<User> users = new ArrayList<>();
    users.add(new User(1, 600, 0)); //4
    users.add(new User(2, 600, 1)); //3
    users.add(new User(3, 600, 1)); //3
    users.add(new User(4, 600, 2)); //2
    users.add(new User(5, 600, 2)); //2
    users.add(new User(6, 600, 3)); //2
    users.add(new User(7, 600, 3)); //2
    users.add(new User(8, 600, 4)); //1
    users.add(new User(9, 600, 4)); //1
    users.add(new User(10, 600, 5)); //1
    users.add(new User(11, 600, 5)); //1
    users.add(new User(12, 600, 6)); //1
    users.add(new User(13, 600, 6)); //1
    users.add(new User(14, 600, 7)); //1
    users.add(new User(15, 600, 7)); //1
    return users;
  }

  public static class User {
    private int id;
    private long money;
    private int parent;
    private int rank;

    public int getRank() {
      return rank;
    }

    public void setRank(int rank) {
      this.rank = rank;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public long getMoney() {
      return money;
    }

    public void setMoney(long money) {
      this.money = money;
    }

    public int getParent() {
      return parent;
    }

    public void setParent(int parent) {
      this.parent = parent;
    }

    public User(int id, long money, int parent) {
      this.id = id;
      this.money = money;
      this.parent = parent;
    }

    @Override
    public String toString() {
      return "User{" +
          "id=" + id +
          ", money=" + money +
          ", parent=" + parent +
          ", rank=" + rank +
          '}';
    }
  }
}
