package celestial;

public class dX_2 extends dB_2 {
   public static final rCm_1 id_volatile = rCT.H;
   public static final rCN id_final = rCT.id_int;
   protected static final rjC_2 id_package = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   public static void id_byte(xc_3 var0, rYB var1, rfH_2 var2) {
      if (var1.id_default().id_break()) {
         int var3 = var1.id_class(rRo_1.SKY, var2) - var1.id_void();
         float var4 = var1.id_throws(1.0F);
         boolean var5 = var0.id_byte(id_final);
         if (var5) {
            var3 = 15 - var3;
         } else if (var3 > 0) {
            float var6 = var4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
            var4 += (var6 - var4) * 0.2F;
            var3 = Math.round((float)var3 * rfU_2.id_break(var4));
         }

         var3 = rfU_2.id_class(var3, 0, 15);
         if (var0.id_byte(id_volatile) != var3) {
            var1.id_class(var2, var0.id_class(id_volatile, Integer.valueOf(var3)), 3);
         }
      }
   }

   @Override
   public boolean id_byte(xc_3 var1) {
      return true;
   }

   public dX_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)).id_class(id_final, Boolean.valueOf(false)));
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_package;
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHn_1();
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final);
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var4.sD()) {
         if (var2.id_continue) {
            return ryZ_2.SUCCESS;
         } else {
            xc_3 var7 = var1.id_class(id_final);
            var2.id_class(var3, var7, 4);
            id_byte(var7, var2, var3);
            return ryZ_2.CONSUME;
         }
      } else {
         return super.id_class(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public int id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.id_byte(id_volatile);
   }

   @Override
   public boolean id_break(xc_3 var1) {
      return true;
   }
}
