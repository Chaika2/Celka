package celestial;

import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class rsE_2 extends an_3 {
   private static final rut_3<rdn_3> break_ = rmE_2.class_(rsE_2.class, ruw_3.catch_);
   private int protected_;
   private int catch_;
   private int private_ = 5;
   private UUID implements_;
   private UUID finally_;
   public final float class_;

   public float byte_(float var1) {
      return ((float)this.catch_() + var1) / 20.0F + this.class_;
   }

   public void byte_(UUID var1) {
      this.implements_ = var1;
   }

   public void int_() {
      this.protected_ = -6000;
   }

   public rsE_2(aI_2<? extends rsE_2> var1, rYB var2) {
      super(var1, var2);
      this.class_ = (float)(Math.random() * Math.PI * 2.0);
   }

   public rsE_2(rYB var1, double var2, double var4, double var6) {
      this(aI_2.short_, var1);
      this.new_(var2, var4, var6);
      Float var12 = ((Random)this.throws_[40]).nextFloat() * 360.0F;
      this.throws_[15] = var12;
      this.catch_(((Random)this.throws_[40]).nextDouble() * 0.2 - 0.1, 0.2, ((Random)this.throws_[40]).nextDouble() * 0.2 - 0.1);
   }

   public rsE_2(rYB var1, double var2, double var4, double var6, rdn_3 var8) {
      this(var1, var2, var4, var6);
      this.break_(var8);
   }

   private rsE_2(rsE_2 var1) {
      super(var1.BC(), (rYB)var1.throws_[7]);
      this.break_(var1.protected_().implements_());
      this.native_(var1);
      this.protected_ = var1.protected_;
      this.class_ = var1.class_;
   }

   @Override
   public void this_() {
      if (this.protected_().class_()) {
         this.PD();
      } else {
         super.this_();
         if (this.catch_ > 0 && this.catch_ != 32767) {
            this.catch_--;
         }

         Double var11 = this.rx();
         this.throws_[8] = var11;
         Double var12 = this.re();
         this.throws_[9] = var12;
         Double var13 = this.BO();
         this.throws_[10] = var13;
         rjU_2 var1 = this.rv();
         float var2 = this.Bx() - 0.11111111F;
         if (this.rT() && this.break_(rlG_2.break_) > (double)var2) {
            this.super_();
         } else if (this.ry() && this.break_(rlG_2.byte_) > (double)var2) {
            this.else_();
         } else if (!this.rw()) {
            this.byte_(this.rv().break_(0.0, -0.04, 0.0));
         }

         if (((rYB)this.throws_[7]).continue_) {
            Boolean var14 = false;
            this.throws_[38] = var14;
         } else {
            Boolean var15 = !((rYB)this.throws_[7]).throws_(this);
            this.throws_[38] = var15;
            if ((Boolean)this.throws_[38]) {
               this.protected_(this.rx(), (this.rN().break_ + this.rN().throws_) / 2.0, this.BO());
            }
         }

         if (!(Boolean)this.throws_[20] || case_(this.rv()) > 1.0E-5F || ((Integer)this.throws_[41] + this.V()) % 4 == 0) {
            this.class_(iG_2.SELF, this.rv());
            float var3 = 0.98F;
            if ((Boolean)this.throws_[20]) {
               var3 = ((rYB)this.throws_[7]).byte_(new rfH_2(this.rx(), this.re() - 1.0, this.BO())).break_().final_() * 0.98F;
            }

            this.byte_(this.rv().throws_((double)var3, 0.98, (double)var3));
            if ((Boolean)this.throws_[20]) {
               rjU_2 var4 = this.rv();
               if (var4.byte_ < 0.0) {
                  this.byte_(var4.throws_(1.0, -0.5, 1.0));
               }
            }
         }

         boolean var18 = rfU_2.byte_((Double)this.throws_[8]) != rfU_2.byte_(this.rx())
            || rfU_2.byte_((Double)this.throws_[9]) != rfU_2.byte_(this.re())
            || rfU_2.byte_((Double)this.throws_[10]) != rfU_2.byte_(this.BO());
         int var19 = var18 ? 2 : 40;
         if ((Integer)this.throws_[41] % var19 == 0) {
            if (((rYB)this.throws_[7]).break_(this.Bs()).class_(rlG_2.byte_) && !this.q()) {
               this.class_(rqn_3.Sf, 0.4F, 2.0F + ((Random)this.throws_[40]).nextFloat() * 0.4F);
            }

            if (!((rYB)this.throws_[7]).continue_ && this.public_()) {
               this.return_();
            }
         }

         if (this.protected_ != -32768) {
            this.protected_++;
         }

         Boolean var16 = (Boolean)this.throws_[57] | this.PM();
         this.throws_[57] = var16;
         if (!((rYB)this.throws_[7]).continue_) {
            double var5 = this.rv().protected_(var1).catch_();
            if (var5 > 0.01) {
               Boolean var17 = true;
               this.throws_[57] = var17;
            }
         }

         if (!((rYB)this.throws_[7]).continue_ && this.protected_ >= 6000) {
            this.PD();
         }
      }
   }

   private static void class_(rsE_2 var0, rdn_3 var1, rsE_2 var2, rdn_3 var3) {
      class_(var0, var1, var3);
      var0.catch_ = Math.max(var0.catch_, var2.catch_);
      var0.protected_ = Math.min(var0.protected_, var2.protected_);
      if (var3.class_()) {
         var2.PD();
      }
   }

   private static void class_(rsE_2 var0, rdn_3 var1, rdn_3 var2) {
      rdn_3 var3 = class_(var1, var2, 64);
      var0.break_(var3);
   }

   public static rdn_3 class_(rdn_3 var0, rdn_3 var1, int var2) {
      int var3 = Math.min(Math.min(var0.byte_(), var2) - var0.char_(), var1.char_());
      rdn_3 var4 = var0.implements_();
      var4.case_(var3);
      var1.catch_(var3);
      return var4;
   }

   @Override
   public an_3 class_(rrEm_1 var1) {
      an_3 var2 = super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_ && var2 instanceof rsE_2) {
         ((rsE_2)var2).return_();
      }

      return var2;
   }

   @Override
   public void class_(rcd_3 var1) {
      var1.class_("Health", (short)this.private_);
      var1.class_("Age", (short)this.protected_);
      var1.class_("PickupDelay", (short)this.catch_);
      if (this.case_() != null) {
         var1.class_("Thrower", this.case_());
      }

      if (this.throws_() != null) {
         var1.class_("Owner", this.throws_());
      }

      if (!this.protected_().class_()) {
         var1.class_("Item", this.protected_().break_(new rcd_3()));
      }
   }

   public void class_(int var1) {
      this.catch_ = var1;
   }

   @Override
   public void class_(rut_3<?> var1) {
      super.class_(var1);
      if (break_.equals(var1)) {
         this.protected_().class_(this);
      }
   }

   private void class_(rsE_2 var1) {
      rdn_3 var2 = this.protected_();
      rdn_3 var3 = var1.protected_();
      if (Objects.equals(this.throws_(), var1.throws_()) && class_(var2, var3)) {
         if (var3.char_() < var2.char_()) {
            class_(this, var2, var1, var3);
         } else {
            class_(var1, var3, this, var2);
         }
      }
   }

   public static boolean class_(rdn_3 var0, rdn_3 var1) {
      if (var1.break_() != var0.break_()) {
         return false;
      } else if (var1.char_() + var0.char_() > var1.byte_()) {
         return false;
      } else {
         return var1.final_() ^ var0.final_() ? false : !var1.final_() || var1.package_().equals(var0.package_());
      }
   }

   @Override
   public rgP_2 g() {
      rgP_2 var1 = this.rD();
      return (rgP_2)(var1 != null ? var1 : new rgn_3(this.protected_().finally_()));
   }

   @Override
   public boolean q() {
      return this.protected_().break_().else_() || super.q();
   }

   public void break_(UUID var1) {
      this.finally_ = var1;
   }

   public void break_(rdn_3 var1) {
      this.BQ().break_(break_, var1);
   }

   @Override
   public void break_(rcd_3 var1) {
      this.private_ = var1.catch_("Health");
      this.protected_ = var1.catch_("Age");
      if (var1.throws_("PickupDelay")) {
         this.catch_ = var1.catch_("PickupDelay");
      }

      if (var1.break_("Owner")) {
         this.finally_ = var1.class_("Owner");
      }

      if (var1.break_("Thrower")) {
         this.implements_ = var1.class_("Thrower");
      }

      rcd_3 var2 = var1.int_("Item");
      this.break_(rdn_3.class_(var2));
      if (this.protected_().class_()) {
         this.PD();
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else if (!this.protected_().class_() && this.protected_().break_() == rdy_3.dQ && var1.protected_()) {
         return false;
      } else if (!this.protected_().break_().class_(var1)) {
         return false;
      } else {
         this.rf();
         this.private_ = (int)((float)this.private_ - var2);
         if (this.private_ <= 0) {
            this.PD();
         }

         return false;
      }
   }

   public UUID throws_() {
      return this.finally_;
   }

   @Override
   public boolean rt() {
      return false;
   }

   public int catch_() {
      return this.protected_;
   }

   @Override
   public float extends_(float var1) {
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().Z().aJ_()) {
         return (float)(rrjZ_2.private_(this, var1) - 0.1F);
      } else {
         float var2 = rfU_2.class_(((float)this.catch_() + var1) / 10.0F + this.class_) * 0.1F + 0.1F;
         return (float)(rrjZ_2.private_(this, var1) + (double)var2) + 0.1F;
      }
   }

   public UUID case_() {
      return this.implements_;
   }

   public rsE_2 continue_() {
      return new rsE_2(this);
   }

   private void else_() {
      rjU_2 var1 = this.rv();
      this.catch_(var1.break_ * 0.95F, var1.byte_ + (double)(var1.byte_ < 0.06F ? 5.0E-4F : 0.0F), var1.protected_ * 0.95F);
   }

   public void implements_() {
      this.catch_ = 0;
   }

   public void new_() {
      this.final_();
      this.protected_ = 5999;
   }

   public boolean package_() {
      return this.catch_ > 0;
   }

   private void return_() {
      if (this.public_()) {
         for (rsE_2 var2 : ((rYB)this.throws_[7]).class_(rsE_2.class, this.rN().byte_(0.5, 0.0, 0.5), var1 -> var1 != this && var1.public_())) {
            if (var2.public_()) {
               this.class_(var2);
               if ((Boolean)this.throws_[27]) {
                  break;
               }
            }
         }
      }
   }

   private void super_() {
      rjU_2 var1 = this.rv();
      this.catch_(var1.break_ * 0.99F, var1.byte_ + (double)(var1.byte_ < 0.06F ? 5.0E-4F : 0.0F), var1.protected_ * 0.99F);
   }

   private boolean public_() {
      rdn_3 var1 = this.protected_();
      return this.BM() && this.catch_ != 32767 && this.protected_ != -32768 && this.protected_ < 6000 && var1.char_() < var1.byte_();
   }

   public rdn_3 protected_() {
      return this.BQ().class_(break_);
   }

   public void private_() {
      this.catch_ = 10;
   }

   public void final_() {
      this.catch_ = 32767;
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected void m_() {
      this.BQ().class_(break_, rdn_3.break_);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }

   @Override
   public void c_(rhd_3 var1) {
      if (!((rYB)this.throws_[7]).continue_) {
         rdn_3 var2 = this.protected_();
         rdb_3 var3 = var2.break_();
         int var4 = var2.char_();
         if (this.catch_ == 0 && (this.finally_ == null || this.finally_.equals(var1.ro())) && ((rhz_3)var1.implements_[1]).throws_(var2)) {
            var1.class_(this, var4);
            if (var2.class_()) {
               this.PD();
               var2.throws_(var4);
            }

            var1.class_(rlB_2.throws_.break_(var3), var4);
            var1.class_(this);
         }
      }
   }
}
