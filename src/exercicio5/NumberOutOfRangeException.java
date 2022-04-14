package exercicio5;

/**
 * Classe para gerar exceções caso o número esteja fora dos valores permitidos
 * 
 * NumberOutOfRangeException
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public final class NumberOutOfRangeException extends Exception {
  public NumberOutOfRangeException() {
  }

  public NumberOutOfRangeException(String arg0) {
    super(arg0);
  }

  public NumberOutOfRangeException(Throwable arg0) {
    super(arg0);
  }

  public NumberOutOfRangeException(String arg0, Throwable arg1) {
    super(arg0, arg1);
  }

  public NumberOutOfRangeException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
    super(arg0, arg1, arg2, arg3);
  }
}
