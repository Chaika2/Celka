package celestial;

import java.util.Random;
import java.util.UUID;

public class rMZ extends rMu_1 implements ag_3 {
   protected static final rut_3<Byte> class_ = rmE_2.class_(rMZ.class, ruw_3.class_);
   private int break_;
   private int protected_;
   private static final rqb_3 super_ = rqt_3.class_(20, 39);
   private int this_;
   private UUID else_;

   @Override
   public UUID byte_() {
      return this.else_;
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.Ey;
   }

   public rMZ(aI_2<? extends rMZ> var1, rYB var2) {
      super(var1, var2);
      Float var7 = 1.0F;
      this.throws_[37] = var7;
   }

   public void this_(boolean var1) {
      if (var1) {
         this.protected_ = 400;
         ((rYB)this.throws_[7]).class_(this, (byte)11);
      } else {
         this.protected_ = 0;
         ((rYB)this.throws_[7]).class_(this, (byte)34);
      }
   }

   public rMv_1 n() {
      return rMv_1.class_(this.Ss() / this.SK());
   }

   @Override
   public void class_(int var1) {
      this.this_ = var1;
   }

   @Override
   public int class_() {
      return this.this_;
   }

   @Override
   public void class_(UUID var1) {
      this.else_ = var1;
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 4) {
         this.break_ = 10;
         this.class_(rqn_3.EC, 1.0F, 1.0F);
      } else if (var1 == 11) {
         this.protected_ = 400;
      } else if (var1 == 34) {
         this.protected_ = 0;
      } else {
         super.class_(var1);
      }
   }

   @Override
   public boolean class_(aI_2<?> var1) {
      if (this.sd() && var1 == aI_2.rM) {
         return false;
      } else {
         return var1 == aI_2.volatile_ ? false : super.class_(var1);
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("PlayerCreated", this.sd());
      this.a_(var1);
   }

   @Override
   public boolean class_(rRR var1) {
      rfH_2 var2 = this.Bs();
      rfH_2 var3 = var2.break_();
      xc_3 var4 = var1.byte_(var3);
      if (!var4.class_(var1, var3, this)) {
         return false;
      } else {
         for (int var5 = 1; var5 < 3; var5++) {
            rfH_2 var6 = var2.break_(var5);
            xc_3 var7 = var1.byte_(var6);
            if (!rrEj_1.class_(var1, var6, var7, var7.volatile_(), aI_2.import_)) {
               return false;
            }
         }

         return rrEj_1.class_(var1, var2, var1.byte_(var2), rXG.class_.private_(), aI_2.import_) && var1.protected_(this);
      }
   }

   @Override
   public void default_() {
      super.default_();
      if (this.break_ > 0) {
         this.break_--;
      }

      if (this.protected_ > 0) {
         this.protected_--;
      }

      if (case_(this.rv()) > 2.5000003E-7F && ((Random)this.throws_[40]).nextInt(5) == 0) {
         int var1 = rfU_2.byte_(this.rx());
         int var2 = rfU_2.byte_(this.re() - 0.2F);
         int var3 = rfU_2.byte_(this.BO());
         xc_3 var4 = ((rYB)this.throws_[7]).byte_(new rfH_2(var1, var2, var3));
         if (!var4.catch_()) {
            ((rYB)this.throws_[7])
               .class_(
                  new rLX(rLQ.protected_, var4),
                  this.rx() + ((double)((Random)this.throws_[40]).nextFloat() - 0.5) * (double)this.PN(),
                  this.re() + 0.1,
                  this.BO() + ((double)((Random)this.throws_[40]).nextFloat() - 0.5) * (double)this.PN(),
                  4.0 * ((double)((Random)this.throws_[40]).nextFloat() - 0.5),
                  0.5,
                  ((double)((Random)this.throws_[40]).nextFloat() - 0.5) * 4.0
               );
         }
      }

      if (!((rYB)this.throws_[7]).continue_) {
         this.class_((rrEm_1)((rYB)this.throws_[7]), true);
      }
   }

   public boolean sd() {
      return (((rmE_2)this.throws_[49]).class_(class_) & 1) != 0;
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.Eq, 1.0F, 1.0F);
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      rMv_1 var3 = this.n();
      boolean var4 = super.break_(var1, var2);
      if (var4 && this.n() != var3) {
         this.class_(rqn_3.El, 1.0F, 1.0F);
      }

      return var4;
   }

   @Override
   public void break_(rye_3 var1) {
      super.break_(var1);
   }

   @Override
   protected ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      rdb_3 var4 = var3.break_();
      if (var4 != rdy_3.Ox) {
         return ryZ_2.PASS;
      } else {
         float var5 = this.Ss();
         this.protected_(25.0F);
         if (this.Ss() == var5) {
            return ryZ_2.PASS;
         } else {
            float var6 = 1.0F + (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F;
            this.class_(rqn_3.Ep, 1.0F, var6);
            if (!((rhx_3)var1.implements_[18]).protected_) {
               var3.catch_(1);
            }

            return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
         }
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.else_(var1.new_("PlayerCreated"));
      this.class_((rrEm_1)((rYB)this.throws_[7]), var1);
   }

   public static iz_3 L() {
      return is_3.package_().class_(iQ_2.class_, 100.0).class_(iQ_2.protected_, 0.25).class_(iQ_2.byte_, 1.0).class_(iQ_2.case_, 15.0);
   }

   public int sx() {
      return this.protected_;
   }

   private float sk() {
      return (float)this.class_(iQ_2.case_);
   }

   public void else_(boolean var1) {
      byte var2 = ((rmE_2)this.throws_[49]).class_(class_);
      if (var1) {
         ((rmE_2)this.throws_[49]).break_(class_, (byte)(var2 | 1));
      } else {
         ((rmE_2)this.throws_[49]).break_(class_, (byte)(var2 & -2));
      }
   }

   @Override
   protected void instanceof_(an_3 var1) {
      if (var1 instanceof rEK && !(var1 instanceof rEJ) && this.Sa().nextInt(20) == 0) {
         this.byte_((iB_2)var1);
      }

      super.instanceof_(var1);
   }

   @Override
   public boolean public_(an_3 var1) {
      this.break_ = 10;
      ((rYB)this.throws_[7]).class_(this, (byte)4);
      float var2 = this.sk();
      float var3 = (int)var2 > 0 ? var2 / 2.0F + (float)((Random)this.throws_[40]).nextInt((int)var2) : var2;
      boolean var4 = var1.break_(rye_3.byte_(this), var3);
      if (var4) {
         var1.byte_(var1.rv().break_(0.0, 0.4F, 0.0));
         this.class_(this, var1);
      }

      this.class_(rqn_3.EC, 1.0F, 1.0F);
      return var4;
   }

   @Override
   public void protected_() {
      this.class_(super_.class_((Random)this.throws_[40]));
   }

   @Override
   protected int final_(int var1) {
      return var1;
   }

   @Override
   protected void final_() {
      this.package_.class_(1, new rBl_1(this, 1.0, true));
      this.package_.class_(2, new rBt_1(this, 0.9, 32.0F));
      this.package_.class_(2, new rSS(this, 0.6, false));
      this.package_.class_(4, new rBo_1(this, 0.6));
      this.package_.class_(5, new rSE(this));
      this.package_.class_(7, new rBA(this, rhd_3.class, 6.0F));
      this.package_.class_(8, new rBC(this));
      this.int_.class_(1, new rBE(this));
      this.int_.class_(2, new rBc_1(this));
      this.int_.class_(3, new rBI<>(this, rhd_3.class, 10, true, false, this::b_));
      this.int_.class_(3, new rBI<>(this, is_3.class, 5, false, false, var0 -> var0 instanceof rEK && !(var0 instanceof rEJ)));
      this.int_.class_(4, new rSP<>(this, false));
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.875F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.EH;
   }

   public int sJ() {
      return this.break_;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, (byte)0);
   }
}
