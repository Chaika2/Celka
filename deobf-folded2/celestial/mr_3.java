package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class mr_3 {
   private rkw_3<?> id_class;
   private final List<mP_2> id_break = Lists.newArrayList();
   float id_byte;

   public rkw_3<?> id_byte() {
      return this.id_class;
   }

   public void id_class(rkw_3<?> var1) {
      this.id_class = var1;
   }

   public void id_class(Ml_1 var1, QY var2, int var3, int var4, boolean var5, float var6) {
      if (!vm_3.id_else()) {
         this.id_byte += var6;
      }

      for (int var7 = 0; var7 < this.id_break.size(); var7++) {
         mP_2 var8 = this.id_break.get(var7);
         int var9 = var8.id_class() + var3;
         int var10 = var8.id_break() + var4;
         if (var7 == 0 && var5) {
            ch_3.id_class(var1, var9 - 4, var10 - 4, var9 + 20, var10 + 20, 822018048);
         } else {
            ch_3.id_class(var1, var9, var10, var9 + 16, var10 + 16, 822018048);
         }

         rdn_3 var11 = var8.id_byte();
         Hz_1 var12 = var2.id_float();
         var12.id_break(var11, var9, var10);
         RenderSystem.depthFunc(516);
         ch_3.id_class(var1, var9, var10, var9 + 16, var10 + 16, 822083583);
         RenderSystem.depthFunc(515);
         if (var7 == 0) {
            var12.id_class((cm_3)var2.id_class[15], var11, (float)var9, (float)var10);
         }
      }
   }

   public void id_class() {
      this.id_class = null;
      this.id_break.clear();
      this.id_byte = 0.0F;
   }

   public void id_class(rkg_3 var1, int var2, int var3) {
      this.id_break.add(new mP_2(this, var1, var2, var3));
   }

   public mP_2 id_class(int var1) {
      return this.id_break.get(var1);
   }

   public int id_break() {
      return this.id_break.size();
   }
}
