package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrhf_3 extends rrMi_1 {
   private static Map<String, Integer> class_ = catch_();

   public rrhf_3() {
      super(aI_2.w, "strider", 0.5F);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wH_2 var3)) {
         return null;
      } else if (class_.containsKey(var2)) {
         int var4 = class_.get(var2);
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.Ec, var4);
      } else {
         return null;
      }
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qU_2 var4 = new qU_2(var3);
      var4.throws_ = (wH_2<rOk_1>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public In_1 throws_() {
      return new wH_2();
   }

   private static Map<String, Integer> catch_() {
      HashMap var0 = new HashMap();
      var0.put("right_leg", 0);
      var0.put("left_leg", 1);
      var0.put("body", 2);
      var0.put("hair_right_bottom", 3);
      var0.put("hair_right_middle", 4);
      var0.put("hair_right_top", 5);
      var0.put("hair_left_top", 6);
      var0.put("hair_left_middle", 7);
      var0.put("hair_left_bottom", 8);
      return var0;
   }

   @Override
   public String[] case_() {
      return class_.keySet().toArray(new String[0]);
   }
}
