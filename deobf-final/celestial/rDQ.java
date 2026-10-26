package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;

public abstract class rDQ {
   public static final Codec<rDQ> class_ = rVL.rs.dispatch(rDQ::break_, rUh_1::class_);
   protected final OptionalInt break_;

   public OptionalInt byte_() {
      return this.break_;
   }

   public rDQ(OptionalInt var1) {
      this.break_ = var1;
   }

   protected static <S extends rDQ> RecordCodecBuilder<S, OptionalInt> class_() {
      return Codec.intRange(0, 80)
         .optionalFieldOf("min_clipped_height")
         .xmap(var0 -> var0.map(OptionalInt::of).orElse(OptionalInt.empty()), var0 -> var0.isPresent() ? Optional.of(var0.getAsInt()) : Optional.empty())
         .forGetter(var0 -> var0.break_);
   }

   public abstract int class_(int var1, int var2);

   protected abstract rUh_1<?> break_();
}
