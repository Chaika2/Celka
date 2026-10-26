package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rWs_1 extends rkU_2 {
   private static final Logger id_byte = LogManager.getLogger();

   public void id_class(rhN_2 var1) {
      var1.id_class.id_class(new rva_3(rvi_3.INIT, this.id_class, this.id_break, this.id_break()));
   }

   private void id_class(rcy_3 var1, Consumer<rkw_3<?>> var2, rWB var3) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         String var5 = var1.id_implements(var4);

         try {
            rqO_2 var6 = new rqO_2(var5);
            Optional var7 = var3.id_class(var6);
            if (!var7.isPresent()) {
               id_byte.error("Tried to load unrecognized recipe: {} removed now.", var6);
            } else {
               var2.accept((rkw_3)var7.get());
            }
         } catch (rqX_2 var8) {
            id_byte.error("Tried to load improperly formatted recipe: {} removed now.", var5);
         }
      }
   }

   public rcd_3 id_class() {
      rcd_3 var1 = new rcd_3();
      this.id_break().id_break(var1);
      rcy_3 var2 = new rcy_3();

      for (rqO_2 var4 : this.id_class) {
         var2.add(rca_3.id_class(var4.toString()));
      }

      var1.id_class("recipes", var2);
      rcy_3 var6 = new rcy_3();

      for (rqO_2 var5 : this.id_break) {
         var6.add(rca_3.id_class(var5.toString()));
      }

      var1.id_class("toBeDisplayed", var6);
      return var1;
   }

   public void id_class(rcd_3 var1, rWB var2) {
      this.id_class(rka_3.id_class(var1));
      rcy_3 var3 = var1.id_protected("recipes", 8);
      this.id_class(var3, this::id_class, var2);
      rcy_3 var4 = var1.id_protected("toBeDisplayed", 8);
      this.id_class(var4, this::id_case, var2);
   }

   private void id_class(rvi_3 var1, rhN_2 var2, List<rqO_2> var3) {
      var2.id_class.id_class(new rva_3(var1, var3, Collections.emptyList(), this.id_break()));
   }

   public int id_class(Collection<rkw_3<?>> var1, rhN_2 var2) {
      ArrayList var3 = Lists.newArrayList();
      int var4 = 0;

      for (rkw_3 var6 : var1) {
         rqO_2 var7 = var6.id_case();
         if (!this.id_class.contains(var7) && !var6.id_implements()) {
            this.id_class(var7);
            this.id_protected(var7);
            var3.add(var7);
            Oo_1.id_case.id_class(var2, var6);
            var4++;
         }
      }

      this.id_class(rvi_3.ADD, var2, var3);
      return var4;
   }

   public int id_break(Collection<rkw_3<?>> var1, rhN_2 var2) {
      ArrayList var3 = Lists.newArrayList();
      int var4 = 0;

      for (rkw_3 var6 : var1) {
         rqO_2 var7 = var6.id_case();
         if (this.id_class.contains(var7)) {
            this.id_byte(var7);
            var3.add(var7);
            var4++;
         }
      }

      this.id_class(rvi_3.REMOVE, var2, var3);
      return var4;
   }
}
