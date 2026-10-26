package celestial;

import com.google.common.collect.Lists;

public final class fQ_2 extends fj_3 {
   private static final rqO_2 int_ = new rqO_2("missingno");
   private static fk_3 new_;
   private static final rpo_3<fN_2> continue_ = new rpo_3<>(() -> {
      fN_2 var0 = new fN_2(16, 16, false);
      int var1 = -16777216;
      int var2 = -524040;

      for (int var3 = 0; var3 < 16; var3++) {
         for (int var4 = 0; var4 < 16; var4++) {
            if (var3 < 8 ^ var4 < 8) {
               var0.class_(var4, var3, -524040);
            } else {
               var0.class_(var4, var3, -16777216);
            }
         }
      }

      var0.catch_();
      return var0;
   });
   private static final fV_2 super_ = new fV_2(int_, 16, 16, new ji_3(Lists.newArrayList(new ja_3[]{new ja_3(0, -1)}), 16, 16, 1, false));

   public static fk_3 byte_() {
      if (new_ == null) {
         new_ = new fk_3(continue_.class_());
         QY.instanceof_().A().class_(int_, new_);
      }

      return new_;
   }

   public fQ_2(fJ_2 var1, fV_2 var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var6, var7, class_(var2.break_(), var2.byte_()));
   }

   private fQ_2(fJ_2 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, super_, var2, var3, var4, var5, var6, continue_.class_());
   }

   public static fQ_2 class_(fJ_2 var0, int var1, int var2, int var3, int var4, int var5) {
      return new fQ_2(var0, var1, var2, var3, var4, var5);
   }

   public static rqO_2 class_() {
      return int_;
   }

   private static fN_2 class_(int var0, int var1) {
      int var2 = var0 / 2;
      int var3 = var1 / 2;
      fN_2 var4 = new fN_2(var0, var1, false);
      int var5 = -16777216;
      int var6 = -524040;

      for (int var7 = 0; var7 < var1; var7++) {
         for (int var8 = 0; var8 < var0; var8++) {
            if (var7 < var3 ^ var8 < var2) {
               var4.class_(var8, var7, var6);
            } else {
               var4.class_(var8, var7, var5);
            }
         }
      }

      return var4;
   }

   @Override
   public void close() {
      super.close();
   }

   public static fV_2 break_() {
      return super_;
   }
}
