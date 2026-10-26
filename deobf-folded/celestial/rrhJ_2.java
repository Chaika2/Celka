package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrhJ_2 extends rrMi_1 {
   private static Map<String, Integer> id_class = null;

   public rrhJ_2() {
      super(aI_2.J, "phantom", 0.75F);
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wb_3 var3)) {
         return null;
      } else {
         Map var4 = id_catch();
         if (var4.containsKey(var2)) {
            int var7 = (Integer)var4.get(var2);
            return (Iq_1)rrxr_3.id_class(var3, rrxr_3.sq, var7);
         } else {
            if (var2.equals("head")) {
               int var5 = (Integer)var4.get("body");
               Iq_1 var6 = (Iq_1)rrxr_3.id_class(var3, rrxr_3.sq, var5);
               if (var6 != null) {
                  return var6.id_class(1);
               }
            }

            return null;
         }
      }
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qL_2 var4 = new qL_2(var3);
      var4.id_throws = (wb_3<rGB>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new wb_3();
   }

   private static Map<String, Integer> id_catch() {
      if (id_class != null) {
         return id_class;
      } else {
         id_class = new HashMap<>();
         id_class.put("body", 0);
         id_class.put("left_wing", 1);
         id_class.put("left_wing_tip", 2);
         id_class.put("right_wing", 3);
         id_class.put("right_wing_tip", 4);
         id_class.put("tail", 5);
         id_class.put("tail2", 6);
         return id_class;
      }
   }

   @Override
   public String[] id_case() {
      return id_catch().keySet().toArray(new String[0]);
   }
}
