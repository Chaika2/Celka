package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class rHx_1 extends ryO_2 implements rHf_1 {
   private final List<rHd_1> class_ = Lists.newArrayList();
   private rfH_2 break_ = null;

   public rHx_1() {
      super(ryW_2.long_);
   }

   private boolean class_(xc_3 var1, rHd_1 var2, List<an_3> var3, rHk_1 var4) {
      if ((this.extends_.boolean_() || this.extends_.s()) && var4 != rHk_1.EMERGENCY) {
         return false;
      } else {
         rfH_2 var5 = this.char_();
         rcd_3 var6 = var2.class_;
         var6.continue_("Passengers");
         var6.continue_("Leash");
         var6.continue_("UUID");
         rpr_3 var7 = var1.byte_(xO_2.volatile_);
         rfH_2 var8 = var5.break_(var7);
         boolean var9 = !this.extends_.byte_(var8).extends_(this.extends_, var8).break_();
         if (var9 && var4 != rHk_1.EMERGENCY) {
            return false;
         } else {
            an_3 var10 = aI_2.class_(var6, this.extends_, var0 -> var0);
            if (var10 != null) {
               if (!var10.BC().class_(rlE_2.protected_)) {
                  return false;
               } else {
                  if (var10 instanceof rbF_2 var11) {
                     if (this.final_() && !var11.n() && this.extends_.int_.nextFloat() < 0.9F) {
                        var11.implements_(this.break_);
                     }

                     if (var4 == rHk_1.HONEY_DELIVERED) {
                        var11.sZ();
                        if (var1.break_().class_(rls_3.k)) {
                           int var12 = class_(var1);
                           if (var12 < 5) {
                              int var13 = this.extends_.int_.nextInt(100) == 0 ? 2 : 1;
                              if (var12 + var13 > 5) {
                                 var13--;
                              }

                              this.extends_.break_(this.char_(), var1.class_(xO_2.final_, Integer.valueOf(var12 + var13)));
                           }
                        }
                     }

                     this.class_(var2.break_, var11);
                     if (var3 != null) {
                        var3.add(var11);
                     }

                     float var21 = var10.PN();
                     double var22 = var9 ? 0.0 : 0.55 + (double)(var21 / 2.0F);
                     double var15 = (double)var5.b_() + 0.5 + var22 * (double)var7.implements_();
                     double var17 = (double)var5.c_() + 0.5 - (double)(var10.Bm() / 2.0F);
                     double var19 = (double)var5.d_() + 0.5 + var22 * (double)var7.extends_();
                     var10.class_(var15, var17, var19, (Float)var10.throws_[15], (Float)var10.throws_[16]);
                  }

                  this.extends_.class_((rhd_3)null, var5, rqn_3.I, rqL_2.BLOCKS, 1.0F, 1.0F);
                  return this.extends_.a_(var10);
               }
            } else {
               return false;
            }
         }
      }
   }

   public void class_(an_3 var1, boolean var2, int var3) {
      if (this.class_.size() < 3) {
         var1.BH();
         var1.Bn();
         rcd_3 var4 = new rcd_3();
         var1.byte_(var4);
         this.class_.add(new rHd_1(var4, var3, var2 ? 2400 : 600));
         if (this.extends_ != null) {
            if (var1 instanceof rbF_2 var5 && var5.n() && (!this.final_() || this.extends_.int_.nextBoolean())) {
               this.break_ = var5.L();
            }

            rfH_2 var6 = this.char_();
            this.extends_.class_((rhd_3)null, (double)var6.b_(), (double)var6.c_(), (double)var6.d_(), rqn_3.w, rqL_2.BLOCKS, 1.0F, 1.0F);
         }

         var1.PD();
      }
   }

   public static int class_(xc_3 var0) {
      return var0.byte_(xO_2.final_);
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Bees", this.volatile_());
      if (this.final_()) {
         var1.class_("FlowerPos", rco_3.class_(this.break_));
      }

      return var1;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.class_.clear();
      rcy_3 var3 = var2.protected_("Bees", 10);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         rcd_3 var5 = var3.class_(var4);
         rHd_1 var6 = new rHd_1(var5.int_("EntityData"), var5.private_("TicksInHive"), var5.private_("MinOccupationTicks"));
         this.class_.add(var6);
      }

      this.break_ = null;
      if (var2.throws_("FlowerPos")) {
         this.break_ = rco_3.break_(var2.int_("FlowerPos"));
      }
   }

   private void class_(int var1, rbF_2 var2) {
      int var3 = var2.O_();
      if (var3 < 0) {
         var2.e_(Math.min(0, var3 + var1));
      } else if (var3 > 0) {
         var2.e_(Math.max(0, var3 - var1));
      }

      var2.this_(Math.max(0, var2.sW() - var1));
      var2.sJ();
   }

   private List<an_3> class_(xc_3 var1, rHk_1 var2) {
      ArrayList var3 = Lists.newArrayList();
      this.class_.removeIf(var4 -> this.class_(var1, var4, var3, var2));
      return var3;
   }

   public void class_(an_3 var1, boolean var2) {
      this.class_(var1, var2, 0);
   }

   public boolean class_() {
      if (this.extends_ == null) {
         return false;
      } else {
         for (rfH_2 var2 : rfH_2.class_(this.native_.break_(-1, -1, -1), this.native_.break_(1, 1, 1))) {
            if (this.extends_.byte_(var2).break_() instanceof dt_3) {
               return true;
            }
         }

         return false;
      }
   }

   public void class_(rhd_3 var1, xc_3 var2, rHk_1 var3) {
      List var4 = this.class_(var2, var3);
      if (var1 != null) {
         for (an_3 var6 : var4) {
            if (var6 instanceof rbF_2) {
               rbF_2 var7 = (rbF_2)var6;
               if (var1.Ps().implements_(var6.Ps()) <= 16.0) {
                  if (!this.extends_()) {
                     var7.byte_(var1);
                  } else {
                     var7.else_(400);
                  }
               }
            }
         }
      }
   }

   @Override
   public void break_() {
      if (this.class_()) {
         this.class_((rhd_3)null, this.extends_.byte_(this.char_()), rHk_1.EMERGENCY);
      }

      super.break_();
   }

   @Override
   public void throws_() {
      if (!this.extends_.continue_) {
         this.package_();
         rfH_2 var1 = this.char_();
         if (this.class_.size() > 0 && this.extends_.long_().nextDouble() < 0.005) {
            double var2 = (double)var1.b_() + 0.5;
            double var4 = (double)var1.c_();
            double var6 = (double)var1.d_() + 0.5;
            this.extends_.class_((rhd_3)null, var2, var4, var6, rqn_3.j, rqL_2.BLOCKS, 1.0F, 1.0F);
         }

         this.native_();
      }
   }

   public int finally_() {
      return this.class_.size();
   }

   public boolean catch_() {
      return this.class_.isEmpty();
   }

   public boolean extends_() {
      return xn_3.class_(this.extends_, this.char_());
   }

   private void package_() {
      Iterator var1 = this.class_.iterator();
      xc_3 var3 = this.abstract_();

      while (var1.hasNext()) {
         rHd_1 var2 = (rHd_1)var1.next();
         if (var2.break_ > var2.byte_) {
            rHk_1 var4 = var2.class_.new_("HasNectar") ? rHk_1.HONEY_DELIVERED : rHk_1.BEE_RELEASED;
            if (this.class_(var3, var2, (List<an_3>)null, var4)) {
               var1.remove();
            }
         }

         var2.break_++;
      }
   }

   public boolean private_() {
      return this.class_.size() == 3;
   }

   private boolean final_() {
      return this.break_ != null;
   }

   public rcy_3 volatile_() {
      rcy_3 var1 = new rcy_3();

      for (rHd_1 var3 : this.class_) {
         var3.class_.continue_("UUID");
         rcd_3 var4 = new rcd_3();
         var4.class_("EntityData", var3.class_);
         var4.break_("TicksInHive", var3.break_);
         var4.break_("MinOccupationTicks", var3.byte_);
         var1.add(var4);
      }

      return var1;
   }

   protected void native_() {
      ruP_2.class_(this);
   }
}
