package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnE_2 extends rrGc_1 {
   private static final Logger id_class = LogManager.getLogger();
   private rns_3 id_break;
   private rcd_3 id_byte;

   @Override
   public rcd_3 id_byte(rcd_3 var1) {
      if (this.id_break == null) {
         id_class.warn("Tried to save scoreboard without having a scoreboard...");
         return var1;
      } else {
         var1.id_class("Objectives", this.id_break());
         var1.id_class("PlayerScores", this.id_break.id_private());
         var1.id_class("Teams", this.id_class());
         this.id_protected(var1);
         return var1;
      }
   }

   public rnE_2() {
      super("scoreboard");
   }

   @Override
   public void id_class(rcd_3 var1) {
      if (this.id_break == null) {
         this.id_byte = var1;
      } else {
         this.id_break(var1.id_protected("Objectives", 10));
         this.id_break.id_class(var1.id_protected("PlayerScores", 10));
         if (var1.id_byte("DisplaySlots", 10)) {
            this.id_break(var1.id_int("DisplaySlots"));
         }

         if (var1.id_byte("Teams", 9)) {
            this.id_class(var1.id_protected("Teams", 10));
         }
      }
   }

   public void id_class(rns_3 var1) {
      this.id_break = var1;
      if (this.id_byte != null) {
         this.id_class(this.id_byte);
      }
   }

   protected rcy_3 id_class() {
      rcy_3 var1 = new rcy_3();

      for (rnB_2 var3 : this.id_break.id_throws()) {
         rcd_3 var4 = new rcd_3();
         var4.id_class("Name", var3.id_class());
         var4.id_class("DisplayName", rgB_2.id_class(var3.id_break()));
         if (var3.id_volatile().id_class() >= 0) {
            var4.id_class("TeamColor", var3.id_volatile().id_throws());
         }

         var4.id_class("AllowFriendlyFire", var3.id_catch());
         var4.id_class("SeeFriendlyInvisibles", var3.id_private());
         var4.id_class("MemberNamePrefix", rgB_2.id_class(var3.id_protected()));
         var4.id_class("MemberNameSuffix", rgB_2.id_class(var3.id_throws()));
         var4.id_class("NameTagVisibility", var3.id_implements().internalName);
         var4.id_class("DeathMessageVisibility", var3.id_finally().internalName);
         var4.id_class("CollisionRule", var3.id_extends().name);
         rcy_3 var5 = new rcy_3();

         for (String var7 : var3.id_case()) {
            var5.add(rca_3.id_class(var7));
         }

         var4.id_class("Players", var5);
         var1.add(var4);
      }

      return var1;
   }

   protected void id_class(rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         rcd_3 var3 = var1.id_class(var2);
         String var4 = var3.id_native("Name");
         if (var4.length() > 16) {
            var4 = var4.substring(0, 16);
         }

         rnB_2 var5 = this.id_break.id_case(var4);
         rVi_1 var6 = rgB_2.id_class(var3.id_native("DisplayName"));
         if (var6 != null) {
            var5.id_class(var6);
         }

         if (var3.id_byte("TeamColor", 8)) {
            var5.id_class(rgF_2.id_break(var3.id_native("TeamColor")));
         }

         if (var3.id_byte("AllowFriendlyFire", 99)) {
            var5.id_class(var3.id_new("AllowFriendlyFire"));
         }

         if (var3.id_byte("SeeFriendlyInvisibles", 99)) {
            var5.id_break(var3.id_new("SeeFriendlyInvisibles"));
         }

         if (var3.id_byte("MemberNamePrefix", 8)) {
            rVi_1 var7 = rgB_2.id_class(var3.id_native("MemberNamePrefix"));
            if (var7 != null) {
               var5.id_break(var7);
            }
         }

         if (var3.id_byte("MemberNameSuffix", 8)) {
            rVi_1 var8 = rgB_2.id_class(var3.id_native("MemberNameSuffix"));
            if (var8 != null) {
               var5.id_byte(var8);
            }
         }

         if (var3.id_byte("NameTagVisibility", 8)) {
            rnX_2 var9 = rnX_2.id_class(var3.id_native("NameTagVisibility"));
            if (var9 != null) {
               var5.id_class(var9);
            }
         }

         if (var3.id_byte("DeathMessageVisibility", 8)) {
            rnX_2 var10 = rnX_2.id_class(var3.id_native("DeathMessageVisibility"));
            if (var10 != null) {
               var5.id_break(var10);
            }
         }

         if (var3.id_byte("CollisionRule", 8)) {
            rnh_3 var11 = rnh_3.id_class(var3.id_native("CollisionRule"));
            if (var11 != null) {
               var5.id_class(var11);
            }
         }

         this.id_class(var5, var3.id_protected("Players", 8));
      }
   }

   protected void id_class(rnB_2 var1, rcy_3 var2) {
      for (int var3 = 0; var3 < var2.size(); var3++) {
         this.id_break.id_class(var2.id_implements(var3), var1);
      }
   }

   protected rcy_3 id_break() {
      rcy_3 var1 = new rcy_3();

      for (rnP_2 var3 : this.id_break.id_class()) {
         if (var3.id_byte() != null) {
            rcd_3 var4 = new rcd_3();
            var4.id_class("Name", var3.id_break());
            var4.id_class("CriteriaName", var3.id_byte().id_class());
            var4.id_class("DisplayName", rgB_2.id_class(var3.id_protected()));
            var4.id_class("RenderType", var3.id_case().id_class());
            var1.add(var4);
         }
      }

      return var1;
   }

   protected void id_break(rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         rcd_3 var3 = var1.id_class(var2);
         rAi_1.id_class(var3.id_native("CriteriaName")).ifPresent(var2x -> {
            String var3x = var3.id_native("Name");
            if (var3x.length() > 16) {
               var3x = var3x.substring(0, 16);
            }

            rVi_1 var4 = rgB_2.id_class(var3.id_native("DisplayName"));
            rnr_3 var5 = rnr_3.id_class(var3.id_native("RenderType"));
            this.id_break.id_class(var3x, var2x, var4, var5);
         });
      }
   }

   protected void id_break(rcd_3 var1) {
      for (int var2 = 0; var2 < 19; var2++) {
         if (var1.id_byte("slot_" + var2, 8)) {
            String var3 = var1.id_native("slot_" + var2);
            rnP_2 var4 = this.id_break.id_byte(var3);
            this.id_break.id_class(var2, var4);
         }
      }
   }

   protected void id_protected(rcd_3 var1) {
      rcd_3 var2 = new rcd_3();
      boolean var3 = false;

      for (int var4 = 0; var4 < 19; var4++) {
         rnP_2 var5 = this.id_break.id_class(var4);
         if (var5 != null) {
            var2.id_class("slot_" + var4, var5.id_break());
            var3 = true;
         }
      }

      if (var3) {
         var1.id_class("DisplaySlots", var2);
      }
   }
}
