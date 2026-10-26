package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrsG_2 implements rrSa_1 {
   public static final Codec<rrsG_2> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.break_.fieldOf("top_material").forGetter(var0x -> var0x.break_),
               xc_3.break_.fieldOf("under_material").forGetter(var0x -> var0x.byte_),
               xc_3.break_.fieldOf("underwater_material").forGetter(var0x -> var0x.protected_)
            )
            .apply(var0, rrsG_2::new)
   );
   private final xc_3 break_;
   private final xc_3 byte_;
   private final xc_3 protected_;

   public xc_3 byte_() {
      return this.protected_;
   }

   public rrsG_2(xc_3 var1, xc_3 var2, xc_3 var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   @Override
   public xc_3 class_() {
      return this.break_;
   }

   @Override
   public xc_3 break_() {
      return this.byte_;
   }
}
