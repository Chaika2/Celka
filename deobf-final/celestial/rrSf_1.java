package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSf_1 {
   public static final Codec<rrSf_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 1023).fieldOf("distance").forGetter(rrSf_1::class_),
               Codec.intRange(0, 1023).fieldOf("spread").forGetter(rrSf_1::break_),
               Codec.intRange(1, 4095).fieldOf("count").forGetter(rrSf_1::byte_)
            )
            .apply(var0, rrSf_1::new)
   );
   private final int break_;
   private final int byte_;
   private final int protected_;

   public int byte_() {
      return this.protected_;
   }

   public rrSf_1(int var1, int var2, int var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   public int class_() {
      return this.break_;
   }

   public int break_() {
      return this.byte_;
   }
}
