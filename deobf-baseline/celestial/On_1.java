package celestial;

public class On_1 extends RuntimeException {
   public On_1(Class<?> var1) {
      super("No registered lambda listener for '" + var1.getName() + "'.");
   }
}
