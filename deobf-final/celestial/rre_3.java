package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class rre_3<E extends iB_2> extends rPm_1<E> {
   private final Set<il_3<?>> class_;
   private final rra_3 byte_;
   private final rri_3 protected_;
   private final rTB<rPm_1<? super E>> throws_ = new rTB<>();

   @Override
   protected void byte_(rrEm_1 var1, E var2, long var3) {
      this.throws_.byte_().filter(var0 -> var0.class_() == rPZ.RUNNING).forEach(var4 -> var4.case_(var1, (E)var2, var3));
   }

   public rre_3(Map<il_3<?>, iC_2> var1, Set<il_3<?>> var2, rra_3 var3, rri_3 var4, List<Pair<rPm_1<? super E>, Integer>> var5) {
      super(var1);
      this.class_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      var5.forEach(var1x -> this.throws_.class_((rPm_1<? super E>)var1x.getFirst(), (Integer)var1x.getSecond()));
   }

   @Override
   public String toString() {
      Set var1 = this.throws_.byte_().filter(var0 -> var0.class_() == rPZ.RUNNING).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + var1;
   }

   @Override
   protected boolean class_(rrEm_1 var1, E var2, long var3) {
      return this.throws_.byte_().filter(var0 -> var0.class_() == rPZ.RUNNING).anyMatch(var4 -> var4.class_(var1, (E)var2, var3));
   }

   @Override
   protected boolean class_(long var1) {
      return false;
   }

   @Override
   protected void break_(rrEm_1 var1, E var2, long var3) {
      this.throws_.byte_().filter(var0 -> var0.class_() == rPZ.RUNNING).forEach(var4 -> var4.catch_(var1, (E)var2, var3));
      this.class_.forEach(var2.SF()::break_);
   }

   @Override
   protected void protected_(rrEm_1 var1, E var2, long var3) {
      this.byte_.class_(this.throws_);
      this.protected_.class_(this.throws_, var1, (E)var2, var3);
   }
}
