package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rrPz_1 extends rrPc_1 {
   public static final Codec<rrPz_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter(var0x -> var0x.break_),
               Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter(var0x -> var0x.protected_),
               Codec.INT.fieldOf("min_dist").orElse(0).forGetter(var0x -> var0x.throws_),
               Codec.INT.fieldOf("max_dist").orElse(0).forGetter(var0x -> var0x.case_)
            )
            .apply(var0, rrPz_1::new)
   );
   private final float break_;
   private final float protected_;
   private final int throws_;
   private final int case_;

   public rrPz_1(float var1, float var2, int var3, int var4) {
      if (var3 >= var4) {
         throw new IllegalArgumentException("Invalid range: [" + var3 + "," + var4 + "]");
      } else {
         this.break_ = var1;
         this.protected_ = var2;
         this.throws_ = var3;
         this.case_ = var4;
      }
   }

   @Override
   public boolean class_(rfH_2 var1, rfH_2 var2, rfH_2 var3, Random var4) {
      int var5 = var2.implements_(var3);
      float var6 = var4.nextFloat();
      return (double)var6 <= rfU_2.break_((double)this.break_, (double)this.protected_, rfU_2.byte_((double)var5, (double)this.throws_, (double)this.case_));
   }

   @Override
   protected rrPX<?> class_() {
      return rrPX.break_;
   }
}
