package celestial;

import java.util.Random;

public class rrzG_2 {
   private static final Random id_class = new Random();

   public static Random id_class() {
      return id_class;
   }

   public static int id_class(int var0) {
      return id_class.nextInt(var0);
   }
}
