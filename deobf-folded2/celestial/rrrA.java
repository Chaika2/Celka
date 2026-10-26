package celestial;

import com.mojang.datafixers.DataFixUtils;
import java.util.stream.Stream;

public class rrrA {
   private final rRg_1 id_class;
   private final rrSp_1 id_break;

   public rrrA(rRg_1 var1, rrSp_1 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public rrrH<?> id_class(rfH_2 var1, boolean var2, rrrZ<?> var3) {
      return (rrrH<?>)DataFixUtils.orElse(
         this.id_class(rjh_3.id_class(var1), var3)
            .filter(var1x -> var1x.id_byte().id_break(var1))
            .filter(var2x -> !var2 || var2x.id_protected().stream().anyMatch(var1xx -> var1xx.id_catch().id_break(var1)))
            .findFirst(),
         rrrH.id_class
      );
   }

   public rrrA id_class(rKf_1 var1) {
      if (var1.id_byte() != this.id_class) {
         throw new IllegalStateException("Using invalid feature manager (source level: " + var1.id_byte() + ", region: " + var1);
      } else {
         return new rrrA(var1, this.id_break);
      }
   }

   public Stream<? extends rrrH<?>> id_class(rjh_3 var1, rrrZ<?> var2) {
      return this.id_class
         .id_class(var1.id_break(), var1.id_protected(), roN_2.id_byte)
         .id_break(var2)
         .stream()
         .map(var0 -> rjh_3.id_class(new rfj_3(var0), 0))
         .map(var2x -> this.id_class(var2x, var2, this.id_class.id_class(var2x.id_break(), var2x.id_protected(), roN_2.id_break)))
         .filter(var0 -> var0 != null && var0.id_throws());
   }

   public rrrH<?> id_class(rjh_3 var1, rrrZ<?> var2, rRj_1 var3) {
      return var3.id_class(var2);
   }

   public void id_class(rjh_3 var1, rrrZ<?> var2, rrrH<?> var3, rRj_1 var4) {
      var4.id_class(var2, var3);
   }

   public void id_class(rjh_3 var1, rrrZ<?> var2, long var3, rRj_1 var5) {
      var5.id_class(var2, var3);
   }

   public boolean id_class() {
      return this.id_break.id_break();
   }
}
