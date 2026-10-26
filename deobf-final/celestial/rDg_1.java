package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rDg_1<FC extends rUv_1, F extends rUO<FC>> implements rKL<rDg_1<?, ?>> {
   public static final Codec<rDg_1<?, ?>> class_ = rVL.q.dispatch(var0 -> var0.throws_, rUO::class_);
   public static final Codec<Supplier<rDg_1<?, ?>>> break_ = rVA.class_(rVL.v, class_);
   public static final Codec<List<Supplier<rDg_1<?, ?>>>> byte_ = rVA.break_(rVL.v, class_);
   public static final Logger protected_ = LogManager.getLogger();
   public final F throws_;
   public final FC case_;

   public FC byte_() {
      return this.case_;
   }

   public rDg_1(F var1, FC var2) {
      this.throws_ = (F)var1;
      this.case_ = (FC)var2;
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4) {
      return this.throws_.class_(var1, var2, var3, var4, this.case_);
   }

   public rDR class_(float var1) {
      return new rDR(this, var1);
   }

   public rDg_1<?, ?> break_(rrBo_1<?> var1) {
      return rUO.G.break_(new rDe_1(() -> this, var1));
   }

   public F break_() {
      return this.throws_;
   }

   public Stream<rDg_1<?, ?>> protected_() {
      return Stream.concat(Stream.of(this), this.case_.ae_());
   }
}
