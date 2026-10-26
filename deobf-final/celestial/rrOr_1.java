package celestial;

public class rrOr_1 extends rrOG {
   public rrOr_1() {
      super(aI_2.break_, "armor_stand", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pQ_2 var4 = new pQ_2(var3);
      var4.throws_ = (tJ_2)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tx_3 var3)) {
         return null;
      } else if (var2.equals("right")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.SF, 0);
      } else if (var2.equals("left")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.SF, 1);
      } else if (var2.equals("waist")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.SF, 2);
      } else {
         return var2.equals("base") ? (Iq_1)rrxr_3.class_(var3, rrxr_3.SF, 3) : super.class_(var3, var2);
      }
   }

   @Override
   public In_1 throws_() {
      return new tx_3();
   }

   @Override
   public String[] case_() {
      String[] var1 = super.case_();
      return (String[])rrbb_3.class_((Object[])var1, (Object[])(new String[]{"right", "left", "waist", "base"}));
   }
}
