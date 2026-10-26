package celestial;

import java.util.Random;

public class rsv_3 extends rsJ_2 {
   private int class_ = -1;

   @Override
   public xc_3 int_() {
      return xu_3.rf.continue_();
   }

   public rsv_3(aI_2<? extends rsv_3> var1, rYB var2) {
      super(var1, var2);
   }

   public rsv_3(rYB var1, double var2, double var4, double var6) {
      super(aI_2.E, var1, var2, var4, var6);
   }

   @Override
   public void this_() {
      super.this_();
      if (this.class_ > 0) {
         this.class_--;
         ((rYB)this.throws_[7]).class_(rLQ.double_, this.rx(), this.re() + 0.5, this.BO(), 0.0, 0.0, 0.0);
      } else if (this.class_ == 0) {
         this.private_(case_(this.rv()));
      }

      if ((Boolean)this.throws_[23]) {
         double var1 = case_(this.rv());
         if (var1 >= 0.01F) {
            this.private_(var1);
         }
      }
   }

   @Override
   public void class_(int var1, int var2, int var3, boolean var4) {
      if (var4 && this.class_ < 0) {
         this.else_();
      }
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 10) {
         this.else_();
      } else {
         super.class_(var1);
      }
   }

   @Override
   public float class_(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, rXE var5, float var6) {
      return this.public_() && (var4.class_(rls_3.float_) || var2.byte_(var3.final_()).class_(rls_3.float_))
         ? 0.0F
         : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean class_(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, float var5) {
      return this.public_() && (var4.class_(rls_3.float_) || var2.byte_(var3.final_()).class_(rls_3.float_))
         ? false
         : super.class_(var1, var2, var3, var4, var5);
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("TNTFuse", this.class_);
   }

   @Override
   public boolean class_(float var1, float var2) {
      if (var1 >= 3.0F) {
         float var3 = var1 / 10.0F;
         this.private_((double)(var3 * var3));
      }

      return super.class_(var1, var2);
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (var1.finally_() instanceof rhm_3 var4 && var4.Pz()) {
         this.private_(var4.rv().catch_());
      }

      return super.break_(var1, var2);
   }

   @Override
   public void break_(rye_3 var1) {
      double var2 = case_(this.rv());
      if (!var1.int_() && !var1.protected_() && !(var2 >= 0.01F)) {
         super.break_(var1);
         if (!var1.protected_() && ((rYB)this.throws_[7]).B().break_(rRu_1.catch_)) {
            this.class_(xu_3.rf);
         }
      } else if (this.class_ < 0) {
         this.else_();
         this.class_ = ((Random)this.throws_[40]).nextInt(20) + ((Random)this.throws_[40]).nextInt(20);
      }
   }

   @Override
   protected void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("TNTFuse", 99)) {
         this.class_ = var1.private_("TNTFuse");
      }
   }

   public void else_() {
      this.class_ = 80;
      if (!((rYB)this.throws_[7]).continue_) {
         ((rYB)this.throws_[7]).class_(this, (byte)10);
         if (!this.BF()) {
            ((rYB)this.throws_[7]).class_((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.db, rqL_2.BLOCKS, 1.0F, 1.0F);
         }
      }
   }

   public int return_() {
      return this.class_;
   }

   public boolean public_() {
      return this.class_ > -1;
   }

   protected void private_(double var1) {
      if (!((rYB)this.throws_[7]).continue_) {
         double var3 = Math.sqrt(var1);
         if (var3 > 5.0) {
            var3 = 5.0;
         }

         ((rYB)this.throws_[7]).class_(this, this.rx(), this.re(), this.BO(), (float)(4.0 + ((Random)this.throws_[40]).nextDouble() * 1.5 * var3), rRz_1.BREAK);
         this.PD();
      }
   }

   @Override
   public rsd_3 final_() {
      return rsd_3.TNT;
   }
}
