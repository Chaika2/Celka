package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrhO_2 extends rrMi_1 {
   private static Map<String, Integer> id_class = null;

   public rrhO_2() {
      super(aI_2.M, "ocelot", 0.4F);
   }

   protected rrhO_2(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wB_2 var3)) {
         return null;
      } else {
         Map var4 = id_catch();
         if (var4.containsKey(var2)) {
            int var5 = (Integer)var4.get(var2);
            return (Iq_1)rrxr_3.id_class(var3, rrxr_3.sy, var5);
         } else {
            return null;
         }
      }
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qm_3 var4 = new qm_3(var3);
      var4.id_throws = (wB_2<rMA>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new wB_2(0.0F);
   }

   private static Map<String, Integer> id_catch() {
      if (id_class != null) {
         return id_class;
      } else {
         id_class = new HashMap<>();
         id_class.put("back_left_leg", 0);
         id_class.put("back_right_leg", 1);
         id_class.put("front_left_leg", 2);
         id_class.put("front_right_leg", 3);
         id_class.put("tail", 4);
         id_class.put("tail2", 5);
         id_class.put("head", 6);
         id_class.put("body", 7);
         return id_class;
      }
   }

   @Override
   public String[] id_case() {
      return new String[]{"back_left_leg", "back_right_leg", "front_left_leg", "front_right_leg", "tail", "tail2", "head", "body"};
   }
}
