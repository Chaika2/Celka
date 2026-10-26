package celestial;

import java.util.Random;

public class aQ_2 extends ev_3 {
   protected aQ_2(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.BREAKABLE, var2);
   }

   @Override
   public int class_() {
      return 3;
   }

   @Override
   public boolean class_(rdn_3 var1) {
      return var1.throws_() ? true : super.class_(var1);
   }

   public static boolean class_(rdn_3 var0, int var1, Random var2) {
      return var0.break_() instanceof rxS_2 && var2.nextFloat() < 0.6F ? false : var2.nextInt(var1 + 1) > 0;
   }

   @Override
   public int class_(int var1) {
      return 5 + (var1 - 1) * 8;
   }

   @Override
   public int break_(int var1) {
      return super.class_(var1) + 50;
   }
}
