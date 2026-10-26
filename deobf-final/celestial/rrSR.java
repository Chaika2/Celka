package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.function.Supplier;

public class rrSR<SC extends rrSa_1> {
   public static final Codec<rrSR<?>> class_ = rVL.l.dispatch(var0 -> var0.byte_, rrsE_2::protected_);
   public static final Codec<Supplier<rrSR<?>>> break_ = rVA.class_(rVL.m, class_);
   public final rrsE_2<SC> byte_;
   public final SC protected_;

   public rrSR(rrsE_2<SC> var1, SC var2) {
      this.byte_ = var1;
      this.protected_ = (SC)var2;
   }

   public SC class_() {
      return this.protected_;
   }

   public void class_(Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12) {
      this.byte_.class_(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, this.protected_);
   }

   public void class_(long var1) {
      this.byte_.class_(var1);
   }
}
