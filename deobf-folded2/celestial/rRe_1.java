package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class rRe_1<T> implements rRV<T> {
   private final List<rRa_1<T>> id_class;
   private final Function<T, rqO_2> id_break;

   public rRe_1(Function<T, rqO_2> var1, List<rRD<T>> var2, long var3) {
      this(
         var1,
         var2.stream().map(var2x -> new rRa_1<>(var2x.id_break(), var2x.id_class, (int)(var2x.id_break - var3), var2x.id_byte)).collect(Collectors.toList())
      );
   }

   private rRe_1(Function<T, rqO_2> var1, List<rRa_1<T>> var2) {
      this.id_class = var2;
      this.id_break = var1;
   }

   public void id_class(rRV<T> var1) {
      this.id_class.forEach(var1x -> var1.id_class(var1x.id_class, var1x.id_protected, var1x.id_break, var1x.id_byte));
   }

   public static <T> rRe_1<T> id_class(rcy_3 var0, Function<T, rqO_2> var1, Function<rqO_2, T> var2) {
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 < var0.size(); var4++) {
         rcd_3 var5 = var0.id_class(var4);
         Object var6 = var2.apply(new rqO_2(var5.id_native("i")));
         if (var6 != null) {
            rfH_2 var7 = new rfH_2(var5.id_private("x"), var5.id_private("y"), var5.id_private("z"));
            var3.add(new rRa_1<>(var6, var7, var5.id_private("t"), rYr_1.id_class(var5.id_private("p"))));
         }
      }

      return new rRe_1<>(var1, var3);
   }

   @Override
   public boolean id_class(rfH_2 var1, T var2) {
      return false;
   }

   @Override
   public void id_class(rfH_2 var1, T var2, int var3, rYr_1 var4) {
      this.id_class.add(new rRa_1<>((T)var2, var1, var3, var4));
   }

   public rcy_3 id_class() {
      rcy_3 var1 = new rcy_3();

      for (rRa_1 var3 : this.id_class) {
         rcd_3 var4 = new rcd_3();
         var4.id_class("i", this.id_break.apply(var3.id_protected).toString());
         var4.id_break("x", var3.id_class.b_());
         var4.id_break("y", var3.id_class.c_());
         var4.id_break("z", var3.id_class.d_());
         var4.id_break("t", var3.id_break);
         var4.id_break("p", var3.id_byte.id_class());
         var1.add(var4);
      }

      return var1;
   }

   @Override
   public boolean id_break(rfH_2 var1, T var2) {
      return false;
   }
}
