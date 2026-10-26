package celestial;

public class dp_3 extends dV_2 {
   private final rjC_2[] id_else;

   @Override
   public rjC_2 id_byte(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_class(var1, var2, var3, var4);
   }

   public dp_3(Jq_1 var1) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, var1);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_volatile, Boolean.valueOf(false))
            .id_class(id_final, Boolean.valueOf(false))
            .id_class(id_package, Boolean.valueOf(false))
            .id_class(id_int, Boolean.valueOf(false))
            .id_class(id_new, Boolean.valueOf(false))
      );
      this.id_else = this.id_class(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         rdn_3 var7 = var4.id_protected(var5);
         return var7.id_break() == rdy_3.df ? ryZ_2.SUCCESS : ryZ_2.PASS;
      } else {
         return rdq_3.id_class(var4, var2, var3);
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      rXE var4 = var1.id_int().id_break(var1.id_class());
      rfH_2 var5 = var3.id_private();
      rfH_2 var6 = var3.id_extends();
      rfH_2 var7 = var3.id_protected();
      rfH_2 var8 = var3.id_byte();
      xc_3 var9 = var2.id_byte(var5);
      xc_3 var10 = var2.id_byte(var6);
      xc_3 var11 = var2.id_byte(var7);
      xc_3 var12 = var2.id_byte(var8);
      return super.id_class(var1)
         .id_class(id_volatile, Boolean.valueOf(this.id_class(var9, var9.id_protected(var2, var5, rpr_3.SOUTH), rpr_3.SOUTH)))
         .id_class(id_final, Boolean.valueOf(this.id_class(var10, var10.id_protected(var2, var6, rpr_3.WEST), rpr_3.WEST)))
         .id_class(id_package, Boolean.valueOf(this.id_class(var11, var11.id_protected(var2, var7, rpr_3.NORTH), rpr_3.NORTH)))
         .id_class(id_int, Boolean.valueOf(this.id_class(var12, var12.id_protected(var2, var8, rpr_3.EAST), rpr_3.EAST)))
         .id_class(id_new, Boolean.valueOf(var4.id_class() == rXG.id_byte));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_byte(id_new)) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      return var2.id_final().id_throws() == rpb_3.HORIZONTAL
         ? var1.id_class(id_continue.get(var2), Boolean.valueOf(this.id_class(var3, var3.id_protected(var4, var6, var2.id_case()), var2.id_case())))
         : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final, id_int, id_package, id_new);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return this.id_else[this.id_private(var1)];
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   public boolean id_class(xc_3 var1, boolean var2, rpr_3 var3) {
      xd_3 var4 = var1.id_break();
      boolean var5 = this.id_class(var4);
      boolean var6 = var4 instanceof dq_3 && dq_3.id_class(var1, var3);
      return !id_byte(var4) && var2 || var5 || var6;
   }

   private boolean id_class(xd_3 var1) {
      return var1.id_class(rls_3.id_default) && var1.id_class(rls_3.id_extends) == this.id_continue().id_class(rls_3.id_extends);
   }
}
