package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IU implements Id_1 {
   private final List<IK> id_class;

   public IU(List<IK> var1) {
      this.id_class = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof IU var2 ? this.id_class.equals(var2.id_class) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.id_class.hashCode();
   }

   @Override
   public IJ id_class(IC var1, Function<Ig_1, fj_3> var2, Ix_1 var3, rqO_2 var4) {
      if (this.id_class().isEmpty()) {
         return null;
      } else {
         Ii_1 var5 = new Ii_1();

         for (IK var7 : this.id_class()) {
            IJ var8 = var1.id_class(var7.id_byte(), var7);
            var5.id_class(var8, var7.id_protected());
         }

         return var5.id_class();
      }
   }

   @Override
   public Collection<Ig_1> id_class(Function<rqO_2, Id_1> var1, Set<Pair<String, String>> var2) {
      return this.id_class()
         .stream()
         .map(IK::id_byte)
         .distinct()
         .flatMap(var2x -> ((Id_1)var1.apply(var2x)).id_class(var1, var2).stream())
         .collect(Collectors.toSet());
   }

   public List<IK> id_class() {
      return this.id_class;
   }

   @Override
   public Collection<rqO_2> id_throws() {
      return this.id_class().stream().map(IK::id_byte).collect(Collectors.toSet());
   }
}
