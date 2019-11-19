package com.example.exceptions;

public class RepeatWordException extends Exception {
  public RepeatWordException() {
    super("Вы ввели повторное слово");
  }


}
