package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class rlF_2<T> {
   private rlW_2<T> class_ = rlW_2.byte_();
   private final List<rlL_2<T>> break_ = Lists.newArrayList();
   private final Function<rlQ_2, rlW_2<T>> byte_;

   public List<? extends rlO_2<T>> byte_() {
      return this.break_;
   }

   public rlF_2(Function<rlQ_2, rlW_2<T>> var1) {
      this.byte_ = var1;
   }

   public rlO_2<T> class_(String var1) {
      rlL_2 var2 = new rlL_2(new rqO_2(var1));
      this.break_.add(var2);
      return var2;
   }

   public void class_() {
      this.class_ = rlW_2.byte_();
      rlm_3 var1 = rlm_3.break_();
      this.break_.forEach(var1x -> var1x.class_(var1xx -> var1));
   }

   public void class_(rlQ_2 var1) {
      rlW_2 var2 = this.byte_.apply(var1);
      this.class_ = var2;
      this.break_.forEach(var1x -> var1x.class_(var2::class_));
   }

   public Set<rqO_2> break_(rlQ_2 var1) {
      rlW_2 var2 = this.byte_.apply(var1);
      Set var3 = this.break_.stream().map(rlL_2::break_).collect(Collectors.toSet());
      ImmutableSet var4 = ImmutableSet.copyOf(var2.break_());
      return Sets.difference(var3, var4);
   }

   public rlW_2<T> break_() {
      return this.class_;
   }
}
