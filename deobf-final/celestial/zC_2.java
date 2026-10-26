package celestial;

import com.google.common.base.MoreObjects;
import java.util.Random;

public class zC_2 extends xd_3 {
   public static final rCc_1 volatile_ = kE_2.p;
   public static final rCN final_ = rCT.return_;
   public static final rCN package_ = rCT.class_;
   protected static final rjC_2 int_ = xd_3.class_(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final rjC_2 new_ = xd_3.class_(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final rjC_2 continue_ = xd_3.class_(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final rjC_2 super_ = xd_3.class_(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public boolean byte_(xc_3 var1) {
      return true;
   }

   public zC_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.NORTH).class_(final_, Boolean.valueOf(false)).class_(package_, Boolean.valueOf(false)));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch ((rpr_3)var1.byte_(volatile_)) {
         case EAST:
         default:
            return super_;
         case WEST:
            return continue_;
         case SOUTH:
            return new_;
         case NORTH:
            return int_;
      }
   }

   @Override
   public int class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.byte_(final_) ? 15 : 0;
   }

   private void class_(rYB var1, rfH_2 var2, rpr_3 var3) {
      var1.break_(var2, this);
      var1.break_(var2.break_(var3.case_()), this);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      rpr_3 var4 = var1.byte_(volatile_);
      rfH_2 var5 = var3.break_(var4.case_());
      xc_3 var6 = var2.byte_(var5);
      return var4.final_().protected_() && var6.protected_(var2, var5, var4);
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(volatile_)));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_, package_);
   }

   public void class_(rYB var1, rfH_2 var2, xc_3 var3, boolean var4, boolean var5, int var6, xc_3 var7) {
      rpr_3 var8 = var3.byte_(volatile_);
      boolean var9 = var3.byte_(package_);
      boolean var10 = var3.byte_(final_);
      boolean var11 = !var4;
      boolean var12 = false;
      int var13 = 0;
      xc_3[] var14 = new xc_3[42];

      for (int var15 = 1; var15 < 42; var15++) {
         rfH_2 var16 = var2.class_(var8, var15);
         xc_3 var17 = var1.byte_(var16);
         if (var17.class_(xu_3.Sz)) {
            if (var17.byte_(volatile_) == var8.case_()) {
               var13 = var15;
            }
            break;
         }

         if (!var17.class_(xu_3.SQ) && var15 != var6) {
            var14[var15] = null;
            var11 = false;
         } else {
            if (var15 == var6) {
               var17 = (xc_3)MoreObjects.firstNonNull(var7, var17);
            }

            boolean var18 = !var17.byte_(zA_2.package_);
            boolean var19 = var17.byte_(zA_2.volatile_);
            var12 |= var18 && var19;
            var14[var15] = var17;
            if (var15 == var6) {
               var1.finally_().class_(var2, this, 10);
               var11 &= var18;
            }
         }
      }

      var11 &= var13 > 1;
      var12 &= var11;
      xc_3 var22 = this.continue_().class_(package_, Boolean.valueOf(var11)).class_(final_, Boolean.valueOf(var12));
      if (var13 > 0) {
         rfH_2 var23 = var2.class_(var8, var13);
         rpr_3 var25 = var8.case_();
         var1.class_(var23, var22.class_(volatile_, var25), 3);
         this.class_(var1, var23, var25);
         this.class_(var1, var23, var11, var12, var9, var10);
      }

      this.class_(var1, var2, var11, var12, var9, var10);
      if (!var4) {
         var1.class_(var2, var22.class_(volatile_, var8), 3);
         if (var5) {
            this.class_(var1, var2, var8);
         }
      }

      if (var9 != var11) {
         for (int var24 = 1; var24 < var13; var24++) {
            rfH_2 var26 = var2.class_(var8, var24);
            xc_3 var27 = var14[var24];
            if (var27 != null) {
               var1.class_(var26, var27.class_(package_, Boolean.valueOf(var11)), 3);
               if (!var1.byte_(var26).catch_()) {
               }
            }
         }
      }
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      this.class_(var1, var2, var3, false, false, -1, (xc_3)null);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      xc_3 var2 = this.continue_().class_(final_, Boolean.valueOf(false)).class_(package_, Boolean.valueOf(false));
      rYB var3 = var1.int_();
      rfH_2 var4 = var1.class_();
      rpr_3[] var5 = var1.throws_();

      for (rpr_3 var9 : var5) {
         if (var9.final_().protected_()) {
            rpr_3 var10 = var9.case_();
            var2 = var2.class_(volatile_, var10);
            if (var2.class_((rRR)var3, var4)) {
               return var2;
            }
         }
      }

      return null;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2.case_() == var1.byte_(volatile_) && !var1.class_(var4, var5) ? xu_3.class_.continue_() : super.class_(var1, var2, var3, var4, var5, var6);
   }

   private void class_(rYB var1, rfH_2 var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      if (var4 && !var6) {
         var1.class_((rhd_3)null, var2, rqn_3.dN, rqL_2.BLOCKS, 0.4F, 0.6F);
      } else if (!var4 && var6) {
         var1.class_((rhd_3)null, var2, rqn_3.dQ, rqL_2.BLOCKS, 0.4F, 0.5F);
      } else if (var3 && !var5) {
         var1.class_((rhd_3)null, var2, rqn_3.dz, rqL_2.BLOCKS, 0.4F, 0.7F);
      } else if (!var3 && var5) {
         var1.class_((rhd_3)null, var2, rqn_3.dc, rqL_2.BLOCKS, 0.4F, 1.2F / (var1.int_.nextFloat() * 0.2F + 0.9F));
      }
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.class_(var4.break_())) {
         boolean var6 = var1.byte_(package_);
         boolean var7 = var1.byte_(final_);
         if (var6 || var7) {
            this.class_(var2, var3, var1, true, false, -1, (xc_3)null);
         }

         if (var7) {
            var2.break_(var3, this);
            var2.break_(var3.break_(var1.byte_(volatile_).case_()), this);
         }

         super.break_(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      if (!var1.byte_(final_)) {
         return 0;
      } else {
         return var1.byte_(volatile_) == var4 ? 15 : 0;
      }
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.class_(var2, var3, var1, false, true, -1, (xc_3)null);
   }
}
