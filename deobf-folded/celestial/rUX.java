package celestial;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Random;
import java.util.function.Function;

public class rUX {
   public static final Codec<rUX> id_class = Codec.either(
         Codec.INT,
         RecordCodecBuilder.create(
               var0 -> var0.group(Codec.INT.fieldOf("base").forGetter(var0x -> var0x.id_break), Codec.INT.fieldOf("spread").forGetter(var0x -> var0x.id_byte))
                     .apply(var0, rUX::new)
            )
            .comapFlatMap(
               var0 -> var0.id_byte < 0 ? DataResult.error("Spread must be non-negative, got: " + var0.id_byte) : DataResult.success(var0), Function.identity()
            )
      )
      .xmap(var0 -> (rUX)var0.map(rUX::id_class, var0x -> var0x), var0 -> var0.id_byte == 0 ? Either.left(var0.id_break) : Either.right(var0));
   private final int id_break;
   private final int id_byte;

   private rUX(int var1, int var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rUX var2 = (rUX)var1;
         return this.id_break == var2.id_break && this.id_byte == var2.id_byte;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "[" + this.id_break + "-" + (this.id_break + this.id_byte) + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id_break, this.id_byte);
   }

   public static Codec<rUX> id_class(int var0, int var1, int var2) {
      Function var3 = var3x -> {
         if (var3x.id_break >= var0 && var3x.id_break <= var1) {
            return var3x.id_byte <= var2 ? DataResult.success(var3x) : DataResult.error("Spread too big: " + var3x.id_byte + " > " + var2);
         } else {
            return DataResult.error("Base value out of range: " + var3x.id_break + " [" + var0 + "-" + var1 + "]");
         }
      };
      return id_class.flatXmap(var3, var3);
   }

   public static rUX id_class(int var0) {
      return new rUX(var0, 0);
   }

   public static rUX id_class(int var0, int var1) {
      return new rUX(var0, var1);
   }

   public int id_class(Random var1) {
      return this.id_byte == 0 ? this.id_break : this.id_break + var1.nextInt(this.id_byte + 1);
   }
}
