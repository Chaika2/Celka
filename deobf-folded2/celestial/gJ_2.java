package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class gJ_2 implements rAn_1 {
   public static final gx_3<rdn_3> id_class = new gx_3<>();
   public static final gx_3<rdn_3> id_break = new gx_3<>();
   public static final gx_3<mG_2> id_byte = new gx_3<>();
   private final Map<gx_3<?>, Vo_1<?>> id_protected = Maps.newHashMap();

   @Override
   public void id_class(rAL var1) {
      for (Vo_1 var3 : this.id_protected.values()) {
         var3.id_break();
      }
   }

   public <T> Vo_1<T> id_class(gx_3<T> var1) {
      return (Vo_1<T>)this.id_protected.get(var1);
   }

   public <T> void id_class(gx_3<T> var1, Vo_1<T> var2) {
      this.id_protected.put(var1, var2);
   }
}
