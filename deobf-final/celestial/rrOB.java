package celestial;

public class rrOB extends rrMi_1 {
   public rrOB() {
      super(aI_2.protected_, "bat", 0.25F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pc_3 var4 = new pc_3(var3);
      var4.throws_ = (td_3)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof td_3 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.SA, 0);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.SA, 1);
      } else if (var2.equals("right_wing")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.SA, 2);
      } else if (var2.equals("left_wing")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.SA, 3);
      } else if (var2.equals("outer_right_wing")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.SA, 4);
      } else {
         return var2.equals("outer_left_wing") ? (Iq_1)rrxr_3.class_(var3, rrxr_3.SA, 5) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new td_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"head", "body", "right_wing", "left_wing", "outer_right_wing", "outer_left_wing"};
   }
}
