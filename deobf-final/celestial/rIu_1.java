package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

final class rIu_1 {
   public static final Codec<rIu_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("spacing").forGetter(var0x -> var0x.break_),
               Codec.INT.fieldOf("separation").forGetter(var0x -> var0x.byte_),
               Codec.INT.fieldOf("salt").forGetter(var0x -> var0x.protected_)
            )
            .apply(var0, rIu_1::new)
   );
   final int break_;
   final int byte_;
   final int protected_;

   public rIu_1(int var1, int var2, int var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   public <T> Dynamic<T> class_(DynamicOps<T> var1) {
      return new Dynamic(var1, class_.encodeStart(var1, this).result().orElse(var1.emptyMap()));
   }
}
