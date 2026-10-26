package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class rlM_2 {
   private final List<rld_3> id_class = Lists.newArrayList();

   public JsonObject id_byte() {
      JsonObject var1 = new JsonObject();
      JsonArray var2 = new JsonArray();

      for (rld_3 var4 : this.id_class) {
         var4.id_class().id_class(var2);
      }

      var1.addProperty("replace", false);
      var1.add("values", var2);
      return var1;
   }

   public rlM_2 id_class(JsonObject var1, String var2) {
      JsonArray var3 = rpY_2.id_volatile(var1, "values");
      ArrayList var4 = Lists.newArrayList();

      for (JsonElement var6 : var3) {
         var4.add(id_class(var6));
      }

      if (rpY_2.id_class(var1, "replace", false)) {
         this.id_class.clear();
      }

      var4.forEach(var2x -> this.id_class.add(new rld_3(var2x, var2)));
      return this;
   }

   private static rlh_3 id_class(JsonElement var0) {
      String var1;
      boolean var2;
      if (var0.isJsonObject()) {
         JsonObject var3 = var0.getAsJsonObject();
         var1 = rpY_2.id_case(var3, "id");
         var2 = rpY_2.id_class(var3, "required", true);
      } else {
         var1 = rpY_2.id_class(var0, "id");
         var2 = true;
      }

      if (var1.startsWith("#")) {
         rqO_2 var5 = new rqO_2(var1.substring(1));
         return (rlh_3)(var2 ? new rlk_3(var5) : new rlx_3(var5));
      } else {
         rqO_2 var4 = new rqO_2(var1);
         return (rlh_3)(var2 ? new rlX_2(var4) : new rlJ_2(var4));
      }
   }

   public rlM_2 id_class(rqO_2 var1, String var2) {
      return this.id_class(new rlX_2(var1), var2);
   }

   public rlM_2 id_class(rlh_3 var1, String var2) {
      return this.id_class(new rld_3(var1, var2));
   }

   public rlM_2 id_class(rld_3 var1) {
      this.id_class.add(var1);
      return this;
   }

   public static rlM_2 id_class() {
      return new rlM_2();
   }

   public <T> Optional<rlb_3<T>> id_class(Function<rqO_2, rlb_3<T>> var1, Function<rqO_2, T> var2) {
      Builder var3 = ImmutableSet.builder();

      for (rld_3 var5 : this.id_class) {
         if (!var5.id_class().id_class(var1, var2, var3::add)) {
            return Optional.empty();
         }
      }

      return Optional.of(rlb_3.id_class(var3.build()));
   }

   public Stream<rld_3> id_break() {
      return this.id_class.stream();
   }

   public rlM_2 id_break(rqO_2 var1, String var2) {
      return this.id_class(new rlk_3(var1), var2);
   }

   public <T> Stream<rld_3> id_break(Function<rqO_2, rlb_3<T>> var1, Function<rqO_2, T> var2) {
      return this.id_break().filter(var2x -> !var2x.id_class().id_class(var1, var2, var0x -> {
         }));
   }
}
