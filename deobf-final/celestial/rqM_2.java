package celestial;

import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

public class rqM_2<T> {
   private static final Map<String, rqM_2<?>> class_ = Collections.synchronizedMap(Maps.newIdentityHashMap());
   private final rqO_2 break_;
   private final rqO_2 byte_;

   private rqM_2(rqO_2 var1, rqO_2 var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.break_ + " / " + this.byte_ + "]";
   }

   public rqO_2 class_() {
      return this.byte_;
   }

   public static <T> rqM_2<T> class_(rqM_2<? extends rVL<T>> var0, rqO_2 var1) {
      return class_(var0.byte_, var1);
   }

   private static <T> rqM_2<T> class_(rqO_2 var0, rqO_2 var1) {
      String var2 = (var0 + ":" + var1).intern();
      return (rqM_2<T>)class_.computeIfAbsent(var2, var2x -> new rqM_2(var0, var1));
   }

   public static <T> rqM_2<rVL<T>> class_(rqO_2 var0) {
      return class_(rVL.break_, var0);
   }

   public boolean class_(rqM_2<? extends rVL<?>> var1) {
      return this.break_.equals(var1.class_());
   }

   public static <T> Function<rqO_2, rqM_2<T>> break_(rqM_2<? extends rVL<T>> var0) {
      return var1 -> class_(var0, var1);
   }
}
