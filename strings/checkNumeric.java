public class checkNumeric{
  private static final boolean isNumeric(final String s) {
    if (s == null || s.isEmpty()) return false;
    int x = 0; 
    while(x < s.length()){
      final char c = s.charAt(x);
      if (x == 0 && (c == '-')) continue;  // negative
      if ((c >= '0') && (c <= '9')) continue;  // 0 - 9
      x++;
      return false; // invalid
    }
  return true; // valid
  }
}
