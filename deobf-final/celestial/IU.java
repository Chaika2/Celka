package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IU implements Id_1 {
   private final List<IK> class_;

   public IU(List<IK> var1) {
      this.class_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof IU var2 ? this.class_.equals(var2.class_) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.class_.hashCode();
   }

   @Override
   public IJ class_(IC var1, Function<Ig_1, fj_3> var2, Ix_1 var3, rqO_2 var4) {
      if (this.class_().isEmpty()) {
         return null;
      } else {
         Ii_1 var5 = new Ii_1();

         for (IK var7 : this.class_()) {
            IJ var8 = var1.class_(var7.byte_(), var7);
            var5.class_(var8, var7.protected_());
         }

         return var5.class_();
      }
   }

   @Override
   public Collection<Ig_1> class_(Function<rqO_2, Id_1> var1, Set<Pair<String, String>> var2) {
      return this.class_()
         .stream()
         .map(IK::byte_)
         .distinct()
         .flatMap(var2x -> ((Id_1)var1.apply(var2x)).class_(var1, var2).stream())
         .collect(Collectors.toSet());
   }

   public List<IK> class_() {
      return this.class_;
   }

   @Override
   public Collection<rqO_2> throws_() {
      return this.class_().stream().map(IK::byte_).collect(Collectors.toSet());
   }
}
