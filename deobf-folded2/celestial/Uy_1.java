package celestial;

public class Uy_1 implements UT {
   public static void id_class(rYB var0, rdn_3 var1, int var2, rpr_3 var3, eX_2 var4) {
      double var5 = var4.id_class();
      double var7 = var4.id_break();
      double var9 = var4.id_byte();
      if (var3.id_final() == rpB_2.Y) {
         var7 -= 0.125;
      } else {
         var7 -= 0.15625;
      }

      rsE_2 var11 = new rsE_2(var0, var5, var7, var9, var1);
      double var12 = var0.id_int.nextDouble() * 0.1 + 0.2;
      var11.id_catch(
         var0.id_int.nextGaussian() * 0.0075F * (double)var2 + (double)var3.id_implements() * var12,
         var0.id_int.nextGaussian() * 0.0075F * (double)var2 + 0.2F,
         var0.id_int.nextGaussian() * 0.0075F * (double)var2 + (double)var3.id_extends() * var12
      );
      var0.a_(var11);
   }

   protected void id_class(Uq_1 var1) {
      var1.id_catch().id_byte(1000, var1.id_protected(), 0);
   }

   protected void id_class(Uq_1 var1, rpr_3 var2) {
      var1.id_catch().id_byte(2000, var1.id_protected(), var2.id_byte());
   }

   protected rdn_3 id_class(Uq_1 var1, rdn_3 var2) {
      rpr_3 var3 = var1.id_throws().id_byte(dQ_2.id_volatile);
      eX_2 var4 = dQ_2.id_class(var1);
      rdn_3 var5 = var2.id_class(1);
      id_class(var1.id_catch(), var5, 6, var3, var4);
      return var2;
   }

   @Override
   public final rdn_3 dispense(Uq_1 var1, rdn_3 var2) {
      rdn_3 var3 = this.id_class(var1, var2);
      this.id_class(var1);
      this.id_class(var1, var1.id_throws().id_byte(dQ_2.id_volatile));
      return var3;
   }
}
