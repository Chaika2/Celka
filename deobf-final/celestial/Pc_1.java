package celestial;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Pc_1 {
   private Pc_1() {
   }

   public static Class<?> class_(Type var0) {
      return var0 instanceof Class ? (Class)var0 : (var0 instanceof ParameterizedType ? (Class)((ParameterizedType)var0).getRawType() : null);
   }
}
