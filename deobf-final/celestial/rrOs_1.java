package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrOs_1 extends rrMi_1 {
   private static Map<String, Integer> class_ = catch_();

   public rrOs_1() {
      super(aI_2.throws_, "bee", 0.4F);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tk_3 var3)) {
         return null;
      } else if (class_.containsKey(var2)) {
         int var4 = class_.get(var2);
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.SC, var4);
      } else {
         return null;
      }
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pu_3 var4 = new pu_3(var3);
      var4.throws_ = (tk_3<rbF_2>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public In_1 throws_() {
      return new tk_3();
   }

   private static Map<String, Integer> catch_() {
      HashMap var0 = new HashMap();
      var0.put("body", 0);
      var0.put("torso", 1);
      var0.put("right_wing", 2);
      var0.put("left_wing", 3);
      var0.put("front_legs", 4);
      var0.put("middle_legs", 5);
      var0.put("back_legs", 6);
      var0.put("stinger", 7);
      var0.put("left_antenna", 8);
      var0.put("right_antenna", 9);
      return var0;
   }

   @Override
   public String[] case_() {
      return class_.keySet().toArray(new String[0]);
   }
}
