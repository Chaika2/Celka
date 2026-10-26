package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

class IH {
   private final List<Id_1> id_class;
   private final List<Object> id_break;

   public IH(List<Id_1> var1, List<Object> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof IH var2) ? false : Objects.equals(this.id_class, var2.id_class) && Objects.equals(this.id_break, var2.id_break);
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.id_class.hashCode() + this.id_break.hashCode();
   }

   private static List<Object> id_class(xc_3 var0, Collection<rCZ<?>> var1) {
      return var1.stream().map(var0::id_byte).collect(ImmutableList.toImmutableList());
   }

   public static IH id_class(xc_3 var0, Id_1 var1, Collection<rCZ<?>> var2) {
      List var3 = id_class(var0, var2);
      return new IH(ImmutableList.of(var1), var3);
   }

   public static IH id_class(xc_3 var0, fS_2 var1, Collection<rCZ<?>> var2) {
      rCF var3 = var0.id_break().id_new();
      List var4 = var1.id_class().stream().filter(var2x -> var2x.id_class(var3).test(var0)).map(fb_3::id_class).collect(ImmutableList.toImmutableList());
      List var5 = id_class(var0, var2);
      return new IH(var4, var5);
   }
}
