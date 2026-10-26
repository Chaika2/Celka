package celestial;

import java.util.Iterator;
import java.util.List;

public class rHa_1 extends ryO_2 implements rHf_1 {
   private xc_3 class_;
   private rpr_3 break_;
   private boolean byte_;
   private boolean protected_;
   private static final ThreadLocal<rpr_3> throws_ = ThreadLocal.withInitial(() -> null);
   private float case_;
   private float catch_;
   private long private_;
   private int implements_;

   public float byte_(float var1) {
      return (float)this.break_.finally_() * this.throws_(this.class_(var1));
   }

   public rHa_1() {
      super(ryW_2.finally_);
   }

   public rHa_1(xc_3 var1, rpr_3 var2, boolean var3, boolean var4) {
      this();
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   private void class_(an_3 var1, rpr_3 var2, double var3) {
      rfl_3 var5 = var1.rN();
      rfl_3 var6 = rjw_3.break_().class_().class_(this.native_);
      if (var5.byte_(var6)) {
         rpr_3 var7 = var2.case_();
         double var8 = class_(var6, var7, var5) + 0.01;
         double var10 = class_(var6, var7, var5.class_(var6)) + 0.01;
         if (Math.abs(var8 - var10) < 0.01) {
            var8 = Math.min(var8, var3) + 0.01;
            class_(var2, var1, var8, var7);
         }
      }
   }

   private rfl_3 class_(rfl_3 var1) {
      double var2 = (double)this.throws_(this.case_);
      return var1.protected_(
         (double)this.native_.b_() + var2 * (double)this.break_.implements_(),
         (double)this.native_.c_() + var2 * (double)this.break_.finally_(),
         (double)this.native_.d_() + var2 * (double)this.break_.extends_()
      );
   }

   public rjC_2 class_(rRq_1 var1, rfH_2 var2) {
      rjC_2 var3;
      if (!this.byte_ && this.protected_) {
         var3 = this.class_.class_(kD_2.final_, Boolean.valueOf(true)).extends_(var1, var2);
      } else {
         var3 = rjw_3.class_();
      }

      rpr_3 var4 = throws_.get();
      if ((double)this.case_ < 1.0 && var4 == this.extends_()) {
         return var3;
      } else {
         xc_3 var5;
         if (this.finally_()) {
            var5 = xu_3.rS.continue_().class_(ka_3.volatile_, this.break_).class_(ka_3.package_, Boolean.valueOf(this.byte_ != 1.0F - this.case_ < 0.25F));
         } else {
            var5 = this.class_;
         }

         float var6 = this.throws_(this.case_);
         double var7 = (double)((float)this.break_.implements_() * var6);
         double var9 = (double)((float)this.break_.finally_() * var6);
         double var11 = (double)((float)this.break_.extends_() * var6);
         return rjw_3.class_(var3, var5.extends_(var1, var2).class_(var7, var9, var11));
      }
   }

   private static void class_(rpr_3 var0, an_3 var1, double var2, rpr_3 var4) {
      throws_.set(var0);
      var1.class_(iG_2.PISTON, new rjU_2(var2 * (double)var4.implements_(), var2 * (double)var4.finally_(), var2 * (double)var4.extends_()));
      throws_.set((rpr_3)null);
   }

   private static boolean class_(rfl_3 var0, an_3 var1) {
      return var1.r_() == Qs_1.NORMAL
         && var1.BL()
         && var1.rx() >= var0.class_
         && var1.rx() <= var0.protected_
         && var1.BO() >= var0.byte_
         && var1.BO() <= var0.case_;
   }

   private static double class_(rfl_3 var0, rpr_3 var1, rfl_3 var2) {
      switch (var1) {
         case EAST:
            return var0.protected_ - var2.class_;
         case WEST:
            return var2.protected_ - var0.class_;
         case UP:
         default:
            return var0.throws_ - var2.break_;
         case DOWN:
            return var2.throws_ - var0.break_;
         case SOUTH:
            return var0.case_ - var2.byte_;
         case NORTH:
            return var2.case_ - var0.byte_;
      }
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.class_ = rco_3.byte_(var2.int_("blockState"));
      this.break_ = rpr_3.class_(var2.private_("facing"));
      this.case_ = var2.finally_("progress");
      this.catch_ = this.case_;
      this.byte_ = var2.new_("extending");
      this.protected_ = var2.new_("source");
   }

   public float class_(float var1) {
      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      return rfU_2.catch_(var1, this.catch_, this.case_);
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("blockState", rco_3.class_(this.class_));
      var1.break_("facing", this.break_.byte_());
      var1.class_("progress", this.catch_);
      var1.class_("extending", this.byte_);
      var1.class_("source", this.protected_);
      return var1;
   }

   public float break_(float var1) {
      return (float)this.break_.implements_() * this.throws_(this.class_(var1));
   }

   private float throws_(float var1) {
      return this.byte_ ? var1 - 1.0F : 1.0F - var1;
   }

   @Override
   public void throws_() {
      this.private_ = this.extends_.r();
      this.catch_ = this.case_;
      if (this.catch_ >= 1.0F) {
         if (this.extends_.continue_ && this.implements_ < 5) {
            this.implements_++;
         } else {
            this.extends_.else_(this.native_);
            this.aa_();
            if (this.class_ != null && this.extends_.byte_(this.native_).class_(xu_3.rc)) {
               xc_3 var1 = xd_3.break_(this.class_, this.extends_, this.native_);
               if (var1.catch_()) {
                  this.extends_.class_(this.native_, this.class_, 84);
                  xd_3.class_(this.class_, var1, this.extends_, this.native_, 3);
               } else {
                  if (var1.break_(rCT.throw_) && var1.byte_(rCT.throw_)) {
                     var1 = var1.class_(rCT.throw_, Boolean.valueOf(false));
                  }

                  this.extends_.class_(this.native_, var1, 67);
                  this.extends_.class_(this.native_, var1.break_(), this.native_);
               }
            }
         }
      } else {
         float var2 = this.case_ + 0.5F;
         this.case_(var2);
         this.catch_(var2);
         this.case_ = var2;
         if (this.case_ >= 1.0F) {
            this.case_ = 1.0F;
         }
      }
   }

   public boolean finally_() {
      return this.protected_;
   }

   public boolean catch_() {
      return this.byte_;
   }

   private void catch_(float var1) {
      if (this.new_()) {
         rpr_3 var2 = this.extends_();
         if (var2.final_().protected_()) {
            double var3 = this.class_.extends_(this.extends_, this.native_).byte_(rpB_2.Y);
            rfl_3 var5 = this.class_(new rfl_3(0.0, var3, 0.0, 1.0, 1.5000000999999998, 1.0));
            double var6 = (double)(var1 - this.case_);

            for (an_3 var9 : this.extends_.break_((an_3)null, var5, var1x -> class_(var5, var1x))) {
               class_(var2, var9, var6, var2);
            }
         }
      }
   }

   public rpr_3 extends_() {
      return this.byte_ ? this.break_ : this.break_.case_();
   }

   private void case_(float var1) {
      rpr_3 var2 = this.extends_();
      double var3 = (double)(var1 - this.case_);
      rjC_2 var5 = this.package_().extends_(this.extends_, this.char_());
      if (!var5.break_()) {
         rfl_3 var6 = this.class_(var5.class_());
         List var7 = this.extends_.class_((an_3)null, ryc_3.class_(var6, var2, var3).break_(var6));
         if (!var7.isEmpty()) {
            List var8 = var5.protected_();
            boolean var9 = this.class_.class_(xu_3.EN);
            Iterator var10 = var7.iterator();

            while (true) {
               an_3 var11;
               while (true) {
                  if (!var10.hasNext()) {
                     return;
                  }

                  var11 = (an_3)var10.next();
                  if (var11.r_() != Qs_1.IGNORE) {
                     if (!var9) {
                        break;
                     }

                     if (!(var11 instanceof rhN_2)) {
                        rjU_2 var12 = var11.rv();
                        double var13 = var12.break_;
                        double var15 = var12.byte_;
                        double var17 = var12.protected_;
                        switch (var2.final_()) {
                           case X:
                              var13 = (double)var2.implements_();
                              break;
                           case Y:
                              var15 = (double)var2.finally_();
                              break;
                           case Z:
                              var17 = (double)var2.extends_();
                        }

                        var11.catch_(var13, var15, var17);
                        break;
                     }
                  }
               }

               double var19 = 0.0;

               for (rfl_3 var21 : var8) {
                  rfl_3 var16 = ryc_3.class_(this.class_(var21), var2, var3);
                  rfl_3 var22 = var11.rN();
                  if (var16.byte_(var22)) {
                     var19 = Math.max(var19, class_(var16, var2, var22));
                     if (var19 >= var3) {
                        break;
                     }
                  }
               }

               if (!(var19 <= 0.0)) {
                  var19 = Math.min(var19, var3) + 0.01;
                  class_(var2, var11, var19, var2);
                  if (!this.byte_ && this.protected_) {
                     this.class_(var11, var2, var3);
                  }
               }
            }
         }
      }
   }

   @Override
   public double implements_() {
      return 68.0;
   }

   private boolean new_() {
      return this.class_.class_(xu_3.Jh);
   }

   private xc_3 package_() {
      return !this.catch_() && this.finally_() && this.class_.break_() instanceof kD_2
         ? xu_3.rS
            .continue_()
            .class_(ka_3.package_, Boolean.valueOf(this.case_ > 0.25F))
            .class_(ka_3.final_, this.class_.class_(xu_3.D) ? rCg_1.STICKY : rCg_1.DEFAULT)
            .class_(ka_3.volatile_, this.class_.byte_(kD_2.volatile_))
         : this.class_;
   }

   public float protected_(float var1) {
      return (float)this.break_.extends_() * this.throws_(this.class_(var1));
   }

   public rpr_3 private_() {
      return this.break_;
   }

   public long final_() {
      return this.private_;
   }

   public void volatile_() {
      if (this.extends_ != null && (this.catch_ < 1.0F || this.extends_.continue_)) {
         this.case_ = 1.0F;
         this.catch_ = this.case_;
         this.extends_.else_(this.native_);
         this.aa_();
         if (this.extends_.byte_(this.native_).class_(xu_3.rc)) {
            xc_3 var1;
            if (this.protected_) {
               var1 = xu_3.class_.continue_();
            } else {
               var1 = xd_3.break_(this.class_, this.extends_, this.native_);
            }

            this.extends_.class_(this.native_, var1, 3);
            this.extends_.class_(this.native_, var1.break_(), this.native_);
         }
      }
   }

   public xc_3 native_() {
      return this.class_;
   }

   @Override
   public rcd_3 Z_() {
      return this.class_(new rcd_3());
   }
}
