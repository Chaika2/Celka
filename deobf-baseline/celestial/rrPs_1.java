package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rrPs_1 extends rrPc_1 {
   public static final Codec<rrPs_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter(var0x -> var0x.id_break),
               Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter(var0x -> var0x.id_protected),
               Codec.INT.fieldOf("min_dist").orElse(0).forGetter(var0x -> var0x.id_throws),
               Codec.INT.fieldOf("max_dist").orElse(0).forGetter(var0x -> var0x.id_case),
               rpB_2.CODEC.fieldOf("axis").orElse(rpB_2.Y).forGetter(var0x -> var0x.id_catch)
            )
            .apply(var0, rrPs_1::new)
   );
   private final float id_break;
   private final float id_protected;
   private final int id_throws;
   private final int id_case;
   private final rpB_2 id_catch;

   public rrPs_1(float var1, float var2, int var3, int var4, rpB_2 var5) {
      if (var3 >= var4) {
         throw new IllegalArgumentException("Invalid range: [" + var3 + "," + var4 + "]");
      } else {
         this.id_break = var1;
         this.id_protected = var2;
         this.id_throws = var3;
         this.id_case = var4;
         this.id_catch = var5;
      }
   }

   @Override
   public boolean id_class(rfH_2 var1, rfH_2 var2, rfH_2 var3, Random var4) {
      rpr_3 var5 = rpr_3.id_class(rpG_2.POSITIVE, this.id_catch);
      float var6 = (float)Math.abs((var2.b_() - var3.b_()) * var5.id_implements());
      float var7 = (float)Math.abs((var2.c_() - var3.c_()) * var5.id_finally());
      float var8 = (float)Math.abs((var2.d_() - var3.d_()) * var5.id_extends());
      int var9 = (int)(var6 + var7 + var8);
      float var10 = var4.nextFloat();
      return (double)var10
         <= rfU_2.id_break((double)this.id_break, (double)this.id_protected, rfU_2.id_byte((double)var9, (double)this.id_throws, (double)this.id_case));
   }

   @Override
   protected rrPX<?> id_class() {
      return rrPX.id_byte;
   }
}
