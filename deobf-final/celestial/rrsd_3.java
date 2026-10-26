package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsd_3 extends rrsk_3 {
   public static final Codec<rrsd_3> class_ = Codec.unit(() -> rrsd_3.break_);
   public static final rrsd_3 break_ = new rrsd_3();

   private void class_(rKH var1, rfH_2 var2, rCN var3, Set<rfH_2> var4, rfi_3 var5) {
      this.class_((rRY)var1, var2, var3, var4, var5);
      int var6 = 4;

      for (rfH_2 var7 = var2.break_(); rUO.break_(var1, var7) && var6 > 0; var6--) {
         this.class_((rRY)var1, var7, var3, var4, var5);
         var7 = var7.break_();
      }
   }

   @Override
   protected rrsW_2<?> class_() {
      return rrsW_2.break_;
   }

   @Override
   public void class_(rRI var1, Random var2, List<rfH_2> var3, List<rfH_2> var4, Set<rfH_2> var5, rfi_3 var6) {
      var4.forEach(var5x -> {
         if (var2.nextInt(4) == 0) {
            rfH_2 var6x = var5x.byte_();
            if (rUO.break_(var1, var6x)) {
               this.class_(var1, var6x, zq_3.package_, var5, var6);
            }
         }

         if (var2.nextInt(4) == 0) {
            rfH_2 var7 = var5x.extends_();
            if (rUO.break_(var1, var7)) {
               this.class_(var1, var7, zq_3.new_, var5, var6);
            }
         }

         if (var2.nextInt(4) == 0) {
            rfH_2 var8 = var5x.private_();
            if (rUO.break_(var1, var8)) {
               this.class_(var1, var8, zq_3.int_, var5, var6);
            }
         }

         if (var2.nextInt(4) == 0) {
            rfH_2 var9 = var5x.protected_();
            if (rUO.break_(var1, var9)) {
               this.class_(var1, var9, zq_3.final_, var5, var6);
            }
         }
      });
   }
}
