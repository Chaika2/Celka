package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYj_1 {
   public static final Codec<rYj_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rqA_2.id_class.fieldOf("sound").forGetter(var0x -> var0x.id_byte),
               Codec.INT.fieldOf("tick_delay").forGetter(var0x -> var0x.id_protected),
               Codec.INT.fieldOf("block_search_extent").forGetter(var0x -> var0x.id_throws),
               Codec.DOUBLE.fieldOf("offset").forGetter(var0x -> var0x.id_case)
            )
            .apply(var0, rYj_1::new)
   );
   public static final rYj_1 id_break = new rYj_1(rqn_3.id_class, 6000, 8, 2.0);
   private rqA_2 id_byte;
   private int id_protected;
   private int id_throws;
   private double id_case;

   public int id_byte() {
      return this.id_throws;
   }

   public rYj_1(rqA_2 var1, int var2, int var3, double var4) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_case = var4;
   }

   public rqA_2 id_class() {
      return this.id_byte;
   }

   public int id_break() {
      return this.id_protected;
   }

   public double id_protected() {
      return this.id_case;
   }
}
