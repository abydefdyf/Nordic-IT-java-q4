package com.wordGame;

import java.util.HashSet;
import com.example.exceptions.NewWordException;
import com.example.exceptions.RepeatWordException;

public class Generator {
  private int lengthPlayer1 = 0;
  private int lengthPlayer2 = 0;

  private HashSet<String> historyPlayer = new HashSet<String>();

  public int getLengthPlayer1() {
    return lengthPlayer1;
  }


  public void setLengthPlayer1(int lengthPlayer1) {
    this.lengthPlayer1 = lengthPlayer1;
  }


  public int getLengthPlayer2() {
    return lengthPlayer2;
  }


  public void setLengthPlayer2(int lengthPlayer2) {
    this.lengthPlayer2 = lengthPlayer2;
  }

  public String getFirstElementPlayer() {

    for (var a : historyPlayer) {
      historyPlayer.remove(a);
      return a;
    }
    return "";
  }


  public void generateNamePlayer1(String namePlayer1) throws RepeatWordException, NewWordException {
    if (historyPlayer.add(namePlayer1)) {
      lengthPlayer1 += namePlayer1.length();
      throw new NewWordException();
    } else {
      throw new RepeatWordException();
    }
  }

  public void generateNamePlayer2(String namePlayer2) throws RepeatWordException, NewWordException {
    if (historyPlayer.add(namePlayer2)) {
      lengthPlayer2 += namePlayer2.length();
      throw new NewWordException();
    } else {
      throw new RepeatWordException();
    }
  }

}
