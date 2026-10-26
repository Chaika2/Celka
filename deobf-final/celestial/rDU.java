package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class rDU extends rUO<rDe_1> {
   public rDU(Codec<rDe_1> var1) {
      super(var1);
   }

   @Override
   public String toString() {
      return String.format("< %s [%s] >", this.getClass().getSimpleName(), rVL.q.break_(this));
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDe_1 var5) {
      MutableBoolean var6 = new MutableBoolean();
      var5.byte_.class_(new reX_2(var1, var2), var3, var4).forEach(var5x -> {
         if (var5.break_.get().class_(var1, var2, var3, var5x)) {
            var6.setTrue();
         }
      });
      return var6.isTrue();
   }
}
