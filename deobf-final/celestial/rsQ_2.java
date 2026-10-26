package celestial;

public abstract class rsQ_2 extends rsJ_2 implements rJZ, rXu_1 {
   private rqs_3<rdn_3> class_ = rqs_3.class_(36, rdn_3.break_);
   private boolean break_ = true;
   private rqO_2 protected_;
   private long catch_;

   @Override
   public boolean byte_(rhd_3 var1) {
      return this.throws_[27] ? false : !(var1.int_(this) > 64.0);
   }

   protected rsQ_2(aI_2<?> var1, rYB var2) {
      super(var1, var2);
   }

   protected rsQ_2(aI_2<?> var1, double var2, double var4, double var6, rYB var8) {
      super(var1, var8, var2, var4, var6);
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      if (this.protected_ != null) {
         var1.class_("LootTable", this.protected_.toString());
         if (this.catch_ != 0L) {
            var1.class_("LootTableSeed", this.catch_);
         }
      } else {
         rXC.class_(var1, this.class_);
      }
   }

   @Override
   public an_3 class_(rrEm_1 var1) {
      this.break_ = false;
      return super.class_(var1);
   }

   @Override
   public boolean class_(int var1, rdn_3 var2) {
      if (var1 >= 0 && var1 < this.else_()) {
         this.break_(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public ryZ_2 class_(rhd_3 var1, rpm_3 var2) {
      var1.class_((rJZ)this);
      if (!((rYB)var1.throws_[7]).continue_) {
         rbW_2.class_(var1, true);
         return ryZ_2.CONSUME;
      } else {
         return ryZ_2.SUCCESS;
      }
   }

   public void class_(rqO_2 var1, long var2) {
      this.protected_ = var1;
      this.catch_ = var2;
   }

   protected abstract rJr_1 class_(int var1, rhz_3 var2);

   @Override
   public rdn_3 class_(int var1, int var2) {
      this.protected_((rhd_3)null);
      return rXC.class_(this.class_, var1, var2);
   }

   @Override
   protected void break_(rcd_3 var1) {
      super.break_(var1);
      this.class_ = rqs_3.class_(this.else_(), rdn_3.break_);
      if (var1.byte_("LootTable", 8)) {
         this.protected_ = new rqO_2(var1.native_("LootTable"));
         this.catch_ = var1.implements_("LootTableSeed");
      } else {
         rXC.break_(var1, this.class_);
      }
   }

   @Override
   public void break_(rye_3 var1) {
      super.break_(var1);
      if (((rYB)this.throws_[7]).B().break_(rRu_1.catch_)) {
         rXn_1.class_((rYB)this.throws_[7], this, this);
         if (!((rYB)this.throws_[7]).continue_) {
            an_3 var2 = var1.finally_();
            if (var2 != null && var2.BC() == aI_2.rM) {
               rbW_2.class_((rhd_3)var2, true);
            }
         }
      }
   }

   @Override
   public void break_() {
   }

   @Override
   public void break_(int var1, rdn_3 var2) {
      this.protected_((rhd_3)null);
      this.class_.set(var1, var2);
      if (!var2.class_() && var2.char_() > this.ab_()) {
         var2.throws_(this.ab_());
      }
   }

   @Override
   public void PD() {
      if (!((rYB)this.throws_[7]).continue_ && this.break_) {
         rXn_1.class_((rYB)this.throws_[7], this, this);
      }

      super.PD();
   }

   @Override
   public rdn_3 extends_(int var1) {
      this.protected_((rhd_3)null);
      return this.class_.get(var1);
   }

   @Override
   protected void case_() {
      float var1 = 0.98F;
      if (this.protected_ == null) {
         int var2 = 15 - rJr_1.break_(this);
         var1 += (float)var2 * 0.001F;
      }

      this.byte_(this.rv().throws_((double)var1, 0.0, (double)var1));
   }

   @Override
   public boolean return_() {
      for (rdn_3 var2 : this.class_) {
         if (!var2.class_()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void public_() {
      this.protected_((rhd_3)null);
      this.class_.clear();
   }

   public void protected_(rhd_3 var1) {
      if (this.protected_ != null && ((rYB)this.throws_[7]).const_() != null) {
         rzL_2 var2 = ((rYB)this.throws_[7]).const_().o().class_(this.protected_);
         if (var1 instanceof rhN_2) {
            Oo_1.const_.class_((rhN_2)var1, this.protected_);
         }

         this.protected_ = null;
         rzP_2 var3 = new rzP_2((rrEm_1)((rYB)this.throws_[7])).class_(rzQ_2.case_, this.Ps()).class_(this.catch_);
         if (var1 != null) {
            var3.class_(var1.sY()).class_(rzQ_2.class_, var1);
         }

         var2.class_(this, var3.class_(rzz_3.break_));
      }
   }

   @Override
   public rdn_3 native_(int var1) {
      this.protected_((rhd_3)null);
      rdn_3 var2 = this.class_.get(var1);
      if (var2.class_()) {
         return rdn_3.break_;
      } else {
         this.class_.set(var1, rdn_3.break_);
         return var2;
      }
   }

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      if (this.protected_ != null && var3.native_()) {
         return null;
      } else {
         this.protected_(var2.throws_);
         return this.class_(var1, var2);
      }
   }
}
