package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class rrSq_1 {
   public static final Codec<rrSq_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rrSf_1.class_.optionalFieldOf("stronghold").forGetter(var0x -> Optional.ofNullable(var0x.throws_)),
               Codec.simpleMap(rVL.t, rrSI.class_, rVL.t).fieldOf("structures").forGetter(var0x -> var0x.protected_)
            )
            .apply(var0, rrSq_1::new)
   );
   public static final ImmutableMap<rrrZ<?>, rrSI> break_ = ImmutableMap.builder()
      .put(rrrZ.new_, new rrSI(32, 8, 10387312))
      .put(rrrZ.case_, new rrSI(32, 8, 14357617))
      .put(rrrZ.catch_, new rrSI(32, 8, 14357618))
      .put(rrrZ.throws_, new rrSI(32, 8, 14357619))
      .put(rrrZ.finally_, new rrSI(32, 8, 14357620))
      .put(rrrZ.break_, new rrSI(32, 8, 165745296))
      .put(rrrZ.extends_, new rrSI(1, 0, 0))
      .put(rrrZ.native_, new rrSI(32, 5, 10387313))
      .put(rrrZ.package_, new rrSI(20, 11, 10387313))
      .put(rrrZ.protected_, new rrSI(80, 20, 10387319))
      .put(rrrZ.int_, new rrSI(1, 0, 0))
      .put(rrrZ.byte_, new rrSI(1, 0, 0))
      .put(rrrZ.private_, new rrSI(40, 15, 34222645))
      .put(rrrZ.implements_, new rrSI(24, 4, 165745295))
      .put(rrrZ.volatile_, new rrSI(20, 8, 14357621))
      .put(rrrZ.super_, new rrSI(27, 4, 30084232))
      .put(rrrZ.final_, new rrSI(27, 4, 30084232))
      .put(rrrZ.continue_, new rrSI(2, 1, 14357921))
      .build();
   public static final rrSf_1 byte_;
   private final Map<rrrZ<?>, rrSI> protected_;
   private final rrSf_1 throws_;

   public rrSq_1(Optional<rrSf_1> var1, Map<rrrZ<?>, rrSI> var2) {
      this.throws_ = var1.orElse((rrSf_1)null);
      this.protected_ = var2;
   }

   public rrSq_1(boolean var1) {
      this.protected_ = Maps.newHashMap(break_);
      this.throws_ = var1 ? byte_ : null;
   }

   static {
      for (rrrZ var1 : rVL.t) {
         if (!break_.containsKey(var1)) {
            throw new IllegalStateException("Structure feature without default settings: " + rVL.t.break_(var1));
         }
      }

      byte_ = new rrSf_1(32, 3, 128);
   }

   public Map<rrrZ<?>, rrSI> class_() {
      return this.protected_;
   }

   public rrSI class_(rrrZ<?> var1) {
      return this.protected_.get(var1);
   }

   public rrSf_1 break_() {
      return this.throws_;
   }
}
