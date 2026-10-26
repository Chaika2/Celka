package celestial;

import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

public class rqM_2<T> {
   private static final Map<String, rqM_2<?>> id_class = Collections.synchronizedMap(Maps.newIdentityHashMap());
   private final rqO_2 id_break;
   private final rqO_2 id_byte;

   private rqM_2(rqO_2 var1, rqO_2 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.id_break + " / " + this.id_byte + "]";
   }

   public rqO_2 id_class() {
      return this.id_byte;
   }

   public static <T> rqM_2<T> id_class(rqM_2<? extends rVL<T>> var0, rqO_2 var1) {
      return id_class(var0.id_byte, var1);
   }

   private static <T> rqM_2<T> id_class(rqO_2 var0, rqO_2 var1) {
      String var2 = (var0 + ":" + var1).intern();
      return (rqM_2<T>)id_class.computeIfAbsent(var2, var2x -> new rqM_2(var0, var1));
   }

   public static <T> rqM_2<rVL<T>> id_class(rqO_2 var0) {
      return id_class(rVL.id_break, var0);
   }

   public boolean id_class(rqM_2<? extends rVL<?>> var1) {
      return this.id_break.equals(var1.id_class());
   }

   public static <T> Function<rqO_2, rqM_2<T>> id_break(rqM_2<? extends rVL<T>> var0) {
      return var1 -> id_class(var0, var1);
   }
}
