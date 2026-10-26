package celestial;

import java.util.Random;

public abstract class rGr_1 extends rEi_1 {
   private rfH_2 class_;
   private boolean break_;
   private boolean protected_;

   protected rGr_1(aI_2<? extends rGr_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var3 != iO_2.PATROL && var3 != iO_2.EVENT && var3 != iO_2.STRUCTURE && ((Random)this.throws_[40]).nextFloat() < 0.06F && this.su()) {
         this.break_ = true;
      }

      if (this.sF()) {
         this.class_(rXQ.HEAD, rrEr_1.new_());
         this.class_(rXQ.HEAD, 2.0F);
      }

      if (var3 == iO_2.PATROL) {
         this.protected_ = true;
      }

      return super.class_(var1, var2, var3, var4, var5);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      if (this.class_ != null) {
         var1.class_("PatrolTarget", rco_3.class_(this.class_));
      }

      var1.class_("PatrolLeader", this.break_);
      var1.class_("Patrolling", this.protected_);
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.throws_("PatrolTarget")) {
         this.class_ = rco_3.break_(var1.int_("PatrolTarget"));
      }

      this.break_ = var1.new_("PatrolLeader");
      this.protected_ = var1.new_("Patrolling");
   }

   public static boolean break_(aI_2<? extends rGr_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.class_(rRo_1.BLOCK, var3) > 8 ? false : byte_(var0, var1, var2, var3, var4);
   }

   public boolean sv() {
      return this.class_ != null;
   }

   public void implements_(rfH_2 var1) {
      this.class_ = var1;
      this.protected_ = true;
   }

   protected void return_(boolean var1) {
      this.protected_ = var1;
   }

   @Override
   public boolean private_(double var1) {
      return !this.protected_ || var1 > 16384.0;
   }

   @Override
   protected void final_() {
      super.final_();
      this.package_.class_(4, new rGP<>(this, 0.7, 0.595));
   }

   public void synchronized_(boolean var1) {
      this.break_ = var1;
      this.protected_ = true;
   }

   @Override
   public double Pv() {
      return -0.45;
   }

   public boolean sJ() {
      return true;
   }

   public void sL() {
      this.class_ = this.Bs().break_(-500 + ((Random)this.throws_[40]).nextInt(1000), 0, -500 + ((Random)this.throws_[40]).nextInt(1000));
      this.protected_ = true;
   }

   public boolean su() {
      return true;
   }

   public rfH_2 sZ() {
      return this.class_;
   }

   public boolean sF() {
      return this.break_;
   }

   protected boolean sA() {
      return this.protected_;
   }
}
