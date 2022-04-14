package validacao;

/**
 * Classe final para validar se o texto contém valores numéricos e especiais
 * 
 * Validacao
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public final class Validacao {
  /**
   * Verifica se o texto contém números e/ou caracteres especiais
   * 
   * @param text texto a ser verificado
   * @return verdadeiro se o texto conter números ou caracteres especiais, caso
   *         contrário, retorna falso
   */
  public static boolean isNumeric(String text) {
    char letters[] = text.toCharArray();
    for (char letter : letters) {
      if (Character.isDigit(letter))
        return true;
    }
    return false;
  }
}
