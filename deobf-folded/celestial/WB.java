package celestial;

import java.util.Optional;
import java.util.function.Predicate;

public class WB {
   private static final Jy_1 id_class = (var0, var1, var2) -> var0.id_class(xu_3.rg);
   private final rRg_1 id_break;
   private final rpB_2 id_byte;
   private final rpr_3 id_protected;
   private int id_throws;
   private rfH_2 id_case;
   private int id_catch;
   private int id_private;

   public boolean id_byte() {
      return this.id_class() && this.id_throws == this.id_private * this.id_catch;
   }

   public WB(rRg_1 var1, rfH_2 var2, rpB_2 var3) {
      this.id_break = var1;
      this.id_byte = var3;
      this.id_protected = var3 == rpB_2.X ? rpr_3.WEST : rpr_3.SOUTH;
      this.id_case = this.id_class(var2);
      if (this.id_case == null) {
         this.id_case = var2;
         this.id_private = 1;
         this.id_catch = 1;
      } else {
         this.id_private = this.id_protected();
         if (this.id_private > 0) {
            this.id_catch = this.id_throws();
         }
      }
   }

   public boolean id_class() {
      return this.id_case != null && this.id_private >= 2 && this.id_private <= 21 && this.id_catch >= 3 && this.id_catch <= 21;
   }

   public static rjU_2 id_class(rqT_2 var0, rpB_2 var1, rjU_2 var2, ap_3 var3) {
      double var4 = (double)var0.id_break - (double)var3.id_class;
      double var6 = (double)var0.id_byte - (double)var3.id_break;
      rfH_2 var8 = var0.id_class;
      double var9;
      if (var4 > 0.0) {
         float var11 = (float)var8.id_class(var1) + var3.id_class / 2.0F;
         var9 = rfU_2.id_class(rfU_2.id_byte(var2.id_class(var1) - (double)var11, 0.0, var4), 0.0, 1.0);
      } else {
         var9 = 0.5;
      }

      double var16;
      if (var6 > 0.0) {
         rpB_2 var13 = rpB_2.Y;
         var16 = rfU_2.id_class(rfU_2.id_byte(var2.id_class(var13) - (double)var8.id_class(var13), 0.0, var6), 0.0, 1.0);
      } else {
         var16 = 0.0;
      }

      rpB_2 var17 = var1 == rpB_2.X ? rpB_2.Z : rpB_2.X;
      double var14 = var2.id_class(var17) - ((double)var8.id_class(var17) + 0.5);
      return new rjU_2(var9, var16, var14);
   }

   public static WP id_class(rrEm_1 var0, rqT_2 var1, rpB_2 var2, rjU_2 var3, ap_3 var4, rjU_2 var5, float var6, float var7) {
      rfH_2 var8 = var1.id_class;
      xc_3 var9 = var0.id_byte(var8);
      rpB_2 var10 = var9.id_byte(rCT.id_char);
      double var11 = (double)var1.id_break;
      double var13 = (double)var1.id_byte;
      int var15 = var2 == var10 ? 0 : 90;
      rjU_2 var16 = var2 == var10 ? var5 : new rjU_2(var5.id_protected, var5.id_byte, -var5.id_break);
      double var17 = (double)var4.id_class / 2.0 + (var11 - (double)var4.id_class) * var3.id_class();
      double var19 = (var13 - (double)var4.id_break) * var3.id_break();
      double var21 = 0.5 + var3.id_byte();
      boolean var23 = var10 == rpB_2.X;
      rjU_2 var24 = new rjU_2((double)var8.b_() + (var23 ? var17 : var21), (double)var8.c_() + var19, (double)var8.d_() + (var23 ? var21 : var17));
      return new WP(var24, var16, var6 + (float)var15, var7);
   }

   public static Optional<WB> id_class(rRg_1 var0, rfH_2 var1, rpB_2 var2) {
      return id_class(var0, var1, var0x -> var0x.id_class() && var0x.id_throws == 0, var2);
   }

