package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class rrsJ_2 extends rrsk_3 {
   public static final Codec<rrsJ_2> class_ = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(rrsJ_2::new, var0 -> var0.break_).codec();
   private final float break_;

   public rrsJ_2(float var1) {
      this.break_ = var1;
   }

   @Override
   protected rrsW_2<?> class_() {
      return rrsW_2.protected_;
   }

   @Override
   public void class_(rRI var1, Random var2, List<rfH_2> var3, List<rfH_2> var4, Set<rfH_2> var5, rfi_3 var6) {
      if (!(var2.nextFloat() >= this.break_)) {
         rpr_3 var7 = xO_2.class_(var2);
         int var8 = !var4.isEmpty()
            ? Math.max(((rfH_2)var4.get(0)).c_() - 1, ((rfH_2)var3.get(0)).c_())
            : Math.min(((rfH_2)var3.get(0)).c_() + 1 + var2.nextInt(3), ((rfH_2)var3.get(var3.size() - 1)).c_());
         List var9 = var3.stream().filter(var1x -> var1x.c_() == var8).collect(Collectors.toList());
         if (!var9.isEmpty()) {
            rfH_2 var10 = (rfH_2)var9.get(var2.nextInt(var9.size()));
            rfH_2 var11 = var10.break_(var7);
            if (rUO.break_(var1, var11) && rUO.break_(var1, var11.break_(rpr_3.SOUTH))) {
               xc_3 var12 = xu_3.JM.continue_().class_(xO_2.volatile_, rpr_3.SOUTH);
               this.class_(var1, var11, var12, var5, var6);
               if (var1.class_(var11) instanceof rHx_1 var14) {
                  int var15 = 2 + var2.nextInt(2);

                  for (int var16 = 0; var16 < var15; var16++) {
                     rbF_2 var17 = new rbF_2(aI_2.throws_, var1.byte_());
                     var14.class_(var17, false, var2.nextInt(599));
                  }
               }
            }
         }
      }
   }
}
