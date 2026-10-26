package celestial;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public enum rMN {
   RED(0, "red", rYl_1.case_, rYl_1.this_, rYl_1.h, rYl_1.long_, rYl_1.N, rYl_1.float_, rYl_1.c),
   SNOW(1, "snow", rYl_1.char_, rYl_1.abstract_, rYl_1.Q);

   private static final rMN[] field_221088_c = Arrays.stream(values()).sorted(Comparator.comparingInt(rMN::break_)).toArray(rMN[]::new);
   private static final Map<String, rMN> TYPES_BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(rMN::class_, var0 -> (rMN)var0));
   private final int index;
   private final String name;
   private final List<rqM_2<rYG>> spawnBiomes;

   private rMN(int var3, String var4, rqM_2<rYG>... var5) {
      this.index = var3;
      this.name = var4;
      this.spawnBiomes = Arrays.asList(var5);
   }

   public static rMN class_(int var0) {
      if (var0 < 0 || var0 > field_221088_c.length) {
         var0 = 0;
      }

      return field_221088_c[var0];
   }

   public static rMN class_(Optional<rqM_2<rYG>> var0) {
      return var0.isPresent() && SNOW.spawnBiomes.contains(var0.get()) ? SNOW : RED;
   }

   public static rMN class_(String var0) {
      return TYPES_BY_NAME.getOrDefault(var0, RED);
   }

   public String class_() {
      return this.name;
   }

   public int break_() {
      return this.index;
   }
}
