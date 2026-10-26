package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrhZ_2 extends rrMi_1 {
   private static Map<String, Integer> id_class = null;

   public rrhZ_2() {
      super(aI_2.u, "ravager", 1.1F);
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wz_3 var3)) {
         return null;
      } else {
         Map var4 = id_catch();
         if (var4.containsKey(var2)) {
            int var5 = (Integer)var4.get(var2);
            return (Iq_1)rrxr_3.id_class(var3, rrxr_3.sU, var5);
         } else {
            return null;
         }
      }
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qq_3 var4 = new qq_3(var3);
      var4.id_throws = (wz_3)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new wz_3();
   }

   private static Map<String, Integer> id_catch() {
      if (id_class != null) {
         return id_class;
      } else {
         id_class = new HashMap<>();
         id_class.put("head", 0);
         id_class.put("jaw", 1);
         id_class.put("body", 2);
         id_class.put("leg1", 3);
         id_class.put("leg2", 4);
         id_class.put("leg3", 5);
         id_class.put("leg4", 6);
         id_class.put("neck", 7);
         return id_class;
      }
   }

   @Override
   public String[] id_case() {
      return id_catch().keySet().toArray(new String[0]);
   }
}
