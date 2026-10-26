package celestial;

import java.util.Random;

public class dn_3 extends dz_3 {
   protected static final rjC_2 id_final = xd_3.id_class(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final rjC_2 id_package = xd_3.id_class(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final rjC_2 id_int = xd_3.id_class(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dn_3(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.UP));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      rpr_3 var5 = var1.id_byte(id_volatile);
      double var6 = (double)var3.b_() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var8 = (double)var3.c_() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var10 = (double)var3.d_() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var12 = (double)(0.4F - (var4.nextFloat() + var4.nextFloat()) * 0.4F);
      if (var4.nextInt(5) == 0) {
         var2.id_class(
            rLQ.id_this,
            var6 + (double)var5.id_implements() * var12,
            var8 + (double)var5.id_finally() * var12,
            var10 + (double)var5.id_extends() * var12,
            var4.nextGaussian() * 0.005,
            var4.nextGaussian() * 0.005,
            var4.nextGaussian() * 0.005
         );
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(id_volatile, var2.id_break(var1.id_byte(id_volatile)));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch (var1.id_byte(id_volatile).id_final()) {
         case X:
         default:
            return id_int;
         case Z:
            return id_package;
         case Y:
            return id_final;
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rpr_3 var2 = var1.id_finally();
      xc_3 var3 = var1.id_int().id_byte(var1.id_class().id_break(var2.id_case()));
      return var3.id_class(this) && var3.id_byte(id_volatile) == var2
         ? this.id_continue().id_class(id_volatile, var2.id_case())
         : this.id_continue().id_class(id_volatile, var2);
   }

   @Override
   public Qs_1 id_protected(xc_3 var1) {
      return Qs_1.NORMAL;
   }
}
