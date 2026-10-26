package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class rhg_3 extends rhf_3 {
   private an_3 class_;
   private rpr_3 break_;
   private int protected_;
   private double catch_;
   private double private_;
   private double implements_;
   private UUID finally_;

   public rhg_3(rYB var1, iB_2 var2, an_3 var3, rpB_2 var4) {
      this(aI_2.F, var1);
      this.break_(var2);
      rfH_2 var5 = var2.Bs();
      double var6 = (double)var5.b_() + 0.5;
      double var8 = (double)var5.c_() + 0.5;
      double var10 = (double)var5.d_() + 0.5;
      this.class_(var6, var8, var10, (Float)this.throws_[15], (Float)this.throws_[16]);
      this.class_ = var3;
      this.break_ = rpr_3.UP;
      this.class_(var4);
   }

   public rhg_3(rYB var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(aI_2.F, var1);
      this.class_(var2, var4, var6, (Float)this.throws_[15], (Float)this.throws_[16]);
      this.catch_(var8, var10, var12);
   }

   public rhg_3(aI_2<? extends rhg_3> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.throws_[38] = var7;
   }

   @Override
   public void this_() {
      super.this_();
      if (!((rYB)this.throws_[7]).continue_) {
         if (this.class_ == null && this.finally_ != null) {
            this.class_ = ((rrEm_1)((rYB)this.throws_[7])).break_(this.finally_);
            if (this.class_ == null) {
               this.finally_ = null;
            }
         }

         if (this.class_ == null || !this.class_.BM() || this.class_ instanceof rhd_3 && ((rhd_3)this.class_).native_()) {
            if (!this.rw()) {
               this.byte_(this.rv().break_(0.0, -0.04, 0.0));
            }
         } else {
            this.catch_ = rfU_2.class_(this.catch_ * 1.025, -1.0, 1.0);
            this.private_ = rfU_2.class_(this.private_ * 1.025, -1.0, 1.0);
            this.implements_ = rfU_2.class_(this.implements_ * 1.025, -1.0, 1.0);
            rjU_2 var1 = this.rv();
            this.byte_(var1.break_((this.catch_ - var1.break_) * 0.2, (this.private_ - var1.byte_) * 0.2, (this.implements_ - var1.protected_) * 0.2));
         }

         rjG_2 var5 = rhj_3.class_(this, this::class_);
         if (var5.byte_() != rjM_2.MISS) {
            this.class_(var5);
         }
      }

      this.Px();
      rjU_2 var6 = this.rv();
      this.new_(this.rx() + var6.break_, this.re() + var6.byte_, this.BO() + var6.protected_);
      rhj_3.class_(this, 0.5F);
      if (((rYB)this.throws_[7]).continue_) {
         ((rYB)this.throws_[7]).class_(rLQ.this_, this.rx() - var6.break_, this.re() - var6.byte_ + 0.15, this.BO() - var6.protected_, 0.0, 0.0, 0.0);
      } else if (this.class_ != null && !(Boolean)this.class_.throws_[27]) {
         if (this.protected_ > 0) {
            this.protected_--;
            if (this.protected_ == 0) {
               this.class_(this.break_ == null ? null : this.break_.final_());
            }
         }

         if (this.break_ != null) {
            rfH_2 var2 = this.Bs();
            rpB_2 var3 = this.break_.final_();
            if (((rYB)this.throws_[7]).class_(var2.break_(this.break_), this)) {
               this.class_(var3);
            } else {
               rfH_2 var4 = this.class_.Bs();
               if (var3 == rpB_2.X && var2.b_() == var4.b_() || var3 == rpB_2.Z && var2.d_() == var4.d_() || var3 == rpB_2.Y && var2.c_() == var4.c_()) {
                  this.class_(var3);
               }
            }
         }
      }
   }

   @Override
   protected void class_(rjG_2 var1) {
      super.class_(var1);
      this.PD();
   }

   @Override
   protected void class_(rff_3 var1) {
      super.class_(var1);
      ((rrEm_1)((rYB)this.throws_[7])).class_(rLQ.return_, this.rx(), this.re(), this.BO(), 2, 0.2, 0.2, 0.2, 0.0);
      this.class_(rqn_3.JX, 1.0F, 1.0F);
   }

   @Override
   protected boolean class_(an_3 var1) {
      return super.class_(var1) && !(Boolean)var1.throws_[38];
   }

   @Override
   protected void class_(rfo_3 var1) {
      super.class_(var1);
      an_3 var2 = var1.class_();
      an_3 var3 = this.else_();
      iB_2 var4 = var3 instanceof iB_2 ? (iB_2)var3 : null;
      boolean var5 = var2.break_(rye_3.class_(this, var4).byte_(), 4.0F);
      if (var5) {
         this.class_(var4, var2);
         if (var2 instanceof iB_2) {
            ((iB_2)var2).break_(new rLY(rLD.goto_, 200));
         }
      }
   }

   @Override
   public boolean class_(double var1) {
      return var1 < 16384.0;
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      if (this.class_ != null) {
         var1.class_("Target", this.class_.ro());
      }

      if (this.break_ != null) {
         var1.break_("Dir", this.break_.byte_());
      }

      var1.break_("Steps", this.protected_);
      var1.class_("TXD", this.catch_);
      var1.class_("TYD", this.private_);
      var1.class_("TZD", this.implements_);
   }

   private void class_(rpr_3 var1) {
      this.break_ = var1;
   }

   private void class_(rpB_2 var1) {
      double var2 = 0.5;
      rfH_2 var4;
      if (this.class_ == null) {
         var4 = this.Bs().break_();
      } else {
         var2 = (double)this.class_.Bm() * 0.5;
         var4 = new rfH_2(this.class_.rx(), this.class_.re() + var2, this.class_.BO());
      }

      double var5 = (double)var4.b_() + 0.5;
      double var7 = (double)var4.c_() + var2;
      double var9 = (double)var4.d_() + 0.5;
      rpr_3 var11 = null;
      if (!var4.class_(this.Ps(), 2.0)) {
         rfH_2 var12 = this.Bs();
         ArrayList var13 = Lists.newArrayList();
         if (var1 != rpB_2.X) {
            if (var12.b_() < var4.b_() && ((rYB)this.throws_[7]).finally_(var12.extends_())) {
               var13.add(rpr_3.EAST);
            } else if (var12.b_() > var4.b_() && ((rYB)this.throws_[7]).finally_(var12.byte_())) {
               var13.add(rpr_3.WEST);
            }
         }

         if (var1 != rpB_2.Y) {
            if (var12.c_() < var4.c_() && ((rYB)this.throws_[7]).finally_(var12.final_())) {
               var13.add(rpr_3.UP);
            } else if (var12.c_() > var4.c_() && ((rYB)this.throws_[7]).finally_(var12.break_())) {
               var13.add(rpr_3.DOWN);
            }
         }

         if (var1 != rpB_2.Z) {
            if (var12.d_() < var4.d_() && ((rYB)this.throws_[7]).finally_(var12.protected_())) {
               var13.add(rpr_3.SOUTH);
            } else if (var12.d_() > var4.d_() && ((rYB)this.throws_[7]).finally_(var12.private_())) {
               var13.add(rpr_3.NORTH);
            }
         }

         var11 = rpr_3.class_((Random)this.throws_[40]);
         if (var13.isEmpty()) {
            for (int var14 = 5; !((rYB)this.throws_[7]).finally_(var12.break_(var11)) && var14 > 0; var14--) {
               var11 = rpr_3.class_((Random)this.throws_[40]);
            }
         } else {
            var11 = (rpr_3)var13.get(((Random)this.throws_[40]).nextInt(var13.size()));
         }

         var5 = this.rx() + (double)var11.implements_();
         var7 = this.re() + (double)var11.finally_();
         var9 = this.BO() + (double)var11.extends_();
      }

      this.class_(var11);
      double var25 = var5 - this.rx();
      double var26 = var7 - this.re();
      double var16 = var9 - this.BO();
      double var18 = (double)rfU_2.class_(var25 * var25 + var26 * var26 + var16 * var16);
      if (var18 == 0.0) {
         this.catch_ = 0.0;
         this.private_ = 0.0;
         this.implements_ = 0.0;
      } else {
         this.catch_ = var25 / var18 * 0.15;
         this.private_ = var26 / var18 * 0.15;
         this.implements_ = var16 / var18 * 0.15;
      }

      Boolean var24 = true;
      this.throws_[57] = var24;
      this.protected_ = 10 + ((Random)this.throws_[40]).nextInt(5) * 10;
   }

   @Override
   protected void break_(rcd_3 var1) {
      super.break_(var1);
      this.protected_ = var1.private_("Steps");
      this.catch_ = var1.extends_("TXD");
      this.private_ = var1.extends_("TYD");
      this.implements_ = var1.extends_("TZD");
      if (var1.byte_("Dir", 99)) {
         this.break_ = rpr_3.class_(var1.private_("Dir"));
      }

      if (var1.break_("Target")) {
         this.finally_ = var1.class_("Target");
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (!((rYB)this.throws_[7]).continue_) {
         this.class_(rqn_3.JJ, 1.0F, 1.0F);
         ((rrEm_1)((rYB)this.throws_[7])).class_(rLQ.catch_, this.rx(), this.re(), this.BO(), 15, 0.2, 0.2, 0.2, 0.0);
         this.PD();
      }

      return true;
   }

   @Override
   public boolean Pz() {
      return false;
   }

   @Override
   public void rA() {
      if (((rYB)this.throws_[7]).abstract_() == rRO.PEACEFUL) {
         this.PD();
      }
   }

   @Override
   public float rX() {
      return 1.0F;
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.HOSTILE;
   }

   @Override
   public boolean rY() {
      return true;
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
