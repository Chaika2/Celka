package celestial;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class rhF_2 extends rhm_3 {
   private static final rut_3<Integer> private_ = rmE_2.class_(rhF_2.class, ruw_3.break_);
   private rLi_1 implements_ = rAS.class_;
   private final Set<rLY> finally_ = Sets.newHashSet();
   private boolean extends_;

   private void byte_(int var1) {
      this.extends_ = true;
      ((rmE_2)this.throws_[49]).break_(private_, var1);
   }

   public static int byte_(rdn_3 var0) {
      rcd_3 var1 = var0.package_();
      return var1 != null && var1.byte_("CustomPotionColor", 99) ? var1.private_("CustomPotionColor") : -1;
   }

   public rhF_2(aI_2<? extends rhF_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rhF_2(rYB var1, iB_2 var2) {
      super(aI_2.byte_, var2, var1);
   }

   public rhF_2(rYB var1, double var2, double var4, double var6) {
      super(aI_2.byte_, var2, var4, var6, var1);
   }

   @Override
   public void this_() {
      super.this_();
      if (((rYB)this.throws_[7]).continue_) {
         if (this.class_) {
            if (this.break_ % 5 == 0) {
               this.break_(1);
            }
         } else {
            this.break_(2);
         }
      } else if (this.class_ && this.break_ != 0 && !this.finally_.isEmpty() && this.break_ >= 600) {
         ((rYB)this.throws_[7]).class_(this, (byte)0);
         this.implements_ = rAS.class_;
         this.finally_.clear();
         ((rmE_2)this.throws_[49]).break_(private_, -1);
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      if (this.implements_ != rAS.class_ && this.implements_ != null) {
         var1.class_("Potion", rVL.double_.break_(this.implements_).toString());
      }

      if (this.extends_) {
         var1.break_("Color", this.super_());
      }

      if (!this.finally_.isEmpty()) {
         rcy_3 var2 = new rcy_3();

         for (rLY var4 : this.finally_) {
            var2.add(var4.class_(new rcd_3()));
         }

         var1.class_("CustomPotionEffects", var2);
      }
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 0) {
         int var2 = this.super_();
         if (var2 != -1) {
            double var3 = (double)(var2 >> 16 & 0xFF) / 255.0;
            double var5 = (double)(var2 >> 8 & 0xFF) / 255.0;
            double var7 = (double)(var2 >> 0 & 0xFF) / 255.0;

            for (int var9 = 0; var9 < 20; var9++) {
               ((rYB)this.throws_[7]).class_(rLQ.else_, this.break_(0.5), this.Ph(), this.protected_(0.5), var3, var5, var7);
            }
         }
      } else {
         super.class_(var1);
      }
   }

   @Override
   protected void class_(iB_2 var1) {
      super.class_(var1);

      for (rLY var3 : this.implements_.class_()) {
         var1.break_(new rLY(var3.class_(), Math.max(var3.break_() / 8, 1), var3.byte_(), var3.protected_(), var3.throws_()));
      }

      if (!this.finally_.isEmpty()) {
         for (rLY var5 : this.finally_) {
            var1.break_(var5);
         }
      }
   }

   public void class_(rLY var1) {
      this.finally_.add(var1);
      this.BQ().break_(private_, rAB.class_(rAB.class_(this.implements_, this.finally_)));
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("Potion", 8)) {
         this.implements_ = rAB.byte_(var1);
      }

      for (rLY var3 : rAB.break_(var1)) {
         this.class_(var3);
      }

      if (var1.byte_("Color", 99)) {
         this.byte_(var1.private_("Color"));
      } else {
         this.public_();
      }
   }

   private void break_(int var1) {
      int var2 = this.super_();
      if (var2 != -1 && var1 > 0) {
         double var3 = (double)(var2 >> 16 & 0xFF) / 255.0;
         double var5 = (double)(var2 >> 8 & 0xFF) / 255.0;
         double var7 = (double)(var2 >> 0 & 0xFF) / 255.0;

         for (int var9 = 0; var9 < var1; var9++) {
            ((rYB)this.throws_[7]).class_(rLQ.else_, this.break_(0.5), this.Ph(), this.protected_(0.5), var3, var5, var7);
         }
      }
   }

   public void break_(rdn_3 var1) {
      if (var1.break_() == rdy_3.kz) {
         this.implements_ = rAB.protected_(var1);
         List var2 = rAB.break_(var1);
         if (!var2.isEmpty()) {
            for (rLY var4 : var2) {
               this.finally_.add(new rLY(var4));
            }
         }

         int var5 = byte_(var1);
         if (var5 == -1) {
            this.public_();
         } else {
            this.byte_(var5);
         }
      } else if (var1.break_() == rdy_3.OO) {
         this.implements_ = rAS.class_;
         this.finally_.clear();
         ((rmE_2)this.throws_[49]).break_(private_, -1);
      }
   }

   @Override
   protected rdn_3 catch_() {
      if (this.finally_.isEmpty() && this.implements_ == rAS.class_) {
         return new rdn_3(rdy_3.OO);
      } else {
         rdn_3 var1 = new rdn_3(rdy_3.kz);
         rAB.class_(var1, this.implements_);
         rAB.class_(var1, this.finally_);
         if (this.extends_) {
            var1.int_().break_("CustomPotionColor", this.super_());
         }

         return var1;
      }
   }

   public int super_() {
      return ((rmE_2)this.throws_[49]).class_(private_);
   }

   private void public_() {
      this.extends_ = false;
      if (this.implements_ == rAS.class_ && this.finally_.isEmpty()) {
         ((rmE_2)this.throws_[49]).break_(private_, -1);
      } else {
         ((rmE_2)this.throws_[49]).break_(private_, rAB.class_(rAB.class_(this.implements_, this.finally_)));
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(private_, -1);
   }
}
