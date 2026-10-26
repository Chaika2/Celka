package celestial;

import java.util.Random;
import java.util.UUID;

public class rbG_2 extends rbB_2 implements ag_3 {
   private static final UUID class_ = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final ix_3 break_ = new ix_3(class_, "Attacking speed boost", 0.05, id_3.ADDITION);
   private static final rqb_3 protected_ = rqt_3.class_(0, 1);
   private int super_;
   private static final rqb_3 this_ = rqt_3.class_(20, 39);
   private int else_;
   private UUID synchronized_;
   private static final rqb_3 return_ = rqt_3.class_(4, 6);
   private int public_;

   @Override
   public void byte_(iB_2 var1) {
      if (this.I_() == null && var1 != null) {
         this.super_ = protected_.class_((Random)this.throws_[40]);
         this.public_ = return_.class_((Random)this.throws_[40]);
      }

      if (var1 instanceof rhd_3) {
         this.break_((rhd_3)var1);
      }

      super.byte_(var1);
   }

   @Override
   public UUID byte_() {
      return this.synchronized_;
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.zB;
   }

   @Override
   protected void double_() {
      ic_3 var1 = this.byte_(iQ_2.protected_);
      if (this.T_()) {
         if (!this.n_() && !var1.class_(break_)) {
            var1.break_(break_);
         }

         this.sZ();
      } else if (var1.class_(break_)) {
         var1.protected_(break_);
      }

      this.class_((rrEm_1)((rYB)this.throws_[7]), true);
      if (this.I_() != null) {
         this.sv();
      }

      if (this.T_()) {
         Integer var6 = (Integer)this.throws_[41];
         this.private_[31] = var6;
      }

      super.double_();
   }

   public rbG_2(aI_2<? extends rbG_2> var1, rYB var2) {
      super(var1, var2);
      this.class_(rLp_1.LAVA, 8.0F);
   }

   @Override
   public boolean class_(rRR var1) {
      return var1.protected_(this) && !var1.protected_(this.rN());
   }

   @Override
   protected void class_(rRh_1 var1) {
      this.class_(rXQ.MAINHAND, new rdn_3(rdy_3.OA));
   }

   @Override
   public void class_(int var1) {
      this.else_ = var1;
   }

   @Override
   public int class_() {
      return this.else_;
   }

   @Override
   public void class_(UUID var1) {
      this.synchronized_ = var1;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      this.a_(var1);
   }

   @Override
   protected void sc() {
      this.byte_(iQ_2.native_).class_(0.0);
   }

   @Override
   protected boolean sd() {
      return false;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.class_((rrEm_1)((rYB)this.throws_[7]), var1);
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      return this.class_(var1) ? false : super.break_(var1, var2);
   }

   public static boolean break_(aI_2<rbG_2> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.abstract_() != rRO.PEACEFUL && var1.byte_(var3.break_()).break_() != xu_3.bg;
   }

   @Override
   public boolean throws_(rhd_3 var1) {
      return this.b_(var1);
   }

   @Override
   protected void throws_() {
      this.package_.class_(2, new rSW(this, 1.0, false));
      this.package_.class_(7, new rSk_1(this, 1.0));
      this.int_.class_(1, new rBc_1(this).class_());
      this.int_.class_(2, new rBI<>(this, rhd_3.class, 10, true, false, this::b_));
      this.int_.class_(3, new rSP<>(this, true));
   }

   @Override
   protected rdn_3 sx() {
      return rdn_3.break_;
   }

   private void sv() {
      if (this.public_ > 0) {
         this.public_--;
      } else {
         if (this.goto_().class_(this.I_())) {
            this.sF();
         }

         this.public_ = return_.class_((Random)this.throws_[40]);
      }
   }

   @Override
   protected rqA_2 static_() {
      return this.T_() ? rqn_3.zr : rqn_3.Wi;
   }

   @Override
   public void protected_() {
      this.class_(this_.class_((Random)this.throws_[40]));
   }

   @Override
   public double Pv() {
      return this.n_() ? -0.05 : -0.45;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.zP;
   }

   private void sL() {
      this.class_(rqn_3.zr, this.Si() * 2.0F, this.SN() * 1.8F);
   }

   public static iz_3 su() {
      return rbB_2.sz().class_(iQ_2.native_, 0.0).class_(iQ_2.protected_, 0.23F).class_(iQ_2.case_, 5.0);
   }

   private void sZ() {
      if (this.super_ > 0) {
         this.super_--;
         if (this.super_ == 0) {
            this.sL();
         }
      }
   }

   private void sF() {
      double var1 = this.class_(iQ_2.break_);
      rfl_3 var3 = rfl_3.class_(this.Ps()).byte_(var1, 10.0, var1);
      ((rYB)this.throws_[7])
         .break_(rbG_2.class, var3)
         .stream()
         .filter(var1x -> var1x != this)
         .filter(var0 -> var0.I_() == null)
         .filter(var1x -> !var1x.final_(this.I_()))
         .forEach(var1x -> var1x.byte_(this.I_()));
   }
}
