package celestial;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;

public class reF_2 extends reA_2 {
   public static final Codec<reF_2> id_class = RecordCodecBuilder.create(var0 -> var0.group(id_catch(), id_case(), id_break()).apply(var0, reF_2::new));

   protected reF_2(Either<rqO_2, rrPl_1> var1, Supplier<rrPn_1> var2, rem_3 var3) {
      super(var1, var2, var3);
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.id_protected + "]";
   }

   @Override
   public red_3<?> id_class() {
      return red_3.id_throws;
   }

   @Override
   protected rrPN id_class(rqd_3 var1, rfi_3 var2, boolean var3) {
      rrPN var4 = super.id_class(var1, var2, var3);
      var4.id_break(rrPG.id_break);
      var4.id_class(rrPG.id_protected);
      return var4;
   }
}
