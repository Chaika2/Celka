package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrhJ_2 extends rrMi_1 {
   private static Map<String, Integer> class_ = null;

   public rrhJ_2() {
      super(aI_2.J, "phantom", 0.75F);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wb_3 var3)) {
         return null;
      } else {
         Map var4 = catch_();
         if (var4.containsKey(var2)) {
            int var7 = (Integer)var4.get(var2);
            return (Iq_1)rrxr_3.class_(var3, rrxr_3.sq, var7);
         } else {
            if (var2.equals("head")) {
               int var5 = (Integer)var4.get("body");
               Iq_1 var6 = (Iq_1)rrxr_3.class_(var3, rrxr_3.sq, var5);
               if (var6 != null) {
                  return var6.class_(1);
               }
            }

            return null;
         }
      }
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qL_2 var4 = new qL_2(var3);
      var4.throws_ = (wb_3<rGB>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public In_1 throws_() {
      return new wb_3();
   }

   private static Map<String, Integer> catch_() {
      if (class_ != null) {
         return class_;
      } else {
         class_ = new HashMap<>();
         class_.put("body", 0);
         class_.put("left_wing", 1);
         class_.put("left_wing_tip", 2);
         class_.put("right_wing", 3);
         class_.put("right_wing_tip", 4);
         class_.put("tail", 5);
         class_.put("tail2", 6);
         return class_;
      }
   }

   @Override
   public String[] case_() {
      return catch_().keySet().toArray(new String[0]);
   }
}
