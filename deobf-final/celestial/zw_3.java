package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class zw_3 extends xd_3 implements kd_3 {
   public static final rCN volatile_ = rCT.long_;
   public static final rCu_1<zf_3> final_ = rCT.double_;
   public static final rCu_1<zf_3> package_ = rCT.switch_;
   public static final rCu_1<zf_3> int_ = rCT.r;
   public static final rCu_1<zf_3> new_ = rCT.P;
   public static final rCN continue_ = rCT.throw_;
   private final Map<xc_3, rjC_2> super_;
   private final Map<xc_3, rjC_2> this_;
   private static final rjC_2 else_ = xd_3.class_(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final rjC_2 synchronized_ = xd_3.class_(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final rjC_2 return_ = xd_3.class_(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final rjC_2 public_ = xd_3.class_(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final rjC_2 goto_ = xd_3.class_(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   public zw_3(Jq_1 var1) {
      super(var1);
      this.extends_(
         this.abstract_
            .break_()
            .class_(volatile_, Boolean.valueOf(true))
            .class_(package_, zf_3.NONE)
            .class_(final_, zf_3.NONE)
            .class_(int_, zf_3.NONE)
            .class_(new_, zf_3.NONE)
            .class_(continue_, Boolean.valueOf(false))
      );
      this.super_ = this.class_(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.this_ = this.class_(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private xc_3 class_(xc_3 var1, boolean var2, boolean var3, boolean var4, boolean var5, rjC_2 var6) {
      return var1.class_(package_, this.class_(var2, var6, synchronized_))
         .class_(final_, this.class_(var3, var6, goto_))
         .class_(int_, this.class_(var4, var6, return_))
         .class_(new_, this.class_(var5, var6, public_));
   }

   private boolean class_(xc_3 var1, xc_3 var2, rjC_2 var3) {
      boolean var4 = var2.break_() instanceof zw_3 && var2.byte_(volatile_);
      if (var4) {
         return true;
      } else {
         zf_3 var5 = var1.byte_(package_);
         zf_3 var6 = var1.byte_(int_);
         zf_3 var7 = var1.byte_(final_);
         zf_3 var8 = var1.byte_(new_);
         boolean var9 = var6 == zf_3.NONE;
         boolean var10 = var8 == zf_3.NONE;
         boolean var11 = var7 == zf_3.NONE;
         boolean var12 = var5 == zf_3.NONE;
         boolean var13 = var12 && var9 && var10 && var11 || var12 != var9 || var10 != var11;
         if (var13) {
            return true;
         } else {
            boolean var14 = var5 == zf_3.TALL && var6 == zf_3.TALL || var7 == zf_3.TALL && var8 == zf_3.TALL;
            return var14 ? false : var2.break_().class_(rls_3.v) || class_(var3, else_);
         }
      }
   }

   private xc_3 class_(rRR var1, xc_3 var2, rfH_2 var3, xc_3 var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      rjC_2 var9 = var4.extends_(var1, var3).class_(rpr_3.DOWN);
      xc_3 var10 = this.class_(var2, var5, var6, var7, var8, var9);
      return var10.class_(volatile_, Boolean.valueOf(this.class_(var10, var4, var9)));
   }

   private xc_3 class_(rRR var1, rfH_2 var2, xc_3 var3, rfH_2 var4, xc_3 var5, rpr_3 var6) {
      rpr_3 var7 = var6.case_();
      boolean var8 = var6 == rpr_3.NORTH ? this.class_(var5, var5.protected_(var1, var4, var7), var7) : class_(var3, package_);
      boolean var9 = var6 == rpr_3.EAST ? this.class_(var5, var5.protected_(var1, var4, var7), var7) : class_(var3, final_);
      boolean var10 = var6 == rpr_3.SOUTH ? this.class_(var5, var5.protected_(var1, var4, var7), var7) : class_(var3, int_);
      boolean var11 = var6 == rpr_3.WEST ? this.class_(var5, var5.protected_(var1, var4, var7), var7) : class_(var3, new_);
      rfH_2 var12 = var2.final_();
      xc_3 var13 = var1.byte_(var12);
      return this.class_(var1, var3, var12, var13, var8, var9, var10, var11);
   }

   private static rjC_2 class_(rjC_2 var0, zf_3 var1, rjC_2 var2, rjC_2 var3) {
      if (var1 == zf_3.TALL) {
         return rjw_3.class_(var0, var3);
      } else {
         return var1 == zf_3.LOW ? rjw_3.class_(var0, var2) : var0;
      }
   }

   private xc_3 class_(rRR var1, xc_3 var2, rfH_2 var3, xc_3 var4) {
      boolean var5 = class_(var2, package_);
      boolean var6 = class_(var2, final_);
      boolean var7 = class_(var2, int_);
      boolean var8 = class_(var2, new_);
      return this.class_(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      switch (var2) {
         case LEFT_RIGHT:
            return var1.class_(package_, var1.byte_(int_)).class_(int_, var1.byte_(package_));
         case FRONT_BACK:
            return var1.class_(final_, var1.byte_(new_)).class_(new_, var1.byte_(final_));
         default:
            return super.class_(var1, var2);
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            return var1.class_(package_, var1.byte_(int_)).class_(final_, var1.byte_(new_)).class_(int_, var1.byte_(package_)).class_(new_, var1.byte_(final_));
         case COUNTERCLOCKWISE_90:
            return var1.class_(package_, var1.byte_(final_)).class_(final_, var1.byte_(int_)).class_(int_, var1.byte_(new_)).class_(new_, var1.byte_(package_));
         case CLOCKWISE_90:
            return var1.class_(package_, var1.byte_(new_)).class_(final_, var1.byte_(package_)).class_(int_, var1.byte_(final_)).class_(new_, var1.byte_(int_));
         default:
            return var1;
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, package_, final_, new_, int_, continue_);
   }

   private zf_3 class_(boolean var1, rjC_2 var2, rjC_2 var3) {
      if (var1) {
         return class_(var2, var3) ? zf_3.TALL : zf_3.LOW;
      } else {
         return zf_3.NONE;
      }
   }

   private boolean class_(xc_3 var1, boolean var2, rpr_3 var3) {
      xd_3 var4 = var1.break_();
      boolean var5 = var4 instanceof dq_3 && dq_3.class_(var1, var3);
      return var1.class_(rls_3.abstract_) || !byte_(var4) && var2 || var4 instanceof kK_2 || var5;
   }

   private Map<xc_3, rjC_2> class_(float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = 8.0F - var1;
      float var8 = 8.0F + var1;
      float var9 = 8.0F - var2;
      float var10 = 8.0F + var2;
      rjC_2 var11 = xd_3.class_((double)var7, 0.0, (double)var7, (double)var8, (double)var3, (double)var8);
      rjC_2 var12 = xd_3.class_((double)var9, (double)var4, 0.0, (double)var10, (double)var5, (double)var10);
      rjC_2 var13 = xd_3.class_((double)var9, (double)var4, (double)var9, (double)var10, (double)var5, 16.0);
      rjC_2 var14 = xd_3.class_(0.0, (double)var4, (double)var9, (double)var10, (double)var5, (double)var10);
      rjC_2 var15 = xd_3.class_((double)var9, (double)var4, (double)var9, 16.0, (double)var5, (double)var10);
      rjC_2 var16 = xd_3.class_((double)var9, (double)var4, 0.0, (double)var10, (double)var6, (double)var10);
      rjC_2 var17 = xd_3.class_((double)var9, (double)var4, (double)var9, (double)var10, (double)var6, 16.0);
      rjC_2 var18 = xd_3.class_(0.0, (double)var4, (double)var9, (double)var10, (double)var6, (double)var10);
      rjC_2 var19 = xd_3.class_((double)var9, (double)var4, (double)var9, 16.0, (double)var6, (double)var10);
      Builder var20 = ImmutableMap.builder();

      for (Boolean var22 : volatile_.class_()) {
         for (zf_3 var24 : final_.class_()) {
            for (zf_3 var26 : package_.class_()) {
               for (zf_3 var28 : new_.class_()) {
                  for (zf_3 var30 : int_.class_()) {
                     rjC_2 var31 = rjw_3.class_();
                     var31 = class_(var31, var24, var15, var19);
                     var31 = class_(var31, var28, var14, var18);
                     var31 = class_(var31, var26, var12, var16);
                     var31 = class_(var31, var30, var13, var17);
                     if (var22) {
                        var31 = rjw_3.class_(var31, var11);
                     }

                     xc_3 var32 = this.continue_()
                        .class_(volatile_, var22)
                        .class_(final_, var24)
                        .class_(new_, var28)
                        .class_(package_, var26)
                        .class_(int_, var30);
                     var20.put(var32.class_(continue_, Boolean.valueOf(false)), var31);
                     var20.put(var32.class_(continue_, Boolean.valueOf(true)), var31);
                  }
               }
            }
         }
      }

      return var20.build();
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.super_.get(var1);
   }

   private static boolean class_(rjC_2 var0, rjC_2 var1) {
      return !rjw_3.byte_(var1, var0, rjN_2.throws_);
   }

   private static boolean class_(xc_3 var0, rCZ<zf_3> var1) {
      return var0.byte_(var1) != zf_3.NONE;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.byte_(continue_)) {
         var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
      }

      if (var2 == rpr_3.DOWN) {
         return super.class_(var1, var2, var3, var4, var5, var6);
      } else {
         return var2 == rpr_3.UP ? this.class_(var4, var1, var6, var3) : this.class_(var4, var5, var1, var6, var3, var2);
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      rXE var4 = var1.int_().break_(var1.class_());
      rfH_2 var5 = var3.private_();
      rfH_2 var6 = var3.extends_();
      rfH_2 var7 = var3.protected_();
      rfH_2 var8 = var3.byte_();
      rfH_2 var9 = var3.final_();
      xc_3 var10 = var2.byte_(var5);
      xc_3 var11 = var2.byte_(var6);
      xc_3 var12 = var2.byte_(var7);
      xc_3 var13 = var2.byte_(var8);
      xc_3 var14 = var2.byte_(var9);
      boolean var15 = this.class_(var10, var10.protected_(var2, var5, rpr_3.SOUTH), rpr_3.SOUTH);
      boolean var16 = this.class_(var11, var11.protected_(var2, var6, rpr_3.WEST), rpr_3.WEST);
      boolean var17 = this.class_(var12, var12.protected_(var2, var7, rpr_3.NORTH), rpr_3.NORTH);
      boolean var18 = this.class_(var13, var13.protected_(var2, var8, rpr_3.EAST), rpr_3.EAST);
      xc_3 var19 = this.continue_().class_(continue_, Boolean.valueOf(var4.class_() == rXG.byte_));
      return this.class_(var2, var19, var9, var14, var15, var16, var17, var18);
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.this_.get(var1);
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return var1.byte_(continue_) ? rXG.byte_.class_(false) : super.throws_(var1);
   }

   @Override
   public boolean a_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return !var1.byte_(continue_);
   }
}
