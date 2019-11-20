package com.comparator;

import java.util.Comparator;

public class NumberComparatorMax implements Comparator<String> {

  @Override
  public int compare(String a, String b) {
    return Integer.parseInt(a) - Integer.parseInt(b);
  }

}
