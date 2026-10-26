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
   public Set<il_3<?>> id_class() {
      return ImmutableSet.of(il_3.id_catch);
   }

   public static void id_class(iB_2 var0) {
      Optional var1 = var0.SF().id_byte(il_3.id_catch);
      if (var1.isPresent()) {
         boolean var2 = ((List)var1.get()).stream().anyMatch(var0x -> var0x.BC().equals(aI_2.id_import));
         if (var2) {
            id_break(var0);
         }
      }
   }

   @Override
   protected void id_class(rrEm_1 var1, iB_2 var2) {
      id_class(var2);
   }

   public static void id_break(iB_2 var0) {
      var0.SF().id_class(il_3.id_char, true, 600L);
   }
}
