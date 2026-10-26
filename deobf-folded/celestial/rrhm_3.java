package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrhm_3 extends rrMi_1 {
   private static Map<String, Integer> id_class = null;

   public rrhm_3() {
      super(aI_2.c, "rabbit", 0.3F);
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wW_2 var3)) {
         return null;
      } else {
         Map var4 = id_catch();
         if (var4.containsKey(var2)) {
            int var5 = (Integer)var4.get(var2);
            return (Iq_1)rrxr_3.id_class(var3, rrxr_3.sK, var5);
         } else {
            return null;
         }
      }
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qp_3 var4 = new qp_3(var3);
      var4.id_throws = (wW_2<rMi_1>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new wW_2();
   }

   private static Map<String, Integer> id_catch() {
      if (id_class != null) {
         return id_class;
      } else {
         id_class = new HashMap<>();
         id_class.put("left_foot", 0);
         id_class.put("right_foot", 1);
         id_class.put("left_thigh", 2);
         id_class.put("right_thigh", 3);
         id_class.put("body", 4);
         id_class.put("left_arm", 5);
         id_class.put("right_arm", 6);
         id_class.put("head", 7);
         id_class.put("right_ear", 8);
         id_class.put("left_ear", 9);
         id_class.put("tail", 10);
         id_class.put("nose", 11);
         return id_class;
      }
   }

   @Override
   public String[] id_case() {
      return new String[]{
         "left_foot", "right_foot", "left_thigh", "right_thigh", "body", "left_arm", "right_arm", "head", "right_ear", "left_ear", "tail", "nose"
      };
   }
}
