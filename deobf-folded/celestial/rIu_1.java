package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

final class rIu_1 {
   public static final Codec<rIu_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("spacing").forGetter(var0x -> var0x.id_break),
               Codec.INT.fieldOf("separation").forGetter(var0x -> var0x.id_byte),
               Codec.INT.fieldOf("salt").forGetter(var0x -> var0x.id_protected)
            )
            .apply(var0, rIu_1::new)
   );
   final int id_break;
   final int id_byte;
   final int id_protected;

   public rIu_1(int var1, int var2, int var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   public <T> Dynamic<T> id_class(DynamicOps<T> var1) {
      return new Dynamic(var1, id_class.encodeStart(var1, this).result().orElse(var1.emptyMap()));
   }
}
