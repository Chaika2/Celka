package celestial;

public class kK_2 extends dV_2 {
   @Override
   public rjC_2 id_byte(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return rjw_3.id_class();
   }

   protected kK_2(Jq_1 var1) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, var1);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_volatile, Boolean.valueOf(false))
            .id_class(id_final, Boolean.valueOf(false))
            .id_class(id_package, Boolean.valueOf(false))
            .id_class(id_int, Boolean.valueOf(false))
            .id_class(id_new, Boolean.valueOf(false))
      );
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final, id_int, id_package, id_new);
   }

   public final boolean id_class(xc_3 var1, boolean var2) {
      xd_3 var3 = var1.id_break();
      return !id_byte(var3) && var2 || var3 instanceof kK_2 || var3.id_class(rls_3.id_abstract);
   }

   @Override
   public boolean id_class(xc_3 var1, xc_3 var2, rpr_3 var3) {
      if (var2.id_class(this)) {
         if (!var3.id_final().id_protected()) {
            return true;
         }

         if (var1.id_byte(id_continue.get(var3)) && var2.id_byte(id_continue.get(var3.id_case()))) {
            return true;
         }
      }

      return super.id_class(var1, var2, var3);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      rXE var4 = var1.id_int().id_break(var1.id_class());
      rfH_2 var5 = var3.id_private();
      rfH_2 var6 = var3.id_protected();
      rfH_2 var7 = var3.id_byte();
      rfH_2 var8 = var3.id_extends();
      xc_3 var9 = var2.id_byte(var5);
      xc_3 var10 = var2.id_byte(var6);
      xc_3 var11 = var2.id_byte(var7);
      xc_3 var12 = var2.id_byte(var8);
      return this.id_continue()
         .id_class(id_volatile, Boolean.valueOf(this.id_class(var9, var9.id_protected(var2, var5, rpr_3.SOUTH))))
         .id_class(id_package, Boolean.valueOf(this.id_class(var10, var10.id_protected(var2, var6, rpr_3.NORTH))))
         .id_class(id_int, Boolean.valueOf(this.id_class(var11, var11.id_protected(var2, var7, rpr_3.EAST))))
         .id_class(id_final, Boolean.valueOf(this.id_class(var12, var12.id_protected(var2, var8, rpr_3.WEST))))
         .id_class(id_new, Boolean.valueOf(var4.id_class() == rXG.id_byte));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_byte(id_new)) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      return var2.id_final().id_protected()
         ? var1.id_class(id_continue.get(var2), Boolean.valueOf(this.id_class(var3, var3.id_protected(var4, var6, var2.id_case()))))
         : super.id_class(var1, var2, var3, var4, var5, var6);
   }
}
