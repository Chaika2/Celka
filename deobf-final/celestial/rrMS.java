package celestial;

import java.util.IdentityHashMap;
import java.util.Map;

public class rrMS {
   public int class_ = 1;
   public boolean break_ = false;
   private Map[] byte_ = new Map[8];

   public rrMS(String var1) {
      if (var1.equals("4")) {
         this.class_ = 4;
      } else if (var1.equals("2")) {
         this.class_ = 2;
      } else if (var1.equals("F")) {
         this.break_ = true;
      } else if (var1.equals("4F")) {
         this.class_ = 4;
         this.break_ = true;
      } else if (var1.equals("2F")) {
         this.class_ = 2;
         this.break_ = true;
      } else {
         rrbb_3.protected_("NaturalTextures: Unknown type: " + var1);
      }
   }

   private boolean class_(float var1, float var2, float var3) {
      float var4 = rfU_2.throws_(var1 - var2);
      return var4 < var3;
   }

   private int[] class_(int[] var1, int var2, boolean var3) {
      int[] var4 = (int[])var1.clone();
      int var5 = 4 - var2;
      if (var3) {
         var5 += 3;
      }

      var5 %= 4;
      int var6 = var4.length / 4;

      for (int var7 = 0; var7 < 4; var7++) {
         int var8 = var7 * var6;
         int var9 = var5 * var6;
         var4[var9 + 4] = var1[var8 + 4];
         var4[var9 + 4 + 1] = var1[var8 + 4 + 1];
         if (var3) {
            if (--var5 < 0) {
               var5 = 3;
            }
         } else if (++var5 > 3) {
            var5 = 0;
         }
      }

      return var4;
   }

   private boolean class_(wK_2 var1) {
      fj_3 var2 = var1.case_();
      float var3 = var2.case_();
      float var4 = var2.catch_();
      float var5 = var4 - var3;
      float var6 = var5 / 256.0F;
      float var7 = var2.private_();
      float var8 = var2.implements_();
      float var9 = var8 - var7;
      float var10 = var9 / 256.0F;
      int[] var11 = var1.class_();
      int var12 = var11.length / 4;

      for (int var13 = 0; var13 < 4; var13++) {
         int var14 = var13 * var12;
         float var15 = Float.intBitsToFloat(var11[var14 + 4]);
         float var16 = Float.intBitsToFloat(var11[var14 + 4 + 1]);
         if (!this.class_(var15, var3, var6) && !this.class_(var15, var4, var6)) {
            return false;
         }

         if (!this.class_(var16, var7, var10) && !this.class_(var16, var8, var10)) {
            return false;
         }
      }

      return true;
   }

   public synchronized wK_2 class_(wK_2 var1, int var2, boolean var3) {
      int var4 = var2;
      if (var3) {
         var4 = var2 | 4;
      }

      if (var4 > 0 && var4 < this.byte_.length) {
         Object var5 = this.byte_[var4];
         if (var5 == null) {
            var5 = new IdentityHashMap(1);
            this.byte_[var4] = (Map)var5;
         }

         wK_2 var6 = (wK_2)var5.get(var1);
         if (var6 == null) {
            var6 = this.break_(var1, var2, var3);
            var5.put(var1, var6);
         }

         return var6;
      } else {
         return var1;
      }
   }

   public boolean class_() {
      return this.class_ != 2 && this.class_ != 4 ? this.break_ : true;
   }

   private wK_2 break_(wK_2 var1, int var2, boolean var3) {
      int[] var4 = var1.class_();
      int var5 = var1.byte_();
      rpr_3 var6 = var1.protected_();
      fj_3 var7 = var1.case_();
      boolean var8 = var1.throws_();
      if (!this.class_(var1)) {
         var2 = 0;
      }

      var4 = this.class_(var4, var2, var3);
      return new wK_2(var4, var5, var6, var7, var8);
   }
}
