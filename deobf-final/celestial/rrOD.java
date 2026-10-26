package celestial;

public class rrOD extends rrMi_1 {
   public rrOD() {
      super(aI_2.strictfp_, "lead_knot", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qJ_2 var4 = new qJ_2(var3);
      if (!rrxr_3.su.protected_()) {
         rrbb_3.protected_("Field not found: RenderLeashKnot.leashKnotModel");
         return null;
      } else {
         rrxr_3.class_(var4, rrxr_3.su, var1);
         var4.byte_ = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tU_2 var3)) {
         return null;
      } else {
         return var2.equals("knot") ? (Iq_1)rrxr_3.sN.class_(var3) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new tU_2();
   }

   @Override
   public String[] case_() {
      return new String[]{"knot"};
   }
}
