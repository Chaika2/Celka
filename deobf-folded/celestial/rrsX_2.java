package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsX_2 extends rrsk_3 {
   public static final Codec<rrsX_2> id_class = rKi_1.id_break.fieldOf("provider").xmap(rrsX_2::new, var0 -> var0.id_break).codec();
   private final rKi_1 id_break;

   public rrsX_2(rKi_1 var1) {
      this.id_break = var1;
   }

   @Override
   public void id_class(rRI var1, Random var2, List<rfH_2> var3, List<rfH_2> var4, Set<rfH_2> var5, rfi_3 var6) {
      int var7 = ((rfH_2)var3.get(0)).c_();
      var3.stream().filter(var1x -> var1x.c_() == var7).forEach(var3x -> {
         this.id_class((rKH)var1, var2, var3x.id_byte().id_private());
         this.id_class((rKH)var1, var2, var3x.id_volatile(2).id_private());
         this.id_class((rKH)var1, var2, var3x.id_byte().id_private(2));
         this.id_class((rKH)var1, var2, var3x.id_volatile(2).id_private(2));

         for (int var4x = 0; var4x < 5; var4x++) {
            int var5x = var2.nextInt(64);
            int var6x = var5x % 8;
            int var7x = var5x / 8;
            if (var6x == 0 || var6x == 7 || var7x == 0 || var7x == 7) {
               this.id_class((rKH)var1, var2, var3x.id_break(-3 + var6x, 0, -3 + var7x));
            }
         }
      });
   }

   private void id_class(rKH var1, Random var2, rfH_2 var3) {
      for (int var4 = -2; var4 <= 2; var4++) {
         for (int var5 = -2; var5 <= 2; var5++) {
            if (Math.abs(var4) != 2 || Math.abs(var5) != 2) {
               this.id_break(var1, var2, var3.id_break(var4, 0, var5));
            }
         }
      }
   }

   @Override
   protected rrsW_2<?> id_class() {
      return rrsW_2.id_throws;
   }

   private void id_break(rKH var1, Random var2, rfH_2 var3) {
      for (int var4 = 2; var4 >= -3; var4--) {
         rfH_2 var5 = var3.id_break(var4);
         if (rUO.id_class(var1, var5)) {
            var1.id_class(var5, this.id_break.id_class(var2, var3), 19);
            break;
         }

         if (!rUO.id_break(var1, var5) && var4 < 0) {
            break;
         }
      }
   }
}
