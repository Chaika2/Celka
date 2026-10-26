package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class vo_3 extends vm_3 {
   private final row_3 class_;
   private long throws_ = -1L;
   private static final Object2IntMap<roN_2> case_ = rqR_2.class_(new Object2IntOpenHashMap(), var0 -> {
      var0.defaultReturnValue(0);
      var0.put(roN_2.class_, 5526612);
      var0.put(roN_2.break_, 10066329);
      var0.put(roN_2.byte_, 6250897);
      var0.put(roN_2.protected_, 8434258);
      var0.put(roN_2.throws_, 13750737);
      var0.put(roN_2.case_, 7497737);
      var0.put(roN_2.catch_, 7169628);
      var0.put(roN_2.private_, 3159410);
      var0.put(roN_2.implements_, 2213376);
      var0.put(roN_2.finally_, 13421772);
      var0.put(roN_2.extends_, 15884384);
      var0.put(roN_2.native_, 15658734);
      var0.put(roN_2.volatile_, 16777215);
   });

   public vo_3(row_3 var1) {
      super(rgN_2.byte_);
      this.class_ = var1;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      String var5 = rfU_2.class_(this.class_.throws_(), 0, 100) + "%";
      long var6 = rqR_2.break_();
      if (var6 - this.throws_ > 2000L) {
         this.throws_ = var6;
      }

      int var8 = this.package_ / 2;
      int var9 = this.int_ / 2;
      byte var10 = 30;
      class_(var1, this.class_, var8, var9 + 30, 2, 0);
      class_(var1, this.super_, var5, var8, var9 - 4 - 30, 16777215);
   }

   public static void class_(Ml_1 var0, row_3 var1, int var2, int var3, int var4, int var5) {
      int var6 = var4 + var5;
      int var7 = var1.byte_();
      int var8 = var7 * var6 - var5;
      int var9 = var1.protected_();
      int var10 = var9 * var6 - var5;
      int var11 = var2 - var10 / 2;
      int var12 = var3 - var10 / 2;
      int var13 = var8 / 2 + 1;
      int var14 = -16772609;
      if (var5 != 0) {
         class_(var0, var2 - var13, var3 - var13, var2 - var13 + 1, var3 + var13, -16772609);
         class_(var0, var2 + var13 - 1, var3 - var13, var2 + var13, var3 + var13, -16772609);
         class_(var0, var2 - var13, var3 - var13, var2 + var13, var3 - var13 + 1, -16772609);
         class_(var0, var2 - var13, var3 + var13 - 1, var2 + var13, var3 + var13, -16772609);
      }

      for (int var15 = 0; var15 < var9; var15++) {
         for (int var16 = 0; var16 < var9; var16++) {
            roN_2 var17 = var1.class_(var15, var16);
            int var18 = var11 + var15 * var6;
            int var19 = var12 + var16 * var6;
            class_(var0, var18, var19, var18 + var4, var19 + var4, case_.getInt(var17) | 0xFF000000);
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
