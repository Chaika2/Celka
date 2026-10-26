package celestial;

public class xA_2 extends xd_3 {
   public static final rCm_1 id_volatile = rCT.z;
   protected static final rjC_2[] id_final = new rjC_2[]{
      xd_3.id_class(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      xd_3.id_class(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      xd_3.id_class(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      xd_3.id_class(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      xd_3.id_class(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      xd_3.id_class(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      xd_3.id_class(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   protected xA_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final[var1.id_byte(id_volatile)];
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
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return var2.id_byte(var3.id_break()).id_byte().id_break();
   }

   private ryZ_2 id_class(rRg_1 var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var4.id_else(false)) {
         return ryZ_2.PASS;
      } else {
         var4.id_break(rlB_2.id_switch);
         var4.sk().id_class(2, 0.1F);
         int var5 = var3.id_byte(id_volatile);
         if (var5 < 6) {
            var1.id_class(var2, var3.id_class(id_volatile, Integer.valueOf(var5 + 1)), 3);
         } else {
            var1.id_class(var2, false);
         }

         return ryZ_2.SUCCESS;
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         rdn_3 var7 = var4.id_protected(var5);
         if (this.id_class(var2, var3, var1, var4).id_class()) {
            return ryZ_2.SUCCESS;
         }

         if (var7.id_class()) {
            return ryZ_2.CONSUME;
         }
      }

      return this.id_class(var2, var3, var1, var4);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == rpr_3.DOWN && !var1.id_class(var4, var5) ? xu_3.id_class.id_continue() : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      return (7 - var1.id_byte(id_volatile)) * 2;
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }
}
