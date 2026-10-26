package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;

public class mJ_2 extends LZ {
   private static final rqO_2 id_class = new rqO_2("textures/gui/recipe_book.png");
   private static final rgP_2 id_throws = new rgn_3("gui.recipebook.moreRecipes");
   private rJI<?> id_case;
   private rkU_2 id_catch;
   private mG_2 id_private;
   private float id_implements;
   private float id_super;
   private int id_this;

   public mJ_2() {
      super(0, 0, 25, 25, rgN_2.id_byte);
   }

   public void id_class(mG_2 var1, mE_2 var2) {
      this.id_private = var1;
      this.id_case = (rJI<?>)((rJr_1)((cb_3)var2.id_protected().id_class[57]).id_implements[4]);
      this.id_catch = var2.id_throws();
      List var3 = var1.id_class(this.id_catch.id_class(this.id_case));

      for (rkw_3 var5 : var3) {
         if (this.id_catch.id_protected(var5)) {
            var2.id_class(var3);
            this.id_super = 15.0F;
            break;
         }
      }
   }

   public List<rgP_2> id_class(vm_3 var1) {
      rdn_3 var2 = this.id_catch().get(this.id_this).id_byte();
      ArrayList var3 = Lists.newArrayList(var1.id_class(var2));
      if (this.id_private.id_class(this.id_catch.id_class(this.id_case)).size() > 1) {
         var3.add(id_throws);
      }

      return var3;
   }

   public mG_2 id_class() {
      return this.id_private;
   }

   public void id_class(int var1, int var2) {
      this.id_volatile = var1;
      this.id_final = var2;
   }

   @Override
   protected boolean id_break(int var1) {
      return var1 == 0 || var1 == 1;
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      if (!vm_3.id_else()) {
         this.id_implements += var4;
      }

      QY var5 = QY.id_instanceof();
      var5.A().id_class(id_class);
      byte var6 = 29;
      if (!this.id_private.id_break()) {
         var6 += 25;
      }

      short var7 = 206;
      if (this.id_private.id_class(this.id_catch.id_class(this.id_case)).size() > 1) {
         var7 += 25;
      }

      boolean var8 = this.id_super > 0.0F;
      if (var8) {
         float var9 = 1.0F + 0.1F * (float)Math.sin((double)(this.id_super / 15.0F * (float) Math.PI));
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)(this.id_volatile + 8), (float)(this.id_final + 12), 0.0F);
         RenderSystem.scalef(var9, var9, 1.0F);
         RenderSystem.translatef((float)(-(this.id_volatile + 8)), (float)(-(this.id_final + 12)), 0.0F);
         this.id_super -= var4;
      }

      this.id_break(var1, this.id_volatile, this.id_final, var6, var7, this.id_extends, this.id_native);
      List var12 = this.id_catch();
      this.id_this = rfU_2.id_protected(this.id_implements / 30.0F) % var12.size();
      rdn_3 var10 = ((rkw_3)var12.get(this.id_this)).id_byte();
      int var11 = 4;
      if (this.id_private.id_throws() && this.id_catch().size() > 1) {
         var5.id_float().id_class(var10, this.id_volatile + var11 + 1, this.id_final + var11 + 1);
         var11--;
      }

      var5.id_float().id_break(var10, this.id_volatile + var11, this.id_final + var11);
      if (var8) {
         RenderSystem.popMatrix();
      }
   }

   public rkw_3<?> id_throws() {
      List var1 = this.id_catch();
      return (rkw_3<?>)var1.get(this.id_this);
   }

   private List<rkw_3<?>> id_catch() {
      List var1 = this.id_private.id_break(true);
      if (!this.id_catch.id_class(this.id_case)) {
         var1.addAll(this.id_private.id_break(false));
      }

      return var1;
   }

   @Override
   public int id_case() {
      return 25;
   }

   public boolean id_protected() {
      return this.id_catch().size() == 1;
   }
}
