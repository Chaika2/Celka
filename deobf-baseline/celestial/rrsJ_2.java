package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class rrsJ_2 extends rrsk_3 {
   public static final Codec<rrsJ_2> id_class = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(rrsJ_2::new, var0 -> var0.id_break).codec();
   private final float id_break;

   public rrsJ_2(float var1) {
      this.id_break = var1;
   }

   @Override
   protected rrsW_2<?> id_class() {
      return rrsW_2.id_protected;
   }

   @Override
   public void id_class(rRI var1, Random var2, List<rfH_2> var3, List<rfH_2> var4, Set<rfH_2> var5, rfi_3 var6) {
      if (!(var2.nextFloat() >= this.id_break)) {
         rpr_3 var7 = xO_2.id_class(var2);
         int var8 = !var4.isEmpty()
            ? Math.max(((rfH_2)var4.get(0)).c_() - 1, ((rfH_2)var3.get(0)).c_())
            : Math.min(((rfH_2)var3.get(0)).c_() + 1 + var2.nextInt(3), ((rfH_2)var3.get(var3.size() - 1)).c_());
         List var9 = var3.stream().filter(var1x -> var1x.c_() == var8).collect(Collectors.toList());
         if (!var9.isEmpty()) {
            rfH_2 var10 = (rfH_2)var9.get(var2.nextInt(var9.size()));
            rfH_2 var11 = var10.id_break(var7);
            if (rUO.id_break(var1, var11) && rUO.id_break(var1, var11.id_break(rpr_3.SOUTH))) {
               xc_3 var12 = xu_3.JM.id_continue().id_class(xO_2.id_volatile, rpr_3.SOUTH);
               this.id_class(var1, var11, var12, var5, var6);
               if (var1.id_class(var11) instanceof rHx_1 var14) {
                  int var15 = 2 + var2.nextInt(2);

                  for (int var16 = 0; var16 < var15; var16++) {
                     rbF_2 var17 = new rbF_2(aI_2.id_throws, var1.id_byte());
                     var14.id_class(var17, false, var2.nextInt(599));
                  }
               }
            }
         }
      }
   }
}
