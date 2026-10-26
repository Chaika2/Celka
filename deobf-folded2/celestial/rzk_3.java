package celestial;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import java.util.Set;

public class rzk_3 {
   private final Set<rzd_3<?>> id_class;
   private final Set<rzd_3<?>> id_break;

   rzk_3(Set<rzd_3<?>> var1, Set<rzd_3<?>> var2) {
      this.id_class = ImmutableSet.copyOf(var1);
      this.id_break = ImmutableSet.copyOf(Sets.union(var1, var2));
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.id_break.stream().map(var1 -> (this.id_class.contains(var1) ? "!" : "") + var1.id_class()).iterator()) + "]";
   }

   public Set<rzd_3<?>> id_class() {
      return this.id_class;
   }

   public void id_class(rQs_1 var1, rWo_1 var2) {
      Set var3 = var2.id_class();
      SetView var4 = Sets.difference(var3, this.id_break);
      if (!var4.isEmpty()) {
         var1.id_class("Parameters " + var4 + " are not provided in this context");
      }
   }

   public Set<rzd_3<?>> id_break() {
      return this.id_break;
   }
}
