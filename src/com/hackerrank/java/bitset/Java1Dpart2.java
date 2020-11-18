package com.hackerrank.java.bitset;

public class Java1Dpart2 {
  public boolean canWin(int leap, int[] game) {
    return move(0, leap, game);
  }

  public boolean move(int index, int leap, int[] game) {
    if (index <= 0 && game[index] == 1) return false;
    if (index + leap >= game.length || (index + leap) == game.length - 1) return true;

    game[index] = 1;
    return move(index + 1, leap, game) || move(index - 1, leap, game) || move(index + leap,leap , game);
  }

  public static void main(String[] args) {

  }
}
