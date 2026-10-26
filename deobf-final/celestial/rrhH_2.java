package celestial;

public class rrhH_2 extends rrMi_1 {
   public rrhH_2() {
      super(aI_2.L, "silverfish", 0.3F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qf_3 var4 = new qf_3(var3);
      var4.throws_ = (wF_2<rGZ>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wF_2 var3)) {
         return null;
      } else {
         String var4 = "body";
         if (var2.startsWith(var4)) {
            Iq_1[] var9 = (Iq_1[])rrxr_3.class_(var3, rrxr_3.EM);
            if (var9 == null) {
               return null;
            } else {
               String var10 = var2.substring(var4.length());
               int var11 = rrbb_3.class_(var10, -1);
               var11--;
               return var11 >= 0 && var11 < var9.length ? var9[var11] : null;
            }
         } else {
            String var5 = "wing";
            if (var2.startsWith(var5)) {
               Iq_1[] var6 = (Iq_1[])rrxr_3.class_(var3, rrxr_3.EO);
               if (var6 == null) {
                  return null;
               } else {
                  String var7 = var2.substring(var5.length());
                  int var8 = rrbb_3.class_(var7, -1);
                  var8--;
                  return var8 >= 0 && var8 < var6.length ? var6[var8] : null;
               }
            } else {
               return null;
            }
         }
      }
   }

   @Override
   public In_1 throws_() {
      return new wF_2();
   }

   @Override
   public String[] case_() {
      return new String[]{"body1", "body2", "body3", "body4", "body5", "body6", "body7", "wing1", "wing2", "wing3"};
   }
}
