package celestial;

public abstract class rrOY extends rrMi_1 {
   public rrOY(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   public rrOY(aI_2 var1, String var2, float var3, String[] var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tK_2 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.sx.class_(var3, 0);
      } else if (var2.equals("hat")) {
         return (Iq_1)rrxr_3.sx.class_(var3, 1);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.sx.class_(var3, 2);
      } else if (var2.equals("arms")) {
         return (Iq_1)rrxr_3.sx.class_(var3, 3);
      } else if (var2.equals("right_leg")) {
         return (Iq_1)rrxr_3.sx.class_(var3, 4);
      } else if (var2.equals("left_leg")) {
         return (Iq_1)rrxr_3.sx.class_(var3, 5);
      } else {
         if (var2.equals("nose")) {
            Iq_1 var4 = (Iq_1)rrxr_3.sx.class_(var3, 0);
            if (var4 != null) {
               return var4.class_(0);
            }
         }

         if (var2.equals("right_arm")) {
            return (Iq_1)rrxr_3.sx.class_(var3, 6);
         } else {
            return var2.equals("left_arm") ? (Iq_1)rrxr_3.sx.class_(var3, 7) : null;
         }
      }
   }

   @Override
   public String[] case_() {
      return new String[]{"head", "hat", "body", "arms", "right_leg", "left_leg", "nose", "right_arm", "left_arm"};
   }
}
