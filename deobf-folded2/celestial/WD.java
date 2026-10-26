package celestial;

import java.util.Random;

public class WD extends xd_3 {
   public static final rCm_1 id_volatile = rCT.m;
   protected static final rjC_2[] id_final = new rjC_2[]{
      rjw_3.id_class(),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public rjC_2 id_byte(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final[var1.id_byte(id_volatile)];
   }

   protected WD(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(1)));
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      xc_3 var4 = var2.id_byte(var3.id_break());
      if (var4.id_class(xu_3.PT) || var4.id_class(xu_3.Ei) || var4.id_class(xu_3.Ec)) {
         return false;
      } else {
         return !var4.id_class(xu_3.Jh) && !var4.id_class(xu_3.PY)
            ? xd_3.id_class(var4.id_extends(var2, var3.id_break()), rpr_3.UP) || var4.id_break() == this && var4.id_byte(id_volatile) == 8
            : true;
      }
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.id_class(rRo_1.BLOCK, var3) > 11) {
         id_protected(var1, var2, var3);
         var2.id_class(var3, false);
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rxx_3 var2) {
      int var3 = var1.id_byte(id_volatile);
      if (var2.id_volatile().id_break() != this.id_case() || var3 >= 8) {
         return var3 == 1;
      } else {
         return var2.id_byte() ? var2.id_finally() == rpr_3.UP : true;
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = var1.id_int().id_byte(var1.id_class());
      if (var2.id_class(this)) {
         int var3 = var2.id_byte(id_volatile);
         return var2.id_class(id_volatile, Integer.valueOf(Math.min(8, var3 + 1)));
      } else {
         return super.id_class(var1);
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return !var1.id_class(var4, var5) ? xu_3.id_class.id_continue() : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final[var1.id_byte(id_volatile)];
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      switch (var4) {
         case LAND:
            return var1.id_byte(id_volatile) < 5;
         case WATER:
            return false;
         case AIR:
            return false;
         default:
            return false;
      }
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final[var1.id_byte(id_volatile) - 1];
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return id_final[var1.id_byte(id_volatile)];
   }

   @Override
   public boolean id_break(xc_3 var1) {
      return true;
   }
}
