package celestial;

public class zv_3 extends kE_2 implements kd_3 {
   public static final rCN id_volatile = rCT.id_else;
   public static final rCu_1<rCj_1> id_final = rCT.b;
   public static final rCN id_package = rCT.id_return;
   public static final rCN id_int = rCT.id_throw;
   protected static final rjC_2 id_new = xd_3.id_class(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final rjC_2 id_continue = xd_3.id_class(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 id_super = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final rjC_2 id_this = xd_3.id_class(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 id_else = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final rjC_2 id_synchronized = xd_3.id_class(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);

   protected zv_3(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(p, rpr_3.NORTH)
            .id_class(id_volatile, Boolean.valueOf(false))
            .id_class(id_final, rCj_1.BOTTOM)
            .id_class(id_package, Boolean.valueOf(false))
            .id_class(id_int, Boolean.valueOf(false))
      );
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = this.id_continue();
      rXE var3 = var1.id_int().id_break(var1.id_class());
      rpr_3 var4 = var1.id_finally();
      if (!var1.id_byte() && var4.id_final().id_protected()) {
         var2 = var2.id_class(p, var4).id_class(id_final, var1.id_extends().id_byte - (double)var1.id_class().c_() > 0.5 ? rCj_1.TOP : rCj_1.BOTTOM);
      } else {
         var2 = var2.id_class(p, var1.id_case().id_case()).id_class(id_final, var4 == rpr_3.UP ? rCj_1.BOTTOM : rCj_1.TOP);
      }

      if (var1.id_int().id_public(var1.id_class())) {
         var2 = var2.id_class(id_volatile, Boolean.valueOf(true)).id_class(id_package, Boolean.valueOf(true));
      }

      return var2.id_class(id_int, Boolean.valueOf(var3.id_class() == rXG.id_byte));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(p, id_volatile, id_final, id_package, id_int);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_byte(id_int)) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.id_continue) {
         boolean var7 = var2.id_public(var3);
         if (var7 != var1.id_byte(id_package)) {
            if (var1.id_byte(id_volatile) != var7) {
               var1 = var1.id_class(id_volatile, Boolean.valueOf(var7));
               this.id_class((rhd_3)null, var2, var3, var7);
            }

            var2.id_class(var3, var1.id_class(id_package, Boolean.valueOf(var7)), 2);
            if (var1.id_byte(id_int)) {
               var2.id_extends().id_class(var3, rXG.id_byte, rXG.id_byte.id_class(var2));
            }
         }
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (this.id_break == QP.id_static) {
         return ryZ_2.PASS;
      } else {
         var1 = var1.id_class(id_volatile);
         var2.id_class(var3, var1, 2);
         if (var1.id_byte(id_int)) {
            var2.id_extends().id_class(var3, rXG.id_byte, rXG.id_byte.id_class(var2));
         }

         this.id_class(var4, var2, var3, var1.id_byte(id_volatile));
         return ryZ_2.id_class(var2.id_continue);
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      switch (var4) {
         case LAND:
            return var1.id_byte(id_volatile);
         case WATER:
            return var1.id_byte(id_int);
         case AIR:
            return var1.id_byte(id_volatile);
         default:
            return false;
      }
   }

   protected void id_class(rhd_3 var1, rYB var2, rfH_2 var3, boolean var4) {
      if (var4) {
         int var5 = this.id_break == QP.id_static ? 1037 : 1007;
         var2.id_class(var1, var5, var3, 0);
      } else {
         int var6 = this.id_break == QP.id_static ? 1036 : 1013;
         var2.id_class(var1, var6, var3, 0);
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (!var1.id_byte(id_volatile)) {
         return var1.id_byte(id_final) == rCj_1.TOP ? id_synchronized : id_else;
      } else {
         switch ((rpr_3)var1.id_byte(p)) {
            case NORTH:
            default:
               return id_this;
            case SOUTH:
               return id_super;
            case WEST:
               return id_continue;
            case EAST:
               return id_new;
         }
      }
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return var1.id_byte(id_int) ? rXG.id_byte.id_class(false) : super.id_throws(var1);
   }
}
