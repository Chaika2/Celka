package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lu_1 extends LZ implements cC_2, cp_3, rrvs_1 {
   private final cm_3 id_class;
   private String id_throws = "";
   private rgP_2 id_case;
   private int id_catch = 32;
   private int id_private;
   private boolean id_implements = true;
   private boolean id_super = true;
   private boolean id_this = true;
   private boolean id_else;
   private int id_synchronized;
   private int id_return;
   private int id_public;
   private int id_goto = 14737632;
   private int id_while = 7368816;
   private String id_try;
   private Consumer<String> id_instanceof;
   private Predicate<String> id_throw = Objects::nonNull;
   private BiFunction<String, Integer, rpl_3> id_interface = this.id_continue();

   public Lu_1 id_byte(String var1) {
      this.id_try = var1;
      return this;
   }

   public void id_byte(boolean var1) {
      super.id_implements(var1);
   }

   public void id_byte(int var1) {
      if (!this.id_throws.isEmpty()) {
         if (this.id_public != this.id_return) {
            this.id_break("");
         } else {
            this.id_protected(this.id_throws(var1) - this.id_return);
         }
      }
   }

   public boolean id_int() {
      return this.id_new;
   }

   public Lu_1(cm_3 var1, int var2, int var3, int var4, int var5, rgP_2 var6) {
      this(var1, var2, var3, var4, var5, (Lu_1)null, var6, true);
   }

   public Lu_1(cm_3 var1, int var2, int var3, int var4, int var5, Lu_1 var6, rgP_2 var7, boolean var8) {
      super(var2, var3, var4, var5, var7);
      this.id_class = var1;
      if (var6 != null) {
         this.id_class(var6.id_private());
      }

      if (var8) {
         vs_3.INSTANCE.id_class(this);
      }
   }

   public float id_this() {
      return (float)this.id_final;
   }

   private int id_class(int var1, int var2) {
      return this.id_class(var1, var2, true);
   }

   private int id_class(int var1, int var2, boolean var3) {
      int var4 = var2;
      boolean var5 = var1 < 0;
      int var6 = Math.abs(var1);

      for (int var7 = 0; var7 < var6; var7++) {
         if (!var5) {
            int var8 = this.id_throws.length();
            var4 = this.id_throws.indexOf(32, var4);
            if (var4 == -1) {
               var4 = var8;
            } else {
               while (var3 && var4 < var8 && this.id_throws.charAt(var4) == ' ') {
                  var4++;
               }
            }
         } else {
            while (var3 && var4 > 0 && this.id_throws.charAt(var4 - 1) == ' ') {
               var4--;
            }

            while (var4 > 0 && this.id_throws.charAt(var4 - 1) != ' ') {
               var4--;
            }
         }
      }

      return var4;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (!this.id_volatile()) {
         return false;
      } else {
         this.id_else = vm_3.id_synchronized();
         if (vm_3.id_private(var1)) {
            this.id_native();
            this.id_native(0);
            return true;
         } else if (vm_3.id_catch(var1)) {
            ((Qj_1)QY.id_instanceof().id_class[23]).id_class(this.id_implements());
            return true;
         } else if (vm_3.id_case(var1)) {
            if (this.id_this) {
               this.id_break(((Qj_1)QY.id_instanceof().id_class[23]).id_class());
            }

            return true;
         } else if (vm_3.id_throws(var1)) {
            ((Qj_1)QY.id_instanceof().id_class[23]).id_class(this.id_implements());
            if (this.id_this) {
               this.id_break("");
            }

            return true;
         } else {
            switch (var1) {
               case 259:
                  if (this.id_this) {
                     this.id_else = false;
                     this.id_new(-1);
                     this.id_else = vm_3.id_synchronized();
                  }

                  return true;
               case 260:
               case 264:
               case 265:
               case 266:
               case 267:
               default:
                  return false;
               case 261:
                  if (this.id_this) {
                     this.id_else = false;
                     this.id_new(1);
                     this.id_else = vm_3.id_synchronized();
                  }

                  return true;
               case 262:
                  if (vm_3.id_else()) {
                     this.id_catch(this.id_throws(1));
                  } else {
                     this.id_case(1);
                  }

                  return true;
               case 263:
                  if (vm_3.id_else()) {
                     this.id_catch(this.id_throws(-1));
                  } else {
                     this.id_case(-1);
                  }

                  return true;
               case 268:
                  this.id_extends();
                  return true;
               case 269:
                  this.id_native();
                  return true;
            }
         }
      }
   }

   @Override
   public boolean id_class(char var1, int var2) {
      if (!this.id_volatile()) {
         return false;
      } else if (rqu_3.id_class(var1)) {
         if (this.id_this) {
            this.id_break(Character.toString(var1));
         }

         return true;
      } else {
         return false;
      }
   }

   public Lu_1 id_class(rgP_2 var1) {
      this.id_case = var1;
      return this;
   }

   public void id_class(Predicate<String> var1) {
      this.id_throw = var1;
   }

   public void id_class(String var1) {
      if (this.id_throw.test(var1)) {
         if (var1.length() > this.id_catch) {
            this.id_throws = var1.substring(0, this.id_catch);
         } else {
            this.id_throws = var1;
         }

         this.id_native();
         this.id_native(this.id_return);
         this.id_protected(var1);
      }
   }

   public void id_class(BiFunction<String, Integer, rpl_3> var1) {
      this.id_interface = var1;
   }

   public void id_class(Consumer<String> var1) {
      this.id_instanceof = var1;
   }

   @Override
   public boolean id_break(boolean var1) {
      return this.id_new && this.id_this ? super.id_break(var1) : false;
   }

   @Override
   public boolean id_break(double var1, double var3) {
      return this.id_new
         && var1 >= (double)this.id_volatile
         && var1 < (double)(this.id_volatile + this.id_extends)
         && var3 >= (double)this.id_final
         && var3 < (double)(this.id_final + this.id_native);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (!this.id_int()) {
         return false;
      } else {
         boolean var6 = var1 >= (double)this.id_volatile
            && var1 < (double)(this.id_volatile + this.id_extends)
            && var3 >= (double)this.id_final
            && var3 < (double)(this.id_final + this.id_native);
         if (this.id_super) {
            this.id_byte(var6);
         }

         if (this.aO_() && var6 && var5 == 0) {
            int var7 = rfU_2.id_byte(var1) - this.id_volatile;
            if (this.id_implements) {
               var7 -= 4;
            }

            String var8 = this.id_class.id_class(this.id_throws.substring(this.id_synchronized), this.id_package());
            this.id_catch(this.id_class.id_class(var8, var7).length() + this.id_synchronized);
            return true;
         } else {
            return false;
         }
      }
   }

   private void id_break(int var1, int var2, int var3, int var4) {
      if (var1 < var3) {
         int var5 = var1;
         var1 = var3;
         var3 = var5;
      }

      if (var2 < var4) {
         int var7 = var2;
         var2 = var4;
         var4 = var7;
      }

      if (var3 > this.id_volatile + this.id_extends) {
         var3 = this.id_volatile + this.id_extends;
      }

      if (var1 > this.id_volatile + this.id_extends) {
         var1 = this.id_volatile + this.id_extends;
      }

      yb_3 var8 = yb_3.id_class();
      lD_2 var6 = var8.id_byte();
      RenderSystem.color4f(0.0F, 0.0F, 255.0F, 255.0F);
      RenderSystem.disableTexture();
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(Ma_1.OR_REVERSE);
      var6.id_class(7, ju_3.id_super);
      var6.id_class((double)var1, (double)var4, 0.0).id_class();
      var6.id_class((double)var3, (double)var4, 0.0).id_class();
      var6.id_class((double)var3, (double)var2, 0.0).id_class();
      var6.id_class((double)var1, (double)var2, 0.0).id_class();
      var8.id_break();
      RenderSystem.disableColorLogicOp();
      RenderSystem.enableTexture();
   }

   public void id_break(String var1) {
      int var2 = this.id_return < this.id_public ? this.id_return : this.id_public;
      int var3 = this.id_return < this.id_public ? this.id_public : this.id_return;
      int var4 = this.id_catch - this.id_throws.length() - (var2 - var3);
      String var5 = rqu_3.id_class(var1);
      int var6 = var5.length();
      if (var4 < var6) {
         var5 = var5.substring(0, var4);
         var6 = var4;
      }

      String var7 = new StringBuilder(this.id_throws).replace(var2, var3, var5).toString();
      if (this.id_throw.test(var7)) {
         this.id_throws = var7;
         this.id_private(var2 + var6);
         this.id_native(this.id_return);
         this.id_protected(this.id_throws);
      }
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      if (this.id_int()) {
         boolean var5 = this.aO_();
         if (this.id_while()) {
            int var6 = var5 ? -1 : -6250336;
            id_class(var1, this.id_volatile - 1, this.id_final - 1, this.id_volatile + this.id_extends + 1, this.id_final + this.id_native + 1, var6);
            id_class(var1, this.id_volatile, this.id_final, this.id_volatile + this.id_extends, this.id_final + this.id_native, -16777216);
         }

         int var18 = this.id_this ? this.id_goto : this.id_while;
         int var7 = this.id_return - this.id_synchronized;
         int var8 = this.id_public - this.id_synchronized;
         String var9 = this.id_class.id_class(this.id_throws.substring(this.id_synchronized), this.id_package());
         boolean var10 = var7 >= 0 && var7 <= var9.length();
         boolean var11 = var5 && this.id_private / 6 % 2 == 0 && var10;
         int var12 = this.id_implements ? this.id_volatile + 4 : this.id_volatile;
         int var13 = this.id_implements ? this.id_final + (this.id_native - 8) / 2 : this.id_final;
         int var14 = var12;
         if (var8 > var9.length()) {
            var8 = var9.length();
         }

         if (!var9.isEmpty()) {
            String var15 = var10 ? var9.substring(0, var7) : var9;
            var14 = this.id_class.id_class(var1, this.id_interface.apply(var15, this.id_synchronized), (float)var12, (float)var13, var18);
         }

         boolean var19 = this.id_return < this.id_throws.length() || this.id_throws.length() >= this.id_goto();
         int var16 = var14;
         if (!var10) {
            var16 = var7 > 0 ? var12 + this.id_extends : var12;
         } else if (var19) {
            var16 = var14 - 1;
            var14--;
         }

         if (!var9.isEmpty() && var10 && var7 < var9.length()) {
            this.id_class.id_class(var1, this.id_interface.apply(var9.substring(var7), this.id_return), (float)var14, (float)var13, var18);
         }

         if (!var19 && this.id_try != null) {
            this.id_class.id_class(var1, this.id_try, (float)(var16 - 1), (float)var13, -8355712);
         }

         if (!var5 && this.id_case != null && this.id_throws.isEmpty()) {
            this.id_class.id_break(var1, this.id_case, (float)(var16 - 1), (float)var13, var18);
         }

         if (var11) {
            if (var19) {
               ch_3.id_class(var1, var16, var13 - 1, var16 + 1, var13 + 1 + 9, -3092272);
            } else {
               this.id_class.id_class(var1, "_", (float)var16, (float)var13, var18);
            }
         }

         if (var8 != var7) {
            int var17 = var12 + this.id_class.id_break(var9.substring(0, var8));
            this.id_break(var16, var13 - 1, var17 - 1, var13 + 1 + 9);
         }
      }
   }

   @Override
   protected void id_throws(boolean var1) {
      if (var1) {
         this.id_private = 0;
      }
   }

   public int id_throws(int var1) {
      return this.id_class(var1, this.id_final());
   }

   public void id_finally(int var1) {
      this.id_goto = var1;
   }

   public void id_catch(boolean var1) {
      this.id_super = var1;
   }

   public void id_catch(int var1) {
      this.id_private(var1);
      if (!this.id_else) {
         this.id_native(this.id_return);
      }

      this.id_protected(this.id_throws);
   }

   public void id_catch() {
      this.id_private++;
   }

   public void id_extends(int var1) {
      this.id_while = var1;
   }

   public void id_extends() {
      this.id_catch(0);
   }

   private int id_goto() {
      return this.id_catch;
   }

   public void id_case(int var1) {
      this.id_catch(this.id_continue(var1));
   }

   public void id_case(boolean var1) {
      this.id_this = var1;
   }

   private int id_continue(int var1) {
      return rqR_2.id_class(this.id_throws, this.id_return, var1);
   }

   public BiFunction<String, Integer, rpl_3> id_continue() {
      return (var0, var1) -> rpl_3.id_class(var0, rgc_3.id_class);
   }

   public Lu_1 id_implements(int var1) {
      this.id_catch = var1;
      if (this.id_throws.length() > var1) {
         this.id_throws = this.id_throws.substring(0, var1);
         this.id_protected(this.id_throws);
      }

      return this;
   }

   public String id_implements() {
      int var1 = this.id_return < this.id_public ? this.id_return : this.id_public;
      int var2 = this.id_return < this.id_public ? this.id_public : this.id_return;
      return this.id_throws.substring(var1, var2);
   }

   public boolean id_new() {
      return this.id_throws == null || this.id_throws.isEmpty();
   }

   private void id_new(int var1) {
      if (vm_3.id_else()) {
         this.id_byte(var1);
      } else {
         this.id_protected(var1);
      }
   }

   public int id_package() {
      return this.id_while() ? this.id_extends - 8 : this.id_extends;
   }

   public void id_package(int var1) {
      this.id_final = var1;
   }

   public float id_super() {
      return (float)this.id_volatile;
   }

   private boolean id_try() {
      return this.id_this;
   }

   private boolean id_while() {
      return this.id_implements;
   }

   public void id_protected(boolean var1) {
      this.id_implements = var1;
   }

   private void id_protected(String var1) {
      if (this.id_instanceof != null) {
         this.id_instanceof.accept(var1);
      }

      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrFg_1.id_class(this, var1));
   }

   public void id_protected(int var1) {
      if (!this.id_throws.isEmpty()) {
         if (this.id_public != this.id_return) {
            this.id_break("");
         } else {
            int var2 = this.id_continue(var1);
            int var3 = Math.min(var2, this.id_return);
            int var4 = Math.max(var2, this.id_return);
            if (var3 != var4) {
               String var5 = new StringBuilder(this.id_throws).delete(var3, var4).toString();
               if (this.id_throw.test(var5)) {
                  this.id_throws = var5;
                  this.id_catch(var3);
               }
            }
         }
      }
   }

   public String id_private() {
      return this.id_throws;
   }

   public void id_private(int var1) {
      this.id_return = rfU_2.id_class(var1, 0, this.id_throws.length());
   }

   public void id_private(boolean var1) {
      this.id_new = var1;
   }

   public int id_final() {
      return this.id_return;
   }

   public void id_final(int var1) {
      this.id_volatile = var1;
   }

   public int id_volatile(int var1) {
      return var1 > this.id_throws.length() ? this.id_volatile : this.id_volatile + this.id_class.id_break(this.id_throws.substring(0, var1));
   }

   public boolean id_volatile() {
      return this.id_int() && this.aO_() && this.id_try();
   }

   public void id_native() {
      this.id_catch(this.id_throws.length());
   }

   public void id_native(int var1) {
      int var2 = this.id_throws.length();
      this.id_public = rfU_2.id_class(var1, 0, var2);
      if (this.id_class != null) {
         if (this.id_synchronized > var2) {
            this.id_synchronized = var2;
         }

         int var3 = this.id_package();
         String var4 = this.id_class.id_class(this.id_throws.substring(this.id_synchronized), var3);
         int var5 = var4.length() + this.id_synchronized;
         if (this.id_public == this.id_synchronized) {
            this.id_synchronized = this.id_synchronized - this.id_class.id_class(this.id_throws, var3, true).length();
         }

         if (this.id_public > var5) {
            this.id_synchronized = this.id_synchronized + (this.id_public - var5);
         } else if (this.id_public <= this.id_synchronized) {
            this.id_synchronized = this.id_synchronized - (this.id_synchronized - this.id_public);
         }

         this.id_synchronized = rfU_2.id_class(this.id_synchronized, 0, var2);
      }
   }

   @Override
   protected rVi_1 A_() {
      rgP_2 var1 = this.C_();
      return new rgn_3("gui.narrate.editBox", var1, this.id_throws);
   }
}
