package celestial;

import java.util.IdentityHashMap;
import java.util.Map;

public class rrMS {
   public int id_class = 1;
   public boolean id_break = false;
   private Map[] id_byte = new Map[8];

   public rrMS(String var1) {
      if (var1.equals("4")) {
         this.id_class = 4;
      } else if (var1.equals("2")) {
         this.id_class = 2;
      } else if (var1.equals("F")) {
         this.id_break = true;
      } else if (var1.equals("4F")) {
         this.id_class = 4;
         this.id_break = true;
      } else if (var1.equals("2F")) {
         this.id_class = 2;
         this.id_break = true;
      } else {
         rrbb_3.id_protected("NaturalTextures: Unknown type: " + var1);
      }
   }

   private boolean id_class(float var1, float var2, float var3) {
      float var4 = rfU_2.id_throws(var1 - var2);
      return var4 < var3;
   }

   private int[] id_class(int[] var1, int var2, boolean var3) {
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

   private boolean id_class(wK_2 var1) {
      fj_3 var2 = var1.id_case();
      float var3 = var2.id_case();
      float var4 = var2.id_catch();
      float var5 = var4 - var3;
      float var6 = var5 / 256.0F;
      float var7 = var2.id_private();
      float var8 = var2.id_implements();
      float var9 = var8 - var7;
      float var10 = var9 / 256.0F;
      int[] var11 = var1.id_class();
      int var12 = var11.length / 4;

      for (int var13 = 0; var13 < 4; var13++) {
         int var14 = var13 * var12;
         float var15 = Float.intBitsToFloat(var11[var14 + 4]);
         float var16 = Float.intBitsToFloat(var11[var14 + 4 + 1]);
         if (!this.id_class(var15, var3, var6) && !this.id_class(var15, var4, var6)) {
            return false;
         }

         if (!this.id_class(var16, var7, var10) && !this.id_class(var16, var8, var10)) {
            return false;
         }
      }

      return true;
   }

   public synchronized wK_2 id_class(wK_2 var1, int var2, boolean var3) {
      int var4 = var2;
      if (var3) {
         var4 = var2 | 4;
      }

      if (var4 > 0 && var4 < this.id_byte.length) {
         Object var5 = this.id_byte[var4];
         if (var5 == null) {
            var5 = new IdentityHashMap(1);
            this.id_byte[var4] = (Map)var5;
         }

         wK_2 var6 = (wK_2)var5.get(var1);
         if (var6 == null) {
            var6 = this.id_break(var1, var2, var3);
            var5.put(var1, var6);
         }

         return var6;
      } else {
         return var1;
      }
   }

   public boolean id_class() {
      return this.id_class != 2 && this.id_class != 4 ? this.id_break : true;
   }

   private wK_2 id_break(wK_2 var1, int var2, boolean var3) {
      int[] var4 = var1.id_class();
      int var5 = var1.id_byte();
      rpr_3 var6 = var1.id_protected();
      fj_3 var7 = var1.id_case();
      boolean var8 = var1.id_throws();
      if (!this.id_class(var1)) {
         var2 = 0;
      }

      var4 = this.id_class(var4, var2, var3);
      return new wK_2(var4, var5, var6, var7, var8);
   }
}
