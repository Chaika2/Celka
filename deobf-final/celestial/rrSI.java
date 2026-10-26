package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class rrSI {
   public static final Codec<rrSI> class_ = RecordCodecBuilder.create(
         var0 -> var0.group(
                  Codec.intRange(0, 4096).fieldOf("spacing").forGetter(var0x -> var0x.break_),
                  Codec.intRange(0, 4096).fieldOf("separation").forGetter(var0x -> var0x.byte_),
                  Codec.intRange(0, Integer.MAX_VALUE).fieldOf("salt").forGetter(var0x -> var0x.protected_)
               )
               .apply(var0, rrSI::new)
      )
      .comapFlatMap(
         var0 -> var0.break_ <= var0.byte_ ? DataResult.error("Spacing has to be smaller than separation") : DataResult.success(var0), Function.identity()
      );
   private final int break_;
   private final int byte_;
   private final int protected_;

   public int byte_() {
      return this.protected_;
   }

   public rrSI(int var1, int var2, int var3) {
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
