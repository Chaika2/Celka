package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrOH extends rrMi_1 {
   private static Map<String, Integer> class_ = null;

   public rrOH() {
      super(aI_2.throw_, "fox", 0.4F);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tT_2 var3)) {
         return null;
      } else {
         Map var4 = catch_();
         if (var4.containsKey(var2)) {
            int var5 = (Integer)var4.get(var2);
            return (Iq_1)rrxr_3.class_(var3, rrxr_3.sz, var5);
         } else {
            return null;
         }
      }
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pa_3 var4 = new pa_3(var3);
      var4.throws_ = (tT_2<rba_3>)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public In_1 throws_() {
      return new tT_2();
   }

   private static Map<String, Integer> catch_() {
      if (class_ != null) {
         return class_;
      } else {
         class_ = new HashMap<>();
         class_.put("head", 0);
         class_.put("body", 4);
         class_.put("leg1", 5);
         class_.put("leg2", 6);
         class_.put("leg3", 7);
         class_.put("leg4", 8);
         class_.put("tail", 9);
         return class_;
      }
   }

   @Override
   public String[] case_() {
      return catch_().keySet().toArray(new String[0]);
   }
}
