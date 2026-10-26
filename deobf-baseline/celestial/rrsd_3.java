package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsd_3 extends rrsk_3 {
   public static final Codec<rrsd_3> id_class = Codec.unit(() -> rrsd_3.id_break);
   public static final rrsd_3 id_break = new rrsd_3();

   private void id_class(rKH var1, rfH_2 var2, rCN var3, Set<rfH_2> var4, rfi_3 var5) {
      this.id_class((rRY)var1, var2, var3, var4, var5);
      int var6 = 4;

      for (rfH_2 var7 = var2.id_break(); rUO.id_break(var1, var7) && var6 > 0; var6--) {
         this.id_class((rRY)var1, var7, var3, var4, var5);
         var7 = var7.id_break();
      }
   }

   @Override
   protected rrsW_2<?> id_class() {
      return rrsW_2.id_break;
   }

   @Override
   public void id_class(rRI var1, Random var2, List<rfH_2> var3, List<rfH_2> var4, Set<rfH_2> var5, rfi_3 var6) {
      var4.forEach(var5x -> {
         if (var2.nextInt(4) == 0) {
            rfH_2 var6x = var5x.id_byte();
            if (rUO.id_break(var1, var6x)) {
               this.id_class(var1, var6x, zq_3.id_package, var5, var6);
            }
         }

         if (var2.nextInt(4) == 0) {
            rfH_2 var7 = var5x.id_extends();
            if (rUO.id_break(var1, var7)) {
               this.id_class(var1, var7, zq_3.id_new, var5, var6);
            }
         }

         if (var2.nextInt(4) == 0) {
            rfH_2 var8 = var5x.id_private();
            if (rUO.id_break(var1, var8)) {
               this.id_class(var1, var8, zq_3.id_int, var5, var6);
            }
         }

         if (var2.nextInt(4) == 0) {
            rfH_2 var9 = var5x.id_protected();
            if (rUO.id_break(var1, var9)) {
               this.id_class(var1, var9, zq_3.id_final, var5, var6);
            }
         }
      });
   }
}
