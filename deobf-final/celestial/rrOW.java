package celestial;

public class rrOW extends rrMi_1 {
   public rrOW() {
      super(aI_2.extends_, "cod", 0.3F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pC_2 var4 = new pC_2(var3);
      var4.throws_ = (tF_2<rOI>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tF_2 var3)) {
         return null;
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.SV.class_(var3, 0);
      } else if (var2.equals("fin_back")) {
         return (Iq_1)rrxr_3.SV.class_(var3, 1);
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.SV.class_(var3, 2);
      } else if (var2.equals("nose")) {
         return (Iq_1)rrxr_3.SV.class_(var3, 3);
      } else if (var2.equals("fin_right")) {
         return (Iq_1)rrxr_3.SV.class_(var3, 4);
      } else if (var2.equals("fin_left")) {
         return (Iq_1)rrxr_3.SV.class_(var3, 5);
      } else {
         return var2.equals("tail") ? (Iq_1)rrxr_3.SV.class_(var3, 6) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new tF_2();
   }

   @Override
   public String[] case_() {
      return new String[]{"body", "fin_back", "head", "nose", "fin_right", "fin_left", "tail"};
   }
}
