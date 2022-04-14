package validacao;

public final class Validacao {
  public static boolean isNumeric(String text) {
    char letters[] = text.toCharArray();
    for (char letter : letters) {
      if (Character.isDigit(letter))
        return true;
    }
    return false;
  }
}
