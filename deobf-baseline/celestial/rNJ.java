package celestial;

import java.util.function.Function;

public enum rNJ {
   THIS("this", rzQ_2.id_class, rNs_1.id_protected),
   KILLER("killer", rzQ_2.id_protected, rNs_1.id_protected),
   KILLER_PLAYER("killer_player", rzQ_2.id_break, rNs_1.id_protected),
   BLOCK_ENTITY("block_entity", rzQ_2.id_private, rNs_1.id_throws);

   public final String sourceName;
   public final rzd_3<?> lootParam;
   public final Function<rzr_3, rcZ_2> field_216226_g;

   private <T> rNJ(String var3, rzd_3<T> var4, Function<? super T, rcZ_2> var5) {
      this.sourceName = var3;
      this.lootParam = var4;
      this.field_216226_g = var2x -> {
         Object var3x = var2x.id_break(var4);
         return var3x != null ? (rcZ_2)var5.apply(var3x) : null;
      };
   }

   public static rNJ id_class(String var0) {
      for (rNJ var4 : values()) {
         if (var4.sourceName.equals(var0)) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Invalid tag source " + var0);
   }
}
