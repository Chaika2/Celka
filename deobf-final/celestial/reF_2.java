package celestial;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;

public class reF_2 extends reA_2 {
   public static final Codec<reF_2> class_ = RecordCodecBuilder.create(var0 -> var0.group(catch_(), case_(), break_()).apply(var0, reF_2::new));

   protected reF_2(Either<rqO_2, rrPl_1> var1, Supplier<rrPn_1> var2, rem_3 var3) {
      super(var1, var2, var3);
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.protected_ + "]";
   }

   @Override
   public red_3<?> class_() {
      return red_3.throws_;
   }

   @Override
   protected rrPN class_(rqd_3 var1, rfi_3 var2, boolean var3) {
      rrPN var4 = super.class_(var1, var2, var3);
      var4.break_(rrPG.break_);
      var4.class_(rrPG.protected_);
      return var4;
   }
}
