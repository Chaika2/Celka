package celestial;

public class kB_2 extends xm_3 {
   protected static final rjC_2 id_volatile = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   private static boolean id_byte(an_3 var0) {
      return var0 instanceof iB_2 || var0 instanceof rsJ_2 || var0 instanceof rsX_2 || var0 instanceof rSK;
   }

   public kB_2(Jq_1 var1) {
      super(var1);
   }

   private void id_class(rYB var1, an_3 var2) {
      if (id_byte(var2)) {
         if (var1.id_int.nextInt(5) == 0) {
            var2.id_class(rqn_3.so, 1.0F, 1.0F);
         }

         if (!var1.id_continue && var1.id_int.nextInt(5) == 0) {
            var1.id_class(var2, (byte)53);
         }
      }
   }

   public static void id_class(an_3 var0) {
      id_class(var0, 5);
   }

   private static void id_class(an_3 var0, int var1) {
      if (((rYB)var0.id_throws[7]).id_continue) {
         xc_3 var2 = xu_3.Jh.id_continue();

         for (int var3 = 0; var3 < var1; var3++) {
            ((rYB)var0.id_throws[7]).id_class(new rLX(rLQ.id_protected, var2), var0.rx(), var0.re(), var0.BO(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void id_class(an_3 var1, rfH_2 var2) {
      if (var1 instanceof rhN_2 && ((rYB)var1.id_throws[7]).r() % 20L == 0L) {
         Oo_1.id_static.id_class((rhN_2)var1, ((rYB)var1.id_throws[7]).id_byte(var2));
      }
   }

   private boolean id_class(rfH_2 var1, an_3 var2) {
      if (var2.BL()) {
         return false;
      } else if (var2.re() > (double)var1.c_() + 0.9375 - 1.0E-7) {
         return false;
      } else if (var2.rv().id_byte >= -0.08) {
         return false;
      } else {
         double var3 = Math.abs((double)var1.b_() + 0.5 - var2.rx());
         double var5 = Math.abs((double)var1.d_() + 0.5 - var2.BO());
         double var7 = 0.4375 + (double)(var2.PN() / 2.0F);
         return var3 + 1.0E-7 > var7 || var5 + 1.0E-7 > var7;
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (this.id_class(var3, var4)) {
         this.id_class(var4, var3);
         this.id_protected(var4);
         this.id_class(var2, var4);
      }

      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, an_3 var3, float var4) {
      var3.id_class(rqn_3.so, 1.0F, 1.0F);
      if (!var1.id_continue) {
         var1.id_class(var3, (byte)54);
      }

      if (var3.id_class(var4, 0.2F)) {
         var3.id_class(this.id_case.id_catch(), this.id_case.id_class() * 0.5F, this.id_case.id_break() * 0.75F);
      }
   }

   public static void id_break(an_3 var0) {
      id_class(var0, 10);
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile;
   }

   private void id_protected(an_3 var1) {
      rjU_2 var2 = var1.rv();
      if (var2.id_byte < -0.13) {
         double var3 = -0.05 / var2.id_byte;
         var1.id_byte(new rjU_2(var2.id_break * var3, -0.05, var2.id_protected * var3));
      } else {
         var1.id_byte(new rjU_2(var2.id_break, -0.05, var2.id_protected));
      }

      Float var9 = 0.0F;
      var1.id_throws[31] = var9;
   }
}
