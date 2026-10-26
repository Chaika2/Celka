package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class rgp_3<T> {
   public static final rgp_3<rgP_2> id_class = new rgp_3<>("show_text", true, rgB_2::id_class, rgB_2::id_break, Function.identity());
   public static final rgp_3<rgT_2> id_break = new rgp_3<>(
      "show_item", true, var0 -> rgT_2.id_class(var0), var0 -> var0.id_break(), var0 -> rgT_2.id_class(var0)
   );
   public static final rgp_3<rgq_3> id_byte = new rgp_3<>("show_entity", true, rgq_3::id_class, rgq_3::id_class, rgq_3::id_class);
   private static final Map<String, rgp_3> id_protected = Stream.of(id_class, id_break, id_byte)
      .collect(ImmutableMap.toImmutableMap(rgp_3::id_break, var0 -> var0));
   private final String id_throws;
   private final boolean id_case;
   private final Function<JsonElement, T> id_catch;
   private final Function<T, JsonElement> id_private;
   private final Function<rgP_2, T> id_implements;

   public rgp_3(String var1, boolean var2, Function<JsonElement, T> var3, Function<T, JsonElement> var4, Function<rgP_2, T> var5) {
      this.id_throws = var1;
      this.id_case = var2;
      this.id_catch = var3;
      this.id_private = var4;
      this.id_implements = var5;
   }

   @Override
   public String toString() {
      return "<action " + this.id_throws + ">";
   }

   public boolean id_class() {
      return this.id_case;
   }

   public JsonElement id_class(Object var1) {
      return this.id_private.apply(this.id_break(var1));
   }

   public static rgp_3 id_class(String var0) {
      return id_protected.get(var0);
   }

   public rgy_3 id_class(JsonElement var1) {
      Object var2 = this.id_catch.apply(var1);
      return var2 == null ? null : new rgy_3(this, (T)var2);
   }

   public rgy_3 id_class(rgP_2 var1) {
      Object var2 = this.id_implements.apply(var1);
      return var2 == null ? null : new rgy_3(this, (T)var2);
   }

   public String id_break() {
      return this.id_throws;
   }

   T id_break(Object var1) {
      return (T)var1;
   }
}
