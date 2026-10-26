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
   public static final JS class_ = new JS(ImmutableList.of());
   private final List<JG> break_;

   JS(List<JG> var1) {
      this.break_ = ImmutableList.copyOf(var1);
   }

   public static JS class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "properties");
         ArrayList var2 = Lists.newArrayList();

         for (Entry var4 : var1.entrySet()) {
            var2.add(class_((String)var4.getKey(), (JsonElement)var4.getValue()));
         }

         return new JS(var2);
      } else {
         return class_;
      }
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (!this.break_.isEmpty()) {
            this.break_.forEach(var1x -> var1.add(var1x.break_(), var1x.class_()));
         }

         return var1;
      }
   }

   private static JG class_(String var0, JsonElement var1) {
      if (var1.isJsonPrimitive()) {
         String var5 = var1.getAsString();
         return new JE(var0, var5);
      } else {
         JsonObject var2 = rpY_2.private_(var1, "value");
         String var3 = var2.has("min") ? break_(var2.get("min")) : null;
         String var4 = var2.has("max") ? break_(var2.get("max")) : null;
         return (JG)(var3 != null && var3.equals(var4) ? new JE(var0, var3) : new Jb_1(var0, var3, var4));
      }
   }

   public <S extends rCn_1<?, S>> boolean class_(rCF<?, S> var1, S var2) {
      for (JG var4 : this.break_) {
         if (!var4.class_(var1, (S)var2)) {
            return false;
         }
      }

      return true;
   }

   public boolean class_(xc_3 var1) {
      return this.class_(var1.break_().new_(), var1);
   }

   public boolean class_(rXE var1) {
      return this.class_(var1.class_().catch_(), var1);
   }

   public void class_(rCF<?, ?> var1, Consumer<String> var2) {
      this.break_.forEach(var2x -> var2x.class_(var1, var2));
   }

   private static String break_(JsonElement var0) {
      return var0.isJsonNull() ? null : var0.getAsString();
   }
}
