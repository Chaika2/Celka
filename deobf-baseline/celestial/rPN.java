package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class rPN<E extends iB_2> extends rPm_1<E> {
   private final Predicate<E> id_class;
   private final rPm_1<? super E> id_byte;
   private final boolean id_protected;

   @Override
   protected void id_byte(rrEm_1 var1, E var2, long var3) {
      this.id_byte.id_byte(var1, (E)var2, var3);
   }

   public rPN(Predicate<E> var1, rPm_1<? super E> var2) {
      this(ImmutableMap.of(), var1, var2, false);
   }

   public rPN(Map<il_3<?>, iC_2> var1, Predicate<E> var2, rPm_1<? super E> var3, boolean var4) {
      super(id_class(var1, var3.id_break));
      this.id_class = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public String toString() {
      return "RunIf: " + this.id_byte;
   }

   @Override
   protected boolean id_class(long var1) {
      return false;
   }

   private static Map<il_3<?>, iC_2> id_class(Map<il_3<?>, iC_2> var0, Map<il_3<?>, iC_2> var1) {
      HashMap var2 = Maps.newHashMap();
      var2.putAll(var0);
      var2.putAll(var1);
      return var2;
   }

   @Override
   protected boolean id_class(rrEm_1 var1, E var2, long var3) {
      return this.id_protected && this.id_class.test((E)var2) && this.id_byte.id_class(var1, (E)var2, var3);
   }

   @Override
   protected boolean id_class(rrEm_1 var1, E var2) {
      return this.id_class.test((E)var2) && this.id_byte.id_class(var1, (E)var2);
   }

   @Override
   protected void id_break(rrEm_1 var1, E var2, long var3) {
      this.id_byte.id_break(var1, (E)var2, var3);
   }

   @Override
   protected void id_protected(rrEm_1 var1, E var2, long var3) {
      this.id_byte.id_protected(var1, (E)var2, var3);
   }
}
