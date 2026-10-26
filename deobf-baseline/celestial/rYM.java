package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYM {
   public static final Codec<rYM> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.floatRange(-2.0F, 2.0F).fieldOf("temperature").forGetter(var0x -> var0x.id_break),
               Codec.floatRange(-2.0F, 2.0F).fieldOf("humidity").forGetter(var0x -> var0x.id_byte),
               Codec.floatRange(-2.0F, 2.0F).fieldOf("altitude").forGetter(var0x -> var0x.id_protected),
               Codec.floatRange(-2.0F, 2.0F).fieldOf("weirdness").forGetter(var0x -> var0x.id_throws),
               Codec.floatRange(0.0F, 1.0F).fieldOf("offset").forGetter(var0x -> var0x.id_case)
            )
            .apply(var0, rYM::new)
   );
   private final float id_break;
   private final float id_byte;
   private final float id_protected;
   private final float id_throws;
   private final float id_case;

   public rYM(float var1, float var2, float var3, float var4, float var5) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rYM var2 = (rYM)var1;
         if (Float.compare(var2.id_break, this.id_break) != 0) {
            return false;
         } else if (Float.compare(var2.id_byte, this.id_byte) != 0) {
            return false;
         } else {
            return Float.compare(var2.id_protected, this.id_protected) != 0 ? false : Float.compare(var2.id_throws, this.id_throws) == 0;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.id_break != 0.0F ? Float.floatToIntBits(this.id_break) : 0;
      var1 = 31 * var1 + (this.id_byte != 0.0F ? Float.floatToIntBits(this.id_byte) : 0);
      var1 = 31 * var1 + (this.id_protected != 0.0F ? Float.floatToIntBits(this.id_protected) : 0);
      return 31 * var1 + (this.id_throws != 0.0F ? Float.floatToIntBits(this.id_throws) : 0);
   }

   public float id_class(rYM var1) {
      return (this.id_break - var1.id_break) * (this.id_break - var1.id_break)
         + (this.id_byte - var1.id_byte) * (this.id_byte - var1.id_byte)
         + (this.id_protected - var1.id_protected) * (this.id_protected - var1.id_protected)
         + (this.id_throws - var1.id_throws) * (this.id_throws - var1.id_throws)
         + (this.id_case - var1.id_case) * (this.id_case - var1.id_case);
   }
}
