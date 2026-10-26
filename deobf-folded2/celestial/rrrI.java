package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;

public class rrrI implements rUv_1 {
   public static final Codec<rrrI> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(reu_3.id_break.fieldOf("start_pool").forGetter(rrrI::id_byte), Codec.intRange(0, 7).fieldOf("size").forGetter(rrrI::id_break))
            .apply(var0, rrrI::new)
   );
   private final Supplier<reu_3> id_break;
   private final int id_byte;

   public Supplier<reu_3> id_byte() {
      return this.id_break;
   }

   public rrrI(Supplier<reu_3> var1, int var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public int id_break() {
      return this.id_byte;
   }
}
