package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rrPm_1 extends rrPL {
   public static final Codec<rrPm_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rVL.strictfp_.fieldOf("block").forGetter(var0x -> var0x.break_), Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.protected_)
            )
            .apply(var0, rrPm_1::new)
   );
   private final xd_3 break_;
   private final float protected_;

   public rrPm_1(xd_3 var1, float var2) {
      this.break_ = var1;
      this.protected_ = var2;
   }

   @Override
   public boolean class_(xc_3 var1, Random var2) {
      return var1.class_(this.break_) && var2.nextFloat() < this.protected_;
   }

   @Override
   protected rrPJ<?> class_() {
      return rrPJ.throws_;
   }
}
