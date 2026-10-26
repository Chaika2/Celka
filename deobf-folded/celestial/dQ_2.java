package celestial;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Random;

public class dQ_2 extends dB_2 {
   public static final rCc_1 id_volatile = dz_3.id_volatile;
   public static final rCN id_final = rCT.id_try;
   private static final Map<rdb_3, UT> id_package = rqR_2.id_class(new Object2ObjectOpenHashMap(), var0 -> var0.defaultReturnValue(new Uy_1()));

   protected dQ_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH).id_class(id_final, Boolean.valueOf(false)));
   }

   public static eX_2 id_class(Uq_1 var0) {
      rpr_3 var1 = var0.id_throws().id_byte(id_volatile);
      double var2 = var0.id_class() + 0.7 * (double)var1.id_implements();
      double var4 = var0.id_break() + 0.7 * (double)var1.id_finally();
      double var6 = var0.id_byte() + 0.7 * (double)var1.id_extends();
      return new ex_3(var2, var4, var6);
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   public static void id_class(rpL_2 var0, UT var1) {
      id_package.put(var0.id_case(), var1);
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.id_this()) {
         ryO_2 var6 = var1.id_class(var2);
         if (var6 instanceof rHC) {
            ((rHC)var6).id_class(var5.id_continue());
         }
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      boolean var7 = var2.id_public(var3) || var2.id_public(var3.id_final());
      boolean var8 = var1.id_byte(id_final);
      if (var7 && !var8) {
         var2.id_finally().id_class(var3, this, 4);
         var2.id_class(var3, var1.id_class(id_final, Boolean.valueOf(true)), 4);
      } else if (!var7 && var8) {
         var2.id_class(var3, var1.id_class(id_final, Boolean.valueOf(false)), 4);
      }
   }

   protected UT id_class(rdn_3 var1) {
      return id_package.get(var1.id_break());
   }

   protected void id_class(rrEm_1 var1, rfH_2 var2) {
      ek_3 var3 = new ek_3(var1, var2);
      rHC var4 = var3.id_case();
      int var5 = var4.id_catch();
      if (var5 < 0) {
         var1.id_byte(1001, var2, 0);
      } else {
         rdn_3 var6 = var4.id_extends(var5);
         UT var7 = this.id_class(var6);
         if (var7 != UT.id_class) {
            var4.id_break(var5, var7.dispense(var3, var6));
         }
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         return ryZ_2.SUCCESS;
      } else {
         ryO_2 var7 = var2.id_class(var3);
         if (var7 instanceof rHC) {
            var4.id_class((rHC)var7);
            if (var7 instanceof rHl_1) {
               var4.id_break(rlB_2.b);
            } else {
               var4.id_break(rlB_2.O);
            }
         }

         return ryZ_2.CONSUME;
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_continue().id_class(id_volatile, var1.id_protected().id_case());
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHC();
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.id_class(var4.id_break())) {
         ryO_2 var6 = var2.id_class(var3);
         if (var6 instanceof rHC) {
            rXn_1.id_class(var2, var3, (rHC)var6);
            var2.id_byte(var3, this);
         }

         super.id_break(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.id_class(var2, var3);
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      return rJr_1.id_class(var2.id_class(var3));
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }
}