   private boolean id_class(rfw_3 var1, int var2) {
      for (int var3 = 0; var3 < this.id_private; var3++) {
         rfw_3 var4 = var1.id_class(this.id_case).id_byte(rpr_3.UP, var2).id_byte(this.id_protected, var3);
         if (!id_class.test(this.id_break.id_byte(var4), this.id_break, var4)) {
            return false;
         }
      }

      return true;
   }

   public static Optional<WB> id_class(rRg_1 var0, rfH_2 var1, Predicate<WB> var2, rpB_2 var3) {
      Optional var4 = Optional.of(new WB(var0, var1, var3)).filter(var2);
      if (var4.isPresent()) {
         return var4;
      } else {
         rpB_2 var5 = var3 == rpB_2.X ? rpB_2.Z : rpB_2.X;
         return Optional.of(new WB(var0, var1, var5)).filter(var2);
      }
   }

   private int id_class(rfH_2 var1, rpr_3 var2) {
      rfw_3 var3 = new rfw_3();

      for (int var4 = 0; var4 <= 21; var4++) {
         var3.id_class(var1).id_byte(var2, var4);
         xc_3 var5 = this.id_break.id_byte(var3);
         if (!id_class(var5)) {
            if (id_class.test(var5, this.id_break, var3)) {
               return var4;
            }
            break;
         }

         xc_3 var6 = this.id_break.id_byte(var3.id_class(rpr_3.DOWN));
         if (!id_class.test(var6, this.id_break, var3)) {
            break;
         }
      }

      return 0;
   }

   private rfH_2 id_class(rfH_2 var1) {
      int var2 = Math.max(0, var1.c_() - 21);

      while (var1.c_() > var2 && id_class(this.id_break.id_byte(var1.id_break()))) {
         var1 = var1.id_break();
      }

      rpr_3 var4 = this.id_protected.id_case();
      int var3 = this.id_class(var1, var4) - 1;
      return var3 < 0 ? null : var1.id_class(var4, var3);
   }

   private int id_class(rfw_3 var1) {
      for (int var2 = 0; var2 < 21; var2++) {
         var1.id_class(this.id_case).id_byte(rpr_3.UP, var2).id_byte(this.id_protected, -1);
         if (!id_class.test(this.id_break.id_byte(var1), this.id_break, var1)) {
            return var2;
         }

         var1.id_class(this.id_case).id_byte(rpr_3.UP, var2).id_byte(this.id_protected, this.id_private);
         if (!id_class.test(this.id_break.id_byte(var1), this.id_break, var1)) {
            return var2;
         }

         for (int var3 = 0; var3 < this.id_private; var3++) {
            var1.id_class(this.id_case).id_byte(rpr_3.UP, var2).id_byte(this.id_protected, var3);
            xc_3 var4 = this.id_break.id_byte(var1);
            if (!id_class(var4)) {
               return var2;
            }

            if (var4.id_class(xu_3.Pi)) {
               this.id_throws++;
            }
         }
      }

      return 21;
   }

   private static boolean id_class(xc_3 var0) {
      return var0.id_catch() || var0.id_class(rls_3.N) || var0.id_class(xu_3.Pi);
   }

   public void id_break() {
      xc_3 var1 = xu_3.Pi.id_continue().id_class(kT_2.id_volatile, this.id_byte);
      rfH_2.id_class(this.id_case, this.id_case.id_class(rpr_3.UP, this.id_catch - 1).id_class(this.id_protected, this.id_private - 1))
         .forEach(var2 -> this.id_break.id_class(var2, var1, 18));
   }

   private int id_throws() {
      rfw_3 var1 = new rfw_3();
      int var2 = this.id_class(var1);
      return var2 >= 3 && var2 <= 21 && this.id_class(var1, var2) ? var2 : 0;
   }

   private int id_protected() {
      int var1 = this.id_class(this.id_case, this.id_protected);
      return var1 >= 2 && var1 <= 21 ? var1 : 0;
   }
}
