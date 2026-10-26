package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class rPN<E extends iB_2> extends rPm_1<E> {
   private final Predicate<E> class_;
   private final rPm_1<? super E> byte_;
   private final boolean protected_;

   @Override
   protected void byte_(rrEm_1 var1, E var2, long var3) {
      this.byte_.byte_(var1, (E)var2, var3);
   }

   public rPN(Predicate<E> var1, rPm_1<? super E> var2) {
      this(ImmutableMap.of(), var1, var2, false);
   }

   public rPN(Map<il_3<?>, iC_2> var1, Predicate<E> var2, rPm_1<? super E> var3, boolean var4) {
      super(class_(var1, var3.break_));
      this.class_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public String toString() {
      return "RunIf: " + this.byte_;
   }

   @Override
   protected boolean class_(long var1) {
      return false;
   }

   private static Map<il_3<?>, iC_2> class_(Map<il_3<?>, iC_2> var0, Map<il_3<?>, iC_2> var1) {
      HashMap var2 = Maps.newHashMap();
      var2.putAll(var0);
      var2.putAll(var1);
      return var2;
   }

   @Override
   protected boolean class_(rrEm_1 var1, E var2, long var3) {
      return this.protected_ && this.class_.test((E)var2) && this.byte_.class_(var1, (E)var2, var3);
   }

   @Override
   protected boolean class_(rrEm_1 var1, E var2) {
      return this.class_.test((E)var2) && this.byte_.class_(var1, (E)var2);
   }

   @Override
   protected void break_(rrEm_1 var1, E var2, long var3) {
      this.byte_.break_(var1, (E)var2, var3);
   }

   @Override
   protected void protected_(rrEm_1 var1, E var2, long var3) {
      this.byte_.protected_(var1, (E)var2, var3);
   }
}
