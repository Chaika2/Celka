package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rzC_2 extends jf_3 {
   private static final Logger id_class = LogManager.getLogger();
   private static final Gson id_break = rzF_2.id_byte().create();
   private Map<rqO_2, rzL_2> id_byte = ImmutableMap.of();
   private final rzZ_2 id_protected;

   public rzC_2(rzZ_2 var1) {
      super(id_break, "loot_tables");
      this.id_protected = var1;
   }

   public rzL_2 id_class(rqO_2 var1) {
      return this.id_byte.getOrDefault(var1, rzL_2.id_class);
   }

   protected void id_class(Map<rqO_2, JsonElement> var1, rAL var2) {
      Builder var3 = ImmutableMap.builder();
      JsonElement var4 = (JsonElement)var1.remove(rzl_3.id_class);
      if (var4 != null) {
         id_class.warn("Datapack tried to redefine {} loot table, ignoring", rzl_3.id_class);
      }

      var1.forEach((var1x, var2x) -> {
         try {
            rzL_2 var3x = (rzL_2)id_break.fromJson(var2x, rzL_2.class);
            var3.put(var1x, var3x);
         } catch (Exception var4x) {
            id_class.error("Couldn't parse loot table {}", var1x, var4x);
         }
      });
      var3.put(rzl_3.id_class, rzL_2.id_class);
      ImmutableMap var5 = var3.build();
      rQs_1 var6 = new rQs_1(rzz_3.id_extends, this.id_protected::id_class, var5::get);
      var5.forEach((var1x, var2x) -> id_class(var6, var1x, var2x));
      var6.id_class().forEach((var0, var1x) -> id_class.warn("Found validation problem in " + var0 + ": " + var1x));
      this.id_byte = var5;
   }

   public static void id_class(rQs_1 var0, rqO_2 var1, rzL_2 var2) {
      var2.id_class(var0.id_class(var2.id_class()).id_class("{" + var1 + "}", var1));
   }

   public static JsonElement id_class(rzL_2 var0) {
      return id_break.toJsonTree(var0);
   }

   public Set<rqO_2> id_break() {
      return this.id_byte.keySet();
   }
}
