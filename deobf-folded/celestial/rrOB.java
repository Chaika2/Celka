package celestial;

public class rrOB extends rrMi_1 {
   public rrOB() {
      super(aI_2.id_protected, "bat", 0.25F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      pc_3 var4 = new pc_3(var3);
      var4.id_throws = (td_3)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof td_3 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.SA, 0);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.SA, 1);
      } else if (var2.equals("right_wing")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.SA, 2);
      } else if (var2.equals("left_wing")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.SA, 3);
      } else if (var2.equals("outer_right_wing")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.SA, 4);
      } else {
         return var2.equals("outer_left_wing") ? (Iq_1)rrxr_3.id_class(var3, rrxr_3.SA, 5) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new td_3();
   }

   @Override
   public String[] id_case() {
      return new String[]{"head", "body", "right_wing", "left_wing", "outer_right_wing", "outer_left_wing"};
   }
}
