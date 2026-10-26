package celestial;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class rev_3 {
   public static final Codec<rev_3> byte_ = rVL.rM.dispatch("element_type", rev_3::class_, red_3::codec);
   private volatile rem_3 class_;

   public rem_3 byte_() {
      rem_3 var1 = this.class_;
      if (var1 == null) {
         throw new IllegalStateException();
      } else {
         return var1;
      }
   }

   protected rev_3(rem_3 var1) {
      this.class_ = var1;
   }

   public static Function<rem_3, reL_2> class_(List<Function<rem_3, ? extends rev_3>> var0) {
      return var1 -> new reL_2(var0.stream().map(var1x -> (rev_3)var1x.apply(var1)).collect(Collectors.toList()), var1);
   }

   public static Function<rem_3, rex_3> class_(rDg_1<?, ?> var0) {
      return var1 -> new rex_3(() -> var0, var1);
   }

   public static Function<rem_3, reF_2> class_(String var0, rrPn_1 var1) {
      return var2 -> new reF_2(Either.left(new rqO_2(var0)), () -> var1, var2);
   }

   public rev_3 class_(rem_3 var1) {
      this.class_ = var1;
      return this;
   }

   public void class_(rRg_1 var1, rrPp_1 var2, rfH_2 var3, rqd_3 var4, Random var5, rfi_3 var6) {
   }

   public abstract red_3<?> class_();

   public abstract boolean class_(rrPt_1 var1, rRI var2, rrrA var3, rKd_1 var4, rfH_2 var5, rfH_2 var6, rqd_3 var7, rfi_3 var8, Random var9, boolean var10);

   public abstract rfi_3 class_(rrPt_1 var1, rfH_2 var2, rqd_3 var3);

   public abstract List<rrPp_1> class_(rrPt_1 var1, rfH_2 var2, rqd_3 var3, Random var4);

   public static Function<rem_3, reF_2> class_(String var0) {
      return var1 -> new reF_2(Either.left(new rqO_2(var0)), () -> rrPu_1.class_, var1);
   }

   protected static <E extends rev_3> RecordCodecBuilder<E, rem_3> break_() {
      return rem_3.field_236858_c_.fieldOf("projection").forGetter(rev_3::byte_);
   }

   public static Function<rem_3, reA_2> break_(String var0, rrPn_1 var1) {
      return var2 -> new reA_2(Either.left(new rqO_2(var0)), () -> var1, var2);
   }

   public static Function<rem_3, reA_2> break_(String var0) {
      return var1 -> new reA_2(Either.left(new rqO_2(var0)), () -> rrPu_1.class_, var1);
   }

   public static Function<rem_3, reJ_2> throws_() {
      return var0 -> reJ_2.break_;
   }

   public int protected_() {
      return 1;
   }
}
