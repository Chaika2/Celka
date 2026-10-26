package celestial;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public abstract class rOQ extends rbZ_2 {
   protected static final rut_3<Byte> return_ = rmE_2.class_(rOQ.class, ruw_3.class_);
   protected static final rut_3<Optional<UUID>> public_ = rmE_2.class_(rOQ.class, ruw_3.package_);
   private boolean super_;

   protected rOQ(aI_2<? extends rOQ> var1, rYB var2) {
      super(var1, var2);
      this.sm();
   }

   public boolean class_(iB_2 var1, iB_2 var2) {
      return true;
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 7) {
         this.synchronized_(true);
      } else if (var1 == 6) {
         this.synchronized_(false);
      } else {
         super.class_(var1);
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      if (this.sv() != null) {
         var1.class_("Owner", this.sv());
      }

      var1.class_("Sitting", this.super_);
   }

   protected void sm() {
   }

   @Override
   public void break_(rye_3 var1) {
      if (!((rYB)this.throws_[7]).continue_ && ((rYB)this.throws_[7]).B().break_(rRu_1.native_) && this.sF() instanceof rhN_2) {
         this.sF().class_(this.SW().break_(), rqR_2.break_);
      }

      super.break_(var1);
   }

   public void break_(UUID var1) {
      ((rmE_2)this.throws_[49]).break_(public_, Optional.ofNullable(var1));
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      UUID var2;
      if (var1.break_("Owner")) {
         var2 = var1.class_("Owner");
      } else {
         String var3 = var1.native_("Owner");
         var2 = rCE.class_(this.rC(), var3);
      }

      if (var2 != null) {
         try {
            this.break_(var2);
            this.return_(true);
         } catch (Throwable var4) {
            this.return_(false);
         }
      }

      this.super_ = var1.new_("Sitting");
      this.public_(this.super_);
   }

   public UUID sv() {
      return ((rmE_2)this.throws_[49]).class_(public_).orElse((UUID)null);
   }

   @Override
   public boolean Sc() {
      return (((rmE_2)this.throws_[49]).class_(return_) & 1) != 0;
   }

   @Override
   public boolean catch_(iB_2 var1) {
      return this.private_(var1) ? false : super.catch_(var1);
   }

   public void goto_(boolean var1) {
      this.super_ = var1;
   }

   public void case_(rhd_3 var1) {
      this.return_(true);
      this.break_(var1.ro());
      if (var1 instanceof rhN_2) {
         Oo_1.public_.class_((rhN_2)var1, this);
      }
   }

   public void return_(boolean var1) {
      byte var2 = ((rmE_2)this.throws_[49]).class_(return_);
      if (var1) {
         ((rmE_2)this.throws_[49]).break_(return_, (byte)(var2 | 4));
      } else {
         ((rmE_2)this.throws_[49]).break_(return_, (byte)(var2 & -5));
      }

      this.sm();
   }

   public void public_(boolean var1) {
      byte var2 = ((rmE_2)this.throws_[49]).class_(return_);
      if (var1) {
         ((rmE_2)this.throws_[49]).break_(return_, (byte)(var2 | 1));
      } else {
         ((rmE_2)this.throws_[49]).break_(return_, (byte)(var2 & -2));
      }
   }

   @Override
   public boolean protected_(rhd_3 var1) {
      return !this.z();
   }

   public boolean private_(iB_2 var1) {
      return var1 == this.sF();
   }

   @Override
   public boolean final_(an_3 var1) {
      if (this.sZ()) {
         iB_2 var2 = this.sF();
         if (var1 == var2) {
            return true;
         }

         if (var2 != null) {
            return var2.final_(var1);
         }
      }

      return super.final_(var1);
   }

   protected void synchronized_(boolean var1) {
      rLO var2 = rLQ.long_;
      if (!var1) {
         var2 = rLQ.double_;
      }

      for (int var3 = 0; var3 < 7; var3++) {
         double var4 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         double var6 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         double var8 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         ((rYB)this.throws_[7]).class_(var2, this.break_(1.0), this.Ph() + 0.5, this.protected_(1.0), var4, var6, var8);
      }
   }

   @Override
   public rnM_2 BG() {
      if (this.sZ()) {
         iB_2 var1 = this.sF();
         if (var1 != null) {
            return var1.BG();
         }
      }

      return super.BG();
   }

   public boolean sL() {
      return this.super_;
   }

   public boolean sZ() {
      return (((rmE_2)this.throws_[49]).class_(return_) & 4) != 0;
   }

   public iB_2 sF() {
      try {
         UUID var1 = this.sv();
         return var1 == null ? null : ((rYB)this.throws_[7]).class_(var1);
      } catch (IllegalArgumentException var2) {
         return null;
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(return_, (byte)0);
      ((rmE_2)this.throws_[49]).class_(public_, Optional.empty());
   }
}
