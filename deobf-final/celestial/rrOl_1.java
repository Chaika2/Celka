package celestial;

public class rrOl_1 extends rrMi_1 {
   public rrOl_1() {
      super(aI_2.public_, "evoker_fangs", 0.0F, new String[]{"evocation_fangs"});
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pR_2 var4 = new pR_2(var3);
      if (!rrxr_3.EY.protected_()) {
         rrbb_3.protected_("Field not found: RenderEvokerFangs.model");
         return null;
      } else {
         rrxr_3.class_(var4, rrxr_3.EY, var1);
         var4.byte_ = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tq_3 var3)) {
         return null;
      } else if (var2.equals("base")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.Si, 0);
      } else if (var2.equals("upper_jaw")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.Si, 1);
      } else {
         return var2.equals("lower_jaw") ? (Iq_1)rrxr_3.class_(var3, rrxr_3.Si, 2) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new tq_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"base", "upper_jaw", "lower_jaw"};
   }
}
