package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public class ryS_2 extends ryO_2 {
   private final rgP_2[] id_class = new rgP_2[]{rgN_2.id_byte, rgN_2.id_byte, rgN_2.id_byte, rgN_2.id_byte};
   private boolean id_break = true;
   private rhd_3 id_byte;
   private final rpl_3[] id_protected = new rpl_3[4];
   private rxL_2 id_throws = rxL_2.BLACK;

   public ryS_2() {
      super(ryW_2.id_private);
   }

   public void id_class(boolean var1) {
      this.id_break = var1;
      if (!var1) {
         this.id_byte = null;
      }
   }

   public boolean id_class(rxL_2 var1) {
      if (var1 != this.id_private()) {
         this.id_throws = var1;
         this.id_break();
         this.id_extends.id_class(this.id_char(), this.id_abstract(), this.id_abstract(), 3);
         return true;
      } else {
         return false;
      }
   }

   public rpl_3 id_class(int var1, Function<rgP_2, rpl_3> var2) {
      if (this.id_protected[var1] == null && this.id_class[var1] != null) {
         this.id_protected[var1] = (rpl_3)var2.apply(this.id_class[var1]);
      }

      return this.id_protected[var1];
   }

   public void id_class(rhd_3 var1) {
      this.id_byte = var1;
   }

   public gy_3 id_class(rhN_2 var1) {
      String var2 = var1 == null ? "Sign" : var1.g().getString();
      Object var3 = var1 == null ? new rgN_2("Sign") : var1.L_();
      return new gy_3(
         gV_2.id_byte, rjU_2.id_class((rja_3)this.id_native), rjK_2.id_class, (rrEm_1)this.id_extends, 2, var2, (rgP_2)var3, this.id_extends.id_const(), var1
      );
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);

      for (int var2 = 0; var2 < 4; var2++) {
         String var3 = rgB_2.id_class(this.id_class[var2]);
         var1.id_class("Text" + (var2 + 1), var3);
      }

      var1.id_class("Color", this.id_throws.id_byte());
      return var1;
   }

   public rgP_2 id_class(int var1) {
      return this.id_class[var1];
   }

   public void id_class(int var1, rgP_2 var2) {
      this.id_class[var1] = var2;
      this.id_protected[var1] = null;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      this.id_break = false;
      super.id_class(var1, var2);
      this.id_throws = rxL_2.id_class(var2.id_native("Color"), rxL_2.BLACK);

      for (int var3 = 0; var3 < 4; var3++) {
         String var4 = var2.id_native("Text" + (var3 + 1));
         rVi_1 var5 = rgB_2.id_class(var4.isEmpty() ? "\"\"" : var4);
         if (this.id_extends instanceof rrEm_1) {
            try {
               this.id_class[var3] = rgv_3.id_class(this.id_class((rhN_2)null), var5, (an_3)null, 0);
            } catch (CommandSyntaxException var7) {
               this.id_class[var3] = var5;
            }
         } else {
            this.id_class[var3] = var5;
         }

         this.id_protected[var3] = null;
      }
   }

   public boolean id_break(rhd_3 var1) {
      for (rgP_2 var5 : this.id_class) {
         rgc_3 var6 = var5 == null ? null : var5.id_class();
         if (var6 != null && var6.id_private() != null) {
            rgl_3 var7 = var6.id_private();
            if (var7.id_class() == rgH_2.RUN_COMMAND) {
               var1.rC().f().id_class(this.id_class((rhN_2)var1), var7.id_break());
            }
         }
      }

      return true;
   }

   public boolean id_throws() {
      return this.id_break;
   }

   public rhd_3 id_catch() {
      return this.id_byte;
   }

   public rxL_2 id_private() {
      return this.id_throws;
   }

   @Override
   public boolean ac_() {
      return true;
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.id_native, 9, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.id_class(new rcd_3());
   }
}
