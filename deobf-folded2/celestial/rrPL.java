package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rrPL {
   public static final Codec<rrPL> id_byte = rVL.s.dispatch("predicate_type", rrPL::id_class, rrPJ::codec);

   public abstract boolean id_class(xc_3 var1, Random var2);

   protected abstract rrPJ<?> id_class();
}
