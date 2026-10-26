package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public enum rMv_1 {
   NONE(1.0F),
   LOW(0.75F),
   MEDIUM(0.5F),
   HIGH(0.25F);

   private static final List<rMv_1> field_226513_e_ = Stream.of(values())
      .sorted(Comparator.comparingDouble(var0 -> (double)var0.field_226514_f_))
      .collect(ImmutableList.toImmutableList());
   private final float field_226514_f_;

   private rMv_1(float var3) {
      this.field_226514_f_ = var3;
   }

   public static rMv_1 class_(float var0) {
      for (rMv_1 var2 : field_226513_e_) {
         if (var0 < var2.field_226514_f_) {
            return var2;
         }
      }

      return NONE;
   }
}
