package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYf_1 extends rTG {
   public static final Codec<rYf_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rVL.transient_.fieldOf("type").forGetter(var0x -> var0x.break_),
               Codec.INT.fieldOf("weight").forGetter(var0x -> var0x.byte_),
               Codec.INT.fieldOf("minCount").forGetter(var0x -> var0x.protected_),
               Codec.INT.fieldOf("maxCount").forGetter(var0x -> var0x.throws_)
            )
            .apply(var0, rYf_1::new)
   );
   public final aI_2<?> break_;
   public final int protected_;
   public final int throws_;

   public rYf_1(aI_2<?> var1, int var2, int var3, int var4) {
      super(var2);
      this.break_ = var1.throws_() == aH_2.MISC ? aI_2.x : var1;
      this.protected_ = var3;
      this.throws_ = var4;
   }

   @Override
   public String toString() {
      return aI_2.class_(this.break_) + "*(" + this.protected_ + "-" + this.throws_ + "):" + this.byte_;
   }
}
