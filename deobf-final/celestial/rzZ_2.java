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
   private static final Logger class_ = LogManager.getLogger();
   private static final Gson break_ = rzF_2.class_().create();
   private Map<rqO_2, rQz_1> byte_ = ImmutableMap.of();

   public rzZ_2() {
      super(break_, "predicates");
   }

   public rQz_1 class_(rqO_2 var1) {
      return this.byte_.get(var1);
   }

   protected void class_(Map<rqO_2, JsonElement> var1, rAL var2) {
      Builder var3 = ImmutableMap.builder();
      var1.forEach((var1x, var2x) -> {
         try {
            if (var2x.isJsonArray()) {
               rQz_1[] var3x = (rQz_1[])break_.fromJson(var2x, rQz_1[].class);
               var3.put(var1x, new rzv_3(var3x));
            } else {
               rQz_1 var5x = (rQz_1)break_.fromJson(var2x, rQz_1.class);
               var3.put(var1x, var5x);
            }
         } catch (Exception var4x) {
            class_.error("Couldn't parse loot table {}", var1x, var4x);
         }
      });
      ImmutableMap var4 = var3.build();
      rQs_1 var5 = new rQs_1(rzz_3.extends_, var4::get, var0 -> null);
      var4.forEach((var1x, var2x) -> var2x.class_(var5.break_("{" + var1x + "}", var1x)));
      var5.class_().forEach((var0, var1x) -> class_.warn("Found validation problem in " + var0 + ": " + var1x));
      this.byte_ = var4;
   }

   public Set<rqO_2> break_() {
      return Collections.unmodifiableSet(this.byte_.keySet());
   }
}
