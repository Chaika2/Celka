package celestial;

public class rrht_3 extends rrMi_1 {
   public rrht_3() {
      super(aI_2.q, "spider", 1.0F);
   }

   protected rrht_3(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wC_2 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.Ek.id_class(var3, 0);
      } else if (var2.equals("neck")) {
         return (Iq_1)rrxr_3.Ek.id_class(var3, 1);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.Ek.id_class(var3, 2);
      } else if (var2.equals("leg1")) {
         return (Iq_1)rrxr_3.Ek.id_class(var3, 3);
      } else if (var2.equals("leg2")) {
         return (Iq_1)rrxr_3.Ek.id_class(var3, 4);
      } else if (var2.equals("leg3")) {
         return (Iq_1)rrxr_3.Ek.id_class(var3, 5);
      } else if (var2.equals("leg4")) {
         return (Iq_1)rrxr_3.Ek.id_class(var3, 6);
      } else if (var2.equals("leg5")) {
         return (Iq_1)rrxr_3.Ek.id_class(var3, 7);
      } else if (var2.equals("leg6")) {
         return (Iq_1)rrxr_3.Ek.id_class(var3, 8);
      } else if (var2.equals("leg7")) {
         return (Iq_1)rrxr_3.Ek.id_class(var3, 9);
      } else {
         return var2.equals("leg8") ? (Iq_1)rrxr_3.Ek.id_class(var3, 10) : null;
      }
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qY_2 var4 = new qY_2(var3);
      var4.id_throws = (tp_3)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new wC_2();
   }

   @Override
   public String[] id_case() {
      return new String[]{"head", "neck", "body", "leg1", "leg2", "leg3", "leg4", "leg5", "leg6", "leg7", "leg8"};
   }
}
