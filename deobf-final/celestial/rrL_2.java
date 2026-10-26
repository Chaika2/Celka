package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.function.Predicate;

public class rrL_2 extends rPm_1<iB_2> {
   private final aI_2<?> class_;
   private final int byte_;
   private final Predicate<iB_2> protected_;
   private final Predicate<iB_2> throws_;

   public rrL_2(aI_2<?> var1, int var2, Predicate<iB_2> var3, Predicate<iB_2> var4) {
      super(ImmutableMap.of(il_3.final_, iC_2.REGISTERED, il_3.new_, iC_2.VALUE_ABSENT, il_3.private_, iC_2.VALUE_PRESENT));
      this.class_ = var1;
      this.byte_ = var2 * var2;
      this.protected_ = var4;
      this.throws_ = var3;
   }

   public rrL_2(aI_2<?> var1, int var2) {
      this(var1, var2, var0 -> true, var0 -> true);
   }

   private boolean class_(iB_2 var1) {
      return this.class_.equals(var1.BC()) && this.protected_.test(var1);
   }

   @Override
   public boolean class_(rrEm_1 var1, iB_2 var2) {
      return this.throws_.test(var2) && this.break_(var2).stream().anyMatch(this::class_);
   }

   private List<iB_2> break_(iB_2 var1) {
      return var1.SF().byte_(il_3.private_).get();
   }

   @Override
   public void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      super.protected_(var1, var2, var3);
      iZ_2 var5 = var2.SF();
      var5.byte_(il_3.private_)
         .ifPresent(var3x -> var3x.stream().filter(var2xx -> var2xx.int_(var2) <= (double)this.byte_).filter(this::class_).findFirst().ifPresent(var1xx -> {
               var5.class_(il_3.new_, var1xx);
               var5.class_(il_3.final_, new rfY_2(var1xx, true));
            }));
   }
}
