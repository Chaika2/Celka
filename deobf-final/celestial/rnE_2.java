package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnE_2 extends rrGc_1 {
   private static final Logger class_ = LogManager.getLogger();
   private rns_3 break_;
   private rcd_3 byte_;

   @Override
   public rcd_3 byte_(rcd_3 var1) {
      if (this.break_ == null) {
         class_.warn("Tried to save scoreboard without having a scoreboard...");
         return var1;
      } else {
         var1.class_("Objectives", this.break_());
         var1.class_("PlayerScores", this.break_.private_());
         var1.class_("Teams", this.class_());
         this.protected_(var1);
         return var1;
      }
   }

   public rnE_2() {
      super("scoreboard");
   }

   @Override
   public void class_(rcd_3 var1) {
      if (this.break_ == null) {
         this.byte_ = var1;
      } else {
         this.break_(var1.protected_("Objectives", 10));
         this.break_.class_(var1.protected_("PlayerScores", 10));
         if (var1.byte_("DisplaySlots", 10)) {
            this.break_(var1.int_("DisplaySlots"));
         }

         if (var1.byte_("Teams", 9)) {
            this.class_(var1.protected_("Teams", 10));
         }
      }
   }

   public void class_(rns_3 var1) {
      this.break_ = var1;
      if (this.byte_ != null) {
         this.class_(this.byte_);
      }
   }

   protected rcy_3 class_() {
      rcy_3 var1 = new rcy_3();

      for (rnB_2 var3 : this.break_.throws_()) {
         rcd_3 var4 = new rcd_3();
         var4.class_("Name", var3.class_());
         var4.class_("DisplayName", rgB_2.class_(var3.break_()));
         if (var3.volatile_().class_() >= 0) {
            var4.class_("TeamColor", var3.volatile_().throws_());
         }

         var4.class_("AllowFriendlyFire", var3.catch_());
         var4.class_("SeeFriendlyInvisibles", var3.private_());
         var4.class_("MemberNamePrefix", rgB_2.class_(var3.protected_()));
         var4.class_("MemberNameSuffix", rgB_2.class_(var3.throws_()));
         var4.class_("NameTagVisibility", var3.implements_().internalName);
         var4.class_("DeathMessageVisibility", var3.finally_().internalName);
         var4.class_("CollisionRule", var3.extends_().name);
         rcy_3 var5 = new rcy_3();

         for (String var7 : var3.case_()) {
            var5.add(rca_3.class_(var7));
         }

         var4.class_("Players", var5);
         var1.add(var4);
      }

      return var1;
   }

   protected void class_(rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         rcd_3 var3 = var1.class_(var2);
         String var4 = var3.native_("Name");
         if (var4.length() > 16) {
            var4 = var4.substring(0, 16);
         }

         rnB_2 var5 = this.break_.case_(var4);
         rVi_1 var6 = rgB_2.class_(var3.native_("DisplayName"));
         if (var6 != null) {
            var5.class_(var6);
         }

         if (var3.byte_("TeamColor", 8)) {
            var5.class_(rgF_2.break_(var3.native_("TeamColor")));
         }

         if (var3.byte_("AllowFriendlyFire", 99)) {
            var5.class_(var3.new_("AllowFriendlyFire"));
         }

         if (var3.byte_("SeeFriendlyInvisibles", 99)) {
            var5.break_(var3.new_("SeeFriendlyInvisibles"));
         }

         if (var3.byte_("MemberNamePrefix", 8)) {
            rVi_1 var7 = rgB_2.class_(var3.native_("MemberNamePrefix"));
            if (var7 != null) {
               var5.break_(var7);
            }
         }

         if (var3.byte_("MemberNameSuffix", 8)) {
            rVi_1 var8 = rgB_2.class_(var3.native_("MemberNameSuffix"));
            if (var8 != null) {
               var5.byte_(var8);
            }
         }

         if (var3.byte_("NameTagVisibility", 8)) {
            rnX_2 var9 = rnX_2.class_(var3.native_("NameTagVisibility"));
            if (var9 != null) {
               var5.class_(var9);
            }
         }

         if (var3.byte_("DeathMessageVisibility", 8)) {
            rnX_2 var10 = rnX_2.class_(var3.native_("DeathMessageVisibility"));
            if (var10 != null) {
               var5.break_(var10);
            }
         }

         if (var3.byte_("CollisionRule", 8)) {
            rnh_3 var11 = rnh_3.class_(var3.native_("CollisionRule"));
            if (var11 != null) {
               var5.class_(var11);
            }
         }

         this.class_(var5, var3.protected_("Players", 8));
      }
   }

   protected void class_(rnB_2 var1, rcy_3 var2) {
      for (int var3 = 0; var3 < var2.size(); var3++) {
         this.break_.class_(var2.implements_(var3), var1);
      }
   }

   protected rcy_3 break_() {
      rcy_3 var1 = new rcy_3();

      for (rnP_2 var3 : this.break_.class_()) {
         if (var3.byte_() != null) {
            rcd_3 var4 = new rcd_3();
            var4.class_("Name", var3.break_());
            var4.class_("CriteriaName", var3.byte_().class_());
            var4.class_("DisplayName", rgB_2.class_(var3.protected_()));
            var4.class_("RenderType", var3.case_().class_());
            var1.add(var4);
         }
      }

      return var1;
   }

   protected void break_(rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         rcd_3 var3 = var1.class_(var2);
         rAi_1.class_(var3.native_("CriteriaName")).ifPresent(var2x -> {
            String var3x = var3.native_("Name");
            if (var3x.length() > 16) {
               var3x = var3x.substring(0, 16);
            }

            rVi_1 var4 = rgB_2.class_(var3.native_("DisplayName"));
            rnr_3 var5 = rnr_3.class_(var3.native_("RenderType"));
            this.break_.class_(var3x, var2x, var4, var5);
         });
      }
   }

   protected void break_(rcd_3 var1) {
      for (int var2 = 0; var2 < 19; var2++) {
         if (var1.byte_("slot_" + var2, 8)) {
            String var3 = var1.native_("slot_" + var2);
            rnP_2 var4 = this.break_.byte_(var3);
            this.break_.class_(var2, var4);
         }
      }
   }

   protected void protected_(rcd_3 var1) {
      rcd_3 var2 = new rcd_3();
      boolean var3 = false;

      for (int var4 = 0; var4 < 19; var4++) {
         rnP_2 var5 = this.break_.class_(var4);
         if (var5 != null) {
            var2.class_("slot_" + var4, var5.break_());
            var3 = true;
         }
      }

      if (var3) {
         var1.class_("DisplaySlots", var2);
      }
   }
}
