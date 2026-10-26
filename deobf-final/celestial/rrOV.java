package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrOV extends rrMi_1 {
   private static Map<String, Integer> class_ = catch_();

   public rrOV() {
      super(aI_2.long_, "hoglin", 0.7F);
   }

   public rrOV(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tc_3 var3)) {
         return null;
      } else if (class_.containsKey(var2)) {
         int var4 = class_.get(var2);
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.Sq, var4);
      } else {
         return null;
      }
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qB_2 var4 = new qB_2(var3);
      var4.throws_ = (tc_3<rEg_1>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public In_1 throws_() {
      return new tc_3();
   }

   private static Map<String, Integer> catch_() {
      HashMap var0 = new HashMap();
      var0.put("head", 0);
      var0.put("right_ear", 1);
      var0.put("left_ear", 2);
      var0.put("body", 3);
      var0.put("front_right_leg", 4);
      var0.put("front_left_leg", 5);
      var0.put("back_right_leg", 6);
      var0.put("back_left_leg", 7);
      var0.put("mane", 8);
      return var0;
   }

   @Override
   public String[] case_() {
      return class_.keySet().toArray(new String[0]);
   }
}
