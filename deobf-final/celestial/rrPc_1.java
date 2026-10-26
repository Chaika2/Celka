package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rrPc_1 {
   public static final Codec<rrPc_1> byte_ = rVL.E.dispatch("predicate_type", rrPc_1::class_, rrPX::codec);

   public abstract boolean class_(rfH_2 var1, rfH_2 var2, rfH_2 var3, Random var4);

   protected abstract rrPX<?> class_();
}
