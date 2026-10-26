package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class rRe_1<T> implements rRV<T> {
   private final List<rRa_1<T>> class_;
   private final Function<T, rqO_2> break_;

   public rRe_1(Function<T, rqO_2> var1, List<rRD<T>> var2, long var3) {
      this(var1, var2.stream().map(var2x -> new rRa_1<>(var2x.break_(), var2x.class_, (int)(var2x.break_ - var3), var2x.byte_)).collect(Collectors.toList()));
   }

   private rRe_1(Function<T, rqO_2> var1, List<rRa_1<T>> var2) {
      this.class_ = var2;
      this.break_ = var1;
   }

   public void class_(rRV<T> var1) {
      this.class_.forEach(var1x -> var1.class_(var1x.class_, var1x.protected_, var1x.break_, var1x.byte_));
   }

   public static <T> rRe_1<T> class_(rcy_3 var0, Function<T, rqO_2> var1, Function<rqO_2, T> var2) {
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 < var0.size(); var4++) {
         rcd_3 var5 = var0.class_(var4);
         Object var6 = var2.apply(new rqO_2(var5.native_("i")));
         if (var6 != null) {
            rfH_2 var7 = new rfH_2(var5.private_("x"), var5.private_("y"), var5.private_("z"));
            var3.add(new rRa_1<>(var6, var7, var5.private_("t"), rYr_1.class_(var5.private_("p"))));
         }
      }

      return new rRe_1<>(var1, var3);
   }

   @Override
   public boolean class_(rfH_2 var1, T var2) {
      return false;
   }

   @Override
   public void class_(rfH_2 var1, T var2, int var3, rYr_1 var4) {
      this.class_.add(new rRa_1<>((T)var2, var1, var3, var4));
   }

   public rcy_3 class_() {
      rcy_3 var1 = new rcy_3();

      for (rRa_1 var3 : this.class_) {
         rcd_3 var4 = new rcd_3();
         var4.class_("i", this.break_.apply(var3.protected_).toString());
         var4.break_("x", var3.class_.b_());
         var4.break_("y", var3.class_.c_());
         var4.break_("z", var3.class_.d_());
         var4.break_("t", var3.break_);
         var4.break_("p", var3.byte_.class_());
         var1.add(var4);
      }

      return var1;
   }

   @Override
   public boolean break_(rfH_2 var1, T var2) {
      return false;
   }
}
