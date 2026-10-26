package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rDg_1<FC extends rUv_1, F extends rUO<FC>> implements rKL<rDg_1<?, ?>> {
   public static final Codec<rDg_1<?, ?>> id_class = rVL.q.dispatch(var0 -> var0.id_throws, rUO::id_class);
   public static final Codec<Supplier<rDg_1<?, ?>>> id_break = rVA.id_class(rVL.v, id_class);
   public static final Codec<List<Supplier<rDg_1<?, ?>>>> id_byte = rVA.id_break(rVL.v, id_class);
   public static final Logger id_protected = LogManager.getLogger();
   public final F id_throws;
   public final FC id_case;

   public FC id_byte() {
      return this.id_case;
   }

   public rDg_1(F var1, FC var2) {
      this.id_throws = (F)var1;
      this.id_case = (FC)var2;
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4) {
      return this.id_throws.id_class(var1, var2, var3, var4, this.id_case);
   }

   public rDR id_class(float var1) {
      return new rDR(this, var1);
   }

   public rDg_1<?, ?> id_break(rrBo_1<?> var1) {
      return rUO.G.id_break(new rDe_1(() -> this, var1));
   }

   public F id_break() {
      return this.id_throws;
   }

   public Stream<rDg_1<?, ?>> id_protected() {
      return Stream.concat(Stream.of(this), this.id_case.ae_());
   }
}
