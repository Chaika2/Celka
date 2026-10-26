package celestial;

public class rrOq_1 extends rrMi_1 {
   public rrOq_1() {
      super(aI_2.abstract_, "guardian", 0.5F);
   }

   public rrOq_1(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tf_3 var3)) {
         return null;
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.sP);
      } else if (var2.equals("eye")) {
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.sB);
      } else {
         String var4 = "spine";
         if (var2.startsWith(var4)) {
            Iq_1[] var9 = (Iq_1[])rrxr_3.class_(var3, rrxr_3.sS);
            if (var9 == null) {
               return null;
            } else {
               String var10 = var2.substring(var4.length());
               int var11 = rrbb_3.class_(var10, -1);
               var11--;
               return var11 >= 0 && var11 < var9.length ? var9[var11] : null;
            }
         } else {
            String var5 = "tail";
            if (var2.startsWith(var5)) {
               Iq_1[] var6 = (Iq_1[])rrxr_3.class_(var3, rrxr_3.ss);
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
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qP_2 var4 = new qP_2(var3);
      var4.throws_ = (tf_3)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public In_1 throws_() {
      return new tf_3();
   }

   @Override
   public String[] case_() {
      return new String[]{
         "body",
         "eye",
         "spine1",
         "spine2",
         "spine3",
         "spine4",
         "spine5",
         "spine6",
         "spine7",
         "spine8",
         "spine9",
         "spine10",
         "spine11",
         "spine12",
         "tail1",
         "tail2",
         "tail3"
      };
   }
}
