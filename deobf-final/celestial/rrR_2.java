package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.function.Predicate;

public class rrR_2<E extends iB_2, T extends iB_2> extends rPm_1<E> {
   private final int class_;
   private final float byte_;
   private final aI_2<? extends T> protected_;
   private final int throws_;
   private final Predicate<T> case_;
   private final Predicate<E> catch_;
   private final il_3<T> private_;

   public rrR_2(aI_2<? extends T> var1, int var2, Predicate<E> var3, Predicate<T> var4, il_3<T> var5, float var6, int var7) {
      super(ImmutableMap.of(il_3.final_, iC_2.REGISTERED, il_3.volatile_, iC_2.VALUE_ABSENT, il_3.private_, iC_2.VALUE_PRESENT));
      this.protected_ = var1;
      this.byte_ = var6;
      this.throws_ = var2 * var2;
      this.class_ = var7;
      this.case_ = var4;
      this.catch_ = var3;
      this.private_ = var5;
   }

   @Override
   protected boolean class_(rrEm_1 var1, E var2) {
      return this.catch_.test((E)var2) && this.class_((E)var2);
   }

   private boolean class_(E var1) {
      List var2 = var1.SF().byte_(il_3.private_).get();
      return var2.stream().anyMatch(this::break_);
   }

   public static <T extends iB_2> rrR_2<iB_2, T> class_(aI_2<? extends T> var0, int var1, il_3<T> var2, float var3, int var4) {
      return new rrR_2<>(var0, var1, var0x -> true, var0x -> true, var2, var3, var4);
   }

   private boolean break_(iB_2 var1) {
      return this.protected_.equals(var1.BC()) && this.case_.test((T)var1);
   }

   @Override
   protected void protected_(rrEm_1 var1, E var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.byte_(il_3.private_)
         .ifPresent(
            var3x -> var3x.stream()
                  .filter(var1xx -> this.protected_.equals(var1xx.BC()))
                  .map(var0 -> (iB_2)var0)
                  .filter(var2xx -> var2xx.int_(var2) <= (double)this.throws_)
                  .filter(this.case_)
                  .findFirst()
                  .ifPresent(var2xx -> {
                     var5.class_(this.private_, (T)var2xx);
                     var5.class_(il_3.final_, new rfY_2(var2xx, true));
                     var5.class_(il_3.volatile_, new iH_2(new rfY_2(var2xx, false), this.byte_, this.class_));
                  })
         );
   }
}
