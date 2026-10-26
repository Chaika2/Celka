package celestial;

public class rrON extends rrMi_1 {
   public rrON() {
      super(aI_2.id_volatile, "creeper", 0.5F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      pH_2 var4 = new pH_2(var3);
      var4.id_throws = (tA_2<rEJ>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tA_2 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.SR.id_class(var3, 0);
      } else if (var2.equals("armor")) {
         return (Iq_1)rrxr_3.SR.id_class(var3, 1);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.SR.id_class(var3, 2);
      } else if (var2.equals("leg1")) {
         return (Iq_1)rrxr_3.SR.id_class(var3, 3);
      } else if (var2.equals("leg2")) {
         return (Iq_1)rrxr_3.SR.id_class(var3, 4);
      } else if (var2.equals("leg3")) {
         return (Iq_1)rrxr_3.SR.id_class(var3, 5);
      } else {
         return var2.equals("leg4") ? (Iq_1)rrxr_3.SR.id_class(var3, 6) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new tA_2();
   }

   @Override
   public String[] id_case() {
      return new String[]{"head", "armor", "body", "leg1", "leg2", "leg3", "leg4"};
   }
}
