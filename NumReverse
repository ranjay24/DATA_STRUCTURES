class Solution {
  public int reverseNumber(int n) {

    boolean flag = false;
    if (n < 0) {
      flag = true;
    }
    int newN = 0;
    while (n != 0) {
      int rem = n % 10;
      newN = (newN * 10) + rem;
      n = n / 10;
    }

    newN = (flag == true) ? (-1 * newN) : newN;

    return newN;
  }
}
