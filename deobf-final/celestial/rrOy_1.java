package celestial;

import java.util.Iterator;

public class rrOy_1 extends rrMi_1 {
   public rrOy_1() {
      super(aI_2.interface_, "ghast", 0.5F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pi_3 var4 = new pi_3(var3);
      var4.throws_ = (tw_3<rEy_1>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tw_3 var3)) {
         return null;
      } else {
         Iterator var4 = var3.class_().iterator();
         if (var2.equals("body")) {
            return rrXO.class_(var4, 0);
         } else {
            String var5 = "tentacle";
            if (var2.startsWith(var5)) {
               String var6 = var2.substring(var5.length());
               int var7 = rrbb_3.class_(var6, -1);
               return rrXO.class_(var4, var7);
            } else {
               return null;
            }
         }
      }
   }

   @Override
   public In_1 throws_() {
      return new tw_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"body", "tentacle1", "tentacle2", "tentacle3", "tentacle4", "tentacle5", "tentacle6", "tentacle7", "tentacle8", "tentacle9"};
   }
}
