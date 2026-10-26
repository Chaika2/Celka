package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUG {
   public static final Codec<rUG> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("centerX").orElse(0).forGetter(var0x -> var0x.break_),
               Codec.INT.fieldOf("centerZ").orElse(0).forGetter(var0x -> var0x.byte_),
               Codec.INT.fieldOf("radius").orElse(0).forGetter(var0x -> var0x.protected_),
               Codec.INT.fieldOf("height").orElse(0).forGetter(var0x -> var0x.throws_),
               Codec.BOOL.fieldOf("guarded").orElse(false).forGetter(var0x -> var0x.case_)
            )
            .apply(var0, rUG::new)
   );
   private final int break_;
   private final int byte_;
   private final int protected_;
   private final int throws_;
   private final boolean case_;
   private final rfl_3 catch_;

   public int byte_() {
      return this.protected_;
   }

   public rUG(int var1, int var2, int var3, int var4, boolean var5) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = new rfl_3((double)(var1 - var3), 0.0, (double)(var2 - var3), (double)(var1 + var3), 256.0, (double)(var2 + var3));
   }

   public int class_() {
      return this.break_;
   }

   public boolean class_(rfH_2 var1) {
      return var1.b_() >> 4 == this.break_ >> 4 && var1.d_() >> 4 == this.byte_ >> 4;
   }

   public int break_() {
      return this.byte_;
   }

   public boolean throws_() {
      return this.case_;
   }

   public rfl_3 case_() {
      return this.catch_;
   }

   public int protected_() {
      return this.throws_;
   }
}
