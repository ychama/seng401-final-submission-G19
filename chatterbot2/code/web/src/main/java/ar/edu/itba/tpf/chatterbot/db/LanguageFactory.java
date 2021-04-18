public class LanguageFactory {

  public StartUpDatabase getLanguage(String s) {
    if (s.charAt(0) == 's' || s.charAt(0) == 'S')
      return new StartUpDatabase("../impl/src/main/resources/impl-beansSP.xml");
    if (s.charAt(0) == 'e' || s.charAt(0) == 'E')
      return new StartUpDatabase("../impl/src/main/resources/impl-beansEN.xml");
    else
      throw new Exception ("Invalid argument.");
  }
}
