package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsx_3 extends rrsk_3 {
   public static final Codec<rrsx_3> class_ = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(rrsx_3::new, var0 -> var0.break_).codec();
   private final float break_;

   public rrsx_3(float var1) {
      this.break_ = var1;
   }

   @Override
   protected rrsW_2<?> class_() {
      return rrsW_2.byte_;
   }

   @Override
   public void class_(rRI var1, Random var2, List<rfH_2> var3, List<rfH_2> var4, Set<rfH_2> var5, rfi_3 var6) {
      if (!(var2.nextFloat() >= this.break_)) {
         int var7 = ((rfH_2)var3.get(0)).c_();
         var3.stream().filter(var1x -> var1x.c_() - var7 <= 2).forEach(var5x -> {
            for (rpr_3 var7x : rpb_3.HORIZONTAL) {
               if (var2.nextFloat() <= 0.25F) {
                  rpr_3 var8 = var7x.case_();
                  rfH_2 var9 = var5x.break_(var8.implements_(), 0, var8.extends_());
                  if (rUO.break_(var1, var9)) {
                     xc_3 var10 = xu_3.Sx.continue_().class_(xY_2.volatile_, Integer.valueOf(var2.nextInt(3))).class_(xY_2.p, var7x);
                     this.class_(var1, var9, var10, var5, var6);
                  }
               }
            }
         });
      }
   }
}
