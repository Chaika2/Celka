package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Random;

class Ld_1 implements LS {
   private final rnB_2 id_class;
   private final rqO_2 id_break;
   private final List<Aw_1> id_byte;

   @Override
   public rgP_2 id_byte() {
      return this.id_class.id_break();
   }

   public Ld_1(Lx_1 var1, rnB_2 var2) {
      this.id_class = var2;
      this.id_byte = Lists.newArrayList();

      for (String var4 : var2.id_case()) {
         Aw_1 var5 = QY.id_instanceof().id_void().id_class(var4);
         if (var5 != null) {
            this.id_byte.add(var5);
         }
      }

      if (this.id_byte.isEmpty()) {
         this.id_break = jH_2.id_class();
      } else {
         String var6 = this.id_byte.get(new Random().nextInt(this.id_byte.size())).id_class().getName();
         this.id_break = cG_2.id_class(var6);
         cG_2.id_class(this.id_break, var6);
      }
   }

   @Override
   public void id_class(Lb_1 var1) {
      var1.id_class(new LJ(this.id_byte));
   }

   @Override
   public void id_class(Ml_1 var1, float var2, int var3) {
      Integer var4 = this.id_class.id_volatile().id_protected();
      if (var4 != null) {
         float var5 = (float)(var4 >> 16 & 0xFF) / 255.0F;
         float var6 = (float)(var4 >> 8 & 0xFF) / 255.0F;
         float var7 = (float)(var4 & 0xFF) / 255.0F;
         ch_3.id_class(var1, 1, 1, 15, 15, rfU_2.id_throws(var5 * var2, var6 * var2, var7 * var2) | var3 << 24);
      }

      QY.id_instanceof().A().id_class(this.id_break);
      RenderSystem.color4f(var2, var2, var2, (float)var3 / 255.0F);
      ch_3.id_class(var1, 2, 2, 12, 12, 8.0F, 8.0F, 8, 8, 64, 64);
      ch_3.id_class(var1, 2, 2, 12, 12, 40.0F, 8.0F, 8, 8, 64, 64);
   }

   @Override
   public boolean id_protected() {
      return !this.id_byte.isEmpty();
   }
}
