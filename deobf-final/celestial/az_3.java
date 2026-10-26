package celestial;

import java.util.Random;
import java.util.Map.Entry;

public class az_3 extends ev_3 {
   public az_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.ARMOR_CHEST, var2);
   }

   @Override
   public boolean class_(rdn_3 var1) {
      return var1.break_() instanceof rxS_2 ? true : super.class_(var1);
   }

   public static boolean class_(int var0, Random var1) {
      return var0 <= 0 ? false : var1.nextFloat() < 0.15F * (float)var0;
   }

   @Override
   public int class_(int var1) {
      return 10 + 20 * (var1 - 1);
   }

   @Override
   public int class_() {
      return 3;
   }

   @Override
   public int break_(int var1) {
      return super.class_(var1) + 50;
   }

   public static int break_(int var0, Random var1) {
      return var0 > 10 ? var0 - 10 : 1 + var1.nextInt(4);
   }

   @Override
   public void break_(iB_2 var1, an_3 var2, int var3) {
      Random var4 = var1.Sa();
      Entry var5 = eA_2.break_(eY_2.private_, var1);
      if (class_(var3, var4)) {
         if (var2 != null) {
            var2.break_(rye_3.class_((an_3)var1), (float)break_(var3, var4));
         }

         if (var5 != null) {
            ((rdn_3)var5.getValue()).class_(2, var1, var1x -> var1x.break_((rXQ)var5.getKey()));
         }
      }
   }
}
