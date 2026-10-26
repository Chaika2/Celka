package celestial;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class yO_2 {
   protected final yX_2 id_class;
   protected final rYB id_break;
   protected int id_byte;
   protected int id_protected;
   protected int id_throws;
   public yQ_2[] id_case;
   private Map<rfj_3, rrxH_2[]> id_catch = new HashMap<>();

   public yO_2(yz_3 var1, rYB var2, int var3, yX_2 var4) {
      this.id_class = var4;
      this.id_break = var2;
      this.id_class(var3);
      this.id_class(var1);
   }

   public void id_class(double var1, double var3) {
      int var5 = rfU_2.id_byte(var1);
      int var6 = rfU_2.id_byte(var3);

      for (int var7 = 0; var7 < this.id_protected; var7++) {
         int var8 = this.id_protected * 16;
         int var9 = var5 - 8 - var8 / 2;
         int var10 = var9 + Math.floorMod(var7 * 16 - var9, var8);

         for (int var11 = 0; var11 < this.id_throws; var11++) {
            int var12 = this.id_throws * 16;
            int var13 = var6 - 8 - var12 / 2;
            int var14 = var13 + Math.floorMod(var11 * 16 - var13, var12);

            for (int var15 = 0; var15 < this.id_byte; var15++) {
               int var16 = var15 * 16;
               yQ_2 var17 = this.id_case[this.id_class(var7, var15, var11)];
               var17.id_class(var10, var16, var14);
            }
         }
      }
   }

   public void id_class(int var1, int var2, int var3, boolean var4) {
      int var5 = Math.floorMod(var1, this.id_protected);
      int var6 = Math.floorMod(var2, this.id_byte);
      int var7 = Math.floorMod(var3, this.id_throws);
      yQ_2 var8 = this.id_case[this.id_class(var5, var6, var7)];
      var8.id_class(var4);
   }

   public yQ_2 id_class(rfH_2 var1) {
      int var2 = var1.b_() >> 4;
      int var3 = var1.c_() >> 4;
      int var4 = var1.d_() >> 4;
      if (var3 >= 0 && var3 < this.id_byte) {
         var2 = rfU_2.id_break(var2, this.id_protected);
         var4 = rfU_2.id_break(var4, this.id_throws);
         return this.id_case[this.id_class(var2, var3, var4)];
      } else {
         return null;
      }
   }

   private void id_class(yQ_2 var1) {
      rfH_2 var2 = var1.id_throws();
      int var3 = var2.b_() >> 8 << 8;
      int var4 = var2.d_() >> 8 << 8;
      rfj_3 var5 = new rfj_3(var3, var4);
      HU[] var6 = HU.s;
      rrxH_2[] var7 = this.id_catch.get(var5);
      if (var7 == null) {
         var7 = new rrxH_2[var6.length];

         for (int var8 = 0; var8 < var6.length; var8++) {
            var7[var8] = new rrxH_2(var6[var8]);
         }

         this.id_catch.put(var5, var7);
      }

      for (int var11 = 0; var11 < var6.length; var11++) {
         HU var9 = var6[var11];
         rrxH_2 var10 = var7[var11];
         if (var10 != null) {
            var1.id_class(var9).id_class(var10);
         }
      }
   }

   protected void id_class(yz_3 var1) {
      int var2 = this.id_protected * this.id_byte * this.id_throws;
      this.id_case = new yQ_2[var2];

      for (int var3 = 0; var3 < this.id_protected; var3++) {
         for (int var4 = 0; var4 < this.id_byte; var4++) {
            for (int var5 = 0; var5 < this.id_throws; var5++) {
               int var6 = this.id_class(var3, var4, var5);
               yQ_2[] var10000 = this.id_case;
               Objects.requireNonNull(var1);
               var10000[var6] = new yQ_2(var1);
               this.id_case[var6].id_class(var3 * 16, var4 * 16, var5 * 16);
               if (rrbb_3.rp() && rrbb_3.ry()) {
                  this.id_class(this.id_case[var6]);
               }
            }
         }
      }

      for (int var9 = 0; var9 < this.id_case.length; var9++) {
         yQ_2 var10 = this.id_case[var9];

         for (int var11 = 0; var11 < rpr_3.VALUES.length; var11++) {
            rpr_3 var12 = rpr_3.VALUES[var11];
            rfH_2 var7 = var10.id_class(var12);
            yQ_2 var8 = this.id_class(var7);
            var10.id_class(var12, var8);
         }
      }
   }

   public void id_class() {
      for (yQ_2 var4 : this.id_case) {
         var4.id_protected();
      }

      this.id_break();
   }

   private int id_class(int var1, int var2, int var3) {
      return (var3 * this.id_byte + var2) * this.id_protected + var1;
   }

   protected void id_class(int var1) {
      int var2 = var1 * 2 + 1;
      this.id_protected = var2;
      this.id_byte = 16;
      this.id_throws = var2;
   }

   public void id_break() {
      for (rfj_3 var2 : this.id_catch.keySet()) {
         rrxH_2[] var3 = this.id_catch.get(var2);

         for (int var4 = 0; var4 < var3.length; var4++) {
            rrxH_2 var5 = var3[var4];
            if (var5 != null) {
               var5.id_protected();
            }

            var3[var4] = null;
         }
      }

      this.id_catch.clear();
   }
}
