package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class NS {
   public static final Codec<NS> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rqA_2.class_.fieldOf("sound").forGetter(var0x -> var0x.break_),
               Codec.INT.fieldOf("min_delay").forGetter(var0x -> var0x.byte_),
               Codec.INT.fieldOf("max_delay").forGetter(var0x -> var0x.protected_),
               Codec.BOOL.fieldOf("replace_current_music").forGetter(var0x -> var0x.throws_)
            )
            .apply(var0, NS::new)
   );
   private final rqA_2 break_;
   private final int byte_;
   private final int protected_;
   private final boolean throws_;

   public int byte_() {
      return this.protected_;
   }

   public NS(rqA_2 var1, int var2, int var3, boolean var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }

   public rqA_2 class_() {
      return this.break_;
   }

   public int break_() {
      return this.byte_;
   }

   public boolean protected_() {
      return this.throws_;
   }
}
