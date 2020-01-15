package com.primeNumber.prime;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
public class PrimeNumberTests {

  @Test
  @DisplayName("Проверка на минимальное простое число")
  public void PrimeMinimumValueTests() {
    var result = new PrimeApplication().primeOrComposite(2);

    assertThat(result).isTrue();
  }

  @Test
  @DisplayName("Проверка на максимальное простое число")
  public void MaximumValueTests() {
    var result = new PrimeApplication().primeOrComposite(2147483647);

    assertThat(result).isTrue();
  }

  @Test
  @DisplayName("Проверка на минимальное составное число")
  public void CompositeMinimumValueTests() {
    var result = new PrimeApplication().primeOrComposite(4);

    assertThat(result).isFalse();
  }

  @Test
  @DisplayName("Проверка на максимальное составное число")
  public void CompositeMaximumValueTests() {
    var result = new PrimeApplication().primeOrComposite(2147483646);

    assertThat(result).isFalse();
  }

  @Test
  @DisplayName("Проверка на минимальное отрицательное число")
  public void NegativeMinimumValueTests() {
    var result = new PrimeApplication().primeOrComposite(-2147483648);

    assertThat(result).isFalse();
  }

  @Test
  @DisplayName("Проверка на максимальное отрицательное число")
  public void NegativeMaximumValueTests() {
    var result = new PrimeApplication().primeOrComposite(-1);

    assertThat(result).isFalse();
  }

  @Test
  @DisplayName("Проверка на ноль")
  public void ZeroTests() {
    var result = new PrimeApplication().primeOrComposite(0);

    assertThat(result).isFalse();
  }

  @Test
  @DisplayName("Проверка на единицу")
  public void NumberOneTests() {
    var result = new PrimeApplication().primeOrComposite(1);

    assertThat(result).isFalse();
  }


  /*
   * @Test public void OutOfRangeTests() { var result = new
   * PrimeApplication().primeOrComposite(2147483648);
   * 
   * assertThat(result).isFalse();
   * 
   * }
   */

}
