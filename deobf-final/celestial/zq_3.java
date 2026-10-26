package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class zq_3 extends xd_3 {
   public static final rCN volatile_ = Wt_1.new_;
   public static final rCN final_ = Wt_1.volatile_;
   public static final rCN package_ = Wt_1.final_;
   public static final rCN int_ = Wt_1.package_;
   public static final rCN new_ = Wt_1.int_;
   public static final Map<rpr_3, rCN> continue_ = Wt_1.super_.entrySet().stream().filter(var0 -> var0.getKey() != rpr_3.DOWN).collect(rqR_2.class_());
   private static final rjC_2 super_ = xd_3.class_(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final rjC_2 this_ = xd_3.class_(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final rjC_2 else_ = xd_3.class_(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final rjC_2 synchronized_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final rjC_2 return_ = xd_3.class_(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<xc_3, rjC_2> public_;

   public zq_3(Jq_1 var1) {
      super(var1);
      this.extends_(
         this.abstract_
            .break_()
            .class_(volatile_, Boolean.valueOf(false))
            .class_(final_, Boolean.valueOf(false))
            .class_(package_, Boolean.valueOf(false))
            .class_(int_, Boolean.valueOf(false))
            .class_(new_, Boolean.valueOf(false))
      );
      this.public_ = ImmutableMap.copyOf(this.abstract_.class_().stream().collect(Collectors.toMap(Function.identity(), zq_3::private_)));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_, package_, int_, new_);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      xc_3 var2 = var1.int_().byte_(var1.class_());
      boolean var3 = var2.class_(this);
      xc_3 var4 = var3 ? var2 : this.continue_();

      for (rpr_3 var8 : var1.throws_()) {
         if (var8 != rpr_3.DOWN) {
            rCN var9 = class_(var8);
            boolean var10 = var3 && var2.byte_(var9);
            if (!var10 && this.break_(var1.int_(), var1.class_(), var8)) {
               return var4.class_(var9, Boolean.valueOf(true));
            }
         }
      }

      return var3 ? var4 : null;
   }

   @Override
   public boolean class_(xc_3 var1, rxx_3 var2) {
      xc_3 var3 = var2.int_().byte_(var2.class_());
      return var3.class_(this) ? this.volatile_(var3) < continue_.size() : super.class_(var1, var2);
   }

   private boolean class_(rRq_1 var1, rfH_2 var2) {
      byte var3 = 4;
      Iterable var4 = rfH_2.break_(var2.b_() - 4, var2.c_() - 1, var2.d_() - 4, var2.b_() + 4, var2.c_() + 1, var2.d_() + 4);
      int var5 = 5;

      for (rfH_2 var7 : var4) {
         if (var1.byte_(var7).class_(this)) {
            if (--var5 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   private xc_3 class_(xc_3 var1, xc_3 var2, Random var3) {
      for (rpr_3 var5 : rpb_3.HORIZONTAL) {
         if (var3.nextBoolean()) {
            rCN var6 = class_(var5);
            if (var1.byte_(var6)) {
               var2 = var2.class_(var6, Boolean.valueOf(true));
            }
         }
      }

      return var2;
   }

   public static rCN class_(rpr_3 var0) {
      return continue_.get(var0);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      switch (var2) {
         case LEFT_RIGHT:
            return var1.class_(final_, var1.byte_(int_)).class_(int_, var1.byte_(final_));
         case FRONT_BACK:
            return var1.class_(package_, var1.byte_(new_)).class_(new_, var1.byte_(package_));
         default:
            return super.class_(var1, var2);
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            return var1.class_(final_, var1.byte_(int_)).class_(package_, var1.byte_(new_)).class_(int_, var1.byte_(final_)).class_(new_, var1.byte_(package_));
         case COUNTERCLOCKWISE_90:
            return var1.class_(final_, var1.byte_(package_)).class_(package_, var1.byte_(int_)).class_(int_, var1.byte_(new_)).class_(new_, var1.byte_(final_));
         case CLOCKWISE_90:
            return var1.class_(final_, var1.byte_(new_)).class_(package_, var1.byte_(final_)).class_(int_, var1.byte_(package_)).class_(new_, var1.byte_(int_));
         default:
            return var1;
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.public_.get(var1);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      return this.implements_(this.catch_(var1, var2, var3));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 == rpr_3.DOWN) {
         return super.class_(var1, var2, var3, var4, var5, var6);
      } else {
         xc_3 var7 = this.catch_(var1, var4, var5);
         return !this.implements_(var7) ? xu_3.class_.continue_() : var7;
      }
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.int_.nextInt(4) == 0) {
         rpr_3 var5 = rpr_3.class_(var4);
         rfH_2 var6 = var3.final_();
         if (var5.final_().protected_() && !var1.byte_(class_(var5))) {
            if (this.class_(var2, var3)) {
               rfH_2 var17 = var3.break_(var5);
               xc_3 var19 = var2.byte_(var17);
               if (var19.catch_()) {
                  rpr_3 var21 = var5.catch_();
                  rpr_3 var22 = var5.private_();
                  boolean var11 = var1.byte_(class_(var21));
                  boolean var12 = var1.byte_(class_(var22));
                  rfH_2 var13 = var17.break_(var21);
                  rfH_2 var14 = var17.break_(var22);
                  if (var11 && class_(var2, var13, var21)) {
                     var2.class_(var17, this.continue_().class_(class_(var21), Boolean.valueOf(true)), 2);
                  } else if (var12 && class_(var2, var14, var22)) {
                     var2.class_(var17, this.continue_().class_(class_(var22), Boolean.valueOf(true)), 2);
                  } else {
                     rpr_3 var15 = var5.case_();
                     if (var11 && var2.finally_(var13) && class_(var2, var3.break_(var21), var15)) {
                        var2.class_(var13, this.continue_().class_(class_(var15), Boolean.valueOf(true)), 2);
                     } else if (var12 && var2.finally_(var14) && class_(var2, var3.break_(var22), var15)) {
                        var2.class_(var14, this.continue_().class_(class_(var15), Boolean.valueOf(true)), 2);
                     } else if ((double)var2.int_.nextFloat() < 0.05 && class_(var2, var17.final_(), rpr_3.UP)) {
                        var2.class_(var17, this.continue_().class_(volatile_, Boolean.valueOf(true)), 2);
                     }
                  }
               } else if (class_(var2, var17, var5)) {
                  var2.class_(var3, var1.class_(class_(var5), Boolean.valueOf(true)), 2);
               }
            }
         } else {
            if (var5 == rpr_3.UP && var3.c_() < 255) {
               if (this.break_(var2, var3, var5)) {
                  var2.class_(var3, var1.class_(volatile_, Boolean.valueOf(true)), 2);
                  return;
               }

               if (var2.finally_(var6)) {
                  if (!this.class_(var2, var3)) {
                     return;
                  }

                  xc_3 var16 = var1;

                  for (rpr_3 var20 : rpb_3.HORIZONTAL) {
                     if (var4.nextBoolean() || !class_(var2, var6.break_(var20), rpr_3.UP)) {
                        var16 = var16.class_(class_(var20), Boolean.valueOf(false));
                     }
                  }

                  if (this.final_(var16)) {
                     var2.class_(var6, var16, 2);
                  }

                  return;
               }
            }

            if (var3.c_() > 0) {
               rfH_2 var7 = var3.break_();
               xc_3 var8 = var2.byte_(var7);
               if (var8.catch_() || var8.class_(this)) {
                  xc_3 var9 = var8.catch_() ? this.continue_() : var8;
                  xc_3 var10 = this.class_(var1, var9, var4);
                  if (var9 != var10 && this.final_(var10)) {
                     var2.class_(var7, var10, 2);
                  }
               }
            }
         }
      }
   }

   public static boolean class_(rRq_1 var0, rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = var0.byte_(var1);
      return xd_3.class_(var3.extends_(var0, var1), var2.case_());
   }

   private boolean break_(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      if (var3 == rpr_3.DOWN) {
         return false;
      } else {
         rfH_2 var4 = var2.break_(var3);
         if (class_(var1, var4, var3)) {
            return true;
         } else if (var3.final_() == rpB_2.Y) {
            return false;
         } else {
            rCN var5 = continue_.get(var3);
            xc_3 var6 = var1.byte_(var2.final_());
            return var6.class_(this) && var6.byte_(var5);
         }
      }
   }

   private xc_3 catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      rfH_2 var4 = var3.final_();
      if (var1.byte_(volatile_)) {
         var1 = var1.class_(volatile_, Boolean.valueOf(class_(var2, var4, rpr_3.DOWN)));
      }

      xc_3 var5 = null;

      for (rpr_3 var7 : rpb_3.HORIZONTAL) {
         rCN var8 = class_(var7);
         if (var1.byte_(var8)) {
            boolean var9 = this.break_(var2, var3, var7);
            if (!var9) {
               if (var5 == null) {
                  var5 = var2.byte_(var4);
               }

               var9 = var5.class_(this) && var5.byte_(var8);
            }

            var1 = var1.class_(var8, Boolean.valueOf(var9));
         }
      }

      return var1;
   }

   private boolean implements_(xc_3 var1) {
      return this.volatile_(var1) > 0;
   }

   private static rjC_2 private_(xc_3 var0) {
      rjC_2 var1 = rjw_3.class_();
      if (var0.byte_(volatile_)) {
         var1 = super_;
      }

      if (var0.byte_(final_)) {
         var1 = rjw_3.class_(var1, synchronized_);
      }

      if (var0.byte_(int_)) {
         var1 = rjw_3.class_(var1, return_);
      }

      if (var0.byte_(package_)) {
         var1 = rjw_3.class_(var1, else_);
      }

      if (var0.byte_(new_)) {
         var1 = rjw_3.class_(var1, this_);
      }

      return var1;
   }

   private boolean final_(xc_3 var1) {
      return var1.byte_(final_) || var1.byte_(package_) || var1.byte_(int_) || var1.byte_(new_);
   }

   private int volatile_(xc_3 var1) {
      int var2 = 0;

      for (rCN var4 : continue_.values()) {
         if (var1.byte_(var4)) {
            var2++;
         }
      }

      return var2;
   }
}
