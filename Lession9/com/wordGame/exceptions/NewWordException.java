package com.example.exceptions;

public class NewWordException extends Exception {
  public NewWordException() {
    super("Вы ввели новое слово");
  }

}
