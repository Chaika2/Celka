package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rrPL {
   public static final Codec<rrPL> byte_ = rVL.s.dispatch("predicate_type", rrPL::class_, rrPJ::codec);

   public abstract boolean class_(xc_3 var1, Random var2);

   protected abstract rrPJ<?> class_();
}
