package celestial;

public class rsu_3 extends rsJ_2 {
   public rsu_3(aI_2<?> var1, rYB var2) {
      super(var1, var2);
   }

   public rsu_3(rYB var1, double var2, double var4, double var6) {
      super(aI_2.switch_, var1, var2, var4, var6);
   }

   @Override
   public void class_(int var1, int var2, int var3, boolean var4) {
      if (var4) {
         if (this.BP()) {
            this.Bn();
         }

         if (this.private_() == 0) {
            this.break_(-this.implements_());
            this.class_(10);
            this.byte_(50.0F);
            this.rf();
         }
      }
   }

   @Override
   public ryZ_2 class_(rhd_3 var1, rpm_3 var2) {
      if (var1.sN()) {
         return ryZ_2.PASS;
      } else if (this.BP()) {
         return ryZ_2.PASS;
      } else if (!((rYB)this.throws_[7]).continue_) {
         return var1.this_(this) ? ryZ_2.CONSUME : ryZ_2.PASS;
      } else {
         return ryZ_2.SUCCESS;
      }
   }

   @Override
   public rsd_3 final_() {
      return rsd_3.RIDEABLE;
   }
}
