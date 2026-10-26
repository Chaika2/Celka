package celestial;

public class Uy_1 implements UT {
   public static void class_(rYB var0, rdn_3 var1, int var2, rpr_3 var3, eX_2 var4) {
      double var5 = var4.class_();
      double var7 = var4.break_();
      double var9 = var4.byte_();
      if (var3.final_() == rpB_2.Y) {
         var7 -= 0.125;
      } else {
         var7 -= 0.15625;
      }

      rsE_2 var11 = new rsE_2(var0, var5, var7, var9, var1);
      double var12 = var0.int_.nextDouble() * 0.1 + 0.2;
      var11.catch_(
         var0.int_.nextGaussian() * 0.0075F * (double)var2 + (double)var3.implements_() * var12,
         var0.int_.nextGaussian() * 0.0075F * (double)var2 + 0.2F,
         var0.int_.nextGaussian() * 0.0075F * (double)var2 + (double)var3.extends_() * var12
      );
      var0.a_(var11);
   }

   protected void class_(Uq_1 var1) {
      var1.catch_().byte_(1000, var1.protected_(), 0);
   }

   protected void class_(Uq_1 var1, rpr_3 var2) {
      var1.catch_().byte_(2000, var1.protected_(), var2.byte_());
   }

   protected rdn_3 class_(Uq_1 var1, rdn_3 var2) {
      rpr_3 var3 = var1.throws_().byte_(dQ_2.volatile_);
      eX_2 var4 = dQ_2.class_(var1);
      rdn_3 var5 = var2.class_(1);
      class_(var1.catch_(), var5, 6, var3, var4);
      return var2;
   }

   @Override
   public final rdn_3 dispense(Uq_1 var1, rdn_3 var2) {
      rdn_3 var3 = this.class_(var1, var2);
      this.class_(var1);
      this.class_(var1, var1.throws_().byte_(dQ_2.volatile_));
      return var3;
   }
}
