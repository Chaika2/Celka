package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYM {
   public static final Codec<rYM> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.floatRange(-2.0F, 2.0F).fieldOf("temperature").forGetter(var0x -> var0x.break_),
               Codec.floatRange(-2.0F, 2.0F).fieldOf("humidity").forGetter(var0x -> var0x.byte_),
               Codec.floatRange(-2.0F, 2.0F).fieldOf("altitude").forGetter(var0x -> var0x.protected_),
               Codec.floatRange(-2.0F, 2.0F).fieldOf("weirdness").forGetter(var0x -> var0x.throws_),
               Codec.floatRange(0.0F, 1.0F).fieldOf("offset").forGetter(var0x -> var0x.case_)
            )
            .apply(var0, rYM::new)
   );
   private final float break_;
   private final float byte_;
   private final float protected_;
   private final float throws_;
   private final float case_;

   public rYM(float var1, float var2, float var3, float var4, float var5) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rYM var2 = (rYM)var1;
         if (Float.compare(var2.break_, this.break_) != 0) {
            return false;
         } else if (Float.compare(var2.byte_, this.byte_) != 0) {
            return false;
         } else {
            return Float.compare(var2.protected_, this.protected_) != 0 ? false : Float.compare(var2.throws_, this.throws_) == 0;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.break_ != 0.0F ? Float.floatToIntBits(this.break_) : 0;
      var1 = 31 * var1 + (this.byte_ != 0.0F ? Float.floatToIntBits(this.byte_) : 0);
      var1 = 31 * var1 + (this.protected_ != 0.0F ? Float.floatToIntBits(this.protected_) : 0);
      return 31 * var1 + (this.throws_ != 0.0F ? Float.floatToIntBits(this.throws_) : 0);
   }

   public float class_(rYM var1) {
      return (this.break_ - var1.break_) * (this.break_ - var1.break_)
         + (this.byte_ - var1.byte_) * (this.byte_ - var1.byte_)
         + (this.protected_ - var1.protected_) * (this.protected_ - var1.protected_)
         + (this.throws_ - var1.throws_) * (this.throws_ - var1.throws_)
         + (this.case_ - var1.case_) * (this.case_ - var1.case_);
   }
}
