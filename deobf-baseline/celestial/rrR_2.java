package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.function.Predicate;

public class rrR_2<E extends iB_2, T extends iB_2> extends rPm_1<E> {
   private final int id_class;
   private final float id_byte;
   private final aI_2<? extends T> id_protected;
   private final int id_throws;
   private final Predicate<T> id_case;
   private final Predicate<E> id_catch;
   private final il_3<T> id_private;

   public rrR_2(aI_2<? extends T> var1, int var2, Predicate<E> var3, Predicate<T> var4, il_3<T> var5, float var6, int var7) {
      super(ImmutableMap.of(il_3.id_final, iC_2.REGISTERED, il_3.id_volatile, iC_2.VALUE_ABSENT, il_3.id_private, iC_2.VALUE_PRESENT));
      this.id_protected = var1;
      this.id_byte = var6;
      this.id_throws = var2 * var2;
      this.id_class = var7;
      this.id_case = var4;
      this.id_catch = var3;
      this.id_private = var5;
   }

   @Override
   protected boolean id_class(rrEm_1 var1, E var2) {
      return this.id_catch.test((E)var2) && this.id_class((E)var2);
   }

   private boolean id_class(E var1) {
      List var2 = var1.SF().id_byte(il_3.id_private).get();
      return var2.stream().anyMatch(this::id_break);
   }

   public static <T extends iB_2> rrR_2<iB_2, T> id_class(aI_2<? extends T> var0, int var1, il_3<T> var2, float var3, int var4) {
      return new rrR_2<>(var0, var1, var0x -> true, var0x -> true, var2, var3, var4);
   }

   private boolean id_break(iB_2 var1) {
      return this.id_protected.equals(var1.BC()) && this.id_case.test((T)var1);
   }

   @Override
   protected void id_protected(rrEm_1 var1, E var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.id_byte(il_3.id_private)
         .ifPresent(
            var3x -> var3x.stream()
                  .filter(var1xx -> this.id_protected.equals(var1xx.BC()))
                  .map(var0 -> (iB_2)var0)
                  .filter(var2xx -> var2xx.id_int(var2) <= (double)this.id_throws)
                  .filter(this.id_case)
                  .findFirst()
                  .ifPresent(var2xx -> {
                     var5.id_class(this.id_private, (T)var2xx);
                     var5.id_class(il_3.id_final, new rfY_2(var2xx, true));
                     var5.id_class(il_3.id_volatile, new iH_2(new rfY_2(var2xx, false), this.id_byte, this.id_class));
                  })
         );
   }
}
