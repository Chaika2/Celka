package celestial;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class rnx_3 extends rrEQ {
   private final rqO_2 id_class;
   private final Set<UUID> id_break = Sets.newHashSet();
   private int id_finally;
   private int id_extends = 100;

   public void id_byte(rhN_2 var1) {
      if (this.id_break.contains(var1.ro())) {
         this.id_class(var1);
      }
   }

   @Override
   public void id_byte() {
      super.id_byte();
      this.id_break.clear();
   }

   public rnx_3(rqO_2 var1, rgP_2 var2) {
      super(var2, rRb_1.WHITE, rRM.PROGRESS);
      this.id_class = var1;
      this.id_class(0.0F);
   }

   public void id_class(int var1) {
      this.id_finally = var1;
      this.id_class(rfU_2.id_class((float)var1 / (float)this.id_extends, 0.0F, 1.0F));
   }

   public boolean id_class(Collection<rhN_2> var1) {
      HashSet var2 = Sets.newHashSet();
      HashSet var3 = Sets.newHashSet();

      for (UUID var5 : this.id_break) {
         boolean var6 = false;

         for (rhN_2 var8 : var1) {
            if (var8.ro().equals(var5)) {
               var6 = true;
               break;
            }
         }

         if (!var6) {
            var2.add(var5);
         }
      }

      for (rhN_2 var12 : var1) {
         boolean var15 = false;

         for (UUID var19 : this.id_break) {
            if (var12.ro().equals(var19)) {
               var15 = true;
               break;
            }
         }

         if (!var15) {
            var3.add(var12);
         }
      }

      for (UUID var13 : var2) {
         for (rhN_2 var18 : this.id_int()) {
            if (var18.ro().equals(var13)) {
               this.id_break(var18);
               break;
            }
         }

         this.id_break.remove(var13);
      }

      for (rhN_2 var14 : var3) {
         this.id_class(var14);
      }

      return !var2.isEmpty() || !var3.isEmpty();
   }

   public static rnx_3 id_class(rcd_3 var0, rqO_2 var1) {
      rnx_3 var2 = new rnx_3(var1, rgB_2.id_class(var0.id_native("Name")));
      var2.id_protected(var0.id_new("Visible"));
      var2.id_class(var0.id_private("Value"));
      var2.id_break(var0.id_private("Max"));
      var2.id_class(rRb_1.id_class(var0.id_native("Color")));
      var2.id_class(rRM.id_class(var0.id_native("Overlay")));
      var2.id_class(var0.id_new("DarkenScreen"));
      var2.id_break(var0.id_new("PlayBossMusic"));
      var2.id_byte(var0.id_new("CreateWorldFog"));
      rcy_3 var3 = var0.id_protected("Players", 11);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         var2.id_class(rco_3.id_class(var3.id_finally(var4)));
      }

      return var2;
   }

   public void id_class(UUID var1) {
      this.id_break.add(var1);
   }

   @Override
   public void id_class(rhN_2 var1) {
      super.id_class(var1);
      this.id_break.add(var1.ro());
   }

   public rqO_2 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(rhN_2 var1) {
      super.id_break(var1);
      this.id_break.remove(var1.ro());
   }

   public void id_break(int var1) {
      this.id_extends = var1;
      this.id_class(rfU_2.id_class((float)this.id_finally / (float)var1, 0.0F, 1.0F));
   }

   public int id_throws() {
      return this.id_extends;
   }

   public rcd_3 id_catch() {
      rcd_3 var1 = new rcd_3();
      var1.id_class("Name", rgB_2.id_class(this.id_byte));
      var1.id_class("Visible", this.id_package());
      var1.id_break("Value", this.id_finally);
      var1.id_break("Max", this.id_extends);
      var1.id_class("Color", this.id_finally().id_break());
      var1.id_class("Overlay", this.id_extends().id_class());
      var1.id_class("DarkenScreen", this.id_native());
      var1.id_class("PlayBossMusic", this.id_volatile());
      var1.id_class("CreateWorldFog", this.id_final());
      rcy_3 var2 = new rcy_3();

      for (UUID var4 : this.id_break) {
         var2.add(rco_3.id_class(var4));
      }

      var1.id_class("Players", var2);
      return var1;
   }

   public final rgP_2 id_case() {
      return rgv_3.id_class(this.id_implements())
         .id_class(
            var1 -> var1.id_class(this.id_finally().id_class())
                  .id_class(new rgy_3(rgp_3.id_class, new rgN_2(this.id_break().toString())))
                  .id_class(this.id_break().toString())
         );
   }

   public int id_protected() {
      return this.id_finally;
   }

   public void id_protected(rhN_2 var1) {
      super.id_break(var1);
   }
}
