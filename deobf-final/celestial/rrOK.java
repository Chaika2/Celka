package celestial;

public class rrOK extends rrMi_1 {
   public rrOK() {
      super(aI_2.import_, "iron_golem", 0.5F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qO_2 var4 = new qO_2(var3);
      var4.throws_ = (tD_2<rMZ>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tD_2 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.sk.class_(var3, 0);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.sk.class_(var3, 1);
      } else if (var2.equals("right_arm")) {
         return (Iq_1)rrxr_3.sk.class_(var3, 2);
      } else if (var2.equals("left_arm")) {
         return (Iq_1)rrxr_3.sk.class_(var3, 3);
      } else if (var2.equals("left_leg")) {
         return (Iq_1)rrxr_3.sk.class_(var3, 4);
      } else {
         return var2.equals("right_leg") ? (Iq_1)rrxr_3.sk.class_(var3, 5) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new tD_2();
   }

   @Override
   public String[] case_() {
      return new String[]{"head", "body", "right_arm", "left_arm", "left_leg", "right_leg"};
   }
}
