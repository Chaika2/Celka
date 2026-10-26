package celestial;

public class rrhK_2 extends rrhu_3 {
   public rrhK_2() {
      super(aI_2.o, "turtle", 0.7F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      TB var4 = new TB(var3);
      var4.throws_ = (wt_3<rON>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wk_3)) {
         return null;
      } else {
         wt_3 var3 = (wt_3)var1;
         return var2.equals("body2") ? (Iq_1)rrxr_3.En.class_(var3) : super.class_(var1, var2);
      }
   }

   @Override
   public In_1 throws_() {
      return new wt_3(0.0F);
   }

   @Override
   public String[] case_() {
      String[] var1 = super.case_();
      return (String[])rrbb_3.class_((Object[])var1, (Object)"body2");
   }
}
