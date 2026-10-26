package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rzZ_2 extends jf_3 {
   private static final Logger id_class = LogManager.getLogger();
   private static final Gson id_break = rzF_2.id_class().create();
   private Map<rqO_2, rQz_1> id_byte = ImmutableMap.of();

   public rzZ_2() {
      super(id_break, "predicates");
   }

   public rQz_1 id_class(rqO_2 var1) {
      return this.id_byte.get(var1);
   }

   protected void id_class(Map<rqO_2, JsonElement> var1, rAL var2) {
      Builder var3 = ImmutableMap.builder();
      var1.forEach((var1x, var2x) -> {
         try {
            if (var2x.isJsonArray()) {
               rQz_1[] var3x = (rQz_1[])id_break.fromJson(var2x, rQz_1[].class);
               var3.put(var1x, new rzv_3(var3x));
            } else {
               rQz_1 var5x = (rQz_1)id_break.fromJson(var2x, rQz_1.class);
               var3.put(var1x, var5x);
            }
         } catch (Exception var4x) {
            id_class.error("Couldn't parse loot table {}", var1x, var4x);
         }
      });
      ImmutableMap var4 = var3.build();
      rQs_1 var5 = new rQs_1(rzz_3.id_extends, var4::get, var0 -> null);
      var4.forEach((var1x, var2x) -> var2x.id_class(var5.id_break("{" + var1x + "}", var1x)));
      var5.id_class().forEach((var0, var1x) -> id_class.warn("Found validation problem in " + var0 + ": " + var1x));
      this.id_byte = var4;
   }

   public Set<rqO_2> id_break() {
      return Collections.unmodifiableSet(this.id_byte.keySet());
   }
}
