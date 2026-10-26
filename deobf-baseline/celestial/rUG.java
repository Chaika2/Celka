package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUG {
   public static final Codec<rUG> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("centerX").orElse(0).forGetter(var0x -> var0x.id_break),
               Codec.INT.fieldOf("centerZ").orElse(0).forGetter(var0x -> var0x.id_byte),
               Codec.INT.fieldOf("radius").orElse(0).forGetter(var0x -> var0x.id_protected),
               Codec.INT.fieldOf("height").orElse(0).forGetter(var0x -> var0x.id_throws),
               Codec.BOOL.fieldOf("guarded").orElse(false).forGetter(var0x -> var0x.id_case)
            )
            .apply(var0, rUG::new)
   );
   private final int id_break;
   private final int id_byte;
   private final int id_protected;
   private final int id_throws;
   private final boolean id_case;
   private final rfl_3 id_catch;

   public int id_byte() {
      return this.id_protected;
   }

   public rUG(int var1, int var2, int var3, int var4, boolean var5) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = new rfl_3((double)(var1 - var3), 0.0, (double)(var2 - var3), (double)(var1 + var3), 256.0, (double)(var2 + var3));
   }

   public int id_class() {
      return this.id_break;
   }

   public boolean id_class(rfH_2 var1) {
      return var1.b_() >> 4 == this.id_break >> 4 && var1.d_() >> 4 == this.id_byte >> 4;
   }

   public int id_break() {
      return this.id_byte;
   }

   public boolean id_throws() {
      return this.id_case;
   }

   public rfl_3 id_case() {
      return this.id_catch;
   }

   public int id_protected() {
      return this.id_throws;
   }
}
