package celestial;

public class rrhD_2 extends rrOG {
   public rrhD_2() {
      super(aI_2.K, "vex", 0.3F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      Ts_1 var4 = new Ts_1(var3);
      var4.throws_ = (ww_3)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof ww_3)) {
         return null;
      } else {
         Iq_1 var3 = super.class_(var1, var2);
         if (var3 != null) {
            return var3;
         } else {
            ww_3 var4 = (ww_3)var1;
            if (var2.equals("left_wing")) {
               return (Iq_1)rrxr_3.class_(var4, rrxr_3.El);
            } else {
               return var2.equals("right_wing") ? (Iq_1)rrxr_3.class_(var4, rrxr_3.EH) : null;
            }
         }
      }
   }

   @Override
   public In_1 throws_() {
      return new ww_3();
   }

   @Override
   public String[] case_() {
      String[] var1 = super.case_();
      return (String[])rrbb_3.class_((Object[])var1, (Object[])(new String[]{"left_wing", "right_wing"}));
   }
}
