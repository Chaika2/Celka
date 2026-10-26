package celestial;

public class rrdO {
   public static boolean id_class(rrdG[] var0) {
      for (int var1 = 0; var1 < var0.length; var1++) {
         rrdG var2 = var0[var1];
         if (var2.id_private() != 0) {
            return true;
         }

         if (var2.id_goto().length > 0) {
            return true;
         }
      }

      return false;
   }
}
