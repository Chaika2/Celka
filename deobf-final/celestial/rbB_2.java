package celestial;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rbB_2 extends rEi_1 {
   private static final UUID class_ = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final ix_3 break_ = new ix_3(class_, "Baby speed boost", 0.5, id_3.MULTIPLY_BASE);
   private static final rut_3<Boolean> protected_ = rmE_2.class_(rbB_2.class, ruw_3.implements_);
   private static final rut_3<Integer> super_ = rmE_2.class_(rbB_2.class, ruw_3.break_);
   private static final rut_3<Boolean> this_ = rmE_2.class_(rbB_2.class, ruw_3.implements_);
   private static final Predicate<rRO> else_ = var0 -> var0 == rRO.HARD;
   private final rPi_1 synchronized_ = new rPi_1(this, else_);
   private boolean return_;
   private int public_;
   private int goto_;

   @Override
   protected int byte_(rhd_3 var1) {
      if (this.n_()) {
         this.finally_ = (int)((float)this.finally_ * 2.5F);
      }

      return super.byte_(var1);
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.We;
   }

   public rbB_2(aI_2<? extends rbB_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rbB_2(rYB var1) {
      this(aI_2.rs, var1);
   }

   @Override
   public void this_() {
      if (!((rYB)this.throws_[7]).continue_ && this.BM() && !this.c()) {
         if (this.sQ()) {
            this.goto_--;
            if (this.goto_ < 0) {
               this.sW();
            }
         } else if (this.sd()) {
            if (this.class_(rlG_2.break_)) {
               this.public_++;
               if (this.public_ >= 600) {
                  this.class_(300);
               }
            } else {
               this.public_ = -1;
            }
         }
      }

      super.this_();
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (protected_.equals(var1)) {
         this.q_();
      }

      super.class_(var1);
   }

   @Override
   public void class_(boolean var1) {
      this.BQ().break_(protected_, var1);
      if ((rYB)this.throws_[7] != null && !((rYB)this.throws_[7]).continue_) {
         ic_3 var2 = this.byte_(iQ_2.protected_);
         var2.protected_(break_);
         if (var1) {
            var2.break_(break_);
         }
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("IsBaby", this.n_());
      var1.class_("CanBreakDoors", this.sN());
      var1.break_("InWaterTime", this.rT() ? this.public_ : -1);
      var1.break_("DrownedConversionTime", this.sQ() ? this.goto_ : -1);
   }

   @Override
   protected void class_(rye_3 var1, int var2, boolean var3) {
      super.class_(var1, var2, var3);
      if (var1.extends_() instanceof rEJ var5 && var5.sd()) {
         rdn_3 var6 = this.sx();
         if (!var6.class_()) {
            var5.sk();
            this.a_(var6);
         }
      }
   }

   private void class_(int var1) {
      this.goto_ = var1;
      this.BQ().break_(this_, true);
   }

   public static boolean class_(Random var0) {
      return var0.nextFloat() < 0.05F;
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      var4 = super.class_(var1, var2, var3, var4, var5);
      float var6 = var2.byte_();
      this.byte_(((Random)this.throws_[40]).nextFloat() < 0.55F * var6);
      if (var4 == null) {
         var4 = new rbs_3(class_(var1.long_()), true);
      }

      if (var4 instanceof rbs_3 var7) {
         if (var7.class_) {
            this.class_(true);
            if (var7.break_) {
               if ((double)var1.long_().nextFloat() < 0.05) {
                  List var8 = var1.class_(rbR_2.class, this.rN().byte_(5.0, 3.0, 5.0), rpJ_2.byte_);
                  if (!var8.isEmpty()) {
                     rbR_2 var9 = (rbR_2)var8.get(0);
                     var9.this_(true);
                     this.this_(var9);
                  }
               } else if ((double)var1.long_().nextFloat() < 0.05) {
                  rbR_2 var12 = aI_2.finally_.class_((rYB)this.throws_[7]);
                  var12.class_(this.rx(), this.re(), this.BO(), (Float)this.throws_[15], 0.0F);
                  var12.class_(var1, var2, iO_2.JOCKEY, (aU_2)null, (rcd_3)null);
                  var12.this_(true);
                  this.this_(var12);
                  var1.a_(var12);
               }
            }
         }

         this.else_(this.L() && ((Random)this.throws_[40]).nextFloat() < var6 * 0.1F);
         this.class_(var2);
         this.break_(var2);
      }

      if (this.class_(rXQ.HEAD).class_()) {
         LocalDate var11 = LocalDate.now();
         int var13 = var11.get(ChronoField.DAY_OF_MONTH);
         int var14 = var11.get(ChronoField.MONTH_OF_YEAR);
         if (var14 == 10 && var13 == 31 && ((Random)this.throws_[40]).nextFloat() < 0.25F) {
            this.class_(rXQ.HEAD, new rdn_3(((Random)this.throws_[40]).nextFloat() < 0.1F ? xu_3.BP : xu_3.Br));
            this.continue_[rXQ.HEAD.break_()] = 0.0F;
         }
      }

      this.throw_(var6);
      return var4;
   }

   @Override
   protected void class_(rRh_1 var1) {
      super.class_(var1);
      if (((Random)this.throws_[40]).nextFloat() < (((rYB)this.throws_[7]).abstract_() == rRO.HARD ? 0.05F : 0.01F)) {
         int var2 = ((Random)this.throws_[40]).nextInt(3);
         if (var2 == 0) {
            this.class_(rXQ.MAINHAND, new rdn_3(rdy_3.Oy));
         } else {
            this.class_(rXQ.MAINHAND, new rdn_3(rdy_3.Op));
         }
      }
   }

   @Override
   public void class_(rrEm_1 var1, iB_2 var2) {
      super.class_(var1, var2);
      if ((var1.abstract_() == rRO.NORMAL || var1.abstract_() == rRO.HARD) && var2 instanceof rsq_3) {
         if (var1.abstract_() != rRO.HARD && ((Random)this.throws_[40]).nextBoolean()) {
            return;
         }

         rsq_3 var3 = (rsq_3)var2;
         rbE_2 var4 = var3.class_(aI_2.rG, false);
         var4.class_(var1, var1.throws_(var4.Bs()), iO_2.CONVERSION, new rbs_3(false, true), (rcd_3)null);
         var4.class_(var3.su());
         var4.class_((rcZ_2)var3.sL().class_(rcf_3.class_).getValue());
         var4.catch_(var3.break_().class_());
         var4.class_(var3.protected_());
         if (!this.BF()) {
            var1.class_((rhd_3)null, 1026, this.Bs(), 0);
         }
      }
   }

   protected void sc() {
      this.byte_(iQ_2.native_).class_(((Random)this.throws_[40]).nextDouble() * 0.1F);
   }

   @Override
   public void default_() {
      if (this.BM()) {
         boolean var1 = this.R_() && this.F();
         if (var1) {
            rdn_3 var2 = this.class_(rXQ.HEAD);
            if (!var2.class_()) {
               if (var2.throws_()) {
                  var2.break_(var2.catch_() + ((Random)this.throws_[40]).nextInt(2));
                  if (var2.catch_() >= var2.private_()) {
                     this.break_(rXQ.HEAD);
                     this.class_(rXQ.HEAD, rdn_3.break_);
                  }
               }

               var1 = false;
            }

            if (var1) {
               this.case_(8);
            }
         }
      }

      super.default_();
   }

   protected boolean sd() {
      return true;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.class_(var1.new_("IsBaby"));
      this.else_(var1.new_("CanBreakDoors"));
      this.public_ = var1.private_("InWaterTime");
      if (var1.byte_("DrownedConversionTime", 99) && var1.private_("DrownedConversionTime") > -1) {
         this.class_(var1.private_("DrownedConversionTime"));
      }
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(this.sJ(), 0.15F, 1.0F);
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return this.n_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (!super.break_(var1, var2)) {
         return false;
      } else if (!((rYB)this.throws_[7] instanceof rrEm_1 var3)) {
         return false;
      } else {
         iB_2 var4 = this.I_();
         if (var4 == null && var1.extends_() instanceof iB_2) {
            var4 = (iB_2)var1.extends_();
         }

         if (var4 != null
            && ((rYB)this.throws_[7]).abstract_() == rRO.HARD
            && (double)((Random)this.throws_[40]).nextFloat() < this.class_(iQ_2.native_)
            && ((rYB)this.throws_[7]).B().break_(rRu_1.protected_)) {
            int var5 = rfU_2.byte_(this.rx());
            int var6 = rfU_2.byte_(this.re());
            int var7 = rfU_2.byte_(this.BO());
            rbB_2 var8 = new rbB_2((rYB)this.throws_[7]);

            for (int var9 = 0; var9 < 50; var9++) {
               int var10 = var5 + rfU_2.class_((Random)this.throws_[40], 7, 40) * rfU_2.class_((Random)this.throws_[40], -1, 1);
               int var11 = var6 + rfU_2.class_((Random)this.throws_[40], 7, 40) * rfU_2.class_((Random)this.throws_[40], -1, 1);
               int var12 = var7 + rfU_2.class_((Random)this.throws_[40], 7, 40) * rfU_2.class_((Random)this.throws_[40], -1, 1);
               rfH_2 var13 = new rfH_2(var10, var11, var12);
               aI_2 var14 = var8.BC();
               aw_3 var15 = aq_3.class_(var14);
               if (rrEj_1.class_(var15, (rYB)this.throws_[7], var13, var14) && aq_3.class_(var14, var3, iO_2.REINFORCEMENT, var13, ((rYB)this.throws_[7]).int_)
                  )
                {
                  var8.new_((double)var10, (double)var11, (double)var12);
                  if (!((rYB)this.throws_[7]).class_((double)var10, (double)var11, (double)var12, 7.0)
                     && ((rYB)this.throws_[7]).protected_(var8)
                     && ((rYB)this.throws_[7]).throws_(var8)
                     && !((rYB)this.throws_[7]).protected_(var8.rN())) {
                     var8.byte_(var4);
                     var8.class_(var3, ((rYB)this.throws_[7]).throws_(var8.Bs()), iO_2.REINFORCEMENT, (aU_2)null, (rcd_3)null);
                     var3.class_(var8);
                     this.byte_(iQ_2.native_).byte_(new ix_3("Zombie reinforcement caller charge", -0.05F, id_3.ADDITION));
                     var8.byte_(iQ_2.native_).byte_(new ix_3("Zombie reinforcement callee charge", -0.05F, id_3.ADDITION));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   protected void break_(aI_2<? extends rbB_2> var1) {
      rbB_2 var2 = this.class_(var1, true);
      if (var2 != null) {
         var2.throw_(((rYB)var2.throws_[7]).throws_(var2.Bs()).byte_());
         var2.else_(var2.L() && this.sN());
      }
   }

   protected void throws_() {
      this.package_.class_(2, new rSW(this, 1.0, false));
      this.package_.class_(6, new rBy_1(this, 1.0, true, 4, this::sN));
      this.package_.class_(7, new rSk_1(this, 1.0));
      this.int_.class_(1, new rBc_1(this).class_(rbG_2.class));
      this.int_.class_(2, new rBI<>(this, rhd_3.class, true));
      this.int_.class_(3, new rBI<>(this, rsy_3.class, false));
      this.int_.class_(3, new rBI<>(this, rMZ.class, true));
      this.int_.class_(5, new rBI<>(this, rON.class, 10, true, false, rON.super_));
   }

   protected boolean L() {
      return true;
   }

   protected rdn_3 sx() {
      return new rdn_3(rdy_3.dx);
   }

   public void else_(boolean var1) {
      if (this.L() && rpc_3.class_(this)) {
         if (this.return_ != var1) {
            this.return_ = var1;
            ((rLA)this.public_()).class_(var1);
            if (var1) {
               this.package_.class_(1, this.synchronized_);
            } else {
               this.package_.class_(this.synchronized_);
            }
         }
      } else if (this.return_) {
         this.package_.class_(this.synchronized_);
         this.return_ = false;
      }
   }

   protected void throw_(float var1) {
      this.sc();
      this.byte_(iQ_2.byte_).byte_(new ix_3("Random spawn bonus", ((Random)this.throws_[40]).nextDouble() * 0.05F, id_3.ADDITION));
      double var2 = ((Random)this.throws_[40]).nextDouble() * 1.5 * (double)var1;
      if (var2 > 1.0) {
         this.byte_(iQ_2.break_).byte_(new ix_3("Random zombie-spawn bonus", var2, id_3.MULTIPLY_TOTAL));
      }

      if (((Random)this.throws_[40]).nextFloat() < var1 * 0.05F) {
         this.byte_(iQ_2.native_).byte_(new ix_3("Leader zombie bonus", ((Random)this.throws_[40]).nextDouble() * 0.25 + 0.5, id_3.ADDITION));
         this.byte_(iQ_2.class_).byte_(new ix_3("Leader zombie bonus", ((Random)this.throws_[40]).nextDouble() * 3.0 + 1.0, id_3.MULTIPLY_TOTAL));
         this.else_(this.L());
      }
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.Wf;
   }

   @Override
   public boolean public_(an_3 var1) {
      boolean var2 = super.public_(var1);
      if (var2) {
         float var3 = ((rYB)this.throws_[7]).throws_(this.Bs()).break_();
         if (this.ss().class_() && this.Pz() && ((Random)this.throws_[40]).nextFloat() < var3 * 0.3F) {
            var1.case_(2 * (int)var3);
         }
      }

      return var2;
   }

   @Override
   public boolean private_(rdn_3 var1) {
      return var1.break_() == rdy_3.XJ && this.n_() && this.Pm() ? false : super.private_(var1);
   }

   @Override
   protected void final_() {
      this.package_.class_(4, new rbS_2(this, this, 1.0, 3));
      this.package_.class_(8, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(8, new rBC(this));
      this.throws_();
   }

   public static iz_3 sz() {
      return rEi_1.sm().class_(iQ_2.break_, 35.0).class_(iQ_2.protected_, 0.23F).class_(iQ_2.case_, 3.0).class_(iQ_2.implements_, 2.0).class_(iQ_2.native_);
   }

   protected boolean R_() {
      return true;
   }

   @Override
   public double Pv() {
      return this.n_() ? 0.0 : -0.45;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.WY;
   }

   protected rqA_2 sJ() {
      return rqn_3.zS;
   }

   public boolean sN() {
      return this.return_;
   }

   @Override
   public aL_2 sG() {
      return aL_2.break_;
   }

   protected void sW() {
      this.break_(aI_2.new_);
      if (!this.BF()) {
         ((rYB)this.throws_[7]).class_((rhd_3)null, 1040, this.Bs(), 0);
      }
   }

   public boolean sQ() {
      return this.BQ().class_(this_);
   }

   @Override
   protected void m_() {
      super.m_();
      this.BQ().class_(protected_, false);
      this.BQ().class_(super_, 0);
      this.BQ().class_(this_, false);
   }

   @Override
   public boolean n_() {
      return this.BQ().class_(protected_);
   }
}
