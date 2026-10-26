package celestial;

public class rrhq_3 extends rrMi_1 {
   public rrhq_3() {
      super(aI_2.C, "slime", 0.25F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qV_2 var4 = new qV_2(var3);
      var4.id_throws = (wA_2<rGA>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wA_2 var3)) {
         return null;
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.EX, 0);
      } else if (var2.equals("left_eye")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.EX, 1);
      } else if (var2.equals("right_eye")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.EX, 2);
      } else {
         return var2.equals("mouth") ? (Iq_1)rrxr_3.id_class(var3, rrxr_3.EX, 3) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new wA_2(16);
   }

   @Override
   public String[] id_case() {
      return new String[]{"body", "left_eye", "right_eye", "mouth"};
   }
}
