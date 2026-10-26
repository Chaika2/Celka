package celestial;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;

public class rbv_3 extends rbm_3 {
   private static final rut_3<Byte> class_ = rmE_2.class_(rbv_3.class, ruw_3.class_);
   private static final ay_3 break_ = new ay_3().class_(4.0).break_();
   private rfH_2 protected_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.Z;
   }

   @Override
   protected void double_() {
      super.double_();
      rfH_2 var1 = this.Bs();
      rfH_2 var2 = var1.final_();
      if (this.catch_()) {
         boolean var3 = this.BF();
         if (((rYB)this.throws_[7]).byte_(var2).catch_((rYB)this.throws_[7], var1)) {
            if (((Random)this.throws_[40]).nextInt(200) == 0) {
               Float var17 = (float)((Random)this.throws_[40]).nextInt(360);
               this.private_[25] = var17;
            }

            if (((rYB)this.throws_[7]).class_(break_, this) != null) {
               this.this_(false);
               if (!var3) {
                  ((rYB)this.throws_[7]).class_((rhd_3)null, 1025, var1, 0);
               }
            }
         } else {
            this.this_(false);
            if (!var3) {
               ((rYB)this.throws_[7]).class_((rhd_3)null, 1025, var1, 0);
            }
         }
      } else {
         if (this.protected_ != null && (!((rYB)this.throws_[7]).finally_(this.protected_) || this.protected_.c_() < 1)) {
            this.protected_ = null;
         }

         if (this.protected_ == null || ((Random)this.throws_[40]).nextInt(30) == 0 || this.protected_.class_(this.Ps(), 2.0)) {
            this.protected_ = new rfH_2(
               this.rx() + (double)((Random)this.throws_[40]).nextInt(7) - (double)((Random)this.throws_[40]).nextInt(7),
               this.re() + (double)((Random)this.throws_[40]).nextInt(6) - 2.0,
               this.BO() + (double)((Random)this.throws_[40]).nextInt(7) - (double)((Random)this.throws_[40]).nextInt(7)
            );
         }

         double var20 = (double)this.protected_.b_() + 0.5 - this.rx();
         double var5 = (double)this.protected_.c_() + 0.1 - this.re();
         double var7 = (double)this.protected_.d_() + 0.5 - this.BO();
         rjU_2 var9 = this.rv();
         rjU_2 var10 = var9.break_(
            (Math.signum(var20) * 0.5 - var9.break_) * 0.1F, (Math.signum(var5) * 0.7F - var9.byte_) * 0.1F, (Math.signum(var7) * 0.5 - var9.protected_) * 0.1F
         );
         this.byte_(var10);
         float var11 = (float)(rfU_2.protected_(var10.protected_, var10.break_) * 180.0F / (float)Math.PI) - 90.0F;
         float var12 = rfU_2.catch_(var11 - (Float)this.throws_[15]);
         Float var18 = 0.5F;
         this.private_[44] = var18;
         Float var19 = (Float)this.throws_[15] + var12;
         this.throws_[15] = var19;
         if (((Random)this.throws_[40]).nextInt(100) == 0 && ((rYB)this.throws_[7]).byte_(var2).catch_((rYB)this.throws_[7], var2)) {
            this.this_(true);
         }
      }
   }

   public rbv_3(aI_2<? extends rbv_3> var1, rYB var2) {
      super(var1, var2);
      this.this_(true);
   }

   public void this_(boolean var1) {
      byte var2 = ((rmE_2)this.throws_[49]).class_(class_);
      if (var1) {
         ((rmE_2)this.throws_[49]).break_(class_, (byte)(var2 | 1));
      } else {
         ((rmE_2)this.throws_[49]).break_(class_, (byte)(var2 & -2));
      }
   }

   @Override
   public void this_() {
      super.this_();
      if (this.catch_()) {
         this.byte_(rjU_2.class_);
         this.volatile_(this.rx(), (double)rfU_2.byte_(this.re()) + 1.0 - (double)this.Bm(), this.BO());
      } else {
         this.byte_(this.rv().throws_(1.0, 0.6, 1.0));
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("BatFlags", ((rmE_2)this.throws_[49]).class_(class_));
   }

   @Override
   public boolean class_(float var1, float var2) {
      return false;
   }

   @Override
   protected void class_(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else {
         if (!((rYB)this.throws_[7]).continue_ && this.catch_()) {
            this.this_(false);
         }

         return super.break_(var1, var2);
      }
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return var2.break_ / 2.0F;
   }

   public static boolean break_(aI_2<rbv_3> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      if (var3.c_() >= var1.short_()) {
         return false;
      } else {
         int var5 = var1.package_(var3);
         byte var6 = 4;
         if (implements_()) {
            var6 = 7;
         } else if (var4.nextBoolean()) {
            return false;
         }

         return var5 > var4.nextInt(var6) ? false : class_(var0, var1, var2, var3, var4);
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      ((rmE_2)this.throws_[49]).break_(class_, var1.case_("BatFlags"));
   }

   public static iz_3 throws_() {
      return is_3.package_().class_(iQ_2.class_, 6.0);
   }

   public boolean catch_() {
      return (((rmE_2)this.throws_[49]).class_(class_) & 1) != 0;
   }

   private static boolean implements_() {
      LocalDate var0 = LocalDate.now();
      int var1 = var0.get(ChronoField.DAY_OF_MONTH);
      int var2 = var0.get(ChronoField.MONTH_OF_YEAR);
      return var2 == 10 && var1 >= 20 || var2 == 11 && var1 <= 3;
   }

   @Override
   protected void instanceof_(an_3 var1) {
   }

   @Override
   public rqA_2 static_() {
      return this.catch_() && ((Random)this.throws_[40]).nextInt(4) != 0 ? null : rqn_3.u;
   }

   @Override
   public boolean rB() {
      return true;
   }

   @Override
   public boolean rG() {
      return false;
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.m;
   }

   @Override
   protected void SS() {
   }

   @Override
   protected float SN() {
      return super.SN() * 0.95F;
   }

   @Override
   protected float Si() {
      return 0.1F;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, (byte)0);
   }
}
