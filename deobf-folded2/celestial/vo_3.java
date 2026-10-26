package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class vo_3 extends vm_3 {
   private final row_3 id_class;
   private long id_throws = -1L;
   private static final Object2IntMap<roN_2> id_case = rqR_2.id_class(new Object2IntOpenHashMap(), var0 -> {
      var0.defaultReturnValue(0);
      var0.put(roN_2.id_class, 5526612);
      var0.put(roN_2.id_break, 10066329);
      var0.put(roN_2.id_byte, 6250897);
      var0.put(roN_2.id_protected, 8434258);
      var0.put(roN_2.id_throws, 13750737);
      var0.put(roN_2.id_case, 7497737);
      var0.put(roN_2.id_catch, 7169628);
      var0.put(roN_2.id_private, 3159410);
      var0.put(roN_2.id_implements, 2213376);
      var0.put(roN_2.id_finally, 13421772);
      var0.put(roN_2.id_extends, 15884384);
      var0.put(roN_2.id_native, 15658734);
      var0.put(roN_2.id_volatile, 16777215);
   });

   public vo_3(row_3 var1) {
      super(rgN_2.id_byte);
      this.id_class = var1;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      String var5 = rfU_2.id_class(this.id_class.id_throws(), 0, 100) + "%";
      long var6 = rqR_2.id_break();
      if (var6 - this.id_throws > 2000L) {
         this.id_throws = var6;
      }

      int var8 = this.id_package / 2;
      int var9 = this.id_int / 2;
      byte var10 = 30;
      id_class(var1, this.id_class, var8, var9 + 30, 2, 0);
      id_class(var1, this.id_super, var5, var8, var9 - 4 - 30, 16777215);
   }

   public static void id_class(Ml_1 var0, row_3 var1, int var2, int var3, int var4, int var5) {
      int var6 = var4 + var5;
      int var7 = var1.id_byte();
      int var8 = var7 * var6 - var5;
      int var9 = var1.id_protected();
      int var10 = var9 * var6 - var5;
      int var11 = var2 - var10 / 2;
      int var12 = var3 - var10 / 2;
      int var13 = var8 / 2 + 1;
      int var14 = -16772609;
      if (var5 != 0) {
         id_class(var0, var2 - var13, var3 - var13, var2 - var13 + 1, var3 + var13, -16772609);
         id_class(var0, var2 + var13 - 1, var3 - var13, var2 + var13, var3 + var13, -16772609);
         id_class(var0, var2 - var13, var3 - var13, var2 + var13, var3 - var13 + 1, -16772609);
         id_class(var0, var2 - var13, var3 + var13 - 1, var2 + var13, var3 + var13, -16772609);
      }

      for (int var15 = 0; var15 < var9; var15++) {
         for (int var16 = 0; var16 < var9; var16++) {
            roN_2 var17 = var1.id_class(var15, var16);
            int var18 = var11 + var15 * var6;
            int var19 = var12 + var16 * var6;
            id_class(var0, var18, var19, var18 + var4, var19 + var4, id_case.getInt(var17) | 0xFF000000);
         }
      }
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   public void w_() {
      super.w_();
   }
}
