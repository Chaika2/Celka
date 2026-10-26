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
   private static final Logger class_ = LogManager.getLogger();
   private static final Gson break_ = rzF_2.byte_().create();
   private Map<rqO_2, rzL_2> byte_ = ImmutableMap.of();
   private final rzZ_2 protected_;

   public rzC_2(rzZ_2 var1) {
      super(break_, "loot_tables");
      this.protected_ = var1;
   }

   public rzL_2 class_(rqO_2 var1) {
      return this.byte_.getOrDefault(var1, rzL_2.class_);
   }

   protected void class_(Map<rqO_2, JsonElement> var1, rAL var2) {
      Builder var3 = ImmutableMap.builder();
      JsonElement var4 = (JsonElement)var1.remove(rzl_3.class_);
      if (var4 != null) {
         class_.warn("Datapack tried to redefine {} loot table, ignoring", rzl_3.class_);
      }

      var1.forEach((var1x, var2x) -> {
         try {
            rzL_2 var3x = (rzL_2)break_.fromJson(var2x, rzL_2.class);
            var3.put(var1x, var3x);
         } catch (Exception var4x) {
            class_.error("Couldn't parse loot table {}", var1x, var4x);
         }
      });
      var3.put(rzl_3.class_, rzL_2.class_);
      ImmutableMap var5 = var3.build();
      rQs_1 var6 = new rQs_1(rzz_3.extends_, this.protected_::class_, var5::get);
      var5.forEach((var1x, var2x) -> class_(var6, var1x, var2x));
      var6.class_().forEach((var0, var1x) -> class_.warn("Found validation problem in " + var0 + ": " + var1x));
      this.byte_ = var5;
   }

   public static void class_(rQs_1 var0, rqO_2 var1, rzL_2 var2) {
      var2.class_(var0.class_(var2.class_()).class_("{" + var1 + "}", var1));
   }

   public static JsonElement class_(rzL_2 var0) {
      return break_.toJsonTree(var0);
   }

   public Set<rqO_2> break_() {
      return this.byte_.keySet();
   }
}
