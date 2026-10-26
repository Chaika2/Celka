package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class rLc_1 implements rLx_1 {
   public static final rLc_1 class_ = new rLc_1(1.0F, 0.0F, 0.0F, 1.0F);
   public static final Codec<rLc_1> break_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.FLOAT.fieldOf("r").forGetter(var0x -> var0x.protected_),
               Codec.FLOAT.fieldOf("g").forGetter(var0x -> var0x.throws_),
               Codec.FLOAT.fieldOf("b").forGetter(var0x -> var0x.case_),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.catch_)
            )
            .apply(var0, rLc_1::new)
   );
   public static final rLd_1<rLc_1> byte_ = new rLu_1();
   private final float protected_;
   private final float throws_;
   private final float case_;
   private final float catch_;

   @Override
   public String byte_() {
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %.2f", rVL.switch_.break_(this.protected_()), this.protected_, this.throws_, this.case_, this.catch_);
   }

   public rLc_1(float var1, float var2, float var3, float var4) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
      this.catch_ = rfU_2.class_(var4, 0.01F, 4.0F);
   }

   @Override
   public void class_(ruu_3 var1) {
      var1.writeFloat(this.protected_);
      var1.writeFloat(this.throws_);
      var1.writeFloat(this.case_);
      var1.writeFloat(this.catch_);
   }

   public float class_() {
      return this.protected_;
   }

   public float break_() {
      return this.throws_;
   }

   public float throws_() {
      return this.case_;
   }

   public float case_() {
      return this.catch_;
   }

   @Override
   public rLz_1<rLc_1> protected_() {
      return rLQ.package_;
   }
}
