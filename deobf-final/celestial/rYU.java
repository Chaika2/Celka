package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

final class rYU {
   public static final MapCodec<rYU> class_ = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               rqO_2.class_
                  .flatXmap(
                     var0x -> Optional.ofNullable(rYa_1.break_.get(var0x))
                           .<DataResult>map(DataResult::success)
                           .orElseGet(() -> DataResult.error("Unknown preset: " + var0x)),
                     var0x -> DataResult.success(var0x.byte_)
                  )
                  .fieldOf("preset")
                  .stable()
                  .forGetter(rYU::class_),
               rVn_1.class_(rVL.n).forGetter(rYU::break_),
               Codec.LONG.fieldOf("seed").stable().forGetter(rYU::byte_)
            )
            .apply(var0, var0.stable(rYU::new))
   );
   private final rYa_1 break_;
   private final rVL<rYG> byte_;
   private final long protected_;

   public long byte_() {
      return this.protected_;
   }

   rYU(rYa_1 var1, rVL<rYG> var2, long var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   public rYa_1 class_() {
      return this.break_;
   }

   public rVL<rYG> break_() {
      return this.byte_;
   }

   public rYD protected_() {
      return this.break_.class_(this.byte_, this.protected_);
   }
}
