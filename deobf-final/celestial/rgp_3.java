package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class rgp_3<T> {
   public static final rgp_3<rgP_2> class_ = new rgp_3<>("show_text", true, rgB_2::class_, rgB_2::break_, Function.identity());
   public static final rgp_3<rgT_2> break_ = new rgp_3<>("show_item", true, var0 -> rgT_2.class_(var0), var0 -> var0.break_(), var0 -> rgT_2.class_(var0));
   public static final rgp_3<rgq_3> byte_ = new rgp_3<>("show_entity", true, rgq_3::class_, rgq_3::class_, rgq_3::class_);
   private static final Map<String, rgp_3> protected_ = Stream.of(class_, break_, byte_).collect(ImmutableMap.toImmutableMap(rgp_3::break_, var0 -> var0));
   private final String throws_;
   private final boolean case_;
   private final Function<JsonElement, T> catch_;
   private final Function<T, JsonElement> private_;
   private final Function<rgP_2, T> implements_;

   public rgp_3(String var1, boolean var2, Function<JsonElement, T> var3, Function<T, JsonElement> var4, Function<rgP_2, T> var5) {
      this.throws_ = var1;
      this.case_ = var2;
      this.catch_ = var3;
      this.private_ = var4;
      this.implements_ = var5;
   }

   @Override
   public String toString() {
      return "<action " + this.throws_ + ">";
   }

   public boolean class_() {
      return this.case_;
   }

   public JsonElement class_(Object var1) {
      return this.private_.apply(this.break_(var1));
   }

   public static rgp_3 class_(String var0) {
      return protected_.get(var0);
   }

   public rgy_3 class_(JsonElement var1) {
      Object var2 = this.catch_.apply(var1);
      return var2 == null ? null : new rgy_3(this, (T)var2);
   }

   public rgy_3 class_(rgP_2 var1) {
      Object var2 = this.implements_.apply(var1);
      return var2 == null ? null : new rgy_3(this, (T)var2);
   }

   public String break_() {
      return this.throws_;
   }

   T break_(Object var1) {
      return (T)var1;
   }
}
