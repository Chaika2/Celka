package celestial;

import java.util.function.Function;

public enum rNJ {
   THIS("this", rzQ_2.class_, rNs_1.protected_),
   KILLER("killer", rzQ_2.protected_, rNs_1.protected_),
   KILLER_PLAYER("killer_player", rzQ_2.break_, rNs_1.protected_),
   BLOCK_ENTITY("block_entity", rzQ_2.private_, rNs_1.throws_);

   public final String sourceName;
   public final rzd_3<?> lootParam;
   public final Function<rzr_3, rcZ_2> field_216226_g;

   private <T> rNJ(String var3, rzd_3<T> var4, Function<? super T, rcZ_2> var5) {
      this.sourceName = var3;
      this.lootParam = var4;
      this.field_216226_g = var2x -> {
         Object var3x = var2x.break_(var4);
         return var3x != null ? (rcZ_2)var5.apply(var3x) : null;
      };
   }

   public static rNJ class_(String var0) {
      for (rNJ var4 : values()) {
         if (var4.sourceName.equals(var0)) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Invalid tag source " + var0);
   }
}
