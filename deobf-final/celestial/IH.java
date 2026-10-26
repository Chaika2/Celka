package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

class IH {
   private final List<Id_1> class_;
   private final List<Object> break_;

   public IH(List<Id_1> var1, List<Object> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof IH var2) ? false : Objects.equals(this.class_, var2.class_) && Objects.equals(this.break_, var2.break_);
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.class_.hashCode() + this.break_.hashCode();
   }

   private static List<Object> class_(xc_3 var0, Collection<rCZ<?>> var1) {
      return var1.stream().map(var0::byte_).collect(ImmutableList.toImmutableList());
   }

   public static IH class_(xc_3 var0, Id_1 var1, Collection<rCZ<?>> var2) {
      List var3 = class_(var0, var2);
      return new IH(ImmutableList.of(var1), var3);
   }

   public static IH class_(xc_3 var0, fS_2 var1, Collection<rCZ<?>> var2) {
      rCF var3 = var0.break_().new_();
      List var4 = var1.class_().stream().filter(var2x -> var2x.class_(var3).test(var0)).map(fb_3::class_).collect(ImmutableList.toImmutableList());
      List var5 = class_(var0, var2);
      return new IH(var4, var5);
   }
}
