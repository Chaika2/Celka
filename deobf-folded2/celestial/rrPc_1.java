package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rrPc_1 {
   public static final Codec<rrPc_1> id_byte = rVL.E.dispatch("predicate_type", rrPc_1::id_class, rrPX::codec);

   public abstract boolean id_class(rfH_2 var1, rfH_2 var2, rfH_2 var3, Random var4);

   protected abstract rrPX<?> id_class();
}
