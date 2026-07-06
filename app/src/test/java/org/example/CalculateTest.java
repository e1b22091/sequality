package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testGetIndividualFee() {
    Calculate calc = new Calculate();

    // 分岐1: 12歳以下 (True)
    assertEquals(1000, calc.getIndividualFee(12));
    // 分岐2: 13歳以上 (False)
    assertEquals(2000, calc.getIndividualFee(13));
  }

  @Test
  public void testGetTotalFee() {
    Calculate calc = new Calculate();

    // 分岐1: 10人未満の場合 (割引なし・Falseルート)
    assertEquals(9000, calc.getTotalFee(12, 9)); // 1000円 * 9人
    assertEquals(18000, calc.getTotalFee(13, 9)); // 2000円 * 9人

    // 分岐2: 10人以上の場合 (10%割引適用・Trueルート)
    assertEquals(9000, calc.getTotalFee(12, 10)); // 1000円 * 10人 * 0.9
    assertEquals(18000, calc.getTotalFee(13, 10)); // 2000円 * 10人 * 0.9
  }
}
