package celestial;

public class rrhX_2 extends rrMi_1 {
   public rrhX_2() {
      super(aI_2.X, "parrot", 0.3F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qF_2 var4 = new qF_2(var3);
      var4.throws_ = (ws_3)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof ws_3 var3)) {
         return null;
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.st, 0);
      } else if (var2.equals("tail")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.st, 1);
      } else if (var2.equals("left_wing")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.st, 2);
      } else if (var2.equals("right_wing")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.st, 3);
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.st, 4);
      } else if (var2.equals("left_leg")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.st, 9);
      } else {
         return var2.equals("right_leg") ? (Iq_1)rrxr_3.class_(var3, rrxr_3.st, 10) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new ws_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"body", "tail", "left_wing", "right_wing", "head", "left_leg", "right_leg"};
   }
}
