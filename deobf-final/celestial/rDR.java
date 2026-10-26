package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.function.Supplier;

public class rDR {
   public static final Codec<rDR> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rDg_1.break_.fieldOf("feature").forGetter(var0x -> var0x.break_), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter(var0x -> var0x.byte_)
            )
            .apply(var0, rDR::new)
   );
   public final Supplier<rDg_1<?, ?>> break_;
   public final float byte_;

   public rDR(rDg_1<?, ?> var1, float var2) {
      this(() -> var1, var2);
   }

   private rDR(Supplier<rDg_1<?, ?>> var1, float var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4) {
      return this.break_.get().class_(var1, var2, var3, var4);
   }
}
