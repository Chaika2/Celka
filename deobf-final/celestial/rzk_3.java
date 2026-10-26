package celestial;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import java.util.Set;

public class rzk_3 {
   private final Set<rzd_3<?>> class_;
   private final Set<rzd_3<?>> break_;

   rzk_3(Set<rzd_3<?>> var1, Set<rzd_3<?>> var2) {
      this.class_ = ImmutableSet.copyOf(var1);
      this.break_ = ImmutableSet.copyOf(Sets.union(var1, var2));
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.break_.stream().map(var1 -> (this.class_.contains(var1) ? "!" : "") + var1.class_()).iterator()) + "]";
   }

   public Set<rzd_3<?>> class_() {
      return this.class_;
   }

   public void class_(rQs_1 var1, rWo_1 var2) {
      Set var3 = var2.class_();
      SetView var4 = Sets.difference(var3, this.break_);
      if (!var4.isEmpty()) {
         var1.class_("Parameters " + var4 + " are not provided in this context");
      }
   }

   public Set<rzd_3<?>> break_() {
      return this.break_;
   }
}
