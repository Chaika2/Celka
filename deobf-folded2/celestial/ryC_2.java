package celestial;

public class ryC_2 extends rye_3 {
   protected ryC_2() {
      super("badRespawnPoint");
      this.id_continue();
      this.id_throws();
   }

   @Override
   public rgP_2 id_class(iB_2 var1) {
      rVi_1 var2 = rgv_3.id_class((rgP_2)(new rgn_3("death.attack.badRespawnPoint.link")))
         .id_class(
            var0 -> var0.id_class(new rgl_3(rgH_2.OPEN_URL, "https://bugs.mojang.com/browse/MCPE-28723"))
                  .id_class(new rgy_3(rgp_3.id_class, new rgN_2("MCPE-28723")))
         );
      return new rgn_3("death.attack.badRespawnPoint.message", var1.L_(), var2);
   }
}
