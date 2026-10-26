package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class rlF_2<T> {
   private rlW_2<T> id_class = rlW_2.id_byte();
   private final List<rlL_2<T>> id_break = Lists.newArrayList();
   private final Function<rlQ_2, rlW_2<T>> id_byte;

   public List<? extends rlO_2<T>> id_byte() {
      return this.id_break;
   }

   public rlF_2(Function<rlQ_2, rlW_2<T>> var1) {
      this.id_byte = var1;
   }

   public rlO_2<T> id_class(String var1) {
      rlL_2 var2 = new rlL_2(new rqO_2(var1));
      this.id_break.add(var2);
      return var2;
   }

   public void id_class() {
      this.id_class = rlW_2.id_byte();
      rlm_3 var1 = rlm_3.id_break();
      this.id_break.forEach(var1x -> var1x.id_class(var1xx -> var1));
   }

   public void id_class(rlQ_2 var1) {
      rlW_2 var2 = this.id_byte.apply(var1);
      this.id_class = var2;
      this.id_break.forEach(var1x -> var1x.id_class(var2::id_class));
   }

   public Set<rqO_2> id_break(rlQ_2 var1) {
      rlW_2 var2 = this.id_byte.apply(var1);
      Set var3 = this.id_break.stream().map(rlL_2::id_break).collect(Collectors.toSet());
      ImmutableSet var4 = ImmutableSet.copyOf(var2.id_break());
      return Sets.difference(var3, var4);
   }

   public rlW_2<T> id_break() {
      return this.id_class;
   }
}
