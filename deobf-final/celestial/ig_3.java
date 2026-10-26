package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ig_3 extends rrr_3<iB_2> {
   public ig_3() {
      this(200);
   }

   public ig_3(int var1) {
      super(var1);
   }

   @Override
   public Set<il_3<?>> class_() {
      return ImmutableSet.of(il_3.catch_);
   }

   public static void class_(iB_2 var0) {
      Optional var1 = var0.SF().byte_(il_3.catch_);
      if (var1.isPresent()) {
         boolean var2 = ((List)var1.get()).stream().anyMatch(var0x -> var0x.BC().equals(aI_2.import_));
         if (var2) {
            break_(var0);
         }
      }
   }

   @Override
   protected void class_(rrEm_1 var1, iB_2 var2) {
      class_(var2);
   }

   public static void break_(iB_2 var0) {
      var0.SF().class_(il_3.char_, true, 600L);
   }
}
