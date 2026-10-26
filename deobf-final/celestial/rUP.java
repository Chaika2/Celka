package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class rUP implements rUv_1 {
   public static final Codec<rUP> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(rfH_2.byte_.optionalFieldOf("exit").forGetter(var0x -> var0x.break_), Codec.BOOL.fieldOf("exact").forGetter(var0x -> var0x.byte_))
            .apply(var0, rUP::new)
   );
   private final Optional<rfH_2> break_;
   private final boolean byte_;

   public Optional<rfH_2> byte_() {
      return this.break_;
   }

   private rUP(Optional<rfH_2> var1, boolean var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public static rUP class_(rfH_2 var0, boolean var1) {
      return new rUP(Optional.of(var0), var1);
   }

   public static rUP break_() {
      return new rUP(Optional.empty(), false);
   }

   public boolean protected_() {
      return this.byte_;
   }
}
