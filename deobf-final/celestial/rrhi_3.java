package celestial;

public class rrhi_3 extends rrhU_2 {
   public rrhi_3() {
      super(aI_2.a, "witch", 0.5F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      TO var4 = new TO(var3);
      var4.throws_ = (wf_3<rGi_1>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wf_3 var3)) {
         return null;
      } else {
         return var2.equals("mole") ? (Iq_1)rrxr_3.class_(var3, rrxr_3.ET) : super.class_(var3, var2);
      }
   }

   @Override
   public In_1 throws_() {
      return new wf_3(0.0F);
   }

   @Override
   public String[] case_() {
      String[] var1 = super.case_();
      return (String[])rrbb_3.class_((Object[])var1, (Object)"mole");
   }
}
