package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPB extends rrPL {
   public static final Codec<rrPB> class_ = Codec.unit(() -> rrPB.break_);
   public static final rrPB break_ = new rrPB();

   private rrPB() {
   }

   @Override
   public boolean class_(xc_3 var1, Random var2) {
      return true;
   }

   @Override
   protected rrPJ<?> class_() {
      return rrPJ.class_;
   }
}
