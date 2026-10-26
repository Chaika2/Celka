package celestial;

public class yW_2 implements rRp_1 {
   protected final int class_;
   protected final int break_;
   protected final rfH_2 byte_;
   protected final int protected_;
   protected final int throws_;
   protected final int case_;
   protected final roJ_2[][] catch_;
   protected final xc_3[] private_;
   protected final rXE[] implements_;
   protected final rYB finally_;

   @Override
   public xc_3 byte_(rfH_2 var1) {
      int var2 = (var1.b_() >> 4) - this.class_;
      int var3 = (var1.d_() >> 4) - this.break_;
      return this.catch_[var2][var3].byte_(var1);
   }

   public yW_2(rYB var1, int var2, int var3, roJ_2[][] var4, rfH_2 var5, rfH_2 var6) {
      this.finally_ = var1;
      this.class_ = var2;
      this.break_ = var3;
      this.catch_ = var4;
      this.byte_ = var5;
      this.protected_ = var6.b_() - var5.b_() + 1;
      this.throws_ = var6.c_() - var5.c_() + 1;
      this.case_ = var6.d_() - var5.d_() + 1;
      this.private_ = null;
      this.implements_ = null;
   }

   @Override
   public rrse_3 class_() {
      return this.finally_.class_();
   }

   @Override
   public float class_(rpr_3 var1, boolean var2) {
      return this.finally_.class_(var1, var2);
   }

   public roJ_2 class_(int var1, int var2) {
      return this.catch_[var1][var2];
   }

   @Override
   public ryO_2 class_(rfH_2 var1) {
      return this.class_(var1, rox_3.IMMEDIATE);
   }

   public ryO_2 class_(rfH_2 var1, rox_3 var2) {
      int var3 = (var1.b_() >> 4) - this.class_;
      int var4 = (var1.d_() >> 4) - this.break_;
      return this.catch_[var3][var4].class_(var1, var2);
   }

   @Override
   public int class_(rfH_2 var1, rrsC_2 var2) {
      return this.finally_.class_(var1, var2);
   }

   public static yW_2 class_(rYB var0, rfH_2 var1, rfH_2 var2, int var3) {
      return class_(var0, var1, var2, var3, true);
   }

   public static yW_2 class_(rYB var0, rfH_2 var1, rfH_2 var2, int var3, boolean var4) {
      int var5 = var1.b_() - var3 >> 4;
      int var6 = var1.d_() - var3 >> 4;
      int var7 = var2.b_() + var3 >> 4;
      int var8 = var2.d_() + var3 >> 4;
      roJ_2[][] var9 = new roJ_2[var7 - var5 + 1][var8 - var6 + 1];

      for (int var10 = var5; var10 <= var7; var10++) {
         for (int var11 = var6; var11 <= var8; var11++) {
            var9[var10 - var5][var11 - var6] = var0.throws_(var10, var11);
         }
      }

      if (var4 && class_(var1, var2, var5, var6, var9)) {
         return null;
      } else {
         boolean var13 = true;
         rfH_2 var14 = var1.break_(-1, -1, -1);
         rfH_2 var12 = var2.break_(1, 1, 1);
         return new yW_2(var0, var5, var6, var9, var14, var12);
      }
   }

   public static boolean class_(rfH_2 var0, rfH_2 var1, int var2, int var3, roJ_2[][] var4) {
      for (int var5 = var0.b_() >> 4; var5 <= var1.b_() >> 4; var5++) {
         for (int var6 = var0.d_() >> 4; var6 <= var1.d_() >> 4; var6++) {
            roJ_2 var7 = var4[var5 - var2][var6 - var3];
            if (!var7.class_(var0.c_(), var1.c_())) {
               return false;
            }
         }
      }

      return true;
   }

   protected int class_(int var1, int var2, int var3) {
      int var4 = var1 - this.byte_.b_();
      int var5 = var2 - this.byte_.c_();
      int var6 = var3 - this.byte_.d_();
      return var6 * this.protected_ * this.throws_ + var5 * this.protected_ + var4;
   }

   @Override
   public rXE break_(rfH_2 var1) {
      int var2 = (var1.b_() >> 4) - this.class_;
      int var3 = (var1.d_() >> 4) - this.break_;
      return this.catch_[var2][var3].break_(var1);
   }

   public rYG throws_(rfH_2 var1) {
      return this.finally_.implements_(var1);
   }

   protected final int protected_(rfH_2 var1) {
      return this.class_(var1.b_(), var1.c_(), var1.d_());
   }
}
