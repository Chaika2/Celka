package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rTH {
   public static final rTH class_ = new rTH(ImmutableList.of("vanilla"), ImmutableList.of());
   public static final Codec<rTH> break_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.STRING.listOf().fieldOf("Enabled").forGetter(var0x -> var0x.byte_),
               Codec.STRING.listOf().fieldOf("Disabled").forGetter(var0x -> var0x.protected_)
            )
            .apply(var0, rTH::new)
   );
   private final List<String> byte_;
   private final List<String> protected_;

   public rTH(List<String> var1, List<String> var2) {
      this.byte_ = ImmutableList.copyOf(var1);
      this.protected_ = ImmutableList.copyOf(var2);
   }

   public List<String> class_() {
      return this.byte_;
   }

   public List<String> break_() {
      return this.protected_;
   }
}
