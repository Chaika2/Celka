package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrOg_1 extends rrMi_1 {
   private static Map<String, Integer> id_class = id_catch();
   private static Map<String, Integer> id_break = id_private();
   private static Map<String, Integer> id_byte = id_implements();

   public rrOg_1() {
      super(aI_2.id_float, "horse", 0.75F);
   }

   protected rrOg_1(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tV_2 var3)) {
         return null;
      } else if (id_class.containsKey(var2)) {
         int var7 = id_class.get(var2);
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.sO, var7);
      } else if (id_break.containsKey(var2)) {
         Iq_1 var6 = this.id_class(var3, "neck");
         int var8 = id_break.get(var2);
         return var6.id_class(var8);
      } else if (id_byte.containsKey(var2)) {
         Iq_1 var4 = this.id_class(var3, "body");
         int var5 = id_byte.get(var2);
         return var4.id_class(var5);
      } else {
         return null;
      }
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qS_2 var4 = new qS_2(var3);
      var4.id_throws = (tV_2<rOi_1>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new tV_2(0.0F);
   }

   private static Map<String, Integer> id_catch() {
      HashMap var0 = new HashMap();
      var0.put("body", 0);
      var0.put("neck", 1);
      var0.put("back_left_leg", 2);
      var0.put("back_right_leg", 3);
      var0.put("front_left_leg", 4);
      var0.put("front_right_leg", 5);
      var0.put("child_back_left_leg", 6);
      var0.put("child_back_right_leg", 7);
      var0.put("child_front_left_leg", 8);
      var0.put("child_front_right_leg", 9);
      return var0;
   }

   @Override
   public String[] id_case() {
      return new String[]{
         "body",
         "neck",
         "back_left_leg",
         "back_right_leg",
         "front_left_leg",
         "front_right_leg",
         "child_back_left_leg",
         "child_back_right_leg",
         "child_front_left_leg",
         "child_front_right_leg",
         "tail",
         "saddle",
         "head",
         "mane",
         "mouth",
         "left_ear",
         "right_ear",
         "left_bit",
         "right_bit",
         "left_rein",
         "right_rein",
         "headpiece",
         "noseband"
      };
   }

   private static Map<String, Integer> id_implements() {
      HashMap var0 = new HashMap();
      var0.put("tail", 0);
      var0.put("saddle", 1);
      return var0;
   }

   private static Map<String, Integer> id_private() {
      HashMap var0 = new HashMap();
      var0.put("head", 0);
      var0.put("mane", 1);
      var0.put("mouth", 2);
      var0.put("left_ear", 3);
      var0.put("right_ear", 4);
      var0.put("left_bit", 5);
      var0.put("right_bit", 6);
      var0.put("left_rein", 7);
      var0.put("right_rein", 8);
      var0.put("headpiece", 9);
      var0.put("noseband", 10);
      return var0;
   }
}
