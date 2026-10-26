package celestial;

public abstract class rrOG extends rrMi_1 {
   public rrOG(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tW_2 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return var3.id_class;
      } else if (var2.equals("headwear")) {
         return var3.id_break;
      } else if (var2.equals("body")) {
         return var3.id_byte;
      } else if (var2.equals("left_arm")) {
         return var3.id_throws;
      } else if (var2.equals("right_arm")) {
         return var3.id_protected;
      } else if (var2.equals("left_leg")) {
         return var3.id_catch;
      } else {
         return var2.equals("right_leg") ? var3.id_case : null;
      }
   }

   @Override
   public String[] id_case() {
      return new String[]{"head", "headwear", "body", "left_arm", "right_arm", "left_leg", "right_leg"};
   }
}
