package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrhO_2 extends rrMi_1 {
   private static Map<String, Integer> class_ = null;

   public rrhO_2() {
      super(aI_2.M, "ocelot", 0.4F);
   }

   protected rrhO_2(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wB_2 var3)) {
         return null;
      } else {
         Map var4 = catch_();
         if (var4.containsKey(var2)) {
            int var5 = (Integer)var4.get(var2);
            return (Iq_1)rrxr_3.class_(var3, rrxr_3.sy, var5);
         } else {
            return null;
         }
      }
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qm_3 var4 = new qm_3(var3);
      var4.throws_ = (wB_2<rMA>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public In_1 throws_() {
      return new wB_2(0.0F);
   }

   private static Map<String, Integer> catch_() {
      if (class_ != null) {
         return class_;
      } else {
         class_ = new HashMap<>();
         class_.put("back_left_leg", 0);
         class_.put("back_right_leg", 1);
         class_.put("front_left_leg", 2);
         class_.put("front_right_leg", 3);
         class_.put("tail", 4);
         class_.put("tail2", 5);
         class_.put("head", 6);
         class_.put("body", 7);
         return class_;
      }
   }

   @Override
   public String[] case_() {
      return new String[]{"back_left_leg", "back_right_leg", "front_left_leg", "front_right_leg", "tail", "tail2", "head", "body"};
   }
}
