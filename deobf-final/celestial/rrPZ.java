package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rrPZ extends rrPL {
   public static final Codec<rrPZ> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.break_.fieldOf("block_state").forGetter(var0x -> var0x.break_), Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.protected_)
            )
            .apply(var0, rrPZ::new)
   );
   private final xc_3 break_;
   private final float protected_;

   public rrPZ(xc_3 var1, float var2) {
      this.break_ = var1;
      this.protected_ = var2;
   }

   @Override
   public boolean class_(xc_3 var1, Random var2) {
      return var1 == this.break_ && var2.nextFloat() < this.protected_;
   }

   @Override
   protected rrPJ<?> class_() {
      return rrPJ.case_;
   }
}
