package celestial;

import java.util.List;
import java.util.Map;

public class rxJ_2 extends rdb_3 {
   @Deprecated
   private final xd_3 class_;

   public xc_3 byte_(rxx_3 var1) {
      xc_3 var2 = this.catch_().class_(var1);
      return var2 != null && this.break_(var1, var2) ? var2 : null;
   }

   public rxJ_2(xd_3 var1, rdO_2 var2) {
      super(var2);
      this.class_ = var1;
   }

   protected boolean class_(rxx_3 var1, xc_3 var2) {
      return var1.int_().class_(var1.class_(), var2, 11);
   }

   private static <T extends Comparable<T>> xc_3 class_(xc_3 var0, rCZ<T> var1, String var2) {
      return var1.break_(var2).map(var2x -> var0.class_(var1, var2x)).orElse(var0);
   }

   public void class_(Map<xd_3, rdb_3> var1, rdb_3 var2) {
      var1.put(this.catch_(), var2);
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      super.class_(var1, var2, var3, var4);
      this.catch_().class_(var1, var2, var3, var4);
   }

   @Override
   public void class_(rdX_2 var1, rqs_3<rdn_3> var2) {
      if (this.class_(var1)) {
         this.catch_().class_(var1, var2);
      }
   }

   public static boolean class_(rYB var0, rhd_3 var1, rfH_2 var2, rdn_3 var3) {
      rnW_2 var4 = var0.const_();
      if (var4 == null) {
         return false;
      } else {
         rcd_3 var5 = var3.break_("BlockEntityTag");
         if (var5 != null) {
            ryO_2 var6 = var0.class_(var2);
            if (var6 != null) {
               if (!var0.continue_ && var6.ac_() && (var1 == null || !var1.sU())) {
                  return false;
               }

               rcd_3 var7 = var6.class_(new rcd_3());
               rcd_3 var8 = var7.catch_();
               var7.class_(var5);
               var7.break_("x", var2.b_());
               var7.break_("y", var2.c_());
               var7.break_("z", var2.d_());
               if (!var7.equals(var8)) {
                  var6.class_(var0.byte_(var2), var7);
                  var6.break_();
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      ryZ_2 var2 = this.class_(new rxx_3(var1));
      return !var2.class_() && this.super_() ? this.class_(var1.int_(), var1.final_(), var1.package_()).class_() : var2;
   }

   public ryZ_2 class_(rxx_3 var1) {
      if (!var1.break_()) {
         return ryZ_2.FAIL;
      } else {
         rxx_3 var2 = this.break_(var1);
         if (var2 == null) {
            return ryZ_2.FAIL;
         } else {
            xc_3 var3 = this.byte_(var2);
            if (var3 == null) {
               return ryZ_2.FAIL;
            } else if (!this.class_(var2, var3)) {
               return ryZ_2.FAIL;
            } else {
               rfH_2 var4 = var2.class_();
               rYB var5 = var2.int_();
               rhd_3 var6 = var2.final_();
               rdn_3 var7 = var2.volatile_();
               xc_3 var8 = var5.byte_(var4);
               xd_3 var9 = var8.break_();
               if (var9 == var3.break_()) {
                  var8 = this.class_(var4, var5, var7, var8);
                  this.class_(var4, var5, var6, var7, var8);
                  var9.class_(var5, var4, var8, var6, var7);
                  if (var6 instanceof rhN_2) {
                     Oo_1.goto_.class_((rhN_2)var6, var4, var7);
                  }
               }

               zr_3 var10 = var8.package_();
               var5.class_(var6, var4, this.class_(var8), rqL_2.BLOCKS, (var10.class_() + 1.0F) / 2.0F, var10.break_() * 0.8F);
               if (var6 == null || !((rhx_3)var6.implements_[18]).protected_) {
                  var7.catch_(1);
               }

               return ryZ_2.class_(var5.continue_);
            }
         }
      }
   }

   protected rqA_2 class_(xc_3 var1) {
      return var1.package_().throws_();
   }

   private xc_3 class_(rfH_2 var1, rYB var2, rdn_3 var3, xc_3 var4) {
      xc_3 var5 = var4;
      rcd_3 var6 = var3.package_();
      if (var6 != null) {
         rcd_3 var7 = var6.int_("BlockStateTag");
         rCF var8 = var4.break_().new_();

         for (String var10 : var7.protected_()) {
            rCZ var11 = var8.class_(var10);
            if (var11 != null) {
               String var12 = var7.byte_(var10).native_();
               var5 = class_(var5, var11, var12);
            }
         }
      }

      if (var5 != var4) {
         var2.class_(var1, var5, 2);
      }

      return var5;
   }

   protected boolean class_(rfH_2 var1, rYB var2, rhd_3 var3, rdn_3 var4, xc_3 var5) {
      return class_(var2, var3, var1, var4);
   }

   protected boolean break_(rxx_3 var1, xc_3 var2) {
      rhd_3 var3 = var1.final_();
      rjm_3 var4 = var3 == null ? rjm_3.break_() : rjm_3.class_(var3);
      return (!this.throws_() || var2.class_((rRR)var1.int_(), var1.class_())) && var1.int_().class_(var2, var1.class_(), var4);
   }

   public rxx_3 break_(rxx_3 var1) {
      return var1;
   }

   @Override
   public String break_() {
      return this.catch_().volatile_();
   }

   protected boolean throws_() {
      return true;
   }

   public xd_3 catch_() {
      return this.class_;
   }
}
