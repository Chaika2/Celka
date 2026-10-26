package celestial;

import java.util.Random;

public abstract class rHK extends rHD {
   protected rqO_2 protected_;
   protected long throws_;

   protected boolean byte_(rcd_3 var1) {
      if (this.protected_ == null) {
         return false;
      } else {
         var1.class_("LootTable", this.protected_.toString());
         if (this.throws_ != 0L) {
            var1.class_("LootTableSeed", this.throws_);
         }

         return true;
      }
   }

   @Override
   public boolean byte_(rhd_3 var1) {
      return this.extends_.class_(this.native_) != this
         ? false
         : !(var1.class_((double)this.native_.b_() + 0.5, (double)this.native_.c_() + 0.5, (double)this.native_.d_() + 0.5) > 64.0);
   }

   protected rHK(ryW_2<?> var1) {
      super(var1);
   }

   protected abstract void class_(rqs_3<rdn_3> var1);

   @Override
   public rdn_3 class_(int var1, int var2) {
      this.protected_((rhd_3)null);
      rdn_3 var3 = rXC.class_(this.ad_(), var1, var2);
      if (!var3.class_()) {
         this.break_();
      }

      return var3;
   }

   public void class_(rqO_2 var1, long var2) {
      this.protected_ = var1;
      this.throws_ = var2;
   }

   public static void class_(rRq_1 var0, Random var1, rfH_2 var2, rqO_2 var3) {
      ryO_2 var4 = var0.class_(var2);
      if (var4 instanceof rHK) {
         ((rHK)var4).class_(var3, var1.nextLong());
      }
   }

   @Override
   public void break_(int var1, rdn_3 var2) {
      this.protected_((rhd_3)null);
      this.ad_().set(var1, var2);
      if (var2.char_() > this.ab_()) {
         var2.throws_(this.ab_());
      }

      this.break_();
   }

   protected boolean break_(rcd_3 var1) {
      if (var1.byte_("LootTable", 8)) {
         this.protected_ = new rqO_2(var1.native_("LootTable"));
         this.throws_ = var1.implements_("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean throws_(rhd_3 var1) {
      return super.throws_(var1) && (this.protected_ == null || !var1.native_());
   }

   @Override
   public rdn_3 extends_(int var1) {
      this.protected_((rhd_3)null);
      return this.ad_().get(var1);
   }

   @Override
   public boolean return_() {
      this.protected_((rhd_3)null);
      return this.ad_().stream().allMatch(rdn_3::class_);
   }

   @Override
   public void public_() {
      this.ad_().clear();
   }

   public void protected_(rhd_3 var1) {
      if (this.protected_ != null && this.extends_.const_() != null) {
         rzL_2 var2 = this.extends_.const_().o().class_(this.protected_);
         if (var1 instanceof rhN_2) {
            Oo_1.const_.class_((rhN_2)var1, this.protected_);
         }

         this.protected_ = null;
         rzP_2 var3 = new rzP_2((rrEm_1)this.extends_).class_(rzQ_2.case_, rjU_2.class_((rja_3)this.native_)).class_(this.throws_);
         if (var1 != null) {
            var3.class_(var1.sY()).class_(rzQ_2.class_, var1);
         }

         var2.class_(this, var3.class_(rzz_3.break_));
      }
   }

   @Override
   public rdn_3 native_(int var1) {
      this.protected_((rhd_3)null);
      return rXC.class_(this.ad_(), var1);
   }

   protected abstract rqs_3<rdn_3> ad_();

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      if (this.throws_(var3)) {
         this.protected_(var2.throws_);
         return this.class_(var1, var2);
      } else {
         return null;
      }
   }
}
