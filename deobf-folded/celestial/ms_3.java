package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ms_3 extends ch_3 implements cC_2, cp_3, mS_2, rkI_2<rkg_3> {
   protected static final rqO_2 id_class = new rqO_2("textures/gui/recipe_book.png");
   private static final rgP_2 id_implements = new rgn_3("gui.recipebook.search_hint").id_class(rgF_2.ITALIC).id_class(rgF_2.GRAY);
   private static final rgP_2 id_finally = new rgn_3("gui.recipebook.toggleRecipes.craftable");
   private static final rgP_2 id_extends = new rgn_3("gui.recipebook.toggleRecipes.all");
   private int id_native;
   private int id_volatile;
   private int id_final;
   protected final mr_3 id_throws = new mr_3();
   private final List<mX_2> id_package = Lists.newArrayList();
   private mX_2 id_int;
   protected Lm_1 id_case;
   protected rJI<?> id_catch;
   protected QY id_private;
   private Lu_1 id_new;
   private String id_continue = "";
   private VR id_super;
   private final mE_2 id_this = new mE_2();
   private final rWr_1 id_else = new rWr_1();
   private int id_synchronized;
   private boolean id_return;

   public void id_byte(Ml_1 var1, int var2, int var3, int var4, int var5) {
      if (this.id_private()) {
         this.id_this.id_class(var1, var4, var5);
         if (this.id_case.B_()) {
            rgP_2 var6 = this.id_volatile();
            if ((vm_3)this.id_private.id_class[73] != null) {
               ((vm_3)this.id_private.id_class[73]).id_class(var1, var6, var4, var5);
            }
         }

         this.id_protected(var1, var2, var3, var4, var5);
      }
   }

   protected void id_byte(boolean var1) {
      this.id_super.id_class(this.id_catch.id_implements(), var1);
      if (!var1) {
         this.id_this.id_byte();
      }

      this.id_extends();
   }

   private boolean id_int() {
      return this.id_native == 86;
   }

   @Override
   public boolean id_class(char var1, int var2) {
      if (this.id_return) {
         return false;
      } else if (!this.id_private() || ((cb_3)this.id_private.id_class[57]).id_native()) {
         return false;
      } else if (this.id_new.id_class(var1, var2)) {
         this.id_package();
         return true;
      } else {
         return cC_2.super.id_class(var1, var2);
      }
   }

   private void id_class(String var1) {
      if ("excitedze".equals(var1)) {
         jV_2 var2 = this.id_private.u();
         jj_3 var3 = var2.id_class("en_pt");
         if (var2.id_break().id_class(var3) == 0) {
            return;
         }

         var2.id_class(var3);
         ((Qw_1)this.id_private.id_class[20]).rG = var3.getCode();
         this.id_private.id_private();
         ((Qw_1)this.id_private.id_class[20]).id_break();
      }
   }

   public void id_class(boolean var1) {
      this.id_native = var1 ? 0 : 86;
      int var2 = (this.id_volatile - 147) / 2 - this.id_native;
      int var3 = (this.id_final - 166) / 2;
      this.id_else.id_class();
      ((rhz_3)((cb_3)this.id_private.id_class[57]).id_implements[1]).id_class(this.id_else);
      this.id_catch.id_class(this.id_else);
      String var4 = this.id_new != null ? this.id_new.id_private() : "";
      this.id_new = new Lu_1((cm_3)this.id_private.id_class[15], var2 + 25, var3 + 14, 80, 14, new rgn_3("itemGroup.search"));
      this.id_new.id_implements(50);
      this.id_new.id_protected(false);
      this.id_new.id_private(true);
      this.id_new.id_finally(16777215);
      this.id_new.id_class(var4);
      this.id_this.id_class(this.id_private, var2, var3);
      this.id_this.id_class(this);
      this.id_case = new Lm_1(var2 + 110, var3 + 12, 26, 16, this.id_super.id_class(this.id_catch));
      this.id_class();
      this.id_package.clear();

      for (gM_2 var6 : gM_2.id_class(this.id_catch.id_implements())) {
         this.id_package.add(new mX_2(var6));
      }

      if (this.id_int != null) {
         this.id_int = this.id_package.stream().filter(var1x -> var1x.id_class().equals(this.id_int.id_class())).findFirst().orElse((mX_2)null);
      }

      if (this.id_int == null) {
         this.id_int = this.id_package.get(0);
      }

      this.id_int.id_byte(true);
      this.id_protected(false);
      this.id_protected();
   }

   @Override
   public void id_class(List<rkw_3<?>> var1) {
      for (rkw_3 var3 : var1) {
         ((cb_3)this.id_private.id_class[57]).id_class(var3);
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_return = false;
      if (!this.id_private() || ((cb_3)this.id_private.id_class[57]).id_native()) {
         return false;
      } else if (var1 == 256 && !this.id_int()) {
         this.id_byte(false);
         return true;
      } else if (this.id_new.id_class(var1, var2, var3)) {
         this.id_package();
         return true;
      } else if (this.id_new.aO_() && this.id_new.id_int() && var1 != 256) {
         return true;
      } else if (((Qw_1)this.id_private.id_class[20]).v.id_class(var1, var2) && !this.id_new.aO_()) {
         this.id_return = true;
         this.id_new.id_byte(true);
         return true;
      } else {
         return false;
      }
   }

   public boolean id_class(double var1, double var3, int var5, int var6, int var7, int var8, int var9) {
      if (!this.id_private()) {
         return true;
      } else {
         boolean var10 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + var7) || var3 >= (double)(var6 + var8);
         boolean var11 = (double)(var5 - 147) < var1 && var1 < (double)var5 && (double)var6 < var3 && var3 < (double)(var6 + var8);
         return var10 && !var11 && !this.id_int.B_();
      }
   }

   public void id_class(Ml_1 var1, int var2, int var3, boolean var4, float var5) {
      this.id_throws.id_class(var1, this.id_private, var2, var3, var4, var5);
   }

   public void id_class(int var1, int var2, QY var3, boolean var4, rJI<?> var5) {
      this.id_private = var3;
      this.id_volatile = var1;
      this.id_final = var2;
      this.id_catch = var5;
      ((cb_3)var3.id_class[57]).id_implements[4] = var5;
      this.id_super = ((cb_3)var3.id_class[57]).Z();
      this.id_synchronized = ((rhz_3)((cb_3)var3.id_class[57]).id_implements[1]).id_implements();
      if (this.id_private()) {
         this.id_class(var4);
      }

      ((Qj_1)var3.id_class[23]).id_class(true);
   }

   @Override
   public void id_class(Iterator<rkg_3> var1, int var2, int var3, int var4, int var5) {
      rkg_3 var6 = (rkg_3)var1.next();
      if (!var6.id_protected()) {
         rJY var7 = this.id_catch.id_throws.get(var2);
         this.id_throws.id_class(var6, var7.id_throws, var7.id_case);
      }
   }

   public void id_class(rkw_3<?> var1, List<rJY> var2) {
      rdn_3 var3 = var1.id_byte();
      this.id_throws.id_class(var1);
      this.id_throws.id_class(rkg_3.id_class(var3), ((rJY)var2.get(0)).id_throws, ((rJY)var2.get(0)).id_case);
      this.id_class(this.id_catch.id_byte(), this.id_catch.id_protected(), this.id_catch.id_break(), var1, var1.id_class().iterator(), 0);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      if (this.id_private()) {
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, 0.0F, 100.0F);
         this.id_private.A().id_class(id_class);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var5 = (this.id_volatile - 147) / 2 - this.id_native;
         int var6 = (this.id_final - 166) / 2;
         this.id_break(var1, var5, var6, 1, 1, 147, 166);
         if (!this.id_new.aO_() && this.id_new.id_private().isEmpty()) {
            id_break(var1, (cm_3)this.id_private.id_class[15], id_implements, var5 + 25, var6 + 14, -1);
         } else {
            this.id_new.id_class(var1, var2, var3, var4);
         }

         for (mX_2 var8 : this.id_package) {
            var8.id_class(var1, var2, var3, var4);
         }

         this.id_case.id_class(var1, var2, var3, var4);
         this.id_this.id_class(var1, var5, var6, var2, var3, var4);
         RenderSystem.popMatrix();
      }
   }

   public int id_class(boolean var1, int var2, int var3) {
      int var4;
      if (this.id_private() && !var1) {
         var4 = 177 + (var2 - var3 - 200) / 2;
      } else {
         var4 = (var2 - var3) / 2;
      }

      return var4;
   }

   protected void id_class() {
      this.id_case.id_class(152, 41, 28, 18, id_class);
   }

   public void id_class(rJY var1) {
      if (var1 != null && var1.id_protected < this.id_catch.id_throws()) {
         this.id_throws.id_class();
         if (this.id_private()) {
            this.id_native();
         }
      }
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      this.id_return = false;
      return cC_2.super.id_break(var1, var2, var3);
   }

   @Override
   public boolean id_break(double var1, double var3) {
      return false;
   }

   @Override
   public boolean id_break(boolean var1) {
      return false;
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (this.id_private() && !((cb_3)this.id_private.id_class[57]).id_native()) {
         if (this.id_this.id_class(var1, var3, var5, (this.id_volatile - 147) / 2 - this.id_native, (this.id_final - 166) / 2, 147, 166)) {
            rkw_3 var9 = this.id_this.id_class();
            mG_2 var10 = this.id_this.id_break();
            if (var9 != null && var10 != null) {
               if (!var10.id_class(var9) && this.id_throws.id_byte() == var9) {
                  return false;
               }

               this.id_throws.id_class();
               ((Ax_1)this.id_private.id_class[55])
                  .id_class(((rJr_1)((cb_3)this.id_private.id_class[57]).id_implements[4]).id_case, var9, vm_3.id_synchronized());
               if (!this.id_int()) {
                  this.id_byte(false);
               }
            }

            return true;
         } else if (this.id_new.id_break(var1, var3, var5)) {
            return true;
         } else if (this.id_case.id_break(var1, var3, var5)) {
            boolean var8 = this.id_final();
            this.id_case.id_byte(var8);
            this.id_extends();
            this.id_protected(false);
            return true;
         } else {
            for (mX_2 var7 : this.id_package) {
               if (var7.id_break(var1, var3, var5)) {
                  if (this.id_int != var7) {
                     this.id_int.id_byte(false);
                     this.id_int = var7;
                     this.id_int.id_byte(true);
                     this.id_protected(true);
                  }

                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   protected rgP_2 id_throws() {
      return id_finally;
   }

   public void id_finally() {
      this.id_protected();
      if (this.id_private()) {
         this.id_protected(false);
      }
   }

   public void id_catch() {
      this.id_byte(!this.id_private());
   }

   protected void id_extends() {
      if (this.id_private.id_void() != null) {
         rke_3 var1 = this.id_catch.id_implements();
         boolean var2 = this.id_super.id_break().id_class(var1);
         boolean var3 = this.id_super.id_break().id_break(var1);
         this.id_private.id_void().id_class(new rZH(var1, var2, var3));
      }
   }

   public void id_case() {
      this.id_new = null;
      this.id_int = null;
      ((Qj_1)this.id_private.id_class[23]).id_class(false);
   }

   public void id_implements() {
      if (this.id_private()) {
         if (this.id_synchronized != ((rhz_3)((cb_3)this.id_private.id_class[57]).id_implements[1]).id_implements()) {
            this.id_native();
            this.id_synchronized = ((rhz_3)((cb_3)this.id_private.id_class[57]).id_implements[1]).id_implements();
         }

         this.id_new.id_catch();
      }
   }

   private void id_package() {
      String var1 = this.id_new.id_private().toLowerCase(Locale.ROOT);
      this.id_class(var1);
      if (!var1.equals(this.id_continue)) {
         this.id_protected(false);
         this.id_continue = var1;
      }
   }

   private void id_protected(Ml_1 var1, int var2, int var3, int var4, int var5) {
      rdn_3 var6 = null;

      for (int var7 = 0; var7 < this.id_throws.id_break(); var7++) {
         mP_2 var8 = this.id_throws.id_class(var7);
         int var9 = var8.id_class() + var2;
         int var10 = var8.id_break() + var3;
         if (var4 >= var9 && var5 >= var10 && var4 < var9 + 16 && var5 < var10 + 16) {
            var6 = var8.id_byte();
         }
      }

      if (var6 != null && (vm_3)this.id_private.id_class[73] != null) {
         ((vm_3)this.id_private.id_class[73]).id_class(var1, ((vm_3)this.id_private.id_class[73]).id_class(var6), var4, var5);
      }
   }

   private void id_protected(boolean var1) {
      List var2 = this.id_super.id_class(this.id_int.id_class());
      var2.forEach(var1x -> var1x.id_class(this.id_else, this.id_catch.id_byte(), this.id_catch.id_protected(), this.id_super));
      ArrayList var3 = Lists.newArrayList(var2);
      var3.removeIf(var0 -> !var0.id_class());
      var3.removeIf(var0 -> !var0.id_byte());
      String var4 = this.id_new.id_private();
      if (!var4.isEmpty()) {
         ObjectLinkedOpenHashSet var5 = new ObjectLinkedOpenHashSet(this.id_private.id_class(gJ_2.id_byte).id_class(var4.toLowerCase(Locale.ROOT)));
         var3.removeIf(var1x -> !var5.contains(var1x));
      }

      if (this.id_super.id_class(this.id_catch)) {
         var3.removeIf(var0 -> !var0.id_break());
      }

      this.id_this.id_class(var3, var1);
   }

   private void id_protected() {
      int var1 = (this.id_volatile - 147) / 2 - this.id_native - 30;
      int var2 = (this.id_final - 166) / 2 + 3;
      byte var3 = 27;
      int var4 = 0;

      for (mX_2 var6 : this.id_package) {
         gM_2 var7 = var6.id_class();
         if (var7 == gM_2.CRAFTING_SEARCH || var7 == gM_2.FURNACE_SEARCH) {
            var6.id_new = true;
            var6.id_class(var1, var2 + 27 * var4++);
         } else if (var6.id_class(this.id_super)) {
            var6.id_class(var1, var2 + 27 * var4++);
            var6.id_class(this.id_private);
         }
      }
   }

   public boolean id_private() {
      return this.id_super.id_class(this.id_catch.id_implements());
   }

   private boolean id_final() {
      rke_3 var1 = this.id_catch.id_implements();
      boolean var2 = !this.id_super.id_break(var1);
      this.id_super.id_break(var1, var2);
      return var2;
   }

   private rgP_2 id_volatile() {
      return this.id_case.id_catch() ? this.id_throws() : id_extends;
   }

   private void id_native() {
      this.id_else.id_class();
      ((rhz_3)((cb_3)this.id_private.id_class[57]).id_implements[1]).id_class(this.id_else);
      this.id_catch.id_class(this.id_else);
      this.id_protected(false);
   }
}
