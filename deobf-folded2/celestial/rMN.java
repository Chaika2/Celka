package celestial;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public enum rMN {
   RED(0, "red", rYl_1.id_case, rYl_1.id_this, rYl_1.h, rYl_1.id_long, rYl_1.N, rYl_1.id_float, rYl_1.c),
   SNOW(1, "snow", rYl_1.id_char, rYl_1.id_abstract, rYl_1.Q);

   private static final rMN[] field_221088_c = Arrays.stream(values()).sorted(Comparator.comparingInt(rMN::id_break)).toArray(rMN[]::new);
   private static final Map<String, rMN> TYPES_BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(rMN::id_class, var0 -> (rMN)var0));
   private final int index;
   private final String name;
   private final List<rqM_2<rYG>> spawnBiomes;

   private rMN(int var3, String var4, rqM_2<rYG>... var5) {
      this.index = var3;
      this.name = var4;
      this.spawnBiomes = Arrays.asList(var5);
   }

   public static rMN id_class(int var0) {
      if (var0 < 0 || var0 > field_221088_c.length) {
         var0 = 0;
      }

      return field_221088_c[var0];
   }

   public static rMN id_class(Optional<rqM_2<rYG>> var0) {
      return var0.isPresent() && SNOW.spawnBiomes.contains(var0.get()) ? SNOW : RED;
   }

   public static rMN id_class(String var0) {
      return TYPES_BY_NAME.getOrDefault(var0, RED);
   }

   public String id_class() {
      return this.name;
   }

   public int id_break() {
      return this.index;
   }
}
