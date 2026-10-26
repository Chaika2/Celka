package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public final class rVa_1 {
   public static final rVa_1 id_class = new rVa_1(-1, "unknown");
   private static final Map<rgF_2, rVa_1> id_break = Stream.of(rgF_2.values())
      .filter(rgF_2::id_byte)
      .collect(ImmutableMap.toImmutableMap(Function.identity(), var0 -> new rVa_1(var0.id_protected(), var0.id_throws())));
   private static final Map<String, rVa_1> id_byte = id_break.values()
      .stream()
      .collect(ImmutableMap.toImmutableMap(var0 -> var0.id_throws, Function.identity()));
   private final int id_protected;
   private final String id_throws;

   private String id_byte() {
      return String.format("#%06X", this.id_protected);
   }

   private rVa_1(int var1, String var2) {
      this.id_protected = var1;
      this.id_throws = var2;
   }

   public rVa_1(int var1) {
      this.id_protected = var1;
      this.id_throws = null;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rVa_1 var2 = (rVa_1)var1;
         return this.id_protected == var2.id_protected;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.id_throws != null ? this.id_throws : this.id_byte();
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id_protected, this.id_throws);
   }

   public static rVa_1 id_class(int var0) {
      return new rVa_1(var0);
   }

   public static rVa_1 id_class(String var0) {
      if (var0.startsWith("#")) {
         try {
            int var1 = Integer.parseInt(var0.substring(1), 16);
            return id_class(var1);
         } catch (NumberFormatException var2) {
            return null;
         }
      } else {
         return id_byte.get(var0);
      }
   }

   public static rVa_1 id_class(rgF_2 var0) {
      return id_break.get(var0);
   }

   public int id_class() {
      return this.id_protected;
   }

   public String id_break() {
      return this.id_throws != null ? this.id_throws : this.id_byte();
   }
}
