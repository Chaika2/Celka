package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rba_3 extends rbZ_2 {
   private static final rut_3<Integer> super_ = rmE_2.class_(rba_3.class, ruw_3.break_);
   private static final rut_3<Byte> this_ = rmE_2.class_(rba_3.class, ruw_3.class_);
   private static final rut_3<Optional<UUID>> else_ = rmE_2.class_(rba_3.class, ruw_3.package_);
   private static final rut_3<Optional<UUID>> synchronized_ = rmE_2.class_(rba_3.class, ruw_3.package_);
   static final Predicate<rsE_2> return_ = var0 -> !var0.package_() && var0.BM();
   private static final Predicate<an_3> public_ = var0 -> !(var0 instanceof iB_2 var1)
         ? false
         : var1.SZ() != null && var1.SE() < (Integer)var1.throws_[41] + 600;
   static final Predicate<an_3> goto_ = var0 -> var0 instanceof rbR_2 || var0 instanceof rMi_1;
   private static final Predicate<an_3> while_ = var0 -> !var0.Pw() && rpJ_2.throws_.test(var0);
   private rBk_1 try_;
   private rBk_1 instanceof_;
   private rBk_1 throw_;
   private float interface_;
   private float char_;
   float abstract_;
   float long_;
   private int float_;

   @Override
   public void byte_(iB_2 var1) {
      if (this.sv() && var1 == null) {
         this.goto_(false);
      }

      super.byte_(var1);
   }

   boolean byte_(UUID var1) {
      return this.sZ().contains(var1);
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.SL;
   }

   @Override
   public void long_() {
      rqA_2 var1 = this.static_();
      if (var1 == rqn_3.SA) {
         this.class_(var1, 2.0F, this.SN());
      } else {
         super.long_();
      }
   }

   public rba_3(aI_2<? extends rba_3> var1, rYB var2) {
      super(var1, var2);
      this.extends_ = new rMO(this);
      this.native_ = new rMX(this);
      this.class_(rLp_1.DANGER_OTHER, 0.0F);
      this.class_(rLp_1.DAMAGE_OTHER, 0.0F);
      this.byte_(true);
   }

   public void this_(boolean var1) {
      this.protected_(1, var1);
   }

   @Override
   public void this_() {
      super.this_();
      if (this.try_()) {
         boolean var1 = this.rT();
         if (var1 || this.I_() != null || ((rYB)this.throws_[7]).S()) {
            this.sF();
         }

         if (var1 || this.Sc()) {
            this.this_(false);
         }

         if (this.sx() && ((rYB)this.throws_[7]).int_.nextFloat() < 0.2F) {
            rfH_2 var2 = this.Bs();
            xc_3 var3 = ((rYB)this.throws_[7]).byte_(var2);
            ((rYB)this.throws_[7]).byte_(2001, var2, xd_3.finally_(var3));
         }
      }

      this.char_ = this.interface_;
      if (this.su()) {
         this.interface_ = this.interface_ + (1.0F - this.interface_) * 0.4F;
      } else {
         this.interface_ = this.interface_ + (0.0F - this.interface_) * 0.4F;
      }

      this.long_ = this.abstract_;
      if (this.x()) {
         this.abstract_ += 0.2F;
         if (this.abstract_ > 3.0F) {
            this.abstract_ = 3.0F;
         }
      } else {
         this.abstract_ = 0.0F;
      }
   }

   @Override
   public boolean x() {
      return this.else_(4);
   }

   public rMN n() {
      return rMN.class_(((rmE_2)this.throws_[49]).class_(super_));
   }

   public float interface_(float var1) {
      return rfU_2.catch_(var1, this.long_, this.abstract_);
   }

   @Override
   protected void class_(rRh_1 var1) {
      if (((Random)this.throws_[40]).nextFloat() < 0.2F) {
         float var2 = ((Random)this.throws_[40]).nextFloat();
         rdn_3 var3;
         if (var2 < 0.05F) {
            var3 = new rdn_3(rdy_3.dP);
         } else if (var2 < 0.2F) {
            var3 = new rdn_3(rdy_3.XJ);
         } else if (var2 < 0.4F) {
            var3 = ((Random)this.throws_[40]).nextBoolean() ? new rdn_3(rdy_3.dy) : new rdn_3(rdy_3.dp);
         } else if (var2 < 0.6F) {
            var3 = new rdn_3(rdy_3.hB);
         } else if (var2 < 0.8F) {
            var3 = new rdn_3(rdy_3.ha);
         } else {
            var3 = new rdn_3(rdy_3.Oi);
         }

         this.class_(rXQ.MAINHAND, var3);
      }
   }

   @Override
   protected void class_(rhd_3 var1, is_3 var2) {
      ((rba_3)var2).break_(var1.ro());
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 45) {
         rdn_3 var2 = this.class_(rXQ.MAINHAND);
         if (!var2.class_()) {
            for (int var3 = 0; var3 < 8; var3++) {
               rjU_2 var4 = new rjU_2(((double)((Random)this.throws_[40]).nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .class_(-(Float)this.throws_[16] * (float) (Math.PI / 180.0))
                  .break_(-(Float)this.throws_[15] * (float) (Math.PI / 180.0));
               ((rYB)this.throws_[7])
                  .class_(
                     new rLk_1(rLQ.void_, var2),
                     this.rx() + this.m().break_ / 2.0,
                     this.re(),
                     this.BO() + this.m().protected_ / 2.0,
                     var4.break_,
                     var4.byte_ + 0.05,
                     var4.protected_
                  );
            }
         }
      } else {
         super.class_(var1);
      }
   }

   public static boolean class_(rba_3 var0, iB_2 var1) {
      double var2 = var1.BO() - var0.BO();
      double var4 = var1.rx() - var0.rx();
      double var6 = var2 / var4;
      byte var8 = 6;

      for (int var9 = 0; var9 < 6; var9++) {
         double var10 = var6 == 0.0 ? 0.0 : var2 * (double)((float)var9 / 6.0F);
         double var12 = var6 == 0.0 ? var4 * (double)((float)var9 / 6.0F) : var10 / var6;

         for (int var14 = 1; var14 < 4; var14++) {
            if (!((rYB)var0.throws_[7]).byte_(new rfH_2(var0.rx() + var12, var0.re() + (double)var14, var0.BO() + var10)).byte_().throws_()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      Optional var6 = var1.protected_(this.Bs());
      rMN var7 = rMN.class_(var6);
      boolean var8 = false;
      if (var4 instanceof rMb_1) {
         var7 = ((rMb_1)var4).class_;
         if (((rMb_1)var4).class_() >= 2) {
            var8 = true;
         }
      } else {
         var4 = new rMb_1(var7);
      }

      this.class_(var7);
      if (var8) {
         this.e_(-24000);
      }

      if (var1 instanceof rrEm_1) {
         this.sm();
      }

      this.class_(var2);
      return super.class_(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      List var2 = this.sZ();
      rcy_3 var3 = new rcy_3();

      for (UUID var5 : var2) {
         if (var5 != null) {
            var3.add(rco_3.class_(var5));
         }
      }

      var1.class_("Trusted", var3);
      var1.class_("Sleeping", this.Sc());
      var1.class_("Type", this.n().class_());
      var1.class_("Sitting", this.sJ());
      var1.class_("Crouching", this.x());
   }

   private void class_(rMN var1) {
      ((rmE_2)this.throws_[49]).break_(super_, var1.break_());
   }

   @Override
   protected void class_(rhd_3 var1, rdn_3 var2) {
      if (this.extends_(var2)) {
         this.class_(this.protected_(var2), 1.0F, 1.0F);
      }

      super.class_(var1, var2);
   }

   private void sm() {
      if (this.n() == rMN.RED) {
         this.int_.class_(4, this.try_);
         this.int_.class_(4, this.instanceof_);
         this.int_.class_(6, this.throw_);
      } else {
         this.int_.class_(4, this.throw_);
         this.int_.class_(6, this.try_);
         this.int_.class_(6, this.instanceof_);
      }
   }

   public boolean sc() {
      return this.abstract_ == 3.0F;
   }

   @Override
   public void default_() {
      if (!((rYB)this.throws_[7]).continue_ && this.BM() && this.try_()) {
         this.float_++;
         rdn_3 var1 = this.class_(rXQ.MAINHAND);
         if (this.native_(var1)) {
            if (this.float_ > 600) {
               rdn_3 var2 = var1.class_((rYB)this.throws_[7], this);
               if (!var2.class_()) {
                  this.class_(rXQ.MAINHAND, var2);
               }

               this.float_ = 0;
            } else if (this.float_ > 560 && ((Random)this.throws_[40]).nextFloat() < 0.1F) {
               this.class_(this.protected_(var1), 1.0F, 1.0F);
               ((rYB)this.throws_[7]).class_(this, (byte)45);
            }
         }

         iB_2 var10 = this.I_();
         if (var10 == null || !var10.BM()) {
            this.synchronized_(false);
            this.return_(false);
         }
      }

      if (this.Sc() || this.BK()) {
         Boolean var7 = false;
         this.private_[41] = var7;
         Float var8 = 0.0F;
         this.private_[42] = var8;
         Float var9 = 0.0F;
         this.private_[44] = var9;
      }

      super.default_();
      if (this.sv() && ((Random)this.throws_[40]).nextFloat() < 0.05F) {
         this.class_(rqn_3.Su, 1.0F, 1.0F);
      }
   }

   public boolean sd() {
      return this.else_(16);
   }

   void break_(UUID var1) {
      if (((rmE_2)this.throws_[49]).class_(else_).isPresent()) {
         ((rmE_2)this.throws_[49]).break_(synchronized_, Optional.ofNullable(var1));
      } else {
         ((rmE_2)this.throws_[49]).break_(else_, Optional.ofNullable(var1));
      }
   }

   @Override
   protected void break_(rsE_2 var1) {
      rdn_3 var2 = var1.protected_();
      if (this.private_(var2)) {
         int var3 = var2.char_();
         if (var3 > 1) {
            this.final_(var2.class_(var3 - 1));
         }

         this.volatile_(this.class_(rXQ.MAINHAND));
         this.class_(var1);
         this.class_(rXQ.MAINHAND, var2.class_(1));
         this.new_[rXQ.MAINHAND.break_()] = 2.0F;
         this.class_(var1, var2.char_());
         var1.PD();
         this.float_ = 0;
      }
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return this.n_() ? var2.break_ * 0.85F : 0.4F;
   }

   public rba_3 break_(rrEm_1 var1, au_3 var2) {
      rba_3 var3 = aI_2.throw_.class_(var1);
      var3.class_(((Random)this.throws_[40]).nextBoolean() ? this.n() : ((rba_3)var2).n());
      return var3;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      rcy_3 var2 = var1.protected_("Trusted", 11);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         this.break_(rco_3.class_(var2.finally_(var3)));
      }

      this.while_(var1.new_("Sleeping"));
      this.class_(rMN.class_(var1.native_("Type")));
      this.this_(var1.new_("Sitting"));
      this.synchronized_(var1.new_("Crouching"));
      if ((rYB)this.throws_[7] instanceof rrEm_1) {
         this.sm();
      }
   }

   @Override
   public boolean throws_(rdn_3 var1) {
      rXQ var2 = is_3.finally_(var1);
      return !this.class_(var2).class_() ? false : var2 == rXQ.MAINHAND && super.throws_(var1);
   }

   public static iz_3 L() {
      return is_3.package_().class_(iQ_2.protected_, 0.3F).class_(iQ_2.class_, 10.0).class_(iQ_2.break_, 32.0).class_(iQ_2.case_, 2.0);
   }

   public boolean sx() {
      return this.else_(64);
   }

   boolean sv() {
      return this.else_(128);
   }

   @Override
   public boolean Sc() {
      return this.else_(32);
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      return var1.break_() == rdy_3.WQ;
   }

   void goto_(boolean var1) {
      this.protected_(128, var1);
   }

   public void else_(boolean var1) {
      this.protected_(16, var1);
   }

   private boolean else_(int var1) {
      return (((rmE_2)this.throws_[49]).class_(this_) & var1) != 0;
   }

   @Override
   protected int implements_(float var1, float var2) {
      return rfU_2.case_((var1 - 5.0F) * var2);
   }

   public void return_(boolean var1) {
      this.protected_(8, var1);
   }

   public float throw_(float var1) {
      return rfU_2.catch_(var1, this.char_, this.interface_) * 0.11F * (float) Math.PI;
   }

   void while_(boolean var1) {
      this.protected_(32, var1);
   }

   @Override
   protected rqA_2 static_() {
      if (this.Sc()) {
         return rqn_3.Sn;
      } else {
         if (!((rYB)this.throws_[7]).strictfp_() && ((Random)this.throws_[40]).nextFloat() < 0.1F) {
            List var1 = ((rYB)this.throws_[7]).class_(rhd_3.class, this.rN().byte_(16.0, 16.0, 16.0), rpJ_2.catch_);
            if (var1.isEmpty()) {
               return rqn_3.SA;
            }
         }

         return rqn_3.Sm;
      }
   }

   void public_(boolean var1) {
      this.protected_(64, var1);
   }

   @Override
   protected void protected_(rye_3 var1) {
      rdn_3 var2 = this.class_(rXQ.MAINHAND);
      if (!var2.class_()) {
         this.a_(var2);
         this.class_(rXQ.MAINHAND, rdn_3.break_);
      }

      super.protected_(var1);
   }

   private void protected_(int var1, boolean var2) {
      if (var2) {
         ((rmE_2)this.throws_[49]).break_(this_, (byte)(((rmE_2)this.throws_[49]).class_(this_) | var1));
      } else {
         ((rmE_2)this.throws_[49]).break_(this_, (byte)(((rmE_2)this.throws_[49]).class_(this_) & ~var1));
      }
   }

   @Override
   public rqA_2 protected_(rdn_3 var1) {
      return rqn_3.SF;
   }

   @Override
   public boolean private_(rdn_3 var1) {
      rdb_3 var2 = var1.break_();
      rdn_3 var3 = this.class_(rXQ.MAINHAND);
      return var3.class_() || this.float_ > 0 && var2.super_() && !var3.break_().super_();
   }

   @Override
   protected void final_() {
      this.try_ = new rBI<>(this, rbZ_2.class, 10, false, false, var0 -> var0 instanceof rbR_2 || var0 instanceof rMi_1);
      this.instanceof_ = new rBI<>(this, rON.class, 10, false, false, rON.super_);
      this.throw_ = new rBI<>(this, rOp_1.class, 20, false, false, var0 -> var0 instanceof rOt_1);
      this.package_.class_(0, new rMQ(this));
      this.package_.class_(1, new rMM(this));
      this.package_.class_(2, new rMJ(this, 2.2));
      this.package_.class_(3, new rMh_1(this, 1.0));
      this.package_.class_(4, new rPD<>(this, rhd_3.class, 16.0F, 1.6, 1.4, var1 -> while_.test(var1) && !this.byte_(var1.ro()) && !this.sv()));
      this.package_.class_(4, new rPD<>(this, rOH.class, 8.0F, 1.6, 1.4, var1 -> !((rOH)var1).sZ() && !this.sv()));
      this.package_.class_(4, new rPD<>(this, rMK.class, 8.0F, 1.6, 1.4, var1 -> !this.sv()));
      this.package_.class_(5, new rMG(this));
      this.package_.class_(6, new rMx_1(this));
      this.package_.class_(6, new rMs_1(this, 1.25));
      this.package_.class_(7, new rMP(this, 1.2F, true));
      this.package_.class_(7, new rMW(this));
      this.package_.class_(8, new rME(this, this, 1.25));
      this.package_.class_(9, new rMz_1(this, 32, 200));
      this.package_.class_(10, new rMB(this, 1.2F, 12, 2));
      this.package_.class_(10, new rBv_1(this, 0.4F));
      this.package_.class_(11, new rSk_1(this, 1.0));
      this.package_.class_(11, new rMS(this));
      this.package_.class_(12, new rMc_1(this, this, (float)rhd_3.class, 24.0F));
      this.package_.class_(13, new rMk_1(this));
      this.int_.class_(3, new rMd_1(this, (boolean)iB_2.class, false, false, var1 -> public_.test(var1) && !this.byte_(var1.ro())));
   }

   private void final_(rdn_3 var1) {
      rsE_2 var2 = new rsE_2((rYB)this.throws_[7], this.rx(), this.re(), this.BO(), var1);
      ((rYB)this.throws_[7]).a_(var2);
   }

   private void volatile_(rdn_3 var1) {
      if (!var1.class_() && !((rYB)this.throws_[7]).continue_) {
         rsE_2 var2 = new rsE_2((rYB)this.throws_[7], this.rx() + this.m().break_, this.re() + 1.0, this.BO() + this.m().protected_, var1);
         var2.class_(40);
         var2.byte_(this.ro());
         this.class_(rqn_3.Sl, 1.0F, 1.0F);
         ((rYB)this.throws_[7]).a_(var2);
      }
   }

   public void synchronized_(boolean var1) {
      this.protected_(4, var1);
   }

   private boolean native_(rdn_3 var1) {
      return var1.break_().super_() && this.I_() == null && (Boolean)this.throws_[20] && !this.Sc();
   }

   @Override
   protected boolean BK() {
      return this.Sl();
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.55F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Sv;
   }

   public boolean sJ() {
      return this.else_(1);
   }

   void sL() {
      this.return_(false);
      this.synchronized_(false);
      this.this_(false);
      this.while_(false);
      this.goto_(false);
      this.public_(false);
   }

   public boolean su() {
      return this.else_(8);
   }

   List<UUID> sZ() {
      ArrayList var1 = Lists.newArrayList();
      var1.add(((rmE_2)this.throws_[49]).class_(else_).orElse((UUID)null));
      var1.add(((rmE_2)this.throws_[49]).class_(synchronized_).orElse((UUID)null));
      return var1;
   }

   void sF() {
      this.while_(false);
   }

   boolean sA() {
      return !this.Sc() && !this.sJ() && !this.sx();
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(else_, Optional.empty());
      ((rmE_2)this.throws_[49]).class_(synchronized_, Optional.empty());
      ((rmE_2)this.throws_[49]).class_(super_, 0);
      ((rmE_2)this.throws_[49]).class_(this_, (byte)0);
   }
}
