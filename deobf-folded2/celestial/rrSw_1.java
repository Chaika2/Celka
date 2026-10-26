package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSw_1 {
   public static final Codec<rrSw_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("target").forGetter(rrSw_1::id_class),
               Codec.intRange(0, 256).fieldOf("size").forGetter(rrSw_1::id_break),
               Codec.INT.fieldOf("offset").forGetter(rrSw_1::id_byte)
            )
            .apply(var0, rrSw_1::new)
   );
   private final int id_break;
   private final int id_byte;
   private final int id_protected;

   public int id_byte() {
      return this.id_protected;
   }

   public rrSw_1(int var1, int var2, int var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   public int id_class() {
      return this.id_break;
   }

   public int id_break() {
      return this.id_byte;
   }
}
