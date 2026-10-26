package celestial;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class uj_3 extends ch_3 {
   private static final rqO_2 id_class = new rqO_2("textures/gui/bars.png");
   private final QY id_throws;
   private final Map<UUID, cd_3> id_case = Maps.newLinkedHashMap();

   public uj_3(QY var1) {
      this.id_throws = var1;
   }

   public boolean id_class(String... var1) {
      if (!this.id_case.isEmpty()) {
         Iterator var2 = this.id_case.values().iterator();
         if (var2.hasNext()) {
            rRG var3 = (rRG)var2.next();
            String var4 = var3.id_implements().id_byte().toLowerCase();
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

   public void id_class(Ml_1 var1) {
      if (!this.id_case.isEmpty()) {
         int var2 = this.id_throws.id_else().id_super();
         byte var3 = 12;

         for (cd_3 var5 : this.id_case.values()) {
            int var6 = var2 / 2 - 91;
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            byte var7 = 19;
            this.id_throws.A().id_class(id_class);
            this.id_class(var1, var6, var3, var5);
            rgP_2 var8 = var5.id_implements();
            int var9 = ((cm_3)this.id_throws.id_class[15]).id_class(var8);
            int var10 = var2 / 2 - var9 / 2;
            int var11 = var3 - 9;
            int var12 = 16777215;
            if (rrbb_3.K()) {
               var12 = rrbN_2.id_break(var12);
            }

            ((cm_3)this.id_throws.id_class[15]).id_break(var1, var8, (float)var10, (float)var11, var12);
            var3 += var7;
            if (var3 >= this.id_throws.id_else().id_this() / 3) {
               break;
            }
         }
      }
   }

   public boolean id_class(String var1) {
      if (!this.id_case.isEmpty()) {
         var1 = var1.toLowerCase();

         for (rRG var3 : this.id_case.values()) {
            String var4 = var3.id_implements().id_byte().toLowerCase();
            if (var4.contains(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   private void id_class(Ml_1 var1, int var2, int var3, rRG var4) {
      this.id_break(var1, var2, var3, 0, var4.id_finally().ordinal() * 5 * 2, 182, 5);
      if (var4.id_extends() != rRM.PROGRESS) {
         this.id_break(var1, var2, var3, 0, 80 + (var4.id_extends().ordinal() - 1) * 5 * 2, 182, 5);
      }

      int var5 = (int)(var4.id_class() * 183.0F);
      if (var5 > 0) {
         this.id_break(var1, var2, var3, 0, var4.id_finally().ordinal() * 5 * 2 + 5, var5, 5);
         if (var4.id_extends() != rRM.PROGRESS) {
            this.id_break(var1, var2, var3, 0, 80 + (var4.id_extends().ordinal() - 1) * 5 * 2 + 5, var5, 5);
         }
      }
   }

   public void id_class(rFv_1 var1) {
      if (var1.id_byte() == rFL.ADD) {
         this.id_case.put(var1.id_break(), new cd_3(var1));
      } else if (var1.id_byte() == rFL.REMOVE) {
         this.id_case.remove(var1.id_break());
      } else {
         this.id_case.get(var1.id_break()).id_class(var1);
      }
   }

   public void id_class() {
      this.id_case.clear();
   }

   public boolean id_break(String... var1) {
      if (!this.id_case.isEmpty()) {
         for (rRG var3 : this.id_case.values()) {
            String var4 = var3.id_implements().id_byte().toLowerCase();

            for (String var8 : var1) {
               if (var4.contains(var8.toLowerCase())) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean id_throws() {
      if (!this.id_case.isEmpty()) {
         for (rRG var2 : this.id_case.values()) {
            if (var2.id_native()) {
               return true;
            }
         }
      }

      return false;
   }

   public Map<UUID, cd_3> id_catch() {
      return this.id_case;
   }

   public boolean id_case() {
      if (!this.id_case.isEmpty()) {
         for (rRG var2 : this.id_case.values()) {
            if (var2.id_final()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean id_protected() {
      if (!this.id_case.isEmpty()) {
         for (rRG var2 : this.id_case.values()) {
            if (var2.id_volatile()) {
               return true;
            }
         }
      }

      return false;
   }
}
