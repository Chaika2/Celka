package celestial;

public abstract class rrhu_3 extends rrMi_1 {
   public rrhu_3(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wk_3 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.sY.id_class(var3, 0);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.sY.id_class(var3, 1);
      } else if (var2.equals("leg1")) {
         return (Iq_1)rrxr_3.sY.id_class(var3, 2);
      } else if (var2.equals("leg2")) {
         return (Iq_1)rrxr_3.sY.id_class(var3, 3);
      } else if (var2.equals("leg3")) {
         return (Iq_1)rrxr_3.sY.id_class(var3, 4);
      } else {
         return var2.equals("leg4") ? (Iq_1)rrxr_3.sY.id_class(var3, 5) : null;
      }
   }

   @Override
   public String[] id_case() {
      return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4"};
   }
}
