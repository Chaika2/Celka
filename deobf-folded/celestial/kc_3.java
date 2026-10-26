package celestial;

public class kc_3 extends xd_3 implements kd_3 {
   public static final rCc_1 id_volatile = kE_2.p;
   public static final rCN id_final = rCT.id_throw;
   protected static final rjC_2 id_package = xd_3.id_class(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final rjC_2 id_int = xd_3.id_class(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 id_new = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final rjC_2 id_continue = xd_3.id_class(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   protected kc_3(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH).id_class(id_final, Boolean.valueOf(false)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      if (!var1.id_byte()) {
         xc_3 var2 = var1.id_int().id_byte(var1.id_class().id_break(var1.id_finally().id_case()));
         if (var2.id_class(this) && var2.id_byte(id_volatile) == var1.id_finally()) {
            return null;
         }
      }

      xc_3 var10 = this.id_continue();
      rYB var3 = var1.id_int();
      rfH_2 var4 = var1.id_class();
      rXE var5 = var1.id_int().id_break(var1.id_class());

      for (rpr_3 var9 : var1.id_throws()) {
         if (var9.id_final().id_protected()) {
            var10 = var10.id_class(id_volatile, var9.id_case());
            if (var10.id_class((rRR)var3, var4)) {
               return var10.id_class(id_final, Boolean.valueOf(var5.id_class() == rXG.id_byte));
            }
         }
      }

      return null;
   }

   private boolean id_class(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      xc_3 var4 = var1.id_byte(var2);
      return var4.id_protected(var1, var2, var3);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      rpr_3 var4 = var1.id_byte(id_volatile);
      return this.id_class(var2, var3.id_break(var4.id_case()), var4);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2.id_case() == var1.id_byte(id_volatile) && !var1.id_class(var4, var5)) {
         return xu_3.id_class.id_continue();
      } else {
         if (var1.id_byte(id_final)) {
            var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
         }

         return super.id_class(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch ((rpr_3)var1.id_byte(id_volatile)) {
         case NORTH:
            return id_continue;
         case SOUTH:
            return id_new;
         case WEST:
            return id_int;
         case EAST:
         default:
            return id_package;
      }
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return var1.id_byte(id_final) ? rXG.id_byte.id_class(false) : super.id_throws(var1);
   }
}
