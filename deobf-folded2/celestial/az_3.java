package celestial;

import java.util.Random;
import java.util.Map.Entry;

public class az_3 extends ev_3 {
   public az_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.ARMOR_CHEST, var2);
   }

   @Override
   public boolean id_class(rdn_3 var1) {
      return var1.id_break() instanceof rxS_2 ? true : super.id_class(var1);
   }

   public static boolean id_class(int var0, Random var1) {
      return var0 <= 0 ? false : var1.nextFloat() < 0.15F * (float)var0;
   }

   @Override
   public int id_class(int var1) {
      return 10 + 20 * (var1 - 1);
   }

   @Override
   public int id_class() {
      return 3;
   }

   @Override
   public int id_break(int var1) {
      return super.id_class(var1) + 50;
   }

   public static int id_break(int var0, Random var1) {
      return var0 > 10 ? var0 - 10 : 1 + var1.nextInt(4);
   }

   @Override
   public void id_break(iB_2 var1, an_3 var2, int var3) {
      Random var4 = var1.Sa();
      Entry var5 = eA_2.id_break(eY_2.id_private, var1);
      if (id_class(var3, var4)) {
         if (var2 != null) {
            var2.id_break(rye_3.id_class((an_3)var1), (float)id_break(var3, var4));
         }

         if (var5 != null) {
            ((rdn_3)var5.getValue()).id_class(2, var1, var1x -> var1x.id_break((rXQ)var5.getKey()));
         }
      }
   }
}
