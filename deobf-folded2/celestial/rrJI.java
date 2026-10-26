package celestial;

import java.util.Arrays;

public class rrJI implements rRp_1 {
   private final yW_2 id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;
   private final int id_throws;
   private final int id_case;
   private final int id_catch;
   private final int id_private;
   private int[] id_implements;
   private xc_3[] id_finally;
   private rYG[] id_extends;
   private final int id_native;
   private rrxF_2 id_volatile;
   private static final rrka_1 id_final = new rrka_1(int.class, 16);
   private static final rrka_1 id_package = new rrka_1(xc_3.class, 16);
   private static final rrka_1 id_int = new rrka_1(rYG.class, 16);

   @Override
   public xc_3 id_byte(rfH_2 var1) {
      int var2 = this.id_protected(var1);
      if (var2 >= 0 && var2 < this.id_native && this.id_finally != null) {
         xc_3 var3 = this.id_finally[var2];
         if (var3 == null) {
            var3 = this.id_class.id_byte(var1);
            this.id_finally[var2] = var3;
         }

         return var3;
      } else {
         return this.id_class.id_byte(var1);
      }
   }

   public void id_byte() {
      id_final.id_class(this.id_implements);
      this.id_implements = null;
      id_package.id_class(this.id_finally);
      this.id_finally = null;
      id_int.id_class(this.id_extends);
      this.id_extends = null;
   }

   public rrJI(yW_2 var1, rfH_2 var2, rfH_2 var3, int var4) {
      this.id_class = var1;
      int var5 = var2.b_() - var4 >> 4;
      int var6 = var2.c_() - var4 >> 4;
      int var7 = var2.d_() - var4 >> 4;
      int var8 = var3.b_() + var4 >> 4;
      int var9 = var3.c_() + var4 >> 4;
      int var10 = var3.d_() + var4 >> 4;
      this.id_throws = var8 - var5 + 1 << 4;
      this.id_case = var9 - var6 + 1 << 4;
      this.id_catch = var10 - var7 + 1 << 4;
      this.id_private = this.id_throws * this.id_catch;
      this.id_native = this.id_throws * this.id_case * this.id_catch;
      this.id_break = var5 << 4;
      this.id_byte = var6 << 4;
      this.id_protected = var7 << 4;
   }

   public void id_class(rrxF_2 var1) {
      this.id_volatile = var1;
   }

   @Override
   public rrse_3 id_class() {
      return this.id_class.id_class();
   }

   @Override
   public int id_class(rfH_2 var1, rrsC_2 var2) {
      return this.id_class.id_class(var1, var2);
   }

   public ryO_2 id_class(rfH_2 var1, rox_3 var2) {
      return this.id_class.id_class(var1, var2);
   }

   @Override
   public ryO_2 id_class(rfH_2 var1) {
      return this.id_class.id_class(var1, rox_3.CHECK);
   }

   @Override
   public float id_class(rpr_3 var1, boolean var2) {
      return this.id_class.id_class(var1, var2);
   }

   @Override
   public int id_class(rRo_1 var1, rfH_2 var2) {
      return this.id_class.id_class(var1, var2);
   }

   @Override
   public rXE id_break(rfH_2 var1) {
      return this.id_byte(var1).id_volatile();
   }

   public void id_break() {
      if (this.id_implements == null) {
         this.id_implements = (int[])id_final.id_class(this.id_native);
      }

      if (this.id_finally == null) {
         this.id_finally = (xc_3[])id_package.id_class(this.id_native);
      }

      if (this.id_extends == null) {
         this.id_extends = (rYG[])id_int.id_class(this.id_native);
      }

      Arrays.fill(this.id_implements, -1);
      Arrays.fill(this.id_finally, null);
      Arrays.fill(this.id_extends, null);
      this.id_case();
   }

   public rrxF_2 id_throws() {
      return this.id_volatile;
   }

   public rYG id_throws(rfH_2 var1) {
      int var2 = this.id_protected(var1);
      if (var2 >= 0 && var2 < this.id_native && this.id_extends != null) {
         rYG var3 = this.id_extends[var2];
         if (var3 == null) {
            var3 = this.id_class.id_throws(var1);
            this.id_extends[var2] = var3;
         }

         return var3;
      } else {
         return this.id_class.id_throws(var1);
      }
   }

   @Override
   public boolean id_case(rfH_2 var1) {
      return this.id_class.id_case(var1);
   }

   private void id_case() {
      if (this.id_throws == 48 && this.id_case == 48 && this.id_catch == 48) {
         roJ_2 var1 = this.id_class.id_class(1, 1);
         rrGi_1 var2 = new rrGi_1();

         for (int var3 = 16; var3 < 32; var3++) {
            int var4 = var3 * this.id_private;

            for (int var5 = 16; var5 < 32; var5++) {
               int var6 = var5 * this.id_throws;

               for (int var7 = 16; var7 < 32; var7++) {
                  var2.id_class(this.id_break + var7, this.id_byte + var3, this.id_protected + var5);
                  int var8 = var4 + var6 + var7;
                  xc_3 var9 = var1.id_byte(var2);
                  this.id_finally[var8] = var9;
               }
            }
         }
      }
   }

   public int[] id_protected() {
      return this.id_implements;
   }

   public int id_protected(rfH_2 var1) {
      int var2 = var1.b_() - this.id_break;
      if (var2 >= 0 && var2 < this.id_throws) {
         int var3 = var1.c_() - this.id_byte;
         if (var3 >= 0 && var3 < this.id_case) {
            int var4 = var1.d_() - this.id_protected;
            return var4 >= 0 && var4 < this.id_catch ? var3 * this.id_private + var4 * this.id_throws + var2 : -1;
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }
}
