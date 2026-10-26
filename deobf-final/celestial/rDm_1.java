package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rDm_1 implements rUv_1 {
   public static final Codec<rDm_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.break_.fieldOf("contents").forGetter(var0x -> var0x.break_),
               xc_3.break_.fieldOf("rim").forGetter(var0x -> var0x.byte_),
               rUX.class_(0, 8, 8).fieldOf("size").forGetter(var0x -> var0x.protected_),
               rUX.class_(0, 8, 8).fieldOf("rim_size").forGetter(var0x -> var0x.throws_)
            )
            .apply(var0, rDm_1::new)
   );
   private final xc_3 break_;
   private final xc_3 byte_;
   private final rUX protected_;
   private final rUX throws_;

   public rUX byte_() {
      return this.protected_;
   }

   public rDm_1(xc_3 var1, xc_3 var2, rUX var3, rUX var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }

   public xc_3 class_() {
      return this.break_;
   }

   public xc_3 break_() {
      return this.byte_;
   }

   public rUX protected_() {
      return this.throws_;
   }
}
