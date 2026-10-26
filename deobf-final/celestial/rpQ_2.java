package celestial;

public class rpQ_2 {
   private int class_ = this.protected_();
   private float break_ = 5.0F;
   private float byte_;
   private int protected_;

   public float byte_() {
      return this.break_;
   }

   public void class_(int var1) {
      this.class_ = var1;
   }

   public void class_(float var1) {
      this.byte_ = Math.min(this.byte_ + var1, 40.0F);
   }

   public int class_() {
      return this.class_;
   }

   public void class_(rhd_3 var1) {
      rRO var2 = ((rYB)var1.throws_[7]).abstract_();
      if (this.byte_ > 4.0F) {
         this.byte_ -= 4.0F;
         if (this.break_ > 0.0F) {
            this.break_ = Math.max(this.break_ - 1.0F, 0.0F);
         } else if (var2 != rRO.PEACEFUL) {
            this.class_ = Math.max(this.class_ - 1, 0);
         }
      }

      boolean var3 = ((rYB)var1.throws_[7]).B().break_(rRu_1.implements_);
      if (var3 && this.break_ > 0.0F && var1.sA() && this.class_ >= this.protected_()) {
         this.protected_++;
         if (this.protected_ >= 10) {
            float var4 = Math.min(this.break_, 6.0F);
            var1.protected_(var4 / 6.0F);
            this.class_(var4);
            this.protected_ = 0;
         }
      } else if (var3 && this.class_ >= 18 && var1.sA()) {
         this.protected_++;
         if (this.protected_ >= 80) {
            var1.protected_(1.0F);
            this.class_(6.0F);
            this.protected_ = 0;
         }
      } else if (this.class_ <= 0) {
         this.protected_++;
         if (this.protected_ >= 80) {
            if (var1.Ss() > 10.0F || var2 == rRO.HARD || var1.Ss() > 1.0F && var2 == rRO.NORMAL) {
               var1.break_(rye_3.implements_, 1.0F);
            }

            this.protected_ = 0;
         }
      } else {
         this.protected_ = 0;
      }
   }

   public void class_(int var1, float var2) {
      this.class_ = Math.min(var1 + this.class_, this.protected_());
      this.break_ = Math.min(this.break_ + (float)var1 * var2 * 2.0F, (float)this.class_);
   }

   public void class_(rcd_3 var1) {
      if (var1.byte_("foodLevel", 99)) {
         this.class_ = var1.private_("foodLevel");
         this.protected_ = var1.private_("foodTickTimer");
         this.break_ = var1.finally_("foodSaturationLevel");
         this.byte_ = var1.finally_("foodExhaustionLevel");
      }
   }

   public void class_(rdb_3 var1, rdn_3 var2) {
      if (var1.super_()) {
         rxK_2 var3 = var1.this_();
         this.class_(var3.class_(), var3.break_());
      }
   }

   public void break_(float var1) {
      this.break_ = var1;
   }

   public void break_(rcd_3 var1) {
      var1.break_("foodLevel", this.class_);
      var1.break_("foodTickTimer", this.protected_);
      var1.class_("foodSaturationLevel", this.break_);
      var1.class_("foodExhaustionLevel", this.byte_);
   }

   public boolean break_() {
      return this.class_ < this.protected_();
   }

   public int protected_() {
      return 20;
   }
}
