package org.example;

public class Calculate {
  // 1. 個人の基本料金を計算するメソッド
  public int getIndividualFee(int age) {
    if (age <= 12) {
      return 1000;
    } else {
      return 2000;
    }
  }

  // 2. グループの合計料金を計算するメソッド
  public int getTotalFee(int age, int groupSize) {
    int baseFee = getIndividualFee(age) * groupSize;

    // 10人以上の場合は10%引き (0.9倍)
    if (groupSize >= 10) {
      return (int) (baseFee * 0.9);
    } else {
      return baseFee;
    }
  }
}
