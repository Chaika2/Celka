package celestial;

import com.mojang.datafixers.DataFixUtils;
import java.util.stream.Stream;

public class rrrA {
   private final rRg_1 class_;
   private final rrSp_1 break_;

   public rrrA(rRg_1 var1, rrSp_1 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public rrrH<?> class_(rfH_2 var1, boolean var2, rrrZ<?> var3) {
      return (rrrH<?>)DataFixUtils.orElse(
         this.class_(rjh_3.class_(var1), var3)
            .filter(var1x -> var1x.byte_().break_(var1))
            .filter(var2x -> !var2 || var2x.protected_().stream().anyMatch(var1xx -> var1xx.catch_().break_(var1)))
            .findFirst(),
         rrrH.class_
      );
   }

   public rrrA class_(rKf_1 var1) {
      if (var1.byte_() != this.class_) {
         throw new IllegalStateException("Using invalid feature manager (source level: " + var1.byte_() + ", region: " + var1);
      } else {
         return new rrrA(var1, this.break_);
      }
   }

   public Stream<? extends rrrH<?>> class_(rjh_3 var1, rrrZ<?> var2) {
      return this.class_
         .class_(var1.break_(), var1.protected_(), roN_2.byte_)
         .break_(var2)
         .stream()
         .map(var0 -> rjh_3.class_(new rfj_3(var0), 0))
         .map(var2x -> this.class_(var2x, var2, this.class_.class_(var2x.break_(), var2x.protected_(), roN_2.break_)))
         .filter(var0 -> var0 != null && var0.throws_());
   }

   public rrrH<?> class_(rjh_3 var1, rrrZ<?> var2, rRj_1 var3) {
      return var3.class_(var2);
   }

   public void class_(rjh_3 var1, rrrZ<?> var2, rrrH<?> var3, rRj_1 var4) {
      var4.class_(var2, var3);
   }

   public void class_(rjh_3 var1, rrrZ<?> var2, long var3, rRj_1 var5) {
      var5.class_(var2, var3);
   }

   public boolean class_() {
      return this.break_.break_();
   }
}
