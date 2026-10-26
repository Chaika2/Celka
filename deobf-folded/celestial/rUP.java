package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class rUP implements rUv_1 {
   public static final Codec<rUP> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rfH_2.id_byte.optionalFieldOf("exit").forGetter(var0x -> var0x.id_break), Codec.BOOL.fieldOf("exact").forGetter(var0x -> var0x.id_byte)
            )
            .apply(var0, rUP::new)
   );
   private final Optional<rfH_2> id_break;
   private final boolean id_byte;

   public Optional<rfH_2> id_byte() {
      return this.id_break;
   }

   private rUP(Optional<rfH_2> var1, boolean var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public static rUP id_class(rfH_2 var0, boolean var1) {
      return new rUP(Optional.of(var0), var1);
   }

   public static rUP id_break() {
      return new rUP(Optional.empty(), false);
   }

   public boolean id_protected() {
      return this.id_byte;
   }
}
