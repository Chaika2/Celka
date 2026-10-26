package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;

public class Fq_1 extends Fb_1<rJV> {
   private static final rqO_2 class_ = new rqO_2("textures/gui/container/shulker_box.png");

   public Fq_1(rJV var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
      this.return_++;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      super.class_(var1, var2, var3, var4);
      this.break_(var1, var2, var3);
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(class_);
      int var5 = (this.package_ - this.synchronized_) / 2;
      int var6 = (this.int_ - this.return_) / 2;
      this.break_(var1, var5, var6, 0, 0, this.synchronized_, this.return_);
   }

   @Override
   public boolean finally_() {
      return this.extends_ != null;
   }

   @Override
   public List<LZ> native_() {
      ArrayList var1 = new ArrayList();
      var1.add(new Fj_1(this, 0, 0, 100, 20, var1x -> this.class_(FM.PUT_ALL)));
      var1.add(new FV(this, 0, 0, 100, 20, var1x -> this.class_(FM.TAKE_ALL)));

      for (int var2 = 0; var2 < var1.size(); var2++) {
         LZ var3 = (LZ)var1.get(var2);
         byte var4 = 20;
         byte var5 = 2;
         int var6 = this.char_ + this.synchronized_ + 5;
         int var7 = this.abstract_ + var2 * (var4 + var5);
         var3.volatile_ = var6;
         var3.final_ = var7;
         var3.finally_(false);
      }

      return var1;
   }
}
