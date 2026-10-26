package celestial;

import com.google.common.collect.UnmodifiableIterator;

public class rXG {
   public static final rXs_1 id_class = id_class("empty", new rXP());
   public static final rXB id_break = id_class("flowing_water", new rXX());
   public static final rXB id_byte = id_class("water", new rXJ());
   public static final rXB id_protected = id_class("flowing_lava", new rXM());
   public static final rXB id_throws = id_class("lava", new rXO());

   static {
      for (rXs_1 var1 : rVL.id_default) {
         UnmodifiableIterator var2 = var1.id_catch().id_class().iterator();

         while (var2.hasNext()) {
            rXE var3 = (rXE)var2.next();
            rXs_1.id_byte.id_break(var3);
         }
      }
   }

   private static <T extends rXs_1> T id_class(String var0, T var1) {
      return rVL.id_class(rVL.id_default, var0, (T)var1);
   }
}
