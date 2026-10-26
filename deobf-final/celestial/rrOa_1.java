package celestial;

public class rrOa_1 extends rrMi_1 {
   public rrOa_1() {
      super(aI_2.for_, "llama_spit", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qz_3 var4 = new qz_3(var3);
      if (!rrxr_3.EK.protected_()) {
         rrbb_3.protected_("Field not found: RenderLlamaSpit.model");
         return null;
      } else {
         rrxr_3.class_(var4, rrxr_3.EK, var1);
         var4.byte_ = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof ta_3 var3)) {
         return null;
      } else {
         return var2.equals("body") ? (Iq_1)rrxr_3.sF.class_(var3) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new ta_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"body"};
   }
}
