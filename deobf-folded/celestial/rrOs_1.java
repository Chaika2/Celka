package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrOs_1 extends rrMi_1 {
   private static Map<String, Integer> id_class = id_catch();

   public rrOs_1() {
      super(aI_2.id_throws, "bee", 0.4F);
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tk_3 var3)) {
         return null;
      } else if (id_class.containsKey(var2)) {
         int var4 = id_class.get(var2);
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.SC, var4);
      } else {
         return null;
      }
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      pu_3 var4 = new pu_3(var3);
      var4.id_throws = (tk_3<rbF_2>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new tk_3();
   }

   private static Map<String, Integer> id_catch() {
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
   public String[] id_case() {
      return id_class.keySet().toArray(new String[0]);
   }
}
