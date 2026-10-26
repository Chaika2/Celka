package celestial;

import java.util.ArrayList;
import java.util.Arrays;

public class rrOu_1 extends rrOg_1 {
   public rrOu_1() {
      super(aI_2.package_, "donkey", 0.75F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pA_2 var4 = new pA_2(var3, 0.87F);
      var4.throws_ = (tp_3)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tj_3 var3)) {
         return null;
      } else if (var2.equals("left_chest")) {
         return (Iq_1)rrxr_3.sX.class_(var3, 0);
      } else {
         return var2.equals("right_chest") ? (Iq_1)rrxr_3.sX.class_(var3, 1) : super.class_(var1, var2);
      }
   }

   @Override
   public In_1 throws_() {
      return new tj_3(0.87F);
   }

   @Override
   public String[] case_() {
      ArrayList var1 = new ArrayList<>(Arrays.asList(super.case_()));
      var1.add("left_chest");
      var1.add("right_chest");
      return var1.toArray(new String[var1.size()]);
   }
}
