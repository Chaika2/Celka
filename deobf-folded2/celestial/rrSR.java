package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.function.Supplier;

public class rrSR<SC extends rrSa_1> {
   public static final Codec<rrSR<?>> id_class = rVL.l.dispatch(var0 -> var0.id_byte, rrsE_2::id_protected);
   public static final Codec<Supplier<rrSR<?>>> id_break = rVA.id_class(rVL.m, id_class);
   public final rrsE_2<SC> id_byte;
   public final SC id_protected;

   public rrSR(rrsE_2<SC> var1, SC var2) {
      this.id_byte = var1;
      this.id_protected = (SC)var2;
   }

   public SC id_class() {
      return this.id_protected;
   }

   public void id_class(Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12) {
      this.id_byte.id_class(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, this.id_protected);
   }

   public void id_class(long var1) {
      this.id_byte.id_class(var1);
   }
}
