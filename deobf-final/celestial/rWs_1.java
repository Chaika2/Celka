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
   private static final Logger byte_ = LogManager.getLogger();

   public void class_(rhN_2 var1) {
      var1.class_.class_(new rva_3(rvi_3.INIT, this.class_, this.break_, this.break_()));
   }

   private void class_(rcy_3 var1, Consumer<rkw_3<?>> var2, rWB var3) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         String var5 = var1.implements_(var4);

         try {
            rqO_2 var6 = new rqO_2(var5);
            Optional var7 = var3.class_(var6);
            if (!var7.isPresent()) {
               byte_.error("Tried to load unrecognized recipe: {} removed now.", var6);
            } else {
               var2.accept((rkw_3)var7.get());
            }
         } catch (rqX_2 var8) {
            byte_.error("Tried to load improperly formatted recipe: {} removed now.", var5);
         }
      }
   }

   public rcd_3 class_() {
      rcd_3 var1 = new rcd_3();
      this.break_().break_(var1);
      rcy_3 var2 = new rcy_3();

      for (rqO_2 var4 : this.class_) {
         var2.add(rca_3.class_(var4.toString()));
      }

      var1.class_("recipes", var2);
      rcy_3 var6 = new rcy_3();

      for (rqO_2 var5 : this.break_) {
         var6.add(rca_3.class_(var5.toString()));
      }

      var1.class_("toBeDisplayed", var6);
      return var1;
   }

   public void class_(rcd_3 var1, rWB var2) {
      this.class_(rka_3.class_(var1));
      rcy_3 var3 = var1.protected_("recipes", 8);
      this.class_(var3, this::class_, var2);
      rcy_3 var4 = var1.protected_("toBeDisplayed", 8);
      this.class_(var4, this::case_, var2);
   }

   private void class_(rvi_3 var1, rhN_2 var2, List<rqO_2> var3) {
      var2.class_.class_(new rva_3(var1, var3, Collections.emptyList(), this.break_()));
   }

   public int class_(Collection<rkw_3<?>> var1, rhN_2 var2) {
      ArrayList var3 = Lists.newArrayList();
      int var4 = 0;

      for (rkw_3 var6 : var1) {
         rqO_2 var7 = var6.case_();
         if (!this.class_.contains(var7) && !var6.implements_()) {
            this.class_(var7);
            this.protected_(var7);
            var3.add(var7);
            Oo_1.case_.class_(var2, var6);
            var4++;
         }
      }

      this.class_(rvi_3.ADD, var2, var3);
      return var4;
   }

   public int break_(Collection<rkw_3<?>> var1, rhN_2 var2) {
      ArrayList var3 = Lists.newArrayList();
      int var4 = 0;

      for (rkw_3 var6 : var1) {
         rqO_2 var7 = var6.case_();
         if (this.class_.contains(var7)) {
            this.byte_(var7);
            var3.add(var7);
            var4++;
         }
      }

      this.class_(rvi_3.REMOVE, var2, var3);
      return var4;
   }
}
