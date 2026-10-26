package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;

public abstract class rDQ {
   public static final Codec<rDQ> id_class = rVL.rs.dispatch(rDQ::id_break, rUh_1::id_class);
   protected final OptionalInt id_break;

   public OptionalInt id_byte() {
      return this.id_break;
   }

   public rDQ(OptionalInt var1) {
      this.id_break = var1;
   }

   protected static <S extends rDQ> RecordCodecBuilder<S, OptionalInt> id_class() {
      return Codec.intRange(0, 80)
         .optionalFieldOf("min_clipped_height")
         .xmap(var0 -> var0.map(OptionalInt::of).orElse(OptionalInt.empty()), var0 -> var0.isPresent() ? Optional.of(var0.getAsInt()) : Optional.empty())
         .forGetter(var0 -> var0.id_break);
   }

   public abstract int id_class(int var1, int var2);

   protected abstract rUh_1<?> id_break();
}
