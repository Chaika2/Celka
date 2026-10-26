package celestial;

public class ryC_2 extends rye_3 {
   protected ryC_2() {
      super("badRespawnPoint");
      this.continue_();
      this.throws_();
   }

   @Override
   public rgP_2 class_(iB_2 var1) {
      rVi_1 var2 = rgv_3.class_((rgP_2)(new rgn_3("death.attack.badRespawnPoint.link")))
         .class_(
            var0 -> var0.class_(new rgl_3(rgH_2.OPEN_URL, "https://bugs.mojang.com/browse/MCPE-28723"))
                  .class_(new rgy_3(rgp_3.class_, new rgN_2("MCPE-28723")))
         );
      return new rgn_3("death.attack.badRespawnPoint.message", var1.L_(), var2);
   }
}
