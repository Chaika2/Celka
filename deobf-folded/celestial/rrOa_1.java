package celestial;

public class rrOa_1 extends rrMi_1 {
   public rrOa_1() {
      super(aI_2.id_for, "llama_spit", 0.0F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qz_3 var4 = new qz_3(var3);
      if (!rrxr_3.EK.id_protected()) {
         rrbb_3.id_protected("Field not found: RenderLlamaSpit.model");
         return null;
      } else {
         rrxr_3.id_class(var4, rrxr_3.EK, var1);
         var4.id_byte = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof ta_3 var3)) {
         return null;
      } else {
         return var2.equals("body") ? (Iq_1)rrxr_3.sF.id_class(var3) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new ta_3();
   }

   @Override
   public String[] id_case() {
      return new String[]{"body"};
   }
}
