package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

public class lY_2 {
   private final Map<xc_3, IJ> class_ = Maps.newIdentityHashMap();
   private final Ip_1 break_;

   public static II byte_(xc_3 var0) {
      return class_(rVL.strictfp_.break_(var0.break_()), var0);
   }

   public lY_2(Ip_1 var1) {
      this.break_ = var1;
   }

   public static String class_(Map<rCZ<?>, Comparable<?>> var0) {
      StringBuilder var1 = new StringBuilder();

      for (Entry var3 : var0.entrySet()) {
         if (var1.length() != 0) {
            var1.append(',');
         }

         rCZ var4 = (rCZ)var3.getKey();
         var1.append(var4.throws_());
         var1.append('=');
         var1.append(class_(var4, (Comparable<?>)var3.getValue()));
      }

      return var1.toString();
   }

   public fj_3 class_(xc_3 var1) {
      return this.break_(var1).throws_();
   }

   private static <T extends Comparable<T>> String class_(rCZ<T> var0, Comparable<?> var1) {
      return var0.class_((T)var1);
   }

   public Ip_1 class_() {
      return this.break_;
   }

   public static II class_(rqO_2 var0, xc_3 var1) {
      return new II(var0, class_(var1.goto_()));
   }

   public IJ break_(xc_3 var1) {
      IJ var2 = this.class_.get(var1);
      if (var2 == null) {
         var2 = this.break_.break_();
      }

      return var2;
   }

   public void break_() {
      this.class_.clear();

      for (xd_3 var2 : rVL.strictfp_) {
         var2.new_().class_().forEach(var1 -> {
            IJ var2x = this.class_.put(var1, this.break_.class_(byte_(var1)));
         });
      }
   }
}
