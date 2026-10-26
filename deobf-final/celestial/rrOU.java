package celestial;

public class rrOU extends rrMi_1 {
   public rrOU() {
      super(aI_2.transient_, "llama", 0.7F);
   }

   public rrOU(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof te_3 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.sZ.class_(var3, 0);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.sZ.class_(var3, 1);
      } else if (var2.equals("leg1")) {
         return (Iq_1)rrxr_3.sZ.class_(var3, 2);
      } else if (var2.equals("leg2")) {
         return (Iq_1)rrxr_3.sZ.class_(var3, 3);
      } else if (var2.equals("leg3")) {
         return (Iq_1)rrxr_3.sZ.class_(var3, 4);
      } else if (var2.equals("leg4")) {
         return (Iq_1)rrxr_3.sZ.class_(var3, 5);
      } else if (var2.equals("chest_right")) {
         return (Iq_1)rrxr_3.sZ.class_(var3, 6);
      } else {
         return var2.equals("chest_left") ? (Iq_1)rrxr_3.sZ.class_(var3, 7) : null;
      }
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qW_2 var4 = new qW_2(var3);
      var4.throws_ = (te_3<rhP_2>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public In_1 throws_() {
      return new te_3(0.0F);
   }

   @Override
   public String[] case_() {
      return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4", "chest_right", "chest_left"};
   }
}
