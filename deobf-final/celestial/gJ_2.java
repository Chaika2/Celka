package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class gJ_2 implements rAn_1 {
   public static final gx_3<rdn_3> class_ = new gx_3<>();
   public static final gx_3<rdn_3> break_ = new gx_3<>();
   public static final gx_3<mG_2> byte_ = new gx_3<>();
   private final Map<gx_3<?>, Vo_1<?>> protected_ = Maps.newHashMap();

   @Override
   public void class_(rAL var1) {
      for (Vo_1 var3 : this.protected_.values()) {
         var3.break_();
      }
   }

   public <T> Vo_1<T> class_(gx_3<T> var1) {
      return (Vo_1<T>)this.protected_.get(var1);
   }

   public <T> void class_(gx_3<T> var1, Vo_1<T> var2) {
      this.protected_.put(var1, var2);
   }
}
