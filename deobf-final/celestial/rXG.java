package celestial;

import com.google.common.collect.UnmodifiableIterator;

public class rXG {
   public static final rXs_1 class_ = class_("empty", new rXP());
   public static final rXB break_ = class_("flowing_water", new rXX());
   public static final rXB byte_ = class_("water", new rXJ());
   public static final rXB protected_ = class_("flowing_lava", new rXM());
   public static final rXB throws_ = class_("lava", new rXO());

   static {
      for (rXs_1 var1 : rVL.default_) {
         UnmodifiableIterator var2 = var1.catch_().class_().iterator();

         while (var2.hasNext()) {
            rXE var3 = (rXE)var2.next();
            rXs_1.byte_.break_(var3);
         }
      }
   }

   private static <T extends rXs_1> T class_(String var0, T var1) {
      return rVL.class_(rVL.default_, var0, (T)var1);
   }
}
