package celestial;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Locale;

public class rpd_3 implements TypeAdapterFactory {
   String id_class(Object var1) {
      return var1 instanceof Enum ? ((Enum)var1).name().toLowerCase(Locale.ROOT) : var1.toString().toLowerCase(Locale.ROOT);
   }

   public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
      Class var3 = var2.getRawType();
      if (!var3.isEnum()) {
         return null;
      } else {
         HashMap var4 = Maps.newHashMap();

         for (Object var8 : var3.getEnumConstants()) {
            var4.put(this.id_class(var8), var8);
         }

         return new rpk_3(this, var4);
      }
   }
}
