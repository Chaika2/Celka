package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rTH {
   public static final rTH id_class = new rTH(ImmutableList.of("vanilla"), ImmutableList.of());
   public static final Codec<rTH> id_break = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.STRING.listOf().fieldOf("Enabled").forGetter(var0x -> var0x.id_byte),
               Codec.STRING.listOf().fieldOf("Disabled").forGetter(var0x -> var0x.id_protected)
            )
            .apply(var0, rTH::new)
   );
   private final List<String> id_byte;
   private final List<String> id_protected;

   public rTH(List<String> var1, List<String> var2) {
      this.id_byte = ImmutableList.copyOf(var1);
      this.id_protected = ImmutableList.copyOf(var2);
   }

   public List<String> id_class() {
      return this.id_byte;
   }

   public List<String> id_break() {
      return this.id_protected;
   }
}
