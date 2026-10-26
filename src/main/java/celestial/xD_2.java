package celestial;

import java.util.List;
import java.util.Random;

public class xD_2 extends Wk_1 implements kx_3 {
   public static final rCu_1<rCw_1> id_volatile = rCT.I;

   protected void id_byte(rYB var1, rfH_2 var2, xc_3 var3) {
      if (!var1.id_finally().id_break(var2, this)) {
         int var4 = this.id_throws(var1, var2, var3);
         ryO_2 var5 = var1.id_class(var2);
         int var6 = var5 instanceof rHL ? ((rHL)var5).id_throws() : 0;
         if (var4 != var6 || (Boolean)var3.id_byte(id_package) != this.id_class(var1, var2, var3)) {
            rYr_1 var7 = this.id_byte(var1, var2, var3) ? rYr_1.HIGH : rYr_1.NORMAL;
            var1.id_finally().id_class(var2, this, 2, var7);
         }
      }
   }

   public xD_2(Jq_1 var1) {
      super(var1);
      this.id_extends(
         (xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(p, rpr_3.NORTH)).id_class(id_package, false)).id_class(id_volatile, rCw_1.COMPARE)
      );
   }

   private rsG_2 id_class(rYB var1, rpr_3 var2, rfH_2 var3) {
      List var4 = var1.id_class(
         rsG_2.class,
         new rfl_3((double)var3.b_(), (double)var3.c_(), (double)var3.d_(), (double)(var3.b_() + 1), (double)(var3.c_() + 1), (double)(var3.d_() + 1)),
         var1x -> var1x != null && var1x.Pg() == var2
      );
      return var4.size() == 1 ? (rsG_2)var4.get(0) : null;
   }

   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (!((rhx_3)var4.id_implements[18]).id_throws) {
         return ryZ_2.PASS;
      } else {
         var1 = (xc_3)var1.id_class(id_volatile);
         float var7 = var1.id_byte(id_volatile) == rCw_1.SUBTRACT ? 0.55F : 0.5F;
         var2.id_class(var4, var3, rqn_3.ri, rqL_2.BLOCKS, 0.3F, var7);
         var2.id_class(var3, var1, 2);
         this.id_case(var2, var3, var1);
         return ryZ_2.id_class(var2.id_continue);
      }
   }

   public ryO_2 id_class(rRq_1 var1) {
      return new rHL();
   }

   public boolean id_class(xc_3 var1, rYB var2, rfH_2 var3, int var4, int var5) {
      super.id_class(var1, var2, var3, var4, var5);
      ryO_2 var6 = var2.id_class(var3);
      return var6 != null && var6.a_(var4, var5);
   }

   protected boolean id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      int var4 = this.id_break(var1, var2, var3);
      if (var4 == 0) {
         return false;
      } else {
         int var5 = this.id_break((rRR)var1, var2, var3);
         return var4 > var5 ? true : var4 == var5 && var3.id_byte(id_volatile) == rCw_1.COMPARE;
      }
   }

   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(new rCZ[]{p, id_volatile, id_package});
   }

   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.id_case(var2, var3, var1);
   }

   protected int id_break(rYB var1, rfH_2 var2, xc_3 var3) {
      int var4 = super.id_break(var1, var2, var3);
      rpr_3 var5 = (rpr_3)var3.id_byte(p);
      rfH_2 var6 = var2.id_break(var5);
      xc_3 var7 = var1.id_byte(var6);
      if (var7.id_finally()) {
         var4 = var7.id_class(var1, var6);
      } else if (var4 < 15 && var7.id_catch(var1, var6)) {
         var6 = var6.id_break(var5);
         var7 = var1.id_byte(var6);
         rsG_2 var8 = this.id_class(var1, var5, var6);
         int var9 = Math.max(var8 == null ? Integer.MIN_VALUE : var8.id_int(), var7.id_finally() ? var7.id_class(var1, var6) : Integer.MIN_VALUE);
         if (var9 != Integer.MIN_VALUE) {
            var4 = var9;
         }
      }

      return var4;
   }

   protected int id_break(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      ryO_2 var4 = var1.id_class(var2);
      return var4 instanceof rHL ? ((rHL)var4).id_throws() : 0;
   }

   private int id_throws(rYB var1, rfH_2 var2, xc_3 var3) {
      return var3.id_byte(id_volatile) == rCw_1.SUBTRACT
         ? Math.max(this.id_break(var1, var2, var3) - this.id_break((rRR)var1, var2, var3), 0)
         : this.id_break(var1, var2, var3);
   }

   private void id_case(rYB var1, rfH_2 var2, xc_3 var3) {
      int var4 = this.id_throws(var1, var2, var3);
      ryO_2 var5 = var1.id_class(var2);
      int var6 = 0;
      if (var5 instanceof rHL var7) {
         var6 = var7.id_throws();
         var7.id_class(var4);
      }

      if (var6 != var4 || var3.id_byte(id_volatile) == rCw_1.COMPARE) {
         boolean var9 = this.id_class(var1, var2, var3);
         boolean var8 = (Boolean)var3.id_byte(id_package);
         if (var8 && !var9) {
            var1.id_class(var2, (xc_3)var3.id_class(id_package, false), 2);
         } else if (!var8 && var9) {
            var1.id_class(var2, (xc_3)var3.id_class(id_package, true), 2);
         }

         this.id_protected(var1, var2, var3);
      }
   }

   protected int id_private(xc_3 var1) {
      return 2;
   }
}
