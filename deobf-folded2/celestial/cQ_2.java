package celestial;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestion;
import java.util.List;

public class cQ_2 {
   private final HZ id_break;
   private final String id_byte;
   private final List<Suggestion> id_protected;
   private int id_throws;
   private int id_case;
   private rjK_2 id_catch;
   private boolean id_private;
   private int id_implements;

   String id_byte() {
      this.id_implements = this.id_case;
      Suggestion var1 = this.id_protected.get(this.id_case);
      Message var2 = var1.getTooltip();
      return var2 != null
         ? jI_2.id_class("narration.suggestion.tooltip", this.id_case + 1, this.id_protected.size(), var1.getText(), var2.getString())
         : jI_2.id_class("narration.suggestion", this.id_case + 1, this.id_protected.size(), var1.getText());
   }

   cQ_2(int var1, int var2, int var3, List<Suggestion> var4, boolean var5, boolean var6) {
      this.id_class = var1;
      this.id_catch = rjK_2.id_class;
      int var7 = var2 - 1;
      int var8 = var1.id_volatile ? var3 - 3 - Math.min(var5.size(), var1.id_native) * 12 : var3;
      this.id_break = new HZ(var7, var8, var4 + 1, Math.min(var5.size(), var1.id_native) * 12);
      this.id_byte = var1.id_catch.id_private();
      this.id_implements = var6 ? -1 : 0;
      this.id_protected = var5;
      this.id_break(0);
   }

   public void id_class(int var1) {
      this.id_break(this.id_case + var1);
      int var2 = this.id_throws;
      int var3 = this.id_throws + this.id_class.id_native - 1;
      if (this.id_case < var2) {
         this.id_throws = rfU_2.id_class(this.id_case, 0, Math.max(this.id_protected.size() - this.id_class.id_native, 0));
      } else if (this.id_case > var3) {
         this.id_throws = rfU_2.id_class(
            this.id_case + this.id_class.id_extends - this.id_class.id_native, 0, Math.max(this.id_protected.size() - this.id_class.id_native, 0)
         );
      }
   }

   public void id_class() {
      Suggestion var1 = this.id_protected.get(this.id_case);
      this.id_class.id_synchronized = true;
      this.id_class.id_catch.id_class(var1.apply(this.id_byte));
      int var2 = var1.getRange().getStart() + var1.getText().length();
      this.id_class.id_catch.id_private(var2);
      this.id_class.id_catch.id_native(var2);
      this.id_break(this.id_case);
      this.id_class.id_synchronized = false;
      this.id_private = true;
   }

