package celestial;

public class rrhT_2 extends rrMi_1 {
   public rrhT_2() {
      super(aI_2.H, "snow_golem", 0.5F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qg_3 var4 = new qg_3(var3);
      var4.throws_ = (wn_3<rOX>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wn_3 var3)) {
         return null;
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.Ex.class_(var3, 0);
      } else if (var2.equals("body_bottom")) {
         return (Iq_1)rrxr_3.Ex.class_(var3, 1);
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.Ex.class_(var3, 2);
      } else if (var2.equals("right_hand")) {
         return (Iq_1)rrxr_3.Ex.class_(var3, 3);
      } else {
         return var2.equals("left_hand") ? (Iq_1)rrxr_3.Ex.class_(var3, 4) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new wn_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"body", "body_bottom", "head", "right_hand", "left_hand"};
   }
}
