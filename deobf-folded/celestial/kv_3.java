package celestial;

import java.util.Random;

public class kv_3 extends dB_2 {
   public static final rCc_1 id_volatile = kE_2.p;
   public static final rCN id_final = rCT.id_return;
   public static final rCN id_package = rCT.id_package;
   public static final rjC_2 id_int = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final rjC_2 id_new = xd_3.id_class(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final rjC_2 id_continue = rjw_3.id_class(id_int, id_new);
   public static final rjC_2 id_super = xd_3.id_class(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final rjC_2 id_this = rjw_3.id_class(id_continue, id_super);
   public static final rjC_2 id_else = rjw_3.id_class(
      xd_3.id_class(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0),
      xd_3.id_class(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0),
      xd_3.id_class(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0),
      id_continue
   );
   public static final rjC_2 id_synchronized = rjw_3.id_class(
      xd_3.id_class(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333),
      xd_3.id_class(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667),
      xd_3.id_class(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0),
      id_continue
   );
   public static final rjC_2 id_return = rjw_3.id_class(
      xd_3.id_class(15.0, 10.0, 0.0, 10.666667, 14.0, 16.0),
      xd_3.id_class(10.666667, 12.0, 0.0, 6.333333, 16.0, 16.0),
      xd_3.id_class(6.333333, 14.0, 0.0, 2.0, 18.0, 16.0),
      id_continue
   );
   public static final rjC_2 id_public = rjw_3.id_class(
      xd_3.id_class(0.0, 10.0, 15.0, 16.0, 14.0, 10.666667),
      xd_3.id_class(0.0, 12.0, 10.666667, 16.0, 16.0, 6.333333),
      xd_3.id_class(0.0, 14.0, 6.333333, 16.0, 18.0, 2.0),
      id_continue
   );

   private void id_byte(xc_3 var1, rYB var2, rfH_2 var3) {
      if (var2.id_class(var3) instanceof rHR var5) {
         rpr_3 var6 = var1.id_byte(id_volatile);
         rdn_3 var7 = var5.id_throws().id_implements();
         float var8 = 0.25F * (float)var6.id_implements();
         float var9 = 0.25F * (float)var6.id_extends();
         rsE_2 var10 = new rsE_2(var2, (double)var3.b_() + 0.5 + (double)var8, (double)(var3.c_() + 1), (double)var3.d_() + 0.5 + (double)var9, var7);
         var10.id_private();
         var2.a_(var10);
         var5.id_public();
      }
   }

   @Override
   public boolean id_byte(xc_3 var1) {
      return true;
   }

   protected kv_3(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH).id_class(id_final, Boolean.valueOf(false)).id_class(id_package, Boolean.valueOf(false))
      );
   }

   @Override
   public rJZ id_class(xc_3 var1, rYB var2, rfH_2 var3) {
      return !var1.id_byte(id_package) ? null : super.id_class(var1, var2, var3);
   }

   private void id_class(rYB var1, rfH_2 var2, rhd_3 var3) {
      ryO_2 var4 = var1.id_class(var2);
      if (var4 instanceof rHR) {
         var3.id_class((rHR)var4);
         var3.id_break(rlB_2.F);
      }
   }

   public static void id_class(rYB var0, rfH_2 var1, xc_3 var2) {
      id_break(var0, var1, var2, true);
      var0.id_finally().id_class(var1, var2.id_break(), 2);
      var0.id_byte(1043, var1, 0);
   }

   public static void id_class(rYB var0, rfH_2 var1, xc_3 var2, boolean var3) {
      var0.id_class(var1, var2.id_class(id_final, Boolean.valueOf(false)).id_class(id_package, Boolean.valueOf(var3)), 3);
      id_break(var0, var1, var2);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public int id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.id_byte(id_final) ? 15 : 0;
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return id_continue;
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var1.id_byte(id_package)) {
         if (!var2.id_continue) {
            this.id_class(var2, var3, var4);
         }

         return ryZ_2.id_class(var2.id_continue);
      } else {
         rdn_3 var7 = var4.id_protected(var5);
         return !var7.id_class() && !var7.id_break().id_class(rlc_3.E) ? ryZ_2.CONSUME : ryZ_2.PASS;
      }
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
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch ((rpr_3)var1.id_byte(id_volatile)) {
         case NORTH:
            return id_synchronized;
         case SOUTH:
            return id_public;
         case EAST:
            return id_return;
         case WEST:
            return id_else;
         default:
            return id_continue;
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rYB var2 = var1.id_int();
      rdn_3 var3 = var1.id_volatile();
      rcd_3 var4 = var3.id_package();
      rhd_3 var5 = var1.id_final();
      boolean var6 = false;
      if (!var2.id_continue && var5 != null && var4 != null && var5.sU() && var4.id_throws("BlockEntityTag")) {
         rcd_3 var7 = var4.id_int("BlockEntityTag");
         if (var7.id_throws("Book")) {
            var6 = true;
         }
      }

      return this.id_continue().id_class(id_volatile, var1.id_case().id_case()).id_class(id_package, Boolean.valueOf(var6));
   }

   public static boolean id_class(rYB var0, rfH_2 var1, xc_3 var2, rdn_3 var3) {
      if (!var2.id_byte(id_package)) {
         if (!var0.id_continue) {
            id_break(var0, var1, var2, var3);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHR();
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final, id_package);
   }

   @Override
   public int id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var4 == rpr_3.UP && var1.id_byte(id_final) ? 15 : 0;
   }

   private static void id_break(rYB var0, rfH_2 var1, xc_3 var2, boolean var3) {
      var0.id_class(var1, var2.id_class(id_final, Boolean.valueOf(var3)), 3);
      id_break(var0, var1, var2);
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      if (var1.id_byte(id_package)) {
         ryO_2 var4 = var2.id_class(var3);
         if (var4 instanceof rHR) {
            return ((rHR)var4).id_finally();
         }
      }

      return 0;
   }

   private static void id_break(rYB var0, rfH_2 var1, xc_3 var2, rdn_3 var3) {
      if (var0.id_class(var1) instanceof rHR var5) {
         var5.id_class(var3.id_class(1));
         id_class(var0, var1, var2, true);
         var0.id_class((rhd_3)null, var1, rqn_3.rs, rqL_2.BLOCKS, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean id_break(xc_3 var1) {
      return true;
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_this;
   }

   private static void id_break(rYB var0, rfH_2 var1, xc_3 var2) {
      var0.id_break(var1.id_break(), var2.id_break());
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.id_class(var4.id_break())) {
         if (var1.id_byte(id_package)) {
            this.id_byte(var1, var2, var3);
         }

         if (var1.id_byte(id_final)) {
            var2.id_break(var3.id_break(), this);
         }

         super.id_break(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      id_break(var2, var3, var1, false);
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }
}
