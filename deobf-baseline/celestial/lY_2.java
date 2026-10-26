package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

public class lY_2 {
   private final Map<xc_3, IJ> id_class = Maps.newIdentityHashMap();
   private final Ip_1 id_break;

   public static II id_byte(xc_3 var0) {
      return id_class(rVL.id_strictfp.id_break(var0.id_break()), var0);
   }

   public lY_2(Ip_1 var1) {
      this.id_break = var1;
   }

   public static String id_class(Map<rCZ<?>, Comparable<?>> var0) {
      StringBuilder var1 = new StringBuilder();

      for (Entry var3 : var0.entrySet()) {
         if (var1.length() != 0) {
            var1.append(',');
         }

         rCZ var4 = (rCZ)var3.getKey();
         var1.append(var4.id_throws());
         var1.append('=');
         var1.append(id_class(var4, (Comparable<?>)var3.getValue()));
      }

      return var1.toString();
   }

   public fj_3 id_class(xc_3 var1) {
      return this.id_break(var1).id_throws();
   }

   private static <T extends Comparable<T>> String id_class(rCZ<T> var0, Comparable<?> var1) {
      return var0.id_class((T)var1);
   }

   public Ip_1 id_class() {
      return this.id_break;
   }

   public static II id_class(rqO_2 var0, xc_3 var1) {
      return new II(var0, id_class(var1.id_goto()));
   }

   public IJ id_break(xc_3 var1) {
      IJ var2 = this.id_class.get(var1);
      if (var2 == null) {
         var2 = this.id_break.id_break();
      }

      return var2;
   }

   public void id_break() {
      this.id_class.clear();

      for (xd_3 var2 : rVL.id_strictfp) {
         var2.id_new().id_class().forEach(var1 -> {
            IJ var2x = this.id_class.put(var1, this.id_break.id_class(id_byte(var1)));
         });
      }
   }
}
