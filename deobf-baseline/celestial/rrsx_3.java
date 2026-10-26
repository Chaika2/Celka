package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsx_3 extends rrsk_3 {
   public static final Codec<rrsx_3> id_class = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(rrsx_3::new, var0 -> var0.id_break).codec();
   private final float id_break;

   public rrsx_3(float var1) {
      this.id_break = var1;
   }

   @Override
   protected rrsW_2<?> id_class() {
      return rrsW_2.id_byte;
   }

   @Override
   public void id_class(rRI var1, Random var2, List<rfH_2> var3, List<rfH_2> var4, Set<rfH_2> var5, rfi_3 var6) {
      if (!(var2.nextFloat() >= this.id_break)) {
         int var7 = ((rfH_2)var3.get(0)).c_();
         var3.stream().filter(var1x -> var1x.c_() - var7 <= 2).forEach(var5x -> {
            for (rpr_3 var7x : rpb_3.HORIZONTAL) {
               if (var2.nextFloat() <= 0.25F) {
                  rpr_3 var8 = var7x.id_case();
                  rfH_2 var9 = var5x.id_break(var8.id_implements(), 0, var8.id_extends());
                  if (rUO.id_break(var1, var9)) {
                     xc_3 var10 = xu_3.Sx.id_continue().id_class(xY_2.id_volatile, Integer.valueOf(var2.nextInt(3))).id_class(xY_2.p, var7x);
                     this.id_class(var1, var9, var10, var5, var6);
                  }
               }
            }
         });
      }
   }
}
