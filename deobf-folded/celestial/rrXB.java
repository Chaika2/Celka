package celestial;

public class rrXB extends rrMi_1 {
   public rrXB() {
      super(aI_2.rP, "wither_skull", 0.0F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      TJ var4 = new TJ(var3);
      if (!rrxr_3.GO.id_protected()) {
         rrbb_3.id_protected("Field not found: RenderWitherSkull_model");
         return null;
      } else {
         rrxr_3.id_class(var4, rrxr_3.GO, var1);
         var4.id_byte = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tt_3 var3)) {
         return null;
      } else {
         return var2.equals("head") ? (Iq_1)rrxr_3.EG.id_class(var3) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new tt_3();
   }

   @Override
   public String[] id_case() {
      return new String[]{"head"};
   }
}
