package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSt_1 {
   private static final Codec<Double> break_ = Codec.doubleRange(0.001, 1000.0);
   public static final Codec<rrSt_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               break_.fieldOf("xz_scale").forGetter(rrSt_1::class_),
               break_.fieldOf("y_scale").forGetter(rrSt_1::break_),
               break_.fieldOf("xz_factor").forGetter(rrSt_1::byte_),
               break_.fieldOf("y_factor").forGetter(rrSt_1::protected_)
            )
            .apply(var0, rrSt_1::new)
   );
   private final double byte_;
   private final double protected_;
   private final double throws_;
   private final double case_;

   public double byte_() {
      return this.throws_;
   }

   public rrSt_1(double var1, double var3, double var5, double var7) {
      this.byte_ = var1;
      this.protected_ = var3;
      this.throws_ = var5;
      this.case_ = var7;
   }

   public double class_() {
      return this.byte_;
   }

   public double break_() {
      return this.protected_;
   }

   public double protected_() {
      return this.case_;
   }
}
