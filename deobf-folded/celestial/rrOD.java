package celestial;

public class rrOD extends rrMi_1 {
   public rrOD() {
      super(aI_2.id_strictfp, "lead_knot", 0.0F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qJ_2 var4 = new qJ_2(var3);
      if (!rrxr_3.su.id_protected()) {
         rrbb_3.id_protected("Field not found: RenderLeashKnot.leashKnotModel");
         return null;
      } else {
         rrxr_3.id_class(var4, rrxr_3.su, var1);
         var4.id_byte = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tU_2 var3)) {
         return null;
      } else {
         return var2.equals("knot") ? (Iq_1)rrxr_3.sN.id_class(var3) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new tU_2();
   }

   @Override
   public String[] id_case() {
      return new String[]{"knot"};
   }
}
