package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.List;

class mO_2 extends LZ implements rkI_2<rkg_3> {
   final rkw_3<?> id_case;
   private final boolean id_catch;
   protected final List<mh_3> id_class;

   public mO_2(int var1, int var2, rkw_3<?> var3, boolean var4, boolean var5) {
      super(var2, var3, 200, 20, rgN_2.id_byte);
      this.id_throws = var1;
      this.id_class = Lists.newArrayList();
      this.id_extends = 24;
      this.id_native = 24;
      this.id_case = var4;
      this.id_catch = var5;
      this.id_class(var4);
   }

   @Override
   public void id_class(Iterator<rkg_3> var1, int var2, int var3, int var4, int var5) {
      rdn_3[] var6 = ((rkg_3)var1.next()).id_class();
      if (var6.length != 0) {
         this.id_class.add(new mh_3(this, 3 + var5 * 7, 3 + var4 * 7, var6));
      }
   }

   protected void id_class(rkw_3<?> var1) {
      this.id_class(3, 3, -1, var1, var1.id_class().iterator(), 0);
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      RenderSystem.enableAlphaTest();
      this.id_throws.id_implements.A().id_class(mb_3.id_class);
      short var5 = 152;
      if (!this.id_catch) {
         var5 += 26;
      }

      int var6 = this.id_throws.id_volatile ? 130 : 78;
      if (this.B_()) {
         var6 += 26;
      }

      this.id_break(var1, this.id_volatile, this.id_final, var5, var6, this.id_extends, this.id_native);

      for (mh_3 var8 : this.id_class) {
         RenderSystem.pushMatrix();
         float var9 = 0.42F;
         int var10 = (int)((float)(this.id_volatile + var8.id_break) / 0.42F - 3.0F);
         int var11 = (int)((float)(this.id_final + var8.id_byte) / 0.42F - 3.0F);
         RenderSystem.scalef(0.42F, 0.42F, 1.0F);
         this.id_throws
            .id_implements
            .id_float()
            .id_class(var8.id_class[rfU_2.id_protected(this.id_throws.id_native / 30.0F) % var8.id_class.length], var10, var11);
         RenderSystem.popMatrix();
      }

      RenderSystem.disableAlphaTest();
   }
}
