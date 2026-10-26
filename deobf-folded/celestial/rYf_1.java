package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYf_1 extends rTG {
   public static final Codec<rYf_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rVL.id_transient.fieldOf("type").forGetter(var0x -> var0x.id_break),
               Codec.INT.fieldOf("weight").forGetter(var0x -> var0x.id_byte),
               Codec.INT.fieldOf("minCount").forGetter(var0x -> var0x.id_protected),
               Codec.INT.fieldOf("maxCount").forGetter(var0x -> var0x.id_throws)
            )
            .apply(var0, rYf_1::new)
   );
   public final aI_2<?> id_break;
   public final int id_protected;
   public final int id_throws;

   public rYf_1(aI_2<?> var1, int var2, int var3, int var4) {
      super(var2);
      this.id_break = var1.id_throws() == aH_2.MISC ? aI_2.x : var1;
      this.id_protected = var3;
      this.id_throws = var4;
   }

   @Override
   public String toString() {
      return aI_2.id_class(this.id_break) + "*(" + this.id_protected + "-" + this.id_throws + "):" + this.id_byte;
   }
}
