package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class rre_3<E extends iB_2> extends rPm_1<E> {
   private final Set<il_3<?>> id_class;
   private final rra_3 id_byte;
   private final rri_3 id_protected;
   private final rTB<rPm_1<? super E>> id_throws = new rTB<>();

   @Override
   protected void id_byte(rrEm_1 var1, E var2, long var3) {
      this.id_throws.id_byte().filter(var0 -> var0.id_class() == rPZ.RUNNING).forEach(var4 -> var4.id_case(var1, (E)var2, var3));
   }

   public rre_3(Map<il_3<?>, iC_2> var1, Set<il_3<?>> var2, rra_3 var3, rri_3 var4, List<Pair<rPm_1<? super E>, Integer>> var5) {
      super(var1);
      this.id_class = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      var5.forEach(var1x -> this.id_throws.id_class((rPm_1<? super E>)var1x.getFirst(), (Integer)var1x.getSecond()));
   }

   @Override
   public String toString() {
      Set var1 = this.id_throws.id_byte().filter(var0 -> var0.id_class() == rPZ.RUNNING).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + var1;
   }

   @Override
   protected boolean id_class(rrEm_1 var1, E var2, long var3) {
      return this.id_throws.id_byte().filter(var0 -> var0.id_class() == rPZ.RUNNING).anyMatch(var4 -> var4.id_class(var1, (E)var2, var3));
   }

   @Override
   protected boolean id_class(long var1) {
      return false;
   }

   @Override
   protected void id_break(rrEm_1 var1, E var2, long var3) {
      this.id_throws.id_byte().filter(var0 -> var0.id_class() == rPZ.RUNNING).forEach(var4 -> var4.id_catch(var1, (E)var2, var3));
      this.id_class.forEach(var2.SF()::id_break);
   }

   @Override
   protected void id_protected(rrEm_1 var1, E var2, long var3) {
      this.id_byte.id_class(this.id_throws);
      this.id_protected.id_class(this.id_throws, var1, (E)var2, var3);
   }
}
