package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYj_1 {
   public static final Codec<rYj_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rqA_2.class_.fieldOf("sound").forGetter(var0x -> var0x.byte_),
               Codec.INT.fieldOf("tick_delay").forGetter(var0x -> var0x.protected_),
               Codec.INT.fieldOf("block_search_extent").forGetter(var0x -> var0x.throws_),
               Codec.DOUBLE.fieldOf("offset").forGetter(var0x -> var0x.case_)
            )
            .apply(var0, rYj_1::new)
   );
   public static final rYj_1 break_ = new rYj_1(rqn_3.class_, 6000, 8, 2.0);
   private rqA_2 byte_;
   private int protected_;
   private int throws_;
   private double case_;

   public int byte_() {
      return this.throws_;
   }

   public rYj_1(rqA_2 var1, int var2, int var3, double var4) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
   }

   public rqA_2 class_() {
      return this.byte_;
   }

   public int break_() {
      return this.protected_;
   }

   public double protected_() {
      return this.case_;
   }
}
