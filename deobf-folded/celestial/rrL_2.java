package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.function.Predicate;

public class rrL_2 extends rPm_1<iB_2> {
   private final aI_2<?> id_class;
   private final int id_byte;
   private final Predicate<iB_2> id_protected;
   private final Predicate<iB_2> id_throws;

   public rrL_2(aI_2<?> var1, int var2, Predicate<iB_2> var3, Predicate<iB_2> var4) {
      super(ImmutableMap.of(il_3.id_final, iC_2.REGISTERED, il_3.id_new, iC_2.VALUE_ABSENT, il_3.id_private, iC_2.VALUE_PRESENT));
      this.id_class = var1;
      this.id_byte = var2 * var2;
      this.id_protected = var4;
      this.id_throws = var3;
   }

   public rrL_2(aI_2<?> var1, int var2) {
      this(var1, var2, var0 -> true, var0 -> true);
   }

   private boolean id_class(iB_2 var1) {
      return this.id_class.equals(var1.BC()) && this.id_protected.test(var1);
   }

   @Override
   public boolean id_class(rrEm_1 var1, iB_2 var2) {
      return this.id_throws.test(var2) && this.id_break(var2).stream().anyMatch(this::id_class);
   }

   private List<iB_2> id_break(iB_2 var1) {
      return var1.SF().id_byte(il_3.id_private).get();
   }

   @Override
   public void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      super.id_protected(var1, var2, var3);
      iZ_2 var5 = var2.SF();
      var5.id_byte(il_3.id_private)
         .ifPresent(
            var3x -> var3x.stream().filter(var2xx -> var2xx.id_int(var2) <= (double)this.id_byte).filter(this::id_class).findFirst().ifPresent(var1xx -> {
                  var5.id_class(il_3.id_new, var1xx);
                  var5.id_class(il_3.id_final, new rfY_2(var1xx, true));
               })
         );
   }
}
