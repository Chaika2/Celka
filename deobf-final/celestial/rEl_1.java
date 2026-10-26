package celestial;

class rEl_1 extends rGt_1 {
   private final ay_3 throws_;

   rEl_1(rEA var1) {
      super(var1);
      this.class_ = var1;
      this.throws_ = new ay_3().class_(16.0).byte_().throws_().class_().break_();
   }

   @Override
   public boolean class_() {
      if (!super.class_()) {
         return false;
      } else {
         int var1 = ((rYB)this.class_.throws_[7]).class_(rGg_1.class, this.throws_, this.class_, this.class_.rN().class_(16.0)).size();
         return rEA.class_(this.class_).nextInt(8) + 1 > var1;
      }
   }

   @Override
   protected void finally_() {
      rrEm_1 var1 = (rrEm_1)((rYB)this.class_.throws_[7]);

      for (int var2 = 0; var2 < 3; var2++) {
         rfH_2 var3 = this.class_.Bs().break_(-2 + rEA.break_(this.class_).nextInt(5), 1, -2 + rEA.byte_(this.class_).nextInt(5));
         rGg_1 var4 = aI_2.K.class_((rYB)this.class_.throws_[7]);
         var4.class_(var3, 0.0F, 0.0F);
         var4.class_(var1, ((rYB)this.class_.throws_[7]).throws_(var3), iO_2.MOB_SUMMONED, (aU_2)null, (rcd_3)null);
         var4.class_(this.class_);
         var4.implements_(var3);
         var4.class_(20 * (30 + rEA.protected_(this.class_).nextInt(90)));
         var1.class_(var4);
      }
   }

   @Override
   protected int catch_() {
      return 100;
   }

   @Override
   protected rqA_2 extends_() {
      return rqn_3.Bi;
   }

   @Override
   protected int private_() {
      return 340;
   }

   @Override
   protected rGT native_() {
      return rGT.SUMMON_VEX;
   }
}
