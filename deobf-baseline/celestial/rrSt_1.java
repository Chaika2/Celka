package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSt_1 {
   private static final Codec<Double> id_break = Codec.doubleRange(0.001, 1000.0);
   public static final Codec<rrSt_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               id_break.fieldOf("xz_scale").forGetter(rrSt_1::id_class),
               id_break.fieldOf("y_scale").forGetter(rrSt_1::id_break),
               id_break.fieldOf("xz_factor").forGetter(rrSt_1::id_byte),
               id_break.fieldOf("y_factor").forGetter(rrSt_1::id_protected)
            )
            .apply(var0, rrSt_1::new)
   );
   private final double id_byte;
   private final double id_protected;
   private final double id_throws;
   private final double id_case;

   public double id_byte() {
      return this.id_throws;
   }

   public rrSt_1(double var1, double var3, double var5, double var7) {
      this.id_byte = var1;
      this.id_protected = var3;
      this.id_throws = var5;
      this.id_case = var7;
   }

   public double id_class() {
      return this.id_byte;
   }

   public double id_break() {
      return this.id_protected;
   }

   public double id_protected() {
      return this.id_case;
   }
}
