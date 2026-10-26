package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class rrSq_1 {
   public static final Codec<rrSq_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rrSf_1.id_class.optionalFieldOf("stronghold").forGetter(var0x -> Optional.ofNullable(var0x.id_throws)),
               Codec.simpleMap(rVL.t, rrSI.id_class, rVL.t).fieldOf("structures").forGetter(var0x -> var0x.id_protected)
            )
            .apply(var0, rrSq_1::new)
   );
   public static final ImmutableMap<rrrZ<?>, rrSI> id_break = ImmutableMap.builder()
      .put(rrrZ.id_new, new rrSI(32, 8, 10387312))
      .put(rrrZ.id_case, new rrSI(32, 8, 14357617))
      .put(rrrZ.id_catch, new rrSI(32, 8, 14357618))
      .put(rrrZ.id_throws, new rrSI(32, 8, 14357619))
      .put(rrrZ.id_finally, new rrSI(32, 8, 14357620))
      .put(rrrZ.id_break, new rrSI(32, 8, 165745296))
      .put(rrrZ.id_extends, new rrSI(1, 0, 0))
      .put(rrrZ.id_native, new rrSI(32, 5, 10387313))
      .put(rrrZ.id_package, new rrSI(20, 11, 10387313))
      .put(rrrZ.id_protected, new rrSI(80, 20, 10387319))
      .put(rrrZ.id_int, new rrSI(1, 0, 0))
      .put(rrrZ.id_byte, new rrSI(1, 0, 0))
      .put(rrrZ.id_private, new rrSI(40, 15, 34222645))
      .put(rrrZ.id_implements, new rrSI(24, 4, 165745295))
      .put(rrrZ.id_volatile, new rrSI(20, 8, 14357621))
      .put(rrrZ.id_super, new rrSI(27, 4, 30084232))
      .put(rrrZ.id_final, new rrSI(27, 4, 30084232))
      .put(rrrZ.id_continue, new rrSI(2, 1, 14357921))
      .build();
   public static final rrSf_1 id_byte;
   private final Map<rrrZ<?>, rrSI> id_protected;
   private final rrSf_1 id_throws;

   public rrSq_1(Optional<rrSf_1> var1, Map<rrrZ<?>, rrSI> var2) {
      this.id_throws = var1.orElse((rrSf_1)null);
      this.id_protected = var2;
   }

   public rrSq_1(boolean var1) {
      this.id_protected = Maps.newHashMap(id_break);
      this.id_throws = var1 ? id_byte : null;
   }

   static {
      for (rrrZ var1 : rVL.t) {
         if (!id_break.containsKey(var1)) {
            throw new IllegalStateException("Structure feature without default settings: " + rVL.t.id_break(var1));
         }
      }

      id_byte = new rrSf_1(32, 3, 128);
   }

   public Map<rrrZ<?>, rrSI> id_class() {
      return this.id_protected;
   }

   public rrSI id_class(rrrZ<?> var1) {
      return this.id_protected.get(var1);
   }

   public rrSf_1 id_break() {
      return this.id_throws;
   }
}
