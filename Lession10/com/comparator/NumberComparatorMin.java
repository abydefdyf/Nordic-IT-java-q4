package com.comparator;

import java.util.Comparator;

public class NumberComparatorMin implements Comparator<String> {

  @Override
  public int compare(String a, String b) {
    return Integer.compare(Integer.parseInt(b), Integer.parseInt(a));
  }

}

