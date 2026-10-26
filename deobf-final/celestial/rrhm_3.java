package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrhm_3 extends rrMi_1 {
   private static Map<String, Integer> class_ = null;

   public rrhm_3() {
      super(aI_2.c, "rabbit", 0.3F);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wW_2 var3)) {
         return null;
      } else {
         Map var4 = catch_();
         if (var4.containsKey(var2)) {
            int var5 = (Integer)var4.get(var2);
            return (Iq_1)rrxr_3.class_(var3, rrxr_3.sK, var5);
         } else {
            return null;
         }
      }
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qp_3 var4 = new qp_3(var3);
      var4.throws_ = (wW_2<rMi_1>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public In_1 throws_() {
      return new wW_2();
   }

   private static Map<String, Integer> catch_() {
      if (class_ != null) {
         return class_;
      } else {
         class_ = new HashMap<>();
         class_.put("left_foot", 0);
         class_.put("right_foot", 1);
         class_.put("left_thigh", 2);
         class_.put("right_thigh", 3);
         class_.put("body", 4);
         class_.put("left_arm", 5);
         class_.put("right_arm", 6);
         class_.put("head", 7);
         class_.put("right_ear", 8);
         class_.put("left_ear", 9);
         class_.put("tail", 10);
         class_.put("nose", 11);
         return class_;
      }
   }

   @Override
   public String[] case_() {
      return new String[]{
         "left_foot", "right_foot", "left_thigh", "right_thigh", "body", "left_arm", "right_arm", "head", "right_ear", "left_ear", "tail", "nose"
      };
   }
}
