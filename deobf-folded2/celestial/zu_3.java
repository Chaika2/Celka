package celestial;

public class zu_3 extends du_3 implements kJ_2 {
   public static final rCu_1<rCf_1> id_final = du_3.id_volatile;
   protected static final rjC_2 id_package = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public zu_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, rXs_1 var4) {
      return false;
   }

   @Override
   public boolean id_class(rRg_1 var1, rfH_2 var2, xc_3 var3, rXE var4) {
      return false;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_package;
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = super.id_class(var1);
      if (var2 != null) {
         rXE var3 = var1.id_int().id_break(var1.id_class().id_final());
         if (var3.id_class(rlG_2.id_break) && var3.id_throws() == 8) {
            return var2;
         }
      }

      return null;
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(xu_3.rr);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      if (var1.id_byte(id_final) == rCf_1.UPPER) {
         xc_3 var5 = var2.id_byte(var3.id_break());
         return var5.id_class(this) && var5.id_byte(id_final) == rCf_1.LOWER;
      } else {
         rXE var4 = var2.id_break(var3);
         return super.id_class(var1, var2, var3) && var4.id_class(rlG_2.id_break) && var4.id_throws() == 8;
      }
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return rXG.id_byte.id_class(false);
   }

   @Override
   protected boolean id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_protected(var2, var3, rpr_3.UP) && !var1.id_class(xu_3.bV);
   }
}
