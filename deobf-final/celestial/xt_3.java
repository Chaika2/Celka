package celestial;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class xt_3 extends JI<rHu_1> implements kd_3 {
   public static final rCc_1 final_ = kE_2.p;
   public static final rCu_1<rCt_1> package_ = rCT.w;
   public static final rCN int_ = rCT.throw_;
   protected static final rjC_2 new_ = xd_3.class_(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final rjC_2 continue_ = xd_3.class_(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final rjC_2 super_ = xd_3.class_(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final rjC_2 this_ = xd_3.class_(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final rjC_2 else_ = xd_3.class_(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final ryX_2<rHu_1, Optional<rXu_1>> synchronized_ = new xw_3();
   private static final ryX_2<rHu_1, Optional<rJZ>> return_ = new xI_2();

   protected xt_3(Jq_1 var1, Supplier<ryW_2<? extends rHu_1>> var2) {
      super(var1, var2);
      this.extends_(this.abstract_.break_().class_(final_, rpr_3.NORTH).class_(package_, rCt_1.SINGLE).class_(int_, Boolean.valueOf(false)));
   }

   private static boolean class_(rRq_1 var0, rfH_2 var1) {
      rfH_2 var2 = var1.final_();
      return var0.byte_(var2).catch_(var0, var2);
   }

   public static boolean class_(rRg_1 var0, rfH_2 var1) {
      return class_((rRq_1)var0, var1) || break_(var0, var1);
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHu_1();
   }

   public static ryX_2<rHu_1, Float2FloatFunction> class_(rHw_1 var0) {
      return new xj_3(var0);
   }

   @Override
   public rJZ class_(xc_3 var1, rYB var2, rfH_2 var3) {
      return this.class_(var1, var2, var3, false).apply(return_).orElse((rJZ)null);
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.ENTITYBLOCK_ANIMATED;
   }

   @Override
   public ryJ_2<? extends rHu_1> class_(xc_3 var1, rYB var2, rfH_2 var3, boolean var4) {
      BiPredicate var5;
      if (var4) {
         var5 = (var0, var1x) -> false;
      } else {
         var5 = xt_3::class_;
      }

      return ryh_3.class_(this.volatile_.get(), xt_3::private_, xt_3::implements_, final_, var1, var2, var3, var5);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(final_, package_, int_);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(final_)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(final_, var2.class_(var1.byte_(final_)));
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.this_()) {
         ryO_2 var6 = var1.class_(var2);
         if (var6 instanceof rHu_1) {
            ((rHu_1)var6).class_(var5.continue_());
         }
      }
   }

   private rpr_3 class_(rxx_3 var1, rpr_3 var2) {
      xc_3 var3 = var1.int_().byte_(var1.class_().break_(var2));
      return var3.class_(this) && var3.byte_(package_) == rCt_1.SINGLE ? var3.byte_(final_) : null;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.byte_(int_)) {
         var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
      }

      if (var3.class_(this) && var2.final_().protected_()) {
         rCt_1 var7 = var3.byte_(package_);
         if (var1.byte_(package_) == rCt_1.SINGLE && var7 != rCt_1.SINGLE && var1.byte_(final_) == var3.byte_(final_) && implements_(var3) == var2.case_()) {
            return var1.class_(package_, var7.break_());
         }
      } else if (implements_(var1) == var2) {
         return var1.class_(package_, rCt_1.SINGLE);
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rCt_1 var2 = rCt_1.SINGLE;
      rpr_3 var3 = var1.case_().case_();
      rXE var4 = var1.int_().break_(var1.class_());
      boolean var5 = var1.catch_();
      rpr_3 var6 = var1.finally_();
      if (var6.final_().protected_() && var5) {
         rpr_3 var7 = this.class_(var1, var6.case_());
         if (var7 != null && var7.final_() != var6.final_()) {
            var3 = var7;
            var2 = var7.private_() == var6.case_() ? rCt_1.RIGHT : rCt_1.LEFT;
         }
      }

      if (var2 == rCt_1.SINGLE && !var5) {
         if (var3 == this.class_(var1, var3.catch_())) {
            var2 = rCt_1.LEFT;
         } else if (var3 == this.class_(var1, var3.private_())) {
            var2 = rCt_1.RIGHT;
         }
      }

      return this.continue_().class_(final_, var3).class_(package_, var2).class_(int_, Boolean.valueOf(var4.class_() == rXG.byte_));
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (var1.byte_(package_) == rCt_1.SINGLE) {
         return else_;
      } else {
         switch (implements_(var1)) {
            case NORTH:
            default:
               return new_;
            case SOUTH:
               return continue_;
            case WEST:
               return super_;
            case EAST:
               return this_;
         }
      }
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         return ryZ_2.SUCCESS;
      } else {
         rJZ var7 = this.class_(var1, var2, var3);
         if (var7 != null) {
            var4.class_(var7);
            var4.class_(this.break_());
            rbW_2.class_(var4, true);
         }

         return ryZ_2.CONSUME;
      }
   }

   public static rXu_1 class_(xt_3 var0, xc_3 var1, rYB var2, rfH_2 var3, boolean var4) {
      return var0.class_(var1, var2, var3, var4).apply(synchronized_).orElse((rXu_1)null);
   }

   protected rCi_1<rqO_2> break_() {
      return rlB_2.implements_.break_(rlB_2.N);
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      return rJr_1.break_(class_(this, var1, var2, var3, false));
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.class_(var4.break_())) {
         ryO_2 var6 = var2.class_(var3);
         if (var6 instanceof rXu_1) {
            rXn_1.class_(var2, var3, (rXu_1)var6);
            var2.byte_(var3, this);
         }

         super.break_(var1, var2, var3, var4, var5);
      }
   }

   private static boolean break_(rRg_1 var0, rfH_2 var1) {
      List var2 = var0.class_(
         rbf_3.class,
         new rfl_3((double)var1.b_(), (double)(var1.c_() + 1), (double)var1.d_(), (double)(var1.b_() + 1), (double)(var1.c_() + 2), (double)(var1.d_() + 1))
      );
      if (!var2.isEmpty()) {
         for (rbf_3 var4 : var2) {
            if (var4.Sc()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return var1.byte_(int_) ? rXG.byte_.class_(false) : super.throws_(var1);
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }

   public static rpr_3 implements_(xc_3 var0) {
      rpr_3 var1 = var0.byte_(final_);
      return var0.byte_(package_) == rCt_1.LEFT ? var1.catch_() : var1.private_();
   }

   public static ryk_3 private_(xc_3 var0) {
      rCt_1 var1 = var0.byte_(package_);
      if (var1 == rCt_1.SINGLE) {
         return ryk_3.SINGLE;
      } else {
         return var1 == rCt_1.RIGHT ? ryk_3.FIRST : ryk_3.SECOND;
      }
   }
}
