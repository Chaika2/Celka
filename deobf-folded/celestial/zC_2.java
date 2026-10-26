package celestial;

import com.google.common.base.MoreObjects;
import java.util.Random;

public class zC_2 extends xd_3 {
   public static final rCc_1 id_volatile = kE_2.p;
   public static final rCN id_final = rCT.id_return;
   public static final rCN id_package = rCT.id_class;
   protected static final rjC_2 id_int = xd_3.id_class(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final rjC_2 id_new = xd_3.id_class(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final rjC_2 id_continue = xd_3.id_class(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final rjC_2 id_super = xd_3.id_class(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public boolean id_byte(xc_3 var1) {
      return true;
   }

   public zC_2(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH).id_class(id_final, Boolean.valueOf(false)).id_class(id_package, Boolean.valueOf(false))
      );
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch ((rpr_3)var1.id_byte(id_volatile)) {
         case EAST:
         default:
            return id_super;
         case WEST:
            return id_continue;
         case SOUTH:
            return id_new;
         case NORTH:
            return id_int;
      }
   }

   @Override
   public int id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.id_byte(id_final) ? 15 : 0;
   }

   private void id_class(rYB var1, rfH_2 var2, rpr_3 var3) {
      var1.id_break(var2, this);
      var1.id_break(var2.id_break(var3.id_case()), this);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      rpr_3 var4 = var1.id_byte(id_volatile);
      rfH_2 var5 = var3.id_break(var4.id_case());
      xc_3 var6 = var2.id_byte(var5);
      return var4.id_final().id_protected() && var6.id_protected(var2, var5, var4);
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
      var1.id_class(id_volatile, id_final, id_package);
   }

   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, boolean var4, boolean var5, int var6, xc_3 var7) {
      rpr_3 var8 = var3.id_byte(id_volatile);
      boolean var9 = var3.id_byte(id_package);
      boolean var10 = var3.id_byte(id_final);
      boolean var11 = !var4;
      boolean var12 = false;
      int var13 = 0;
      xc_3[] var14 = new xc_3[42];

      for (int var15 = 1; var15 < 42; var15++) {
         rfH_2 var16 = var2.id_class(var8, var15);
         xc_3 var17 = var1.id_byte(var16);
         if (var17.id_class(xu_3.Sz)) {
            if (var17.id_byte(id_volatile) == var8.id_case()) {
               var13 = var15;
            }
            break;
         }

         if (!var17.id_class(xu_3.SQ) && var15 != var6) {
            var14[var15] = null;
            var11 = false;
         } else {
            if (var15 == var6) {
               var17 = (xc_3)MoreObjects.firstNonNull(var7, var17);
            }

            boolean var18 = !var17.id_byte(zA_2.id_package);
            boolean var19 = var17.id_byte(zA_2.id_volatile);
            var12 |= var18 && var19;
            var14[var15] = var17;
            if (var15 == var6) {
               var1.id_finally().id_class(var2, this, 10);
               var11 &= var18;
            }
         }
      }

      var11 &= var13 > 1;
      var12 &= var11;
      xc_3 var22 = this.id_continue().id_class(id_package, Boolean.valueOf(var11)).id_class(id_final, Boolean.valueOf(var12));
      if (var13 > 0) {
         rfH_2 var23 = var2.id_class(var8, var13);
         rpr_3 var25 = var8.id_case();
         var1.id_class(var23, var22.id_class(id_volatile, var25), 3);
         this.id_class(var1, var23, var25);
         this.id_class(var1, var23, var11, var12, var9, var10);
      }

      this.id_class(var1, var2, var11, var12, var9, var10);
      if (!var4) {
         var1.id_class(var2, var22.id_class(id_volatile, var8), 3);
         if (var5) {
            this.id_class(var1, var2, var8);
         }
      }

      if (var9 != var11) {
         for (int var24 = 1; var24 < var13; var24++) {
            rfH_2 var26 = var2.id_class(var8, var24);
            xc_3 var27 = var14[var24];
            if (var27 != null) {
               var1.id_class(var26, var27.id_class(id_package, Boolean.valueOf(var11)), 3);
               if (!var1.id_byte(var26).id_catch()) {
               }
            }
         }
      }
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      this.id_class(var1, var2, var3, false, false, -1, (xc_3)null);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = this.id_continue().id_class(id_final, Boolean.valueOf(false)).id_class(id_package, Boolean.valueOf(false));
      rYB var3 = var1.id_int();
      rfH_2 var4 = var1.id_class();
      rpr_3[] var5 = var1.id_throws();

      for (rpr_3 var9 : var5) {
         if (var9.id_final().id_protected()) {
            rpr_3 var10 = var9.id_case();
            var2 = var2.id_class(id_volatile, var10);
            if (var2.id_class((rRR)var3, var4)) {
               return var2;
            }
         }
      }

      return null;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2.id_case() == var1.id_byte(id_volatile) && !var1.id_class(var4, var5)
         ? xu_3.id_class.id_continue()
         : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   private void id_class(rYB var1, rfH_2 var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      if (var4 && !var6) {
         var1.id_class((rhd_3)null, var2, rqn_3.dN, rqL_2.BLOCKS, 0.4F, 0.6F);
      } else if (!var4 && var6) {
         var1.id_class((rhd_3)null, var2, rqn_3.dQ, rqL_2.BLOCKS, 0.4F, 0.5F);
      } else if (var3 && !var5) {
         var1.id_class((rhd_3)null, var2, rqn_3.dz, rqL_2.BLOCKS, 0.4F, 0.7F);
      } else if (!var3 && var5) {
         var1.id_class((rhd_3)null, var2, rqn_3.dc, rqL_2.BLOCKS, 0.4F, 1.2F / (var1.id_int.nextFloat() * 0.2F + 0.9F));
      }
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.id_class(var4.id_break())) {
         boolean var6 = var1.id_byte(id_package);
         boolean var7 = var1.id_byte(id_final);
         if (var6 || var7) {
            this.id_class(var2, var3, var1, true, false, -1, (xc_3)null);
         }

         if (var7) {
            var2.id_break(var3, this);
            var2.id_break(var3.id_break(var1.id_byte(id_volatile).id_case()), this);
         }

         super.id_break(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      if (!var1.id_byte(id_final)) {
         return 0;
      } else {
         return var1.id_byte(id_volatile) == var4 ? 15 : 0;
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.id_class(var2, var3, var1, false, true, -1, (xc_3)null);
   }
}
