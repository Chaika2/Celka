package celestial;

import java.util.Random;

public abstract class au_3 extends aA_2 {
   private static final rut_3<Boolean> super_ = rmE_2.class_(au_3.class, ruw_3.implements_);
   protected int class_;
   protected int break_;
   protected int protected_;

   protected au_3(aI_2<? extends au_3> var1, rYB var2) {
      super(var1, var2);
   }

   public void class_(int var1, boolean var2) {
      int var3 = this.O_();
      var3 += var1 * 20;
      if (var3 > 0) {
         var3 = 0;
      }

      int var4 = var3 - var3;
      this.e_(var3);
      if (var2) {
         this.break_ += var4;
         if (this.protected_ == 0) {
            this.protected_ = 40;
         }
      }

      if (this.O_() == 0) {
         this.e_(this.break_);
      }
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var4 == null) {
         var4 = new am_3(true);
      }

      am_3 var6 = (am_3)var4;
      if (var6.byte_() && var6.class_() > 0 && ((Random)this.throws_[40]).nextFloat() <= var6.protected_()) {
         this.e_(-24000);
      }

      var6.break_();
      return super.class_(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Age", this.O_());
      var1.break_("ForcedAge", this.break_);
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (super_.equals(var1)) {
         this.q_();
      }

      super.class_(var1);
   }

   @Override
   public void class_(boolean var1) {
      this.e_(var1 ? -24000 : 0);
   }

   public abstract au_3 class_(rrEm_1 var1, au_3 var2);

   @Override
   public void default_() {
      super.default_();
      if (((rYB)this.throws_[7]).continue_) {
         if (this.protected_ > 0) {
            if (this.protected_ % 4 == 0) {
               ((rYB)this.throws_[7]).class_(rLQ.char_, this.break_(1.0), this.Ph() + 0.5, this.protected_(1.0), 0.0, 0.0, 0.0);
            }

            this.protected_--;
         }
      } else if (this.BM()) {
         int var1 = this.O_();
         if (var1 < 0) {
            this.e_(++var1);
         } else if (var1 > 0) {
            this.e_(--var1);
         }
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.e_(var1.private_("Age"));
      this.break_ = var1.private_("ForcedAge");
   }

   public int O_() {
      if (((rYB)this.throws_[7]).continue_) {
         return ((rmE_2)this.throws_[49]).class_(super_) ? -1 : 1;
      } else {
         return this.class_;
      }
   }

   protected void P_() {
   }

   public boolean N_() {
      return false;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(super_, false);
   }

   @Override
   public boolean n_() {
      return this.O_() < 0;
   }

   public void e_(int var1) {
      int var2 = this.class_;
      this.class_ = var1;
      if (var2 < 0 && var1 >= 0 || var2 >= 0 && var1 < 0) {
         ((rmE_2)this.throws_[49]).break_(super_, var1 < 0);
         this.P_();
      }
   }

   public void d_(int var1) {
      this.class_(var1, false);
   }
}
