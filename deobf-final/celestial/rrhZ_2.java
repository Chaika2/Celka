package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrhZ_2 extends rrMi_1 {
   private static Map<String, Integer> class_ = null;

   public rrhZ_2() {
      super(aI_2.u, "ravager", 1.1F);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wz_3 var3)) {
         return null;
      } else {
         Map var4 = catch_();
         if (var4.containsKey(var2)) {
            int var5 = (Integer)var4.get(var2);
            return (Iq_1)rrxr_3.class_(var3, rrxr_3.sU, var5);
         } else {
            return null;
         }
      }
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      qq_3 var4 = new qq_3(var3);
      var4.throws_ = (wz_3)var1;
      var4.byte_ = var2;
      return var4;
   }

   @Override
   public In_1 throws_() {
      return new wz_3();
   }

   private static Map<String, Integer> catch_() {
      if (class_ != null) {
         return class_;
      } else {
         class_ = new HashMap<>();
         class_.put("head", 0);
         class_.put("jaw", 1);
         class_.put("body", 2);
         class_.put("leg1", 3);
         class_.put("leg2", 4);
         class_.put("leg3", 5);
         class_.put("leg4", 6);
         class_.put("neck", 7);
         return class_;
      }
   }

   @Override
   public String[] case_() {
      return catch_().keySet().toArray(new String[0]);
   }
}
