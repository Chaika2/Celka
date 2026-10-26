package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrOg_1 extends rrMi_1 {
   private static Map<String, Integer> class_ = catch_();
   private static Map<String, Integer> break_ = private_();
   private static Map<String, Integer> byte_ = implements_();

   public rrOg_1() {
      super(aI_2.float_, "horse", 0.75F);
   }

   protected rrOg_1(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tV_2 var3)) {
         return null;
      } else if (class_.containsKey(var2)) {
         int var7 = class_.get(var2);
         return (Iq_1)rrxr_3.class_(var3, rrxr_3.sO, var7);
      } else if (break_.containsKey(var2)) {
         Iq_1 var6 = this.class_(var3, "neck");
         int var8 = break_.get(var2);
         return var6.class_(var8);
      } else if (byte_.containsKey(var2)) {
         Iq_1 var4 = this.class_(var3, "body");
         int var5 = byte_.get(var2);
         return var4.class_(var5);
      } else {
         return null;
      }
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qS_2 var4 = new qS_2(var3);
      var4.throws_ = (tV_2<rOi_1>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public In_1 throws_() {
      return new tV_2(0.0F);
   }

   private static Map<String, Integer> catch_() {
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
   public String[] case_() {
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

   private static Map<String, Integer> implements_() {
      HashMap var0 = new HashMap();
      var0.put("tail", 0);
      var0.put("saddle", 1);
      return var0;
   }

   private static Map<String, Integer> private_() {
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
