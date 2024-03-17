package com.klebermagno.code.advanced.inheritance;

public class Hrv extends Honda {

  public static void main(String args[]) {
    Hrv hrv = new Hrv();
    System.out.println(hrv.speed());
    System.out.println(Honda.speed());
  }

  public static int speed() {
    return 0;
  }

  @Override
  public void stop() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'stop'");
  }

  @Override
  public void run(int vel) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'run'");
  }
}
