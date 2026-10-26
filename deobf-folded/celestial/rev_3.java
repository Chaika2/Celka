package celestial;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class rev_3 {
   public static final Codec<rev_3> id_byte = rVL.rM.dispatch("element_type", rev_3::id_class, red_3::codec);
   private volatile rem_3 id_class;

   public rem_3 id_byte() {
      rem_3 var1 = this.id_class;
      if (var1 == null) {
         throw new IllegalStateException();
      } else {
         return var1;
      }
   }

   protected rev_3(rem_3 var1) {
      this.id_class = var1;
   }

   public static Function<rem_3, reL_2> id_class(List<Function<rem_3, ? extends rev_3>> var0) {
      return var1 -> new reL_2(var0.stream().map(var1x -> (rev_3)var1x.apply(var1)).collect(Collectors.toList()), var1);
   }

   public static Function<rem_3, rex_3> id_class(rDg_1<?, ?> var0) {
      return var1 -> new rex_3(() -> var0, var1);
   }

   public static Function<rem_3, reF_2> id_class(String var0, rrPn_1 var1) {
      return var2 -> new reF_2(Either.left(new rqO_2(var0)), () -> var1, var2);
   }

   public rev_3 id_class(rem_3 var1) {
      this.id_class = var1;
      return this;
   }

   public void id_class(rRg_1 var1, rrPp_1 var2, rfH_2 var3, rqd_3 var4, Random var5, rfi_3 var6) {
   }

   public abstract red_3<?> id_class();

   public abstract boolean id_class(rrPt_1 var1, rRI var2, rrrA var3, rKd_1 var4, rfH_2 var5, rfH_2 var6, rqd_3 var7, rfi_3 var8, Random var9, boolean var10);

   public abstract rfi_3 id_class(rrPt_1 var1, rfH_2 var2, rqd_3 var3);

   public abstract List<rrPp_1> id_class(rrPt_1 var1, rfH_2 var2, rqd_3 var3, Random var4);

   public static Function<rem_3, reF_2> id_class(String var0) {
      return var1 -> new reF_2(Either.left(new rqO_2(var0)), () -> rrPu_1.id_class, var1);
   }

   protected static <E extends rev_3> RecordCodecBuilder<E, rem_3> id_break() {
      return rem_3.field_236858_c_.fieldOf("projection").forGetter(rev_3::id_byte);
   }

   public static Function<rem_3, reA_2> id_break(String var0, rrPn_1 var1) {
      return var2 -> new reA_2(Either.left(new rqO_2(var0)), () -> var1, var2);
   }

   public static Function<rem_3, reA_2> id_break(String var0) {
      return var1 -> new reA_2(Either.left(new rqO_2(var0)), () -> rrPu_1.id_class, var1);
   }

   public static Function<rem_3, reJ_2> id_throws() {
      return var0 -> reJ_2.id_break;
   }

   public int id_protected() {
      return 1;
   }
}
