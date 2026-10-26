package celestial;

public class rrOk_1 extends rrMi_1 {
   public rrOk_1() {
      super(aI_2.id_finally, "chicken", 0.3F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      pn_3 var4 = new pn_3(var3);
      var4.id_throws = (tv_3<rbR_2>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tv_3 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.Sf.id_class(var3, 0);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.Sf.id_class(var3, 1);
      } else if (var2.equals("right_leg")) {
         return (Iq_1)rrxr_3.Sf.id_class(var3, 2);
      } else if (var2.equals("left_leg")) {
         return (Iq_1)rrxr_3.Sf.id_class(var3, 3);
      } else if (var2.equals("right_wing")) {
         return (Iq_1)rrxr_3.Sf.id_class(var3, 4);
      } else if (var2.equals("left_wing")) {
         return (Iq_1)rrxr_3.Sf.id_class(var3, 5);
      } else if (var2.equals("bill")) {
         return (Iq_1)rrxr_3.Sf.id_class(var3, 6);
      } else {
         return var2.equals("chin") ? (Iq_1)rrxr_3.Sf.id_class(var3, 7) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new tv_3();
   }

   @Override
   public String[] id_case() {
      return new String[]{"head", "body", "right_leg", "left_leg", "right_wing", "left_wing", "bill", "chin"};
   }
}
