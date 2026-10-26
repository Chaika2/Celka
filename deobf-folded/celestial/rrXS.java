package celestial;

public class rrXS extends rrMi_1 {
   public rrXS() {
      super(aI_2.rB, "wolf", 0.5F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      Tx_1 var4 = new Tx_1(var3);
      var4.id_throws = (wV_2<rOH>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wV_2 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.Ej.id_class(var3, 0);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.Ej.id_class(var3, 2);
      } else if (var2.equals("leg1")) {
         return (Iq_1)rrxr_3.Ej.id_class(var3, 3);
      } else if (var2.equals("leg2")) {
         return (Iq_1)rrxr_3.Ej.id_class(var3, 4);
      } else if (var2.equals("leg3")) {
         return (Iq_1)rrxr_3.Ej.id_class(var3, 5);
      } else if (var2.equals("leg4")) {
         return (Iq_1)rrxr_3.Ej.id_class(var3, 6);
      } else if (var2.equals("tail")) {
         return (Iq_1)rrxr_3.Ej.id_class(var3, 7);
      } else {
         return var2.equals("mane") ? (Iq_1)rrxr_3.Ej.id_class(var3, 9) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new wV_2();
   }

   @Override
   public String[] id_case() {
      return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4", "tail", "mane"};
   }
}
