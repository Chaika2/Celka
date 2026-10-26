package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

final class yY_2 {
   final Map<rfj_3, String> class_;
   final CompletableFuture<Map<rfj_3, String>> break_;

   yY_2(yR_2 var1, rng_3 var2, double var3, double var5) {
      gm_3 var7 = (gm_3)var1.class_.class_[56];
      rqM_2 var8 = var7.E();
      int var9 = (int)var3 >> 4;
      int var10 = (int)var5 >> 4;
      Builder var11 = ImmutableMap.builder();
      AO var12 = var7.native_();

      for (int var13 = var9 - 12; var13 <= var9 + 12; var13++) {
         for (int var14 = var10 - 12; var14 <= var10 + 12; var14++) {
            rfj_3 var15 = new rfj_3(var13, var14);
            String var16 = "";
            roJ_2 var17 = var12.class_(var13, var14, false);
            var16 = var16 + "Client: ";
            if (var17 == null) {
               var16 = var16 + "0n/a\n";
            } else {
               var16 = var16 + (var17.catch_() ? " E" : "");
               var16 = var16 + "\n";
            }

            var11.put(var15, var16);
         }
      }

      this.class_ = var11.build();
      this.break_ = var2.class_(() -> {
         rrEm_1 var4 = var2.class_(var8);
         if (var4 == null) {
            return ImmutableMap.of();
         } else {
            Builder var5x = ImmutableMap.builder();
            rrEN var6 = var4.else_();

            for (int var7x = var9 - 12; var7x <= var9 + 12; var7x++) {
               for (int var8x = var10 - 12; var8x <= var10 + 12; var8x++) {
                  rfj_3 var9x = new rfj_3(var7x, var8x);
                  var5x.put(var9x, "Server: " + var6.break_(var9x));
               }
            }

            return var5x.build();
         }
      });
   }
}
