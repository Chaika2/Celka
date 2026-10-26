package celestial;

public class rrhA_2 extends rrMi_1 {
   public rrhA_2() {
      super(aI_2.v, "shulker", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qI_2 var4 = new qI_2(var3);
      var4.throws_ = (wv_3<rGz_1>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wv_3 var3)) {
         return null;
      } else if (var2.equals("base")) {
         return (Iq_1)rrxr_3.Er.class_(var3, 0);
      } else if (var2.equals("lid")) {
         return (Iq_1)rrxr_3.Er.class_(var3, 1);
      } else {
         return var2.equals("head") ? (Iq_1)rrxr_3.Er.class_(var3, 2) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new wv_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"base", "lid", "head"};
   }
}
