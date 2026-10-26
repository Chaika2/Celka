package celestial;

import java.util.Random;
import java.util.Map.Entry;

public class rsP_2 extends an_3 {
   public int class_;
   public int break_;
   public int protected_;
   private int catch_ = 5;
   private int private_;
   private rhd_3 implements_;
   private int finally_;

   private int byte_(int var1) {
      return var1 * 2;
   }

   public rsP_2(rYB var1, double var2, double var4, double var6, int var8) {
      this(aI_2.goto_, var1);
      this.new_(var2, var4, var6);
      Float var13 = (float)(((Random)this.throws_[40]).nextDouble() * 360.0);
      this.throws_[15] = var13;
      this.catch_(
         (((Random)this.throws_[40]).nextDouble() * 0.2F - 0.1F) * 2.0,
         ((Random)this.throws_[40]).nextDouble() * 0.2 * 2.0,
         (((Random)this.throws_[40]).nextDouble() * 0.2F - 0.1F) * 2.0
      );
      this.private_ = var8;
   }

   public rsP_2(aI_2<? extends rsP_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      super.this_();
      if (this.protected_ > 0) {
         this.protected_--;
      }

      Double var12 = this.rx();
      this.throws_[8] = var12;
      Double var13 = this.re();
      this.throws_[9] = var13;
      Double var14 = this.BO();
      this.throws_[10] = var14;
      if (this.class_(rlG_2.break_)) {
         this.case_();
      } else if (!this.rw()) {
         this.byte_(this.rv().break_(0.0, -0.03, 0.0));
      }

      if (((rYB)this.throws_[7]).break_(this.Bs()).class_(rlG_2.byte_)) {
         this.catch_(
            (double)((((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F),
            0.2F,
            (double)((((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F)
         );
         this.class_(rqn_3.Sf, 0.4F, 2.0F + ((Random)this.throws_[40]).nextFloat() * 0.4F);
      }

      if (!((rYB)this.throws_[7]).break_(this.rN())) {
         this.protected_(this.rx(), (this.rN().break_ + this.rN().throws_) / 2.0, this.BO());
      }

      double var1 = 8.0;
      if (this.finally_ < this.class_ - 20 + this.V() % 100) {
         if (this.implements_ == null || this.implements_.int_(this) > 64.0) {
            this.implements_ = ((rYB)this.throws_[7]).class_(this, 8.0);
         }

         this.finally_ = this.class_;
      }

      if (this.implements_ != null && this.implements_.native_()) {
         this.implements_ = null;
      }

      if (this.implements_ != null) {
         rjU_2 var3 = new rjU_2(
            this.implements_.rx() - this.rx(), this.implements_.re() + (double)this.implements_.Bx() / 2.0 - this.re(), this.implements_.BO() - this.BO()
         );
         double var4 = var3.catch_();
         if (var4 < 64.0) {
            double var6 = 1.0 - Math.sqrt(var4) / 8.0;
            this.byte_(this.rv().throws_(var3.protected_().class_(var6 * var6 * 0.1)));
         }
      }

      this.class_(iG_2.SELF, this.rv());
      float var15 = 0.98F;
      if ((Boolean)this.throws_[20]) {
         var15 = ((rYB)this.throws_[7]).byte_(new rfH_2(this.rx(), this.re() - 1.0, this.BO())).break_().final_() * 0.98F;
      }

      this.byte_(this.rv().throws_((double)var15, 0.98, (double)var15));
      if ((Boolean)this.throws_[20]) {
         this.byte_(this.rv().throws_(1.0, -0.9, 1.0));
      }

      this.class_++;
      this.break_++;
      if (this.break_ >= 6000) {
         this.PD();
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      var1.class_("Health", (short)this.catch_);
      var1.class_("Age", (short)this.break_);
      var1.class_("Value", (short)this.private_);
   }

   public static int class_(int var0) {
      if (var0 >= 2477) {
         return 2477;
      } else if (var0 >= 1237) {
         return 1237;
      } else if (var0 >= 617) {
         return 617;
      } else if (var0 >= 307) {
         return 307;
      } else if (var0 >= 149) {
         return 149;
      } else if (var0 >= 73) {
         return 73;
      } else if (var0 >= 37) {
         return 37;
      } else if (var0 >= 17) {
         return 17;
      } else if (var0 >= 7) {
         return 7;
      } else {
         return var0 >= 3 ? 3 : 1;
      }
   }

   @Override
   protected void U() {
   }

   private int break_(int var1) {
      return var1 / 2;
   }

   @Override
   public void break_(rcd_3 var1) {
      this.catch_ = var1.catch_("Health");
      this.break_ = var1.catch_("Age");
      this.private_ = var1.catch_("Value");
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else {
         this.rf();
         this.catch_ = (int)((float)this.catch_ - var2);
         if (this.catch_ <= 0) {
            this.PD();
         }

         return false;
      }
   }

   public int throws_() {
      if (this.private_ >= 2477) {
         return 10;
      } else if (this.private_ >= 1237) {
         return 9;
      } else if (this.private_ >= 617) {
         return 8;
      } else if (this.private_ >= 307) {
         return 7;
      } else if (this.private_ >= 149) {
         return 6;
      } else if (this.private_ >= 73) {
         return 5;
      } else if (this.private_ >= 37) {
         return 4;
      } else if (this.private_ >= 17) {
         return 3;
      } else if (this.private_ >= 7) {
         return 2;
      } else {
         return this.private_ >= 3 ? 1 : 0;
      }
   }

   @Override
   public boolean rt() {
      return false;
   }

   private void case_() {
      rjU_2 var1 = this.rv();
      this.catch_(var1.break_ * 0.99F, Math.min(var1.byte_ + 5.0E-4F, 0.06F), var1.protected_ * 0.99F);
   }

   public int protected_() {
      return this.private_;
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      return new rFO(this);
   }

   @Override
   public void c_(rhd_3 var1) {
      if (!((rYB)this.throws_[7]).continue_ && this.protected_ == 0 && (Integer)var1.implements_[9] == 0) {
         Integer var9 = 2;
         var1.implements_[9] = var9;
         var1.class_(this, 1);
         Entry var2 = eA_2.class_(eY_2.import_, var1, rdn_3::case_);
         if (var2 != null) {
            rdn_3 var3 = (rdn_3)var2.getValue();
            if (!var3.class_() && var3.case_()) {
               int var4 = Math.min(this.byte_(this.private_), var3.catch_());
               this.private_ = this.private_ - this.break_(var4);
               var3.break_(var3.catch_() - var4);
            }
         }

         if (this.private_ > 0) {
            var1.this_(this.private_);
         }

         this.PD();
      }
   }
}
