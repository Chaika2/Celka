package celestial;

import java.util.Random;
import java.util.stream.IntStream;

public class zG_2 extends xd_3 implements kd_3 {
   public static final rCc_1 volatile_ = kE_2.p;
   public static final rCu_1<rCj_1> final_ = rCT.b;
   public static final rCu_1<rCK> package_ = rCT.R;
   public static final rCN int_ = rCT.throw_;
   protected static final rjC_2 new_ = Wg_1.int_;
   protected static final rjC_2 continue_ = Wg_1.package_;
   protected static final rjC_2 super_ = xd_3.class_(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final rjC_2 this_ = xd_3.class_(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final rjC_2 else_ = xd_3.class_(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final rjC_2 synchronized_ = xd_3.class_(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final rjC_2 return_ = xd_3.class_(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final rjC_2 public_ = xd_3.class_(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final rjC_2 goto_ = xd_3.class_(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final rjC_2 while_ = xd_3.class_(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final rjC_2[] try_ = class_(new_, super_, return_, this_, public_);
   protected static final rjC_2[] instanceof_ = class_(continue_, else_, goto_, synchronized_, while_);
   private static final int[] throw_ = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final xd_3 long_;
   private final xc_3 float_;

   protected zG_2(xc_3 var1, Jq_1 var2) {
      super(var2);
      this.extends_(
         this.abstract_
            .break_()
            .class_(volatile_, rpr_3.NORTH)
            .class_(final_, rCj_1.BOTTOM)
            .class_(package_, rCK.STRAIGHT)
            .class_(int_, Boolean.valueOf(false))
      );
      this.long_ = var1.break_();
      this.float_ = var1;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.byte_(int_)) {
         var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
      }

      return var2.final_().protected_() ? var1.class_(package_, catch_(var1, var4, var5)) : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rpr_3 var2 = var1.finally_();
      rfH_2 var3 = var1.class_();
      rXE var4 = var1.int_().break_(var3);
      xc_3 var5 = this.continue_()
         .class_(volatile_, var1.case_())
         .class_(final_, var2 == rpr_3.DOWN || var2 != rpr_3.UP && var1.extends_().byte_ - (double)var3.c_() > 0.5 ? rCj_1.TOP : rCj_1.BOTTOM)
         .class_(int_, Boolean.valueOf(var4.class_() == rXG.byte_));
      return var5.class_(package_, catch_(var5, var1.int_(), var3));
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, rRW var3) {
      this.long_.class_(var1, var2, var3);
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      return this.float_.class_(var2, var4, var5, var6);
   }

   private static rjC_2[] class_(rjC_2 var0, rjC_2 var1, rjC_2 var2, rjC_2 var3, rjC_2 var4) {
      return IntStream.range(0, 16).mapToObj(var5 -> class_(var5, var0, var1, var2, var3, var4)).toArray(rjC_2[]::new);
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.long_.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_, package_, int_);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      rpr_3 var3 = var1.byte_(volatile_);
      rCK var4 = var1.byte_(package_);
      switch (var2) {
         case LEFT_RIGHT:
            if (var3.final_() == rpB_2.Z) {
               switch (var4) {
                  case INNER_LEFT:
                     return var1.class_(rqd_3.CLOCKWISE_180).class_(package_, rCK.INNER_RIGHT);
                  case INNER_RIGHT:
                     return var1.class_(rqd_3.CLOCKWISE_180).class_(package_, rCK.INNER_LEFT);
                  case OUTER_LEFT:
                     return var1.class_(rqd_3.CLOCKWISE_180).class_(package_, rCK.OUTER_RIGHT);
                  case OUTER_RIGHT:
                     return var1.class_(rqd_3.CLOCKWISE_180).class_(package_, rCK.OUTER_LEFT);
                  default:
                     return var1.class_(rqd_3.CLOCKWISE_180);
               }
            }
            break;
         case FRONT_BACK:
            if (var3.final_() == rpB_2.X) {
               switch (var4) {
                  case INNER_LEFT:
                     return var1.class_(rqd_3.CLOCKWISE_180).class_(package_, rCK.INNER_LEFT);
                  case INNER_RIGHT:
                     return var1.class_(rqd_3.CLOCKWISE_180).class_(package_, rCK.INNER_RIGHT);
                  case OUTER_LEFT:
                     return var1.class_(rqd_3.CLOCKWISE_180).class_(package_, rCK.OUTER_RIGHT);
                  case OUTER_RIGHT:
                     return var1.class_(rqd_3.CLOCKWISE_180).class_(package_, rCK.OUTER_LEFT);
                  case STRAIGHT:
                     return var1.class_(rqd_3.CLOCKWISE_180);
               }
            }
      }

      return super.class_(var1, var2);
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.class_(var1.break_())) {
         this.float_.class_(var2, var3, xu_3.class_, var3, false);
         this.long_.class_(this.float_, var2, var3, var4, false);
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      this.float_.class_(var2, var3, var4);
   }

   @Override
   public void class_(rRg_1 var1, rfH_2 var2, xc_3 var3) {
      super.class_(var1, var2, var3);
      this.long_.class_(var1, var2, var3);
   }

   private static rjC_2 class_(int var0, rjC_2 var1, rjC_2 var2, rjC_2 var3, rjC_2 var4, rjC_2 var5) {
      rjC_2 var6 = var1;
      if ((var0 & 1) != 0) {
         var6 = rjw_3.class_(var1, var2);
      }

      if ((var0 & 2) != 0) {
         var6 = rjw_3.class_(var6, var3);
      }

      if ((var0 & 4) != 0) {
         var6 = rjw_3.class_(var6, var4);
      }

      if ((var0 & 8) != 0) {
         var6 = rjw_3.class_(var6, var5);
      }

      return var6;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return (var1.byte_(final_) == rCj_1.TOP ? try_ : instanceof_)[throw_[this.implements_(var1)]];
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, an_3 var3) {
      this.long_.class_(var1, var2, var3);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      this.long_.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean break_(xc_3 var1) {
      return true;
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.class_(var4.break_())) {
         this.float_.break_(var2, var3, var4, var5);
      }
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.long_.break_(var1, var2, var3, var4);
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return var1.byte_(int_) ? rXG.byte_.class_(false) : super.throws_(var1);
   }

   private static rCK catch_(xc_3 var0, rRq_1 var1, rfH_2 var2) {
      rpr_3 var3 = var0.byte_(volatile_);
      xc_3 var4 = var1.byte_(var2.break_(var3));
      if (private_(var4) && var0.byte_(final_) == var4.byte_(final_)) {
         rpr_3 var5 = var4.byte_(volatile_);
         if (var5.final_() != var0.byte_(volatile_).final_() && protected_(var0, var1, var2, var5.case_())) {
            if (var5 == var3.private_()) {
               return rCK.OUTER_LEFT;
            }

            return rCK.OUTER_RIGHT;
         }
      }

      xc_3 var7 = var1.byte_(var2.break_(var3.case_()));
      if (private_(var7) && var0.byte_(final_) == var7.byte_(final_)) {
         rpr_3 var6 = var7.byte_(volatile_);
         if (var6.final_() != var0.byte_(volatile_).final_() && protected_(var0, var1, var2, var6)) {
            if (var6 == var3.private_()) {
               return rCK.INNER_LEFT;
            }

            return rCK.INNER_RIGHT;
         }
      }

      return rCK.STRAIGHT;
   }

   @Override
   public float extends_() {
      return this.long_.extends_();
   }

   private int implements_(xc_3 var1) {
      return var1.byte_(package_).ordinal() * 4 + var1.byte_(volatile_).protected_();
   }

   private static boolean protected_(xc_3 var0, rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      xc_3 var4 = var1.byte_(var2.break_(var3));
      return !private_(var4) || var4.byte_(volatile_) != var0.byte_(volatile_) || var4.byte_(final_) != var0.byte_(final_);
   }

   public static boolean private_(xc_3 var0) {
      return var0.break_() instanceof zG_2;
   }

   @Override
   public boolean a_(xc_3 var1) {
      return this.long_.a_(var1);
   }
}
