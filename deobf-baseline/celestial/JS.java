package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;

public class JS {
   public static final JS id_class = new JS(ImmutableList.of());
   private final List<JG> id_break;

   JS(List<JG> var1) {
      this.id_break = ImmutableList.copyOf(var1);
   }

   public static JS id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "properties");
         ArrayList var2 = Lists.newArrayList();

         for (Entry var4 : var1.entrySet()) {
            var2.add(id_class((String)var4.getKey(), (JsonElement)var4.getValue()));
         }

         return new JS(var2);
      } else {
         return id_class;
      }
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (!this.id_break.isEmpty()) {
            this.id_break.forEach(var1x -> var1.add(var1x.id_break(), var1x.id_class()));
         }

         return var1;
      }
   }

   private static JG id_class(String var0, JsonElement var1) {
      if (var1.isJsonPrimitive()) {
         String var5 = var1.getAsString();
         return new JE(var0, var5);
      } else {
         JsonObject var2 = rpY_2.id_private(var1, "value");
         String var3 = var2.has("min") ? id_break(var2.get("min")) : null;
         String var4 = var2.has("max") ? id_break(var2.get("max")) : null;
         return (JG)(var3 != null && var3.equals(var4) ? new JE(var0, var3) : new Jb_1(var0, var3, var4));
      }
   }

   public <S extends rCn_1<?, S>> boolean id_class(rCF<?, S> var1, S var2) {
      for (JG var4 : this.id_break) {
         if (!var4.id_class(var1, (S)var2)) {
            return false;
         }
      }

      return true;
   }

   public boolean id_class(xc_3 var1) {
      return this.id_class(var1.id_break().id_new(), var1);
   }

   public boolean id_class(rXE var1) {
      return this.id_class(var1.id_class().id_catch(), var1);
   }

   public void id_class(rCF<?, ?> var1, Consumer<String> var2) {
      this.id_break.forEach(var2x -> var2x.id_class(var1, var2));
   }

   private static String id_break(JsonElement var0) {
      return var0.isJsonNull() ? null : var0.getAsString();
   }
}
