package celestial;

public class rrOm_1 extends rrMi_1 {
   public rrOm_1() {
      super(aI_2.this_, "dragon", 0.5F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pw_3 var4 = new pw_3(var3);
      if (!rrxr_3.Sb.protected_()) {
         rrbb_3.protected_("Field not found: EnderDragonRenderer.model");
         return null;
      } else {
         rrxr_3.class_(var4, rrxr_3.Sb, var1);
         var4.byte_ = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof pI_2 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 0);
      } else if (var2.equals("spine")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 1);
      } else if (var2.equals("jaw")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 2);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 3);
      } else if (var2.equals("left_wing")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 4);
      } else if (var2.equals("left_wing_tip")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 5);
      } else if (var2.equals("front_left_leg")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 6);
      } else if (var2.equals("front_left_shin")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 7);
      } else if (var2.equals("front_left_foot")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 8);
      } else if (var2.equals("back_left_leg")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 9);
      } else if (var2.equals("back_left_shin")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 10);
      } else if (var2.equals("back_left_foot")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 11);
      } else if (var2.equals("right_wing")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 12);
      } else if (var2.equals("right_wing_tip")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 13);
      } else if (var2.equals("front_right_leg")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 14);
      } else if (var2.equals("front_right_shin")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 15);
      } else if (var2.equals("front_right_foot")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 16);
      } else if (var2.equals("back_right_leg")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 17);
      } else if (var2.equals("back_right_shin")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 18);
      } else {
         return var2.equals("back_right_foot") ? (Iq_1)rrxr_3.class_(var3, rrxr_3.So, 19) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new pI_2();
   }

   @Override
   public String[] case_() {
      return new String[]{
         "head",
         "spine",
         "jaw",
         "body",
         "left_wing",
         "left_wing_tip",
         "front_left_leg",
         "front_left_shin",
         "front_left_foot",
         "back_left_leg",
         "back_left_shin",
         "back_left_foot",
         "right_wing",
         "right_wing_tip",
         "front_right_leg",
         "front_right_shin",
         "front_right_foot",
         "back_right_leg",
         "back_right_shin",
         "back_right_foot"
      };
   }
}
