package celestial;

public class rrhR_2 extends rrMi_1 {
   public rrhR_2() {
      super(aI_2.g, "trident", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      Tr_1 var4 = new Tr_1(var3);
      if (!rrxr_3.Gs.protected_()) {
         rrbb_3.protected_("Field not found: RenderTrident.modelTrident");
         return null;
      } else {
         rrxr_3.class_(var4, rrxr_3.Gs, var1);
         var4.byte_ = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wp_3 var3)) {
         return null;
      } else {
         return var2.equals("body") ? (Iq_1)rrxr_3.Em.class_(var3) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new wp_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"body"};
   }
}
