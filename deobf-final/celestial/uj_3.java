package celestial;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class uj_3 extends ch_3 {
   private static final rqO_2 class_ = new rqO_2("textures/gui/bars.png");
   private final QY throws_;
   private final Map<UUID, cd_3> case_ = Maps.newLinkedHashMap();

   public uj_3(QY var1) {
      this.throws_ = var1;
   }

   public boolean class_(String... var1) {
      if (!this.case_.isEmpty()) {
         Iterator var2 = this.case_.values().iterator();
         if (var2.hasNext()) {
            rRG var3 = (rRG)var2.next();
            String var4 = var3.implements_().byte_().toLowerCase();
            boolean var5 = true;

            for (String var9 : var1) {
               if (!var4.contains(var9.toLowerCase())) {
                  var5 = false;
                  break;
               }
            }

            return var5;
         }
      }

      return false;
   }

   public void class_(Ml_1 var1) {
      if (!this.case_.isEmpty()) {
         int var2 = this.throws_.else_().super_();
         byte var3 = 12;

         for (cd_3 var5 : this.case_.values()) {
            int var6 = var2 / 2 - 91;
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            byte var7 = 19;
            this.throws_.A().class_(class_);
            this.class_(var1, var6, var3, var5);
            rgP_2 var8 = var5.implements_();
            int var9 = ((cm_3)this.throws_.class_[15]).class_(var8);
            int var10 = var2 / 2 - var9 / 2;
            int var11 = var3 - 9;
            int var12 = 16777215;
            if (rrbb_3.K()) {
               var12 = rrbN_2.break_(var12);
            }

            ((cm_3)this.throws_.class_[15]).break_(var1, var8, (float)var10, (float)var11, var12);
            var3 += var7;
            if (var3 >= this.throws_.else_().this_() / 3) {
               break;
            }
         }
      }
   }

   public boolean class_(String var1) {
      if (!this.case_.isEmpty()) {
         var1 = var1.toLowerCase();

         for (rRG var3 : this.case_.values()) {
            String var4 = var3.implements_().byte_().toLowerCase();
            if (var4.contains(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   private void class_(Ml_1 var1, int var2, int var3, rRG var4) {
      this.break_(var1, var2, var3, 0, var4.finally_().ordinal() * 5 * 2, 182, 5);
      if (var4.extends_() != rRM.PROGRESS) {
         this.break_(var1, var2, var3, 0, 80 + (var4.extends_().ordinal() - 1) * 5 * 2, 182, 5);
      }

      int var5 = (int)(var4.class_() * 183.0F);
      if (var5 > 0) {
         this.break_(var1, var2, var3, 0, var4.finally_().ordinal() * 5 * 2 + 5, var5, 5);
         if (var4.extends_() != rRM.PROGRESS) {
            this.break_(var1, var2, var3, 0, 80 + (var4.extends_().ordinal() - 1) * 5 * 2 + 5, var5, 5);
         }
      }
   }

   public void class_(rFv_1 var1) {
      if (var1.byte_() == rFL.ADD) {
         this.case_.put(var1.break_(), new cd_3(var1));
      } else if (var1.byte_() == rFL.REMOVE) {
         this.case_.remove(var1.break_());
      } else {
         this.case_.get(var1.break_()).class_(var1);
      }
   }

   public void class_() {
      this.case_.clear();
   }

   public boolean break_(String... var1) {
      if (!this.case_.isEmpty()) {
         for (rRG var3 : this.case_.values()) {
            String var4 = var3.implements_().byte_().toLowerCase();

            for (String var8 : var1) {
               if (var4.contains(var8.toLowerCase())) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean throws_() {
      if (!this.case_.isEmpty()) {
         for (rRG var2 : this.case_.values()) {
            if (var2.native_()) {
               return true;
            }
         }
      }

      return false;
   }

   public Map<UUID, cd_3> catch_() {
      return this.case_;
   }

   public boolean case_() {
      if (!this.case_.isEmpty()) {
         for (rRG var2 : this.case_.values()) {
            if (var2.final_()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean protected_() {
      if (!this.case_.isEmpty()) {
         for (rRG var2 : this.case_.values()) {
            if (var2.volatile_()) {
               return true;
            }
         }
      }

      return false;
   }
}
