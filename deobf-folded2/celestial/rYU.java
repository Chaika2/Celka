package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

final class rYU {
   public static final MapCodec<rYU> id_class = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               rqO_2.id_class
                  .flatXmap(
                     var0x -> Optional.ofNullable(rYa_1.id_break.get(var0x))
                           .<DataResult>map(DataResult::success)
                           .orElseGet(() -> DataResult.error("Unknown preset: " + var0x)),
                     var0x -> DataResult.success(var0x.id_byte)
                  )
                  .fieldOf("preset")
                  .stable()
                  .forGetter(rYU::id_class),
               rVn_1.id_class(rVL.n).forGetter(rYU::id_break),
               Codec.LONG.fieldOf("seed").stable().forGetter(rYU::id_byte)
            )
            .apply(var0, var0.stable(rYU::new))
   );
   private final rYa_1 id_break;
   private final rVL<rYG> id_byte;
   private final long id_protected;

   public long id_byte() {
      return this.id_protected;
   }

   rYU(rYa_1 var1, rVL<rYG> var2, long var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   public rYa_1 id_class() {
      return this.id_break;
   }

   public rVL<rYG> id_break() {
      return this.id_byte;
   }

   public rYD id_protected() {
      return this.id_break.id_class(this.id_byte, this.id_protected);
   }
}
