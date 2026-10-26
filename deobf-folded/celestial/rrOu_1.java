package celestial;

import java.util.ArrayList;
import java.util.Arrays;

public class rrOu_1 extends rrOg_1 {
   public rrOu_1() {
      super(aI_2.id_package, "donkey", 0.75F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      pA_2 var4 = new pA_2(var3, 0.87F);
      var4.id_throws = (tp_3)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tj_3 var3)) {
         return null;
      } else if (var2.equals("left_chest")) {
         return (Iq_1)rrxr_3.sX.id_class(var3, 0);
      } else {
         return var2.equals("right_chest") ? (Iq_1)rrxr_3.sX.id_class(var3, 1) : super.id_class(var1, var2);
      }
   }

   @Override
   public In_1 id_throws() {
      return new tj_3(0.87F);
   }

   @Override
   public String[] id_case() {
      ArrayList var1 = new ArrayList<>(Arrays.asList(super.id_case()));
      var1.add("left_chest");
      var1.add("right_chest");
      return var1.toArray(new String[var1.size()]);
   }
}
