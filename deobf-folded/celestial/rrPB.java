package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPB extends rrPL {
   public static final Codec<rrPB> id_class = Codec.unit(() -> rrPB.id_break);
   public static final rrPB id_break = new rrPB();

   private rrPB() {
   }

   @Override
   public boolean id_class(xc_3 var1, Random var2) {
      return true;
   }

   @Override
   protected rrPJ<?> id_class() {
      return rrPJ.id_class;
   }
}
