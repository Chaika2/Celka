package celestial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class rhI_2 extends rhV_2 implements ai_3 {
   public static final Predicate<iB_2> class_ = iB_2::BU;

   public rhI_2(rYB var1, double var2, double var4, double var6) {
      super(aI_2.V, var2, var4, var6, var1);
   }

   public rhI_2(rYB var1, iB_2 var2) {
      super(aI_2.V, var2, var1);
   }

   public rhI_2(aI_2<? extends rhI_2> var1, rYB var2) {
      super(var1, var2);
   }

   private void class_(rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = ((rYB)this.throws_[7]).byte_(var1);
      if (var3.class_(rls_3.N)) {
         ((rYB)this.throws_[7]).class_(var1, false);
      } else if (xn_3.private_(var3)) {
         ((rYB)this.throws_[7]).class_((rhd_3)null, 1009, var1, 0);
         xn_3.byte_((rYB)this.throws_[7], var1, var3);
         ((rYB)this.throws_[7]).break_(var1, var3.class_(xn_3.final_, Boolean.valueOf(false)));
      }
   }

   private void class_(rdn_3 var1, rLi_1 var2) {
      aZ_2 var3 = new aZ_2((rYB)this.throws_[7], this.rx(), this.re(), this.BO());
      an_3 var4 = this.else_();
      if (var4 instanceof iB_2) {
         var3.class_((iB_2)var4);
      }

      var3.byte_(3.0F);
      var3.protected_(-0.5F);
      var3.byte_(10);
      var3.catch_(-var3.protected_() / (float)var3.private_());
      var3.class_(var2);

      for (rLY var6 : rAB.break_(var1)) {
         var3.class_(new rLY(var6));
      }

      rcd_3 var7 = var1.package_();
      if (var7 != null && var7.byte_("CustomPotionColor", 99)) {
         var3.class_(var7.private_("CustomPotionColor"));
      }

      ((rYB)this.throws_[7]).a_(var3);
   }

   @Override
   protected void class_(rjG_2 var1) {
      super.class_(var1);
      rdn_3 var2 = this.class_();
      rdn_3 var3;
      List var4;
      if (((rYB)this.throws_[7]).continue_) {
         rrFi_1 var5 = rrFi_1.class_(var2, rAB.class_(var2));
         var3 = var5.class_();
         var4 = var5.break_();
      } else {
         var3 = var2;
         var4 = rAB.class_(var2);
      }

      rLi_1 var8 = rAB.protected_(var3);
      boolean var6 = var8 == rAS.break_ && var4.isEmpty();
      if (var6) {
         if (!((rYB)this.throws_[7]).continue_) {
            this.catch_();
         }
      } else if (this.private_()) {
         if (!((rYB)this.throws_[7]).continue_ && !var4.isEmpty()) {
            this.class_(var3, var8);
         }
      } else {
         this.class_(var4, var3, var1.byte_() == rjM_2.ENTITY ? ((rfo_3)var1).class_() : null);
      }

      if (!((rYB)this.throws_[7]).continue_) {
         int var7 = var8.break_() ? 2007 : 2002;
         ((rYB)this.throws_[7]).byte_(var7, this.Bs(), rAB.byte_(var3));
      }

      this.PD();
   }

   @Override
   protected void class_(rff_3 var1) {
      super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         rdn_3 var2 = this.class_();
         rLi_1 var3 = rAB.protected_(var2);
         List var4 = rAB.class_(var2);
         boolean var5 = var3 == rAS.break_ && var4.isEmpty();
         rpr_3 var6 = var1.break_();
         rfH_2 var7 = var1.class_();
         rfH_2 var8 = var7.break_(var6);
         if (var5) {
            this.class_(var8, var6);
            this.class_(var8.break_(var6.case_()), var6);

            for (rpr_3 var10 : rpb_3.HORIZONTAL) {
               this.class_(var8.break_(var10), var10);
            }
         }
      }
   }

   private void class_(List<rLY> var1, rdn_3 var2, an_3 var3) {
      rfl_3 var4 = this.rN().byte_(4.0, 2.0, 4.0);
      List var5 = ((rYB)this.throws_[7]).class_(iB_2.class, var4);
      if (!var5.isEmpty()) {
         Bk_1 var6 = C_throws.byte_().boolean_();
         ArrayList var7 = new ArrayList();
         boolean var8 = var1.isEmpty() && var6.class_();

         for (iB_2 var10 : var5) {
            if (var10.SL()) {
               double var11 = this.int_(var10);
               if (var11 < 16.0) {
                  double var13 = 1.0 - Math.sqrt(var11) / 4.0;
                  if (var10 == var3) {
                     var13 = 1.0;
                  }

                  ArrayList var15 = new ArrayList();

                  for (rLY var17 : var1) {
                     rLR var18 = var17.class_();
                     if (var18.class_()) {
                        if (!((rYB)this.throws_[7]).continue_) {
                           var18.class_(this, this.else_(), var10, var17.byte_(), var13);
                        }
                     } else {
                        int var19 = (int)(var13 * (double)var17.break_() + 0.5);
                        if (var19 > 20) {
                           rLY var20 = new rLY(var18, var19, var17.byte_(), var17.protected_(), var17.throws_());
                           var15.add(var20);
                           if (var10 != (cb_3)QY.instanceof_().class_[57] && var10.BC() == aI_2.rM) {
                              var10.break_(var20);
                           }
                        }
                     }
                  }

                  if (((rYB)this.throws_[7]).continue_) {
                     if (!var8) {
                        if (!var15.isEmpty()) {
                           rrLD.class_(var10, var2, var15, var13);
                        }
                     } else {
                        var7.add(new BN(var10, var13));
                     }
                  }
               }
            }
         }

         if (((rYB)this.throws_[7]).continue_ && var8 && !var7.isEmpty()) {
            var6.class_(var3, this.Ps(), var2, var7);
         }
      }
   }

   @Override
   public float throws_() {
      return 0.05F;
   }

   private void catch_() {
      rfl_3 var1 = this.rN().byte_(4.0, 2.0, 4.0);
      List var2 = ((rYB)this.throws_[7]).class_(iB_2.class, var1, class_);
      if (!var2.isEmpty()) {
         for (iB_2 var4 : var2) {
            double var5 = this.int_(var4);
            if (var5 < 16.0 && var4.BU()) {
               var4.break_(rye_3.byte_(var4, this.else_()), 1.0F);
            }
         }
      }
   }

   @Override
   protected rdb_3 protected_() {
      return rdy_3.kk;
   }

   private boolean private_() {
      return this.class_().break_() == rdy_3.kQ;
   }
}
