package celestial;

import org.apache.commons.lang3.ArrayUtils;

public class rWL extends rzt_3 {
   rWL(rzE_2[] var1, rQz_1[] var2) {
      super(var1, var2);
   }

   @Override
   public void id_class(rQs_1 var1) {
      super.id_class(var1);

      for (int var2 = 0; var2 < this.id_protected.length - 1; var2++) {
         if (ArrayUtils.isEmpty(this.id_protected[var2].id_byte)) {
            var1.id_class("Unreachable entry!");
         }
      }
   }

   public static rWA id_class(rzG_2<?>... var0) {
      return new rWA(var0);
   }

   @Override
   protected rWV id_class(rWV[] var1) {
      switch (var1.length) {
         case 0:
            return id_class;
         case 1:
            return var1[0];
         case 2:
            return var1[0].id_break(var1[1]);
         default:
            return (var1x, var2) -> {
               for (rWV var6 : var1) {
                  if (var6.expand(var1x, var2)) {
                     return true;
                  }
               }

               return false;
            };
      }
   }

   @Override
   public rzm_3 id_class() {
      return rzM_2.id_case;
   }
}
