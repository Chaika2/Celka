package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrBo_1<DC extends rrSx_1> implements rKL<rrBo_1<?>> {
   public static final Codec<rrBo_1<?>> id_class = rVL.j.dispatch("type", var0 -> var0.id_break, rrSu_1::id_class);
   private final rrSu_1<DC> id_break;
   private final DC id_byte;

   public rrBo_1(rrSu_1<DC> var1, DC var2) {
      this.id_break = var1;
      this.id_byte = (DC)var2;
   }

   @Override
   public String toString() {
      return String.format("[%s %s]", rVL.j.id_break(this.id_break), this.id_byte);
   }

   public Stream<rfH_2> id_class(reX_2 var1, Random var2, rfH_2 var3) {
      return this.id_break.id_class(var1, var2, this.id_byte, var3);
   }

   public DC id_break() {
      return this.id_byte;
   }

   public rrBo_1<?> id_break(rrBo_1<?> var1) {
      return new rrBo_1<>(rrSu_1.id_instanceof, new rrSP(var1, this));
   }
}
