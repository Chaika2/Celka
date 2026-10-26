package celestial;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Random;
import java.util.function.Function;

public class rUX {
   public static final Codec<rUX> class_ = Codec.either(
         Codec.INT,
         RecordCodecBuilder.create(
               var0 -> var0.group(Codec.INT.fieldOf("base").forGetter(var0x -> var0x.break_), Codec.INT.fieldOf("spread").forGetter(var0x -> var0x.byte_))
                     .apply(var0, rUX::new)
            )
            .comapFlatMap(
               var0 -> var0.byte_ < 0 ? DataResult.error("Spread must be non-negative, got: " + var0.byte_) : DataResult.success(var0), Function.identity()
            )
      )
      .xmap(var0 -> (rUX)var0.map(rUX::class_, var0x -> var0x), var0 -> var0.byte_ == 0 ? Either.left(var0.break_) : Either.right(var0));
   private final int break_;
   private final int byte_;

   private rUX(int var1, int var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rUX var2 = (rUX)var1;
         return this.break_ == var2.break_ && this.byte_ == var2.byte_;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "[" + this.break_ + "-" + (this.break_ + this.byte_) + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.break_, this.byte_);
   }

   public static Codec<rUX> class_(int var0, int var1, int var2) {
      Function var3 = var3x -> {
         if (var3x.break_ >= var0 && var3x.break_ <= var1) {
            return var3x.byte_ <= var2 ? DataResult.success(var3x) : DataResult.error("Spread too big: " + var3x.byte_ + " > " + var2);
         } else {
            return DataResult.error("Base value out of range: " + var3x.break_ + " [" + var0 + "-" + var1 + "]");
         }
      };
      return class_.flatXmap(var3, var3);
   }

   public static rUX class_(int var0) {
      return new rUX(var0, 0);
   }

   public static rUX class_(int var0, int var1) {
      return new rUX(var0, var1);
   }

   public int class_(Random var1) {
      return this.byte_ == 0 ? this.break_ : this.break_ + var1.nextInt(this.byte_ + 1);
   }
}
