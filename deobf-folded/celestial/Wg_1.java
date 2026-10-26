package celestial;

public class Wg_1 extends xd_3 implements kd_3 {
   public static final rCu_1<rCo_1> id_volatile = rCT.g;
   public static final rCN id_final = rCT.id_throw;
   protected static final rjC_2 id_package = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final rjC_2 id_int = xd_3.id_class(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   public Wg_1(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_continue().id_class(id_volatile, rCo_1.BOTTOM).id_class(id_final, Boolean.valueOf(false)));
   }

   @Override
   public boolean id_class(rRg_1 var1, rfH_2 var2, xc_3 var3, rXE var4) {
      return var3.id_byte(id_volatile) != rCo_1.DOUBLE ? kd_3.super.id_class(var1, var2, var3, var4) : false;
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, rXs_1 var4) {
      return var3.id_byte(id_volatile) != rCo_1.DOUBLE ? kd_3.super.id_class(var1, var2, var3, var4) : false;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_byte(id_final)) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      switch (var4) {
         case LAND:
            return false;
         case WATER:
            return var2.id_break(var3).id_class(rlG_2.id_break);
         case AIR:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rfH_2 var2 = var1.id_class();
      xc_3 var3 = var1.id_int().id_byte(var2);
      if (var3.id_class(this)) {
         return var3.id_class(id_volatile, rCo_1.DOUBLE).id_class(id_final, Boolean.valueOf(false));
      } else {
         rXE var4 = var1.id_int().id_break(var2);
         xc_3 var5 = this.id_continue().id_class(id_volatile, rCo_1.BOTTOM).id_class(id_final, Boolean.valueOf(var4.id_class() == rXG.id_byte));
         rpr_3 var6 = var1.id_finally();
         return var6 == rpr_3.DOWN || var6 != rpr_3.UP && var1.id_extends().id_byte - (double)var2.c_() > 0.5 ? var5.id_class(id_volatile, rCo_1.TOP) : var5;
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rxx_3 var2) {
      rdn_3 var3 = var2.id_volatile();
      rCo_1 var4 = var1.id_byte(id_volatile);
      if (var4 == rCo_1.DOUBLE || var3.id_break() != this.id_case()) {
         return false;
      } else if (var2.id_byte()) {
         boolean var5 = var2.id_extends().id_byte - (double)var2.id_class().c_() > 0.5;
         rpr_3 var6 = var2.id_finally();
         return var4 == rCo_1.BOTTOM
            ? var6 == rpr_3.UP || var5 && var6.id_final().id_protected()
            : var6 == rpr_3.DOWN || !var5 && var6.id_final().id_protected();
      } else {
         return true;
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rCo_1 var5 = var1.id_byte(id_volatile);
      switch (var5) {
         case DOUBLE:
            return rjw_3.id_break();
         case TOP:
            return id_int;
         default:
            return id_package;
      }
   }

   @Override
   public boolean id_break(xc_3 var1) {
      return var1.id_byte(id_volatile) != rCo_1.DOUBLE;
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return var1.id_byte(id_final) ? rXG.id_byte.id_class(false) : super.id_throws(var1);
   }
}
