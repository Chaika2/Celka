package celestial;

import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class fS_2 implements Id_1 {
   private final rCF<xd_3, xc_3> class_;
   private final List<fb_3> break_;

   public fS_2(rCF<xd_3, xc_3> var1, List<fb_3> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof fS_2 var2) ? false : Objects.equals(this.class_, var2.class_) && Objects.equals(this.break_, var2.break_);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.class_, this.break_);
   }

   @Override
   public Collection<Ig_1> class_(Function<rqO_2, Id_1> var1, Set<Pair<String, String>> var2) {
      return this.class_().stream().flatMap(var2x -> var2x.class_().class_(var1, var2).stream()).collect(Collectors.toSet());
   }

   @Override
   public IJ class_(IC var1, Function<Ig_1, fj_3> var2, Ix_1 var3, rqO_2 var4) {
      IV var5 = new IV();

      for (fb_3 var7 : this.class_()) {
         IJ var8 = var7.class_().class_(var1, var2, var3, var4);
         if (var8 != null) {
            var5.class_(var7.class_(this.class_), var8);
         }
      }

      return var5.class_();
   }

   public List<fb_3> class_() {
      return this.break_;
   }

   public Set<IU> break_() {
      HashSet var1 = Sets.newHashSet();

      for (fb_3 var3 : this.break_) {
         var1.add(var3.class_());
      }

      return var1;
   }

   @Override
   public Collection<rqO_2> throws_() {
      return this.class_().stream().flatMap(var0 -> var0.class_().throws_().stream()).collect(Collectors.toSet());
   }
}
