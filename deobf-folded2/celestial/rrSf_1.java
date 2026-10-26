package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSf_1 {
   public static final Codec<rrSf_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 1023).fieldOf("distance").forGetter(rrSf_1::id_class),
               Codec.intRange(0, 1023).fieldOf("spread").forGetter(rrSf_1::id_break),
               Codec.intRange(1, 4095).fieldOf("count").forGetter(rrSf_1::id_byte)
            )
            .apply(var0, rrSf_1::new)
   );
   private final int id_break;
   private final int id_byte;
   private final int id_protected;

   public int id_byte() {
      return this.id_protected;
   }

   public rrSf_1(int var1, int var2, int var3) {
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
