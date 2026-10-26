package celestial;

public class rrhC_2 extends rrMi_1 {
   public rrhC_2() {
      super(aI_2.F, "shulker_bullet", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qw_3 var4 = new qw_3(var3);
      if (!rrxr_3.GB.protected_()) {
         rrbb_3.protected_("Field not found: RenderShulkerBullet.model");
         return null;
      } else {
         rrxr_3.class_(var4, rrxr_3.GB, var1);
         var4.byte_ = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wZ_2 var3)) {
         return null;
      } else {
         return var2.equals("bullet") ? (Iq_1)rrxr_3.EB.class_(var3) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new wZ_2();
   }

   @Override
   public String[] case_() {
      return new String[]{"bullet"};
   }
}
