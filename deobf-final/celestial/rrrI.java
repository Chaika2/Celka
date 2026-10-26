package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;

public class rrrI implements rUv_1 {
   public static final Codec<rrrI> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(reu_3.break_.fieldOf("start_pool").forGetter(rrrI::byte_), Codec.intRange(0, 7).fieldOf("size").forGetter(rrrI::break_))
            .apply(var0, rrrI::new)
   );
   private final Supplier<reu_3> break_;
   private final int byte_;

   public Supplier<reu_3> byte_() {
      return this.break_;
   }

   public rrrI(Supplier<reu_3> var1, int var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public int break_() {
      return this.byte_;
   }
}
