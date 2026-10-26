package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class ue_3 extends ms_3 {
   private Iterator<rdb_3> id_implements;
   private Set<rdb_3> id_finally;
   private rJY id_extends;
   private rdb_3 id_native;
   private float id_volatile;

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, boolean var4, float var5) {
      super.id_class(var1, var2, var3, var4, var5);
      if (this.id_extends != null) {
         if (!vm_3.id_else()) {
            this.id_volatile += var5;
         }

         int var6 = this.id_extends.id_throws + var2;
         int var7 = this.id_extends.id_case + var3;
         ch_3.id_class(var1, var6, var7, var6 + 16, var7 + 16, 822018048);
         this.id_private.id_float().id_class((cb_3)this.id_private.id_class[57], this.id_native().id_continue(), (float)var6, (float)var7);
         RenderSystem.depthFunc(516);
         ch_3.id_class(var1, var6, var7, var6 + 16, var7 + 16, 822083583);
         RenderSystem.depthFunc(515);
      }
   }

   @Override
   public void id_class(rkw_3<?> var1, List<rJY> var2) {
      rdn_3 var3 = var1.id_byte();
      this.id_throws.id_class(var1);
      this.id_throws.id_class(rkg_3.id_class(var3), ((rJY)var2.get(2)).id_throws, ((rJY)var2.get(2)).id_case);
      rqs_3 var4 = var1.id_class();
      this.id_extends = (rJY)var2.get(1);
      if (this.id_finally == null) {
         this.id_finally = this.id_protected();
      }

      this.id_implements = this.id_finally.iterator();
      this.id_native = null;
      Iterator var5 = var4.iterator();

      for (int var6 = 0; var6 < 2; var6++) {
         if (!var5.hasNext()) {
            return;
         }

         rkg_3 var7 = (rkg_3)var5.next();
         if (!var7.id_protected()) {
            rJY var8 = (rJY)var2.get(var6);
            this.id_throws.id_class(var7, var8.id_throws, var8.id_case);
         }
      }
   }

   @Override
   protected void id_class() {
      this.id_case.id_class(152, 182, 28, 18, id_class);
   }

   @Override
   public void id_class(rJY var1) {
      super.id_class(var1);
      if (var1 != null && var1.id_protected < this.id_catch.id_throws()) {
         this.id_extends = null;
      }
   }

   protected abstract Set<rdb_3> id_protected();

   private rdb_3 id_native() {
      if (this.id_native == null || this.id_volatile > 30.0F) {
         this.id_volatile = 0.0F;
         if (this.id_implements == null || !this.id_implements.hasNext()) {
            if (this.id_finally == null) {
               this.id_finally = this.id_protected();
            }

            this.id_implements = this.id_finally.iterator();
         }

         this.id_native = this.id_implements.next();
      }

      return this.id_native;
   }
}
