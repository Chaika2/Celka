package celestial;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ph_3 implements yD_2 {
   private final QY id_class;
   private final Map<rRJ, Map<String, rfi_3>> id_break = Maps.newIdentityHashMap();
   private final Map<rRJ, Map<String, rfi_3>> id_byte = Maps.newIdentityHashMap();
   private final Map<rRJ, Map<String, Boolean>> id_protected = Maps.newIdentityHashMap();

   public ph_3(QY var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class() {
      this.id_break.clear();
      this.id_byte.clear();
      this.id_protected.clear();
   }

   public void id_class(rfi_3 var1, List<rfi_3> var2, List<Boolean> var3, rRJ var4) {
      if (!this.id_break.containsKey(var4)) {
         this.id_break.put(var4, Maps.newHashMap());
      }

      if (!this.id_byte.containsKey(var4)) {
         this.id_byte.put(var4, Maps.newHashMap());
         this.id_protected.put(var4, Maps.newHashMap());
      }

      this.id_break.get(var4).put(var1.toString(), var1);

      for (int var5 = 0; var5 < var2.size(); var5++) {
         rfi_3 var6 = (rfi_3)var2.get(var5);
         Boolean var7 = (Boolean)var3.get(var5);
         this.id_byte.get(var4).put(var6.toString(), var6);
         this.id_protected.get(var4).put(var6.toString(), var7);
      }
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      ly_3 var9 = ((Hh_1)this.id_class.id_class[16]).id_finally();
      gm_3 var10 = (gm_3)this.id_class.id_class[56];
      rRJ var11 = var10.id_default();
      rfH_2 var12 = new rfH_2(var9.id_break().id_break, 0.0, var9.id_break().id_protected);
      Ok_1 var13 = var2.getBuffer(HU.id_return());
      if (this.id_break.containsKey(var11)) {
         for (rfi_3 var15 : this.id_break.get(var11).values()) {
            if (var12.id_class(var15.id_catch(), 500.0)) {
               yX_2.id_class(
                  var1,
                  var13,
                  (double)var15.id_class - var3,
                  (double)var15.id_break - var5,
                  (double)var15.id_byte - var7,
                  (double)(var15.id_protected + 1) - var3,
                  (double)(var15.id_throws + 1) - var5,
                  (double)(var15.id_case + 1) - var7,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F
               );
            }
         }
      }

      if (this.id_byte.containsKey(var11)) {
         for (Entry var20 : this.id_byte.get(var11).entrySet()) {
            String var16 = (String)var20.getKey();
            rfi_3 var17 = (rfi_3)var20.getValue();
            Boolean var18 = this.id_protected.get(var11).get(var16);
            if (var12.id_class(var17.id_catch(), 500.0)) {
               if (var18) {
                  yX_2.id_class(
                     var1,
                     var13,
                     (double)var17.id_class - var3,
                     (double)var17.id_break - var5,
                     (double)var17.id_byte - var7,
                     (double)(var17.id_protected + 1) - var3,
                     (double)(var17.id_throws + 1) - var5,
                     (double)(var17.id_case + 1) - var7,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F
                  );
               } else {
                  yX_2.id_class(
                     var1,
                     var13,
                     (double)var17.id_class - var3,
                     (double)var17.id_break - var5,
                     (double)var17.id_byte - var7,
                     (double)(var17.id_protected + 1) - var3,
                     (double)(var17.id_throws + 1) - var5,
                     (double)(var17.id_case + 1) - var7,
                     0.0F,
                     0.0F,
                     1.0F,
                     1.0F,
                     0.0F,
                     0.0F,
                     1.0F
                  );
               }
            }
         }
      }
   }
}
