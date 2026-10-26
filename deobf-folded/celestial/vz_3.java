package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.List;

public class vz_3 extends vm_3 {
   public static final vN_2 id_class = new vQ_2();
   public static final rqO_2 id_throws = new rqO_2("textures/gui/book.png");
   private vN_2 id_case;
   private int id_catch;
   private List<rpl_3> id_private = Collections.emptyList();
   private int id_implements = -1;
   private rgP_2 id_finally = rgN_2.id_byte;
   private Ln_1 id_else;
   private Ln_1 id_synchronized;
   private final boolean id_return;

   public boolean id_byte(int var1) {
      int var2 = rfU_2.id_class(var1, 0, this.id_case.id_class() - 1);
      if (var2 != this.id_catch) {
         this.id_catch = var2;
         this.id_interface();
         this.id_implements = -1;
         return true;
      } else {
         return false;
      }
   }

   protected void id_int() {
      int var1 = (this.id_package - 192) / 2;
      byte var2 = 2;
      this.id_else = this.id_class(new Ln_1(var1 + 116, 159, true, var1x -> this.id_package(), this.id_return));
      this.id_synchronized = this.id_class(new Ln_1(var1 + 43, 159, false, var1x -> this.id_final(), this.id_return));
      this.id_interface();
   }

   public vz_3(vN_2 var1) {
      this(var1, true);
   }

   public vz_3() {
      this(id_class, false);
   }

   private vz_3(vN_2 var1, boolean var2) {
      super(rgN_2.id_byte);
      this.id_case = var1;
      this.id_return = var2;
   }

   private void id_interface() {
      this.id_else.id_new = this.id_catch < this.id_finally() - 1;
      this.id_synchronized.id_new = this.id_catch > 0;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_throws);
      int var5 = (this.id_package - 192) / 2;
      byte var6 = 2;
      this.id_break(var1, var5, 2, 0, 0, 192, 192);
      if (this.id_implements != this.id_catch) {
         rgS_2 var7 = this.id_case.id_break(this.id_catch);
         this.id_private = this.id_super.id_break(var7, 114);
         this.id_finally = new rgn_3("book.pageIndicator", this.id_catch + 1, Math.max(this.id_finally(), 1));
      }

      this.id_implements = this.id_catch;
      int var11 = this.id_super.id_class(this.id_finally);
      this.id_super.id_byte(var1, this.id_finally, (float)(var5 - var11 + 192 - 44), 18.0F, 0);
      int var8 = Math.min(14, this.id_private.size());

      for (int var9 = 0; var9 < var8; var9++) {
         rpl_3 var10 = this.id_private.get(var9);
         this.id_super.id_break(var1, var10, (float)(var5 + 36), (float)(32 + var9 * 9), 0);
      }

      rgc_3 var12 = this.id_protected((double)var2, (double)var3);
      if (var12 != null) {
         this.id_class(var1, var12, var2, var3);
      }

      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (super.id_class(var1, var2, var3)) {
         return true;
      } else {
         switch (var1) {
            case 266:
               this.id_synchronized.id_catch();
               return true;
            case 267:
               this.id_else.id_catch();
               return true;
            default:
               return false;
         }
      }
   }

   public static List<String> id_class(rcd_3 var0) {
      rcy_3 var1 = var0.id_protected("pages", 8).id_protected();
      Builder var2 = ImmutableList.builder();

      for (int var3 = 0; var3 < var1.size(); var3++) {
         var2.add(var1.id_implements(var3));
      }

      return var2.build();
   }

   @Override
   public boolean id_class(rgc_3 var1) {
      rgl_3 var2 = var1.id_private();
      if (var2 == null) {
         return false;
      } else if (var2.id_class() == rgH_2.CHANGE_PAGE) {
         String var6 = var2.id_break();

         try {
            int var4 = Integer.parseInt(var6) - 1;
            return this.id_break(var4);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean var3 = super.id_class(var1);
         if (var3 && var2.id_class() == rgH_2.RUN_COMMAND) {
            this.id_volatile.id_break((vm_3)null);
         }

         return var3;
      }
   }

   public void id_class(vN_2 var1) {
      this.id_case = var1;
      this.id_catch = rfU_2.id_class(this.id_catch, 0, var1.id_class());
      this.id_interface();
      this.id_implements = -1;
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (var5 == 0) {
         rgc_3 var6 = this.id_protected(var1, var3);
         if (var6 != null && this.id_class(var6)) {
            return true;
         }
      }

      return super.id_break(var1, var3, var5);
   }

   protected boolean id_break(int var1) {
      return this.id_byte(var1);
   }

   private int id_finally() {
      return this.id_case.id_class();
   }

   protected void id_package() {
      if (this.id_catch < this.id_finally() - 1) {
         this.id_catch++;
      }

      this.id_interface();
   }

   public rgc_3 id_protected(double var1, double var3) {
      if (this.id_private.isEmpty()) {
         return null;
      } else {
         int var5 = rfU_2.id_byte(var1 - (double)((this.id_package - 192) / 2) - 36.0);
         int var6 = rfU_2.id_byte(var3 - 2.0 - 30.0);
         if (var5 >= 0 && var6 >= 0) {
            int var7 = Math.min(14, this.id_private.size());
            if (var5 <= 114 && var6 < 9 * var7 + var7) {
               int var8 = var6 / 9;
               if (var8 >= 0 && var8 < this.id_private.size()) {
                  rpl_3 var9 = this.id_private.get(var8);
                  return ((cm_3)this.id_volatile.id_class[15]).id_break().id_class(var9, var5);
               } else {
                  return null;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   protected void id_final() {
      if (this.id_catch > 0) {
         this.id_catch--;
      }

      this.id_interface();
   }

   protected void id_native() {
      this.id_class((LF)(new LF(this.id_package / 2 - 100, 196, 200, 20, cN_2.id_byte, var1 -> this.id_volatile.id_break((vm_3)null))));
   }

   @Override
   protected void v_() {
      this.id_native();
      this.id_int();
   }
}
