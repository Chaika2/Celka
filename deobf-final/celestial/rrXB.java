package celestial;

public class rrXB extends rrMi_1 {
   public rrXB() {
      super(aI_2.rP, "wither_skull", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      TJ var4 = new TJ(var3);
      if (!rrxr_3.GO.protected_()) {
         rrbb_3.protected_("Field not found: RenderWitherSkull_model");
         return null;
      } else {
         rrxr_3.class_(var4, rrxr_3.GO, var1);
         var4.byte_ = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tt_3 var3)) {
         return null;
      } else {
         return var2.equals("head") ? (Iq_1)rrxr_3.EG.class_(var3) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new tt_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"head"};
   }
}
