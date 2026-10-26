package celestial;

import org.apache.commons.lang3.ArrayUtils;

public class rWL extends rzt_3 {
   rWL(rzE_2[] var1, rQz_1[] var2) {
      super(var1, var2);
   }

   @Override
   public void class_(rQs_1 var1) {
      super.class_(var1);

      for (int var2 = 0; var2 < this.protected_.length - 1; var2++) {
         if (ArrayUtils.isEmpty(this.protected_[var2].byte_)) {
            var1.class_("Unreachable entry!");
         }
      }
   }

   public static rWA class_(rzG_2<?>... var0) {
      return new rWA(var0);
   }

   @Override
   protected rWV class_(rWV[] var1) {
      switch (var1.length) {
         case 0:
            return class_;
         case 1:
            return var1[0];
         case 2:
            return var1[0].break_(var1[1]);
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
   public rzm_3 class_() {
      return rzM_2.case_;
   }
}
