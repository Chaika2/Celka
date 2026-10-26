package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.function.Supplier;

public class rDR {
   public static final Codec<rDR> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rDg_1.id_break.fieldOf("feature").forGetter(var0x -> var0x.id_break),
               Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter(var0x -> var0x.id_byte)
            )
            .apply(var0, rDR::new)
   );
   public final Supplier<rDg_1<?, ?>> id_break;
   public final float id_byte;

   public rDR(rDg_1<?, ?> var1, float var2) {
      this(() -> var1, var2);
   }

   private rDR(Supplier<rDg_1<?, ?>> var1, float var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4) {
      return this.id_break.get().id_class(var1, var2, var3, var4);
   }
}
