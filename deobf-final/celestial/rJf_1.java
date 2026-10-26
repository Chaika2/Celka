package celestial;

import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rJf_1 extends rXy_1 {
   private static final Logger catch_ = LogManager.getLogger();
   private int private_;
   private String implements_;
   private final rpj_3 finally_ = rpj_3.class_();

   public rJf_1(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.class_);
   }

   public rJf_1(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.private_, var1, var2, var3);
      this.class_(this.finally_);
   }

   @Override
   public void class_() {
      rdn_3 var1 = this.break_.extends_(0);
      this.finally_.class_(1);
      int var2 = 0;
      int var3 = 0;
      byte var4 = 0;
      if (var1.class_()) {
         this.class_.break_(0, rdn_3.break_);
         this.finally_.class_(0);
      } else {
         rdn_3 var5 = var1.implements_();
         rdn_3 var6 = this.break_.extends_(1);
         Map var7 = eA_2.class_(var5);
         var3 = var3 + var1.instanceof_() + (var6.class_() ? 0 : var6.instanceof_());
         this.private_ = 0;
         if (!var6.class_()) {
            boolean var8 = var6.break_() == rdy_3.dm && !rxy_3.protected_(var6).isEmpty();
            if (var5.throws_() && var5.break_().class_(var1, var6)) {
               int var22 = Math.min(var5.catch_(), var5.private_() / 4);
               if (var22 <= 0) {
                  this.class_.break_(0, rdn_3.break_);
                  this.finally_.class_(0);
                  return;
               }

               int var24;
               for (var24 = 0; var22 > 0 && var24 < var6.char_(); var24++) {
                  int var26 = var5.catch_() - var22;
                  var5.break_(var26);
                  var2++;
                  var22 = Math.min(var5.catch_(), var5.private_() / 4);
               }

               this.private_ = var24;
            } else {
               if (!var8 && (var5.break_() != var6.break_() || !var5.throws_())) {
                  this.class_.break_(0, rdn_3.break_);
                  this.finally_.class_(0);
                  return;
               }

               if (var5.throws_() && !var8) {
                  int var9 = var1.private_() - var1.catch_();
                  int var10 = var6.private_() - var6.catch_();
                  int var11 = var10 + var5.private_() * 12 / 100;
                  int var12 = var9 + var11;
                  int var13 = var5.private_() - var12;
                  if (var13 < 0) {
                     var13 = 0;
                  }

                  if (var13 < var5.catch_()) {
                     var5.break_(var13);
                     var2 += 2;
                  }
               }

               Map var21 = eA_2.class_(var6);
               boolean var23 = false;
               boolean var25 = false;

               for (ev_3 var28 : var21.keySet()) {
                  if (var28 != null) {
                     int var14 = var7.getOrDefault(var28, 0);
                     int var15 = (Integer)var21.get(var28);
                     var15 = var14 == var15 ? var15 + 1 : Math.max(var15, var14);
                     boolean var16 = var28.class_(var1);
                     if (((rhx_3)this.protected_.implements_[18]).protected_ || var1.break_() == rdy_3.dm) {
                        var16 = true;
                     }

                     for (ev_3 var18 : var7.keySet()) {
                        if (var18 != var28 && !var28.break_(var18)) {
                           var16 = false;
                           var2++;
                        }
                     }

                     if (!var16) {
                        var25 = true;
                     } else {
                        var23 = true;
                        if (var15 > var28.class_()) {
                           var15 = var28.class_();
                        }

                        var7.put(var28, var15);
                        int var30 = 0;
                        switch (var28.protected_()) {
                           case COMMON:
                              var30 = 1;
                              break;
                           case UNCOMMON:
                              var30 = 2;
                              break;
                           case RARE:
                              var30 = 4;
                              break;
                           case VERY_RARE:
                              var30 = 8;
                        }

                        if (var8) {
                           var30 = Math.max(1, var30 / 2);
                        }

                        var2 += var30 * var15;
                        if (var1.char_() > 1) {
                           var2 = 40;
                        }
                     }
                  }
               }

               if (var25 && !var23) {
                  this.class_.break_(0, rdn_3.break_);
                  this.finally_.class_(0);
                  return;
               }
            }
         }

         if (StringUtils.isBlank(this.implements_)) {
            if (var1.this_()) {
               var4 = 1;
               var2 += var4;
               var5.super_();
            }
         } else if (!this.implements_.equals(var1.continue_().getString())) {
            var4 = 1;
            var2 += var4;
            var5.class_(new rgN_2(this.implements_));
         }

         this.finally_.class_(var3 + var2);
         if (var2 <= 0) {
            var5 = rdn_3.break_;
         }

         if (var4 == var2 && var4 > 0 && this.finally_.break_() >= 40) {
            this.finally_.class_(39);
         }

         if (this.finally_.break_() >= 40 && !((rhx_3)this.protected_.implements_[18]).protected_) {
            var5 = rdn_3.break_;
         }

         if (!var5.class_()) {
            int var20 = var5.instanceof_();
            if (!var6.class_() && var20 < var6.instanceof_()) {
               var20 = var6.instanceof_();
            }

            if (var4 != var2 || var4 == 0) {
               var20 = protected_(var20);
            }

            var5.byte_(var20);
            eA_2.class_(var7, var5);
         }

         this.class_.break_(0, var5);
         this.native_();
      }
   }

   public void class_(String var1) {
      this.implements_ = var1;
      if (this.class_(2).break_()) {
         rdn_3 var2 = this.class_(2).class_();
         if (StringUtils.isBlank(var1)) {
            var2.super_();
         } else {
            var2.class_(new rgN_2(this.implements_));
         }
      }

      this.class_();
   }

   @Override
   protected boolean class_(rhd_3 var1, boolean var2) {
      return (((rhx_3)var1.implements_[18]).protected_ || (Integer)var1.implements_[19] >= this.finally_.break_()) && this.finally_.break_() > 0;
   }

   @Override
   protected boolean class_(xc_3 var1) {
      return var1.class_(rls_3.long_);
   }

   @Override
   protected rdn_3 class_(rhd_3 var1, rdn_3 var2) {
      if (!((rhx_3)var1.implements_[18]).protected_) {
         var1.super_(-this.finally_.break_());
      }

      this.break_.break_(0, rdn_3.break_);
      if (this.private_ > 0) {
         rdn_3 var3 = this.break_.extends_(1);
         if (!var3.class_() && var3.char_() > this.private_) {
            var3.catch_(this.private_);
            this.break_.break_(1, var3);
         } else {
            this.break_.break_(1, rdn_3.break_);
         }
      } else {
         this.break_.break_(1, rdn_3.break_);
      }

      this.finally_.class_(0);
      this.byte_.class_((var1x, var2x) -> {
         xc_3 var3x = var1x.byte_(var2x);
         if (!((rhx_3)var1.implements_[18]).protected_ && var3x.class_(rls_3.long_) && var1.Sa().nextFloat() < 0.12F) {
            xc_3 var4 = Ji_1.private_(var3x);
            if (var4 == null) {
               var1x.class_(var2x, false);
               var1x.byte_(1029, var2x, 0);
            } else {
               var1x.class_(var2x, var4, 2);
               var1x.byte_(1030, var2x, 0);
            }
         } else {
            var1x.byte_(1030, var2x, 0);
         }
      });
      return var2;
   }

   public int break_() {
      return this.finally_.break_();
   }

   public static int protected_(int var0) {
      return var0 * 2 + 1;
   }
}
