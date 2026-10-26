package celestial;

public class rrON extends rrMi_1 {
   public rrON() {
      super(aI_2.volatile_, "creeper", 0.5F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pH_2 var4 = new pH_2(var3);
      var4.throws_ = (tA_2<rEJ>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tA_2 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.SR.class_(var3, 0);
      } else if (var2.equals("armor")) {
         return (Iq_1)rrxr_3.SR.class_(var3, 1);
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.SR.class_(var3, 2);
      } else if (var2.equals("leg1")) {
         return (Iq_1)rrxr_3.SR.class_(var3, 3);
      } else if (var2.equals("leg2")) {
         return (Iq_1)rrxr_3.SR.class_(var3, 4);
      } else if (var2.equals("leg3")) {
         return (Iq_1)rrxr_3.SR.class_(var3, 5);
      } else {
         return var2.equals("leg4") ? (Iq_1)rrxr_3.SR.class_(var3, 6) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new tA_2();
   }

   @Override
   public String[] case_() {
      return new String[]{"head", "armor", "body", "leg1", "leg2", "leg3", "leg4"};
   }
}
