package celestial;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class rHt_1 extends rHK implements rHI, rHf_1 {
   private rqs_3<rdn_3> id_case = rqs_3.id_class(5, rdn_3.id_break);
   private int id_catch = -1;
   private long id_private;

   public static List<rsE_2> id_byte(rHI var0) {
      return var0.id_byte()
         .id_protected()
         .stream()
         .flatMap(
            var1 -> var0.id_while()
                  .id_class(rsE_2.class, var1.id_protected(var0.id_try() - 0.5, var0.id_instanceof() - 0.5, var0.id_throw() - 0.5), rpJ_2.id_class)
                  .stream()
         )
         .collect(Collectors.toList());
   }

   private static boolean id_byte(rXu_1 var0, rpr_3 var1) {
      return id_class(var0, var1).allMatch(var1x -> var0.id_extends(var1x).id_class());
   }

   public rHt_1() {
      super(ryW_2.id_new);
   }

   public static rdn_3 id_class(rXu_1 var0, rXu_1 var1, rdn_3 var2, rpr_3 var3) {
      if (var1 instanceof rXF && var3 != null) {
         rXF var7 = (rXF)var1;
         int[] var8 = var7.id_class(var3);

         for (int var6 = 0; var6 < var8.length && !var2.id_class(); var6++) {
            var2 = id_class(var0, var1, var2, var8[var6], var3);
         }
      } else {
         int var4 = var1.id_else();

         for (int var5 = 0; var5 < var4 && !var2.id_class(); var5++) {
            var2 = id_class(var0, var1, var2, var5, var3);
         }
      }

      return var2;
   }

   private static rdn_3 id_class(rXu_1 var0, rXu_1 var1, rdn_3 var2, int var3, rpr_3 var4) {
      rdn_3 var5 = var1.id_extends(var3);
      if (id_class(var1, var2, var3, var4)) {
         boolean var6 = false;
         boolean var7 = var1.id_return();
         if (var5.id_class()) {
            var1.id_break(var3, var2);
            var2 = rdn_3.id_break;
            var6 = true;
         } else if (id_class(var5, var2)) {
            int var8 = var2.id_byte() - var5.id_char();
            int var9 = Math.min(var2.id_char(), var8);
            var2.id_catch(var9);
            var5.id_case(var9);
            var6 = var9 > 0;
         }

         if (var6) {
            if (var7 && var1 instanceof rHt_1 var11 && !var11.id_native()) {
               byte var12 = 0;
               if (var0 instanceof rHt_1 var10 && var11.id_private >= var10.id_private) {
                  var12 = 1;
               }

               var11.id_class(8 - var12);
            }

            var1.id_break();
         }
      }

      return var2;
   }

   private static boolean id_class(rXu_1 var0, rdn_3 var1, int var2, rpr_3 var3) {
      return !var0.a_(var2, var1) ? false : !(var0 instanceof rXF) || ((rXF)var0).id_class(var2, var1, var3);
   }

   private static boolean id_class(rHI var0, rXu_1 var1, int var2, rpr_3 var3) {
      rdn_3 var4 = var1.id_extends(var2);
      if (!var4.id_class() && id_break(var1, var4, var2, var3)) {
         rdn_3 var5 = var4.id_implements();
         rdn_3 var6 = id_class(var1, var0, var1.id_class(var2, 1), (rpr_3)null);
         if (var6.id_class()) {
            var1.id_break();
            return true;
         }

         var1.id_break(var2, var5);
      }

      return false;
   }

   public static boolean id_class(rXu_1 var0, rsE_2 var1) {
      boolean var2 = false;
      rdn_3 var3 = var1.id_protected().id_implements();
      rdn_3 var4 = id_class((rXu_1)null, var0, var3, (rpr_3)null);
      if (var4.id_class()) {
         var2 = true;
         var1.PD();
      } else {
         var1.id_break(var4);
      }

      return var2;
   }

   @Override
   protected rJr_1 id_class(int var1, rhz_3 var2) {
      return new rJz_1(var1, var2, this);
   }

   public void id_class(an_3 var1) {
      if (var1 instanceof rsE_2) {
         rfH_2 var2 = this.id_char();
         if (rjw_3.id_byte(
            rjw_3.id_class(var1.rN().id_protected((double)(-var2.b_()), (double)(-var2.c_()), (double)(-var2.d_()))), this.id_byte(), rjN_2.id_implements
         )) {
            this.id_class(() -> id_class(this, (rsE_2)var1));
         }
      }
   }

   @Override
   protected void id_class(rqs_3<rdn_3> var1) {
      this.id_case = var1;
   }

   private void id_class(int var1) {
      this.id_catch = var1;
   }

   private static boolean id_class(rdn_3 var0, rdn_3 var1) {
      if (var0.id_break() != var1.id_break()) {
         return false;
      } else if (var0.id_catch() != var1.id_catch()) {
         return false;
      } else {
         return var0.id_char() > var0.id_byte() ? false : rdn_3.id_class(var0, var1);
      }
   }

   public static rXu_1 id_class(rYB var0, double var1, double var3, double var5) {
      Object var7 = null;
      rfH_2 var8 = new rfH_2(var1, var3, var5);
      xc_3 var9 = var0.id_byte(var8);
      xd_3 var10 = var9.id_break();
      if (var10 instanceof rXL) {
         var7 = ((rXL)var10).id_class(var9, var0, var8);
      } else if (var10.id_protected()) {
         ryO_2 var11 = var0.id_class(var8);
         if (var11 instanceof rXu_1) {
            var7 = (rXu_1)var11;
            if (var7 instanceof rHu_1 && var10 instanceof xt_3) {
               var7 = xt_3.id_class((xt_3)var10, var9, var0, var8, true);
            }
         }
      }

      if (var7 == null) {
         List var12 = var0.id_break((an_3)null, new rfl_3(var1 - 0.5, var3 - 0.5, var5 - 0.5, var1 + 0.5, var3 + 0.5, var5 + 0.5), rpJ_2.id_protected);
         if (!var12.isEmpty()) {
            var7 = (rXu_1)var12.get(var0.id_int.nextInt(var12.size()));
         }
      }

      return (rXu_1)var7;
   }

   public static rXu_1 id_class(rYB var0, rfH_2 var1) {
      return id_class(var0, (double)var1.b_() + 0.5, (double)var1.c_() + 0.5, (double)var1.d_() + 0.5);
   }

   private boolean id_class(Supplier<Boolean> var1) {
      if (this.id_extends != null && !this.id_extends.id_continue) {
         if (!this.id_extends() && this.id_abstract().id_byte(kS_2.id_final)) {
            boolean var2 = false;
            if (!this.id_return()) {
               var2 = this.id_private();
            }

            if (!this.id_catch()) {
               var2 |= var1.get();
            }

            if (var2) {
               this.id_class(8);
               this.id_break();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public rdn_3 id_class(int var1, int var2) {
      this.id_protected((rhd_3)null);
      return rXC.id_class(this.ad_(), var1, var2);
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      if (!this.id_byte(var1)) {
         rXC.id_class(var1, this.id_case);
      }

      var1.id_break("TransferCooldown", this.id_catch);
      return var1;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_case = rqs_3.id_class(this.id_else(), rdn_3.id_break);
      if (!this.id_break(var2)) {
         rXC.id_break(var2, this.id_case);
      }

      this.id_catch = var2.id_private("TransferCooldown");
   }

   private static IntStream id_class(rXu_1 var0, rpr_3 var1) {
      return var0 instanceof rXF ? IntStream.of(((rXF)var0).id_class(var1)) : IntStream.range(0, var0.id_else());
   }

   public static boolean id_class(rHI var0) {
      rXu_1 var1 = id_break(var0);
      if (var1 != null) {
         rpr_3 var4 = rpr_3.DOWN;
         return id_byte(var1, var4) ? false : id_class(var1, var4).anyMatch(var3x -> id_class(var0, var1, var3x, var4));
      } else {
         for (rsE_2 var3 : id_byte(var0)) {
            if (id_class(var0, var3)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean id_break(rXu_1 var1, rpr_3 var2) {
      return id_class(var1, var2).allMatch(var1x -> {
         rdn_3 var2x = var1.id_extends(var1x);
         return var2x.id_char() >= var2x.id_byte();
      });
   }

   public static rXu_1 id_break(rHI var0) {
      return id_class(var0.id_while(), var0.id_try(), var0.id_instanceof() + 1.0, var0.id_throw());
   }

   private static boolean id_break(rXu_1 var0, rdn_3 var1, int var2, rpr_3 var3) {
      return !(var0 instanceof rXF) || ((rXF)var0).id_break(var2, var1, var3);
   }

   @Override
   public void id_break(int var1, rdn_3 var2) {
      this.id_protected((rhd_3)null);
      this.ad_().set(var1, var2);
      if (var2.id_char() > this.ab_()) {
         var2.id_throws(this.ab_());
      }
   }

   @Override
   public void id_throws() {
      if (this.id_extends != null && !this.id_extends.id_continue) {
         this.id_catch--;
         this.id_private = this.id_extends.r();
         if (!this.id_extends()) {
            this.id_class(0);
            this.id_class(() -> id_class(this));
         }
      }
   }

   private rXu_1 id_finally() {
      rpr_3 var1 = this.id_abstract().id_byte(kS_2.id_volatile);
      return id_class(this.id_while(), this.id_native.id_break(var1));
   }

   private boolean id_catch() {
      for (rdn_3 var2 : this.id_case) {
         if (var2.id_class() || var2.id_char() != var2.id_byte()) {
            return false;
         }
      }

      return true;
   }

   private boolean id_extends() {
      return this.id_catch > 0;
   }

   @Override
   public int id_else() {
      return this.id_case.size();
   }

   @Override
   public double id_instanceof() {
      return (double)this.id_native.c_() + 0.5;
   }

   @Override
   public double id_throw() {
      return (double)this.id_native.d_() + 0.5;
   }

   @Override
   public double id_try() {
      return (double)this.id_native.b_() + 0.5;
   }

   private boolean id_private() {
      rXu_1 var1 = this.id_finally();
      if (var1 == null) {
         return false;
      } else {
         rpr_3 var2 = this.id_abstract().id_byte(kS_2.id_volatile).id_case();
         if (this.id_break(var1, var2)) {
            return false;
         } else {
            for (int var3 = 0; var3 < this.id_else(); var3++) {
               if (!this.id_extends(var3).id_class()) {
                  rdn_3 var4 = this.id_extends(var3).id_implements();
                  rdn_3 var5 = id_class(this, var1, this.id_class(var3, 1), var2);
                  if (var5.id_class()) {
                     var1.id_break();
                     return true;
                  }

                  this.id_break(var3, var4);
               }
            }

            return false;
         }
      }
   }

   private boolean id_native() {
      return this.id_catch > 8;
   }

   @Override
   protected rqs_3<rdn_3> ad_() {
      return this.id_case;
   }

   @Override
   protected rgP_2 X_() {
      return new rgn_3("container.hopper");
   }
}
