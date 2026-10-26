package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public final class rVa_1 {
   public static final rVa_1 class_ = new rVa_1(-1, "unknown");
   private static final Map<rgF_2, rVa_1> break_ = Stream.of(rgF_2.values())
      .filter(rgF_2::byte_)
      .collect(ImmutableMap.toImmutableMap(Function.identity(), var0 -> new rVa_1(var0.protected_(), var0.throws_())));
   private static final Map<String, rVa_1> byte_ = break_.values().stream().collect(ImmutableMap.toImmutableMap(var0 -> var0.throws_, Function.identity()));
   private final int protected_;
   private final String throws_;

   private String byte_() {
      return String.format("#%06X", this.protected_);
   }

   private rVa_1(int var1, String var2) {
      this.protected_ = var1;
      this.throws_ = var2;
   }

   public rVa_1(int var1) {
      this.protected_ = var1;
      this.throws_ = null;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rVa_1 var2 = (rVa_1)var1;
         return this.protected_ == var2.protected_;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.throws_ != null ? this.throws_ : this.byte_();
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.protected_, this.throws_);
   }

   public static rVa_1 class_(int var0) {
      return new rVa_1(var0);
   }

   public static rVa_1 class_(String var0) {
      if (var0.startsWith("#")) {
         try {
            int var1 = Integer.parseInt(var0.substring(1), 16);
            return class_(var1);
         } catch (NumberFormatException var2) {
            return null;
         }
      } else {
         return byte_.get(var0);
      }
   }

   public static rVa_1 class_(rgF_2 var0) {
      return break_.get(var0);
   }

   public int class_() {
      return this.protected_;
   }

   public String break_() {
      return this.throws_ != null ? this.throws_ : this.byte_();
   }
}