   public void id_class(Ml_1 var1, int var2, int var3) {
      int var4 = Math.min(this.id_protected.size(), this.id_class.id_native);
      int var5 = -5592406;
      boolean var6 = this.id_throws > 0;
      boolean var7 = this.id_protected.size() > this.id_throws + var4;
      boolean var8 = var6 || var7;
      boolean var9 = this.id_catch.id_byte != (float)var2 || this.id_catch.id_protected != (float)var3;
      if (var9) {
         this.id_catch = new rjK_2((float)var2, (float)var3);
      }

      if (var8) {
         ch_3.id_class(
            var1,
            this.id_break.id_class(),
            this.id_break.id_break() - 1,
            this.id_break.id_class() + this.id_break.id_byte(),
            this.id_break.id_break(),
            this.id_class.id_final
         );
         ch_3.id_class(
            var1,
            this.id_break.id_class(),
            this.id_break.id_break() + this.id_break.id_protected(),
            this.id_break.id_class() + this.id_break.id_byte(),
            this.id_break.id_break() + this.id_break.id_protected() + 1,
            this.id_class.id_final
         );
         if (var6) {
            for (int var10 = 0; var10 < this.id_break.id_byte(); var10++) {
               if (var10 % 2 == 0) {
                  ch_3.id_class(
                     var1, this.id_break.id_class() + var10, this.id_break.id_break() - 1, this.id_break.id_class() + var10 + 1, this.id_break.id_break(), -1
                  );
               }
            }
         }

         if (var7) {
            for (int var13 = 0; var13 < this.id_break.id_byte(); var13++) {
               if (var13 % 2 == 0) {
                  ch_3.id_class(
                     var1,
                     this.id_break.id_class() + var13,
                     this.id_break.id_break() + this.id_break.id_protected(),
                     this.id_break.id_class() + var13 + 1,
                     this.id_break.id_break() + this.id_break.id_protected() + 1,
                     -1
                  );
               }
            }
         }
      }

      boolean var14 = false;

      for (int var11 = 0; var11 < var4; var11++) {
         Suggestion var12 = this.id_protected.get(var11 + this.id_throws);
         ch_3.id_class(
            var1,
            this.id_break.id_class(),
            this.id_break.id_break() + 12 * var11,
            this.id_break.id_class() + this.id_break.id_byte(),
            this.id_break.id_break() + 12 * var11 + 12,
            this.id_class.id_final
         );
         if (var2 > this.id_break.id_class()
            && var2 < this.id_break.id_class() + this.id_break.id_byte()
            && var3 > this.id_break.id_break() + 12 * var11
            && var3 < this.id_break.id_break() + 12 * var11 + 12) {
            if (var9) {
               this.id_break(var11 + this.id_throws);
            }

            var14 = true;
         }

         this.id_class
            .id_private
            .id_class(
               var1,
               var12.getText(),
               (float)(this.id_break.id_class() + 1),
               (float)(this.id_break.id_break() + 2 + 12 * var11),
               var11 + this.id_throws == this.id_case ? -256 : -5592406
            );
      }

      if (var14) {
         Message var15 = this.id_protected.get(this.id_case).getTooltip();
         if (var15 != null) {
            this.id_class.id_case.id_class(var1, rgv_3.id_class(var15), var2, var3);
         }
      }
   }

   public boolean id_class(double var1) {
      int var3 = (int)(
         ((Qi_1)this.id_class.id_throws.id_class[22]).id_byte()
            * (double)this.id_class.id_throws.id_else().id_super()
            / (double)this.id_class.id_throws.id_else().id_new()
      );
      int var4 = (int)(
         ((Qi_1)this.id_class.id_throws.id_class[22]).id_protected()
            * (double)this.id_class.id_throws.id_else().id_this()
            / (double)this.id_class.id_throws.id_else().id_continue()
      );
      if (this.id_break.id_class(var3, var4)) {
         this.id_throws = rfU_2.id_class((int)((double)this.id_throws - var1), 0, Math.max(this.id_protected.size() - this.id_class.id_native, 0));
         return true;
      } else {
         return false;
      }
   }

   public boolean id_class(int var1, int var2, int var3) {
      if (!this.id_break.id_class(var1, var2)) {
         return false;
      } else {
         int var4 = (var2 - this.id_break.id_break()) / 12 + this.id_throws;
         if (var4 >= 0 && var4 < this.id_protected.size()) {
            this.id_break(var4);
            this.id_class();
         }

         return true;
      }
   }

   public void id_break() {
      this.id_class.id_this = null;
   }

   public boolean id_break(int var1, int var2, int var3) {
      if (var1 == 265) {
         this.id_class(-1);
         this.id_private = false;
         return true;
      } else if (var1 == 264) {
         this.id_class(1);
         this.id_private = false;
         return true;
      } else if (var1 == 258) {
         if (this.id_private) {
            this.id_class(vm_3.id_synchronized() ? -1 : 1);
         }

         this.id_class();
         return true;
      } else if (var1 == 256) {
         this.id_break();
         return true;
      } else {
         return false;
      }
   }

   public void id_break(int var1) {
      this.id_case = var1;
      if (this.id_case < 0) {
         this.id_case = this.id_case + this.id_protected.size();
      }

      if (this.id_case >= this.id_protected.size()) {
         this.id_case = this.id_case - this.id_protected.size();
      }

      Suggestion var2 = this.id_protected.get(this.id_case);
      this.id_class.id_catch.id_byte(cW_2.id_class(this.id_class.id_catch.id_private(), var2.apply(this.id_byte)));
   }
}
