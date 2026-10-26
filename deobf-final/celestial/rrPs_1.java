package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rrPs_1 extends rrPc_1 {
   public static final Codec<rrPs_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter(var0x -> var0x.break_),
               Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter(var0x -> var0x.protected_),
               Codec.INT.fieldOf("min_dist").orElse(0).forGetter(var0x -> var0x.throws_),
               Codec.INT.fieldOf("max_dist").orElse(0).forGetter(var0x -> var0x.case_),
               rpB_2.CODEC.fieldOf("axis").orElse(rpB_2.Y).forGetter(var0x -> var0x.catch_)
            )
            .apply(var0, rrPs_1::new)
   );
   private final float break_;
   private final float protected_;
   private final int throws_;
   private final int case_;
   private final rpB_2 catch_;

   public rrPs_1(float var1, float var2, int var3, int var4, rpB_2 var5) {
      if (var3 >= var4) {
         throw new IllegalArgumentException("Invalid range: [" + var3 + "," + var4 + "]");
      } else {
         this.break_ = var1;
         this.protected_ = var2;
         this.throws_ = var3;
         this.case_ = var4;
         this.catch_ = var5;
      }
   }

   @Override
   public boolean class_(rfH_2 var1, rfH_2 var2, rfH_2 var3, Random var4) {
      rpr_3 var5 = rpr_3.class_(rpG_2.POSITIVE, this.catch_);
      float var6 = (float)Math.abs((var2.b_() - var3.b_()) * var5.implements_());
      float var7 = (float)Math.abs((var2.c_() - var3.c_()) * var5.finally_());
      float var8 = (float)Math.abs((var2.d_() - var3.d_()) * var5.extends_());
      int var9 = (int)(var6 + var7 + var8);
      float var10 = var4.nextFloat();
      return (double)var10 <= rfU_2.break_((double)this.break_, (double)this.protected_, rfU_2.byte_((double)var9, (double)this.throws_, (double)this.case_));
   }

   @Override
   protected rrPX<?> class_() {
      return rrPX.byte_;
   }
}
