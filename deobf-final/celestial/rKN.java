package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rKN {
   public static final Codec<rKN> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 256).fieldOf("height").forGetter(rKN::class_),
               rVL.strictfp_.fieldOf("block").orElse(xu_3.class_).forGetter(var0x -> var0x.break_().break_())
            )
            .apply(var0, rKN::new)
   );
   private final xc_3 break_;
   private final int byte_;
   private int protected_;

   public int byte_() {
      return this.protected_;
   }

   public rKN(int var1, xd_3 var2) {
      this.byte_ = var1;
      this.break_ = var2.continue_();
   }

   @Override
   public String toString() {
      return (this.byte_ != 1 ? this.byte_ + "*" : "") + rVL.strictfp_.break_(this.break_.break_());
   }

   public void class_(int var1) {
      this.protected_ = var1;
   }

   public int class_() {
      return this.byte_;
   }

   public xc_3 break_() {
      return this.break_;
   }
}
