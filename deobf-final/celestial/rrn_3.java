package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;

public class rrn_3<E extends is_3> extends rPm_1<E> {
   private final Predicate<iB_2> class_;

   private boolean byte_(E var1) {
      Optional var2 = var1.SF().byte_(il_3.package_);
      return var2.isPresent() && !((iB_2)var2.get()).BM();
   }

   public rrn_3(Predicate<iB_2> var1) {
      super(ImmutableMap.of(il_3.package_, iC_2.VALUE_PRESENT, il_3.interface_, iC_2.REGISTERED));
      this.class_ = var1;
   }

   public rrn_3() {
      this(var0 -> false);
   }

   private static <E extends iB_2> boolean class_(E var0) {
      Optional var1 = var0.SF().byte_(il_3.interface_);
      return var1.isPresent() && ((rYB)var0.throws_[7]).r() - (Long)var1.get() > 200L;
   }

   private boolean class_(E var1) {
      return (rYB)this.break_((E)var1).throws_[7] != (rYB)var1.throws_[7];
   }

   protected void class_(rrEm_1 var1, E var2, long var3) {
      if (class_(var2)) {
         this.protected_((E)var2);
      } else if (this.byte_((E)var2)) {
         this.protected_((E)var2);
      } else if (this.class_((E)var2)) {
         this.protected_((E)var2);
      } else if (!rpJ_2.case_.test(this.break_((E)var2))) {
         this.protected_((E)var2);
      } else if (this.class_.test(this.break_((E)var2))) {
         this.protected_((E)var2);
      }
   }

   private iB_2 break_(E var1) {
      return var1.SF().byte_(il_3.package_).get();
   }

   private void protected_(E var1) {
      var1.SF().break_(il_3.package_);
   }
}
