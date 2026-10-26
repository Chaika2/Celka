package celestial;

public class rrOl_1 extends rrMi_1 {
   public rrOl_1() {
      super(aI_2.id_public, "evoker_fangs", 0.0F, new String[]{"evocation_fangs"});
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      pR_2 var4 = new pR_2(var3);
      if (!rrxr_3.EY.id_protected()) {
         rrbb_3.id_protected("Field not found: RenderEvokerFangs.model");
         return null;
      } else {
         rrxr_3.id_class(var4, rrxr_3.EY, var1);
         var4.id_byte = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tq_3 var3)) {
         return null;
      } else if (var2.equals("base")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.Si, 0);
      } else if (var2.equals("upper_jaw")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.Si, 1);
      } else {
         return var2.equals("lower_jaw") ? (Iq_1)rrxr_3.id_class(var3, rrxr_3.Si, 2) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new tq_3();
   }

   @Override
   public String[] id_case() {
      return new String[]{"base", "upper_jaw", "lower_jaw"};
   }
}
