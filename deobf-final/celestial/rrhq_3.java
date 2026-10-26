package celestial;

public class rrhq_3 extends rrMi_1 {
   public rrhq_3() {
      super(aI_2.C, "slime", 0.25F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qV_2 var4 = new qV_2(var3);
      var4.throws_ = (wA_2<rGA>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wA_2 var3)) {
         return null;
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.EX, 0);
      } else if (var2.equals("left_eye")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.EX, 1);
      } else if (var2.equals("right_eye")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.EX, 2);
      } else {
         return var2.equals("mouth") ? (Iq_1)rrxr_3.class_(var3, rrxr_3.EX, 3) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new wA_2(16);
   }

   @Override
   public String[] case_() {
      return new String[]{"body", "left_eye", "right_eye", "mouth"};
   }
}
