package celestial;

public abstract class rrOG extends rrMi_1 {
   public rrOG(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tW_2 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return var3.class_;
      } else if (var2.equals("headwear")) {
         return var3.break_;
      } else if (var2.equals("body")) {
         return var3.byte_;
      } else if (var2.equals("left_arm")) {
         return var3.throws_;
      } else if (var2.equals("right_arm")) {
         return var3.protected_;
      } else if (var2.equals("left_leg")) {
         return var3.catch_;
      } else {
         return var2.equals("right_leg") ? var3.case_ : null;
      }
   }

   @Override
   public String[] case_() {
      return new String[]{"head", "headwear", "body", "left_arm", "right_arm", "left_leg", "right_leg"};
   }
}
