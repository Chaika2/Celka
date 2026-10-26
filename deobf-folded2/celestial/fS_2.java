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
   private final rCF<xd_3, xc_3> id_class;
   private final List<fb_3> id_break;

   public fS_2(rCF<xd_3, xc_3> var1, List<fb_3> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof fS_2 var2) ? false : Objects.equals(this.id_class, var2.id_class) && Objects.equals(this.id_break, var2.id_break);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id_class, this.id_break);
   }

   @Override
   public Collection<Ig_1> id_class(Function<rqO_2, Id_1> var1, Set<Pair<String, String>> var2) {
      return this.id_class().stream().flatMap(var2x -> var2x.id_class().id_class(var1, var2).stream()).collect(Collectors.toSet());
   }

   @Override
   public IJ id_class(IC var1, Function<Ig_1, fj_3> var2, Ix_1 var3, rqO_2 var4) {
      IV var5 = new IV();

      for (fb_3 var7 : this.id_class()) {
         IJ var8 = var7.id_class().id_class(var1, var2, var3, var4);
         if (var8 != null) {
            var5.id_class(var7.id_class(this.id_class), var8);
         }
      }

      return var5.id_class();
   }

   public List<fb_3> id_class() {
      return this.id_break;
   }

   public Set<IU> id_break() {
      HashSet var1 = Sets.newHashSet();

      for (fb_3 var3 : this.id_break) {
         var1.add(var3.id_class());
      }

      return var1;
   }

   @Override
   public Collection<rqO_2> id_throws() {
      return this.id_class().stream().flatMap(var0 -> var0.id_class().id_throws().stream()).collect(Collectors.toSet());
   }
}
