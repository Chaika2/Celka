package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrBo_1<DC extends rrSx_1> implements rKL<rrBo_1<?>> {
   public static final Codec<rrBo_1<?>> class_ = rVL.j.dispatch("type", var0 -> var0.break_, rrSu_1::class_);
   private final rrSu_1<DC> break_;
   private final DC byte_;

   public rrBo_1(rrSu_1<DC> var1, DC var2) {
      this.break_ = var1;
      this.byte_ = (DC)var2;
   }

   @Override
   public String toString() {
      return String.format("[%s %s]", rVL.j.break_(this.break_), this.byte_);
   }

   public Stream<rfH_2> class_(reX_2 var1, Random var2, rfH_2 var3) {
      return this.break_.class_(var1, var2, this.byte_, var3);
   }

   public DC break_() {
      return this.byte_;
   }

   public rrBo_1<?> break_(rrBo_1<?> var1) {
      return new rrBo_1<>(rrSu_1.instanceof_, new rrSP(var1, this));
   }
}
