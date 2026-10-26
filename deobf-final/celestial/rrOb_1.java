package celestial;

public class rrOb_1 extends rrMi_1 {
   public rrOb_1() {
      super(aI_2.case_, "blaze", 0.5F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pZ_2 var4 = new pZ_2(var3);
      var4.throws_ = (tN_2<rEO>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tN_2 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.SH);
      } else {
         String var4 = "stick";
         if (var2.startsWith(var4)) {
            Iq_1[] var5 = (Iq_1[])rrxr_3.class_(var3, rrxr_3.Sy);
            if (var5 == null) {
               return null;
            } else {
               String var6 = var2.substring(var4.length());
               int var7 = rrbb_3.class_(var6, -1);
               var7--;
               return var7 >= 0 && var7 < var5.length ? var5[var7] : null;
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public In_1 throws_() {
      return new tN_2();
   }

   @Override
   public String[] case_() {
      return new String[]{"head", "stick1", "stick2", "stick3", "stick4", "stick5", "stick6", "stick7", "stick8", "stick9", "stick10", "stick11", "stick12"};
   }
}
