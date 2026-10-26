package celestial;

public class rrOk_1 extends rrMi_1 {
   public rrOk_1() {
      super(aI_2.finally_, "chicken", 0.3F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pn_3 var4 = new pn_3(var3);
      var4.throws_ = (tv_3<rbR_2>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tv_3 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.Sf.class_(var3, 0);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.Sf.class_(var3, 1);
      } else if (var2.equals("right_leg")) {
         return (Iq_1)rrxr_3.Sf.class_(var3, 2);
      } else if (var2.equals("left_leg")) {
         return (Iq_1)rrxr_3.Sf.class_(var3, 3);
      } else if (var2.equals("right_wing")) {
         return (Iq_1)rrxr_3.Sf.class_(var3, 4);
      } else if (var2.equals("left_wing")) {
         return (Iq_1)rrxr_3.Sf.class_(var3, 5);
      } else if (var2.equals("bill")) {
         return (Iq_1)rrxr_3.Sf.class_(var3, 6);
      } else {
         return var2.equals("chin") ? (Iq_1)rrxr_3.Sf.class_(var3, 7) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new tv_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"head", "body", "right_leg", "left_leg", "right_wing", "left_wing", "bill", "chin"};
   }
}
