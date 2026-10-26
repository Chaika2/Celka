package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class rrSI {
   public static final Codec<rrSI> id_class = RecordCodecBuilder.create(
         var0 -> var0.group(
                  Codec.intRange(0, 4096).fieldOf("spacing").forGetter(var0x -> var0x.id_break),
                  Codec.intRange(0, 4096).fieldOf("separation").forGetter(var0x -> var0x.id_byte),
                  Codec.intRange(0, Integer.MAX_VALUE).fieldOf("salt").forGetter(var0x -> var0x.id_protected)
               )
               .apply(var0, rrSI::new)
      )
      .comapFlatMap(
         var0 -> var0.id_break <= var0.id_byte ? DataResult.error("Spacing has to be smaller than separation") : DataResult.success(var0), Function.identity()
      );
   private final int id_break;
   private final int id_byte;
   private final int id_protected;

   public int id_byte() {
      return this.id_protected;
   }

   public rrSI(int var1, int var2, int var3) {
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
