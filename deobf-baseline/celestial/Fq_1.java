package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;

public class Fq_1 extends Fb_1<rJV> {
   private static final rqO_2 id_class = new rqO_2("textures/gui/container/shulker_box.png");

   public Fq_1(rJV var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
      this.id_return++;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      super.id_class(var1, var2, var3, var4);
      this.id_break(var1, var2, var3);
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_class);
      int var5 = (this.id_package - this.id_synchronized) / 2;
      int var6 = (this.id_int - this.id_return) / 2;
      this.id_break(var1, var5, var6, 0, 0, this.id_synchronized, this.id_return);
   }

   @Override
   public boolean id_finally() {
      return this.id_extends != null;
   }

   @Override
   public List<LZ> id_native() {
      ArrayList var1 = new ArrayList();
      var1.add(new Fj_1(this, 0, 0, 100, 20, var1x -> this.id_class(FM.PUT_ALL)));
      var1.add(new FV(this, 0, 0, 100, 20, var1x -> this.id_class(FM.TAKE_ALL)));

      for (int var2 = 0; var2 < var1.size(); var2++) {
         LZ var3 = (LZ)var1.get(var2);
         byte var4 = 20;
         byte var5 = 2;
         int var6 = this.id_char + this.id_synchronized + 5;
         int var7 = this.id_abstract + var2 * (var4 + var5);
         var3.id_volatile = var6;
         var3.id_final = var7;
         var3.id_finally(false);
      }

      return var1;
   }
}
