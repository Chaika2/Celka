package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrOH extends rrMi_1 {
   private static Map<String, Integer> id_class = null;

   public rrOH() {
      super(aI_2.id_throw, "fox", 0.4F);
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tT_2 var3)) {
         return null;
      } else {
         Map var4 = id_catch();
         if (var4.containsKey(var2)) {
            int var5 = (Integer)var4.get(var2);
            return (Iq_1)rrxr_3.id_class(var3, rrxr_3.sz, var5);
         } else {
            return null;
         }
      }
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      pa_3 var4 = new pa_3(var3);
      var4.id_throws = (tT_2<rba_3>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new tT_2();
   }

   private static Map<String, Integer> id_catch() {
      if (id_class != null) {
         return id_class;
      } else {
         id_class = new HashMap<>();
         id_class.put("head", 0);
         id_class.put("body", 4);
         id_class.put("leg1", 5);
         id_class.put("leg2", 6);
         id_class.put("leg3", 7);
         id_class.put("leg4", 8);
         id_class.put("tail", 9);
         return id_class;
      }
   }

   @Override
   public String[] id_case() {
      return id_catch().keySet().toArray(new String[0]);
   }
}
