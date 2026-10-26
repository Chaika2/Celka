package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class vp_3 extends vm_3 implements cy_3 {
   private static final rgP_2 id_case = new rgn_3("multiplayer.downloadingStats");
   protected final vm_3 id_throws;
   private vq_3 id_catch;
   vI_2 id_private;
   private vt_3 id_implements;
   final rlP_2 id_finally;
   private LV<?> id_else;
   private boolean id_synchronized = true;

   void id_byte(Ml_1 var1, int var2, int var3, int var4, int var5) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_byte);
      id_class(var1, var2, var3, this.h_(), (float)var4, (float)var5, 18, 18, 128, 128);
   }

   public vp_3(vm_3 var1, rlP_2 var2) {
      super(new rgn_3("gui.stats"));
      this.id_throws = var1;
      this.id_finally = var2;
   }

   public void id_class(LV<?> var1) {
      this.id_native.remove(this.id_catch);
      this.id_native.remove(this.id_private);
      this.id_native.remove(this.id_implements);
      if (var1 != null) {
         this.id_native.add(0, var1);
         this.id_else = var1;
      }
   }

   void id_class(Ml_1 var1, int var2, int var3, rdb_3 var4) {
      this.id_byte(var1, var2 + 1, var3 + 1, 0, 0);
      RenderSystem.enableRescaleNormal();
      this.id_final.id_class(var4.id_continue(), (float)(var2 + 2), (float)(var3 + 2));
      RenderSystem.disableRescaleNormal();
   }

   static String id_class(rCi_1<rqO_2> var0) {
      return "stat." + ((rqO_2)var0.id_throws()).toString().replace(':', '.');
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      if (this.id_synchronized) {
         this.id_class(var1);
         id_class(var1, this.id_super, id_case, this.id_package / 2, this.id_int / 2, 16777215);
         id_class(var1, this.id_super, id_class[(int)(rqR_2.id_break() / 150L % (long)id_class.length)], this.id_package / 2, this.id_int / 2 + 18, 16777215);
      } else {
         this.id_final().id_class(var1, var2, var3, var4);
         id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 20, 16777215);
         super.id_class(var1, var2, var3, var4);
      }
   }

   @Override
   public void id_break() {
      if (this.id_synchronized) {
         this.id_finally();
         this.id_native();
         this.id_class(this.id_catch);
         this.id_synchronized = false;
      }
   }

   int id_break(int var1) {
      return 115 + 40 * var1;
   }

   public void id_finally() {
      this.id_catch = new vq_3(this, this.id_volatile);
      this.id_private = new vI_2(this, this.id_volatile);
      this.id_implements = new vt_3(this, this.id_volatile);
   }

   public LV<?> id_final() {
      return this.id_else;
   }

   public void id_native() {
      this.id_class((LF)(new LF(this.id_package / 2 - 120, this.id_int - 52, 80, 20, new rgn_3("stat.generalButton"), var1x -> this.id_class(this.id_catch))));
      LF var1 = this.id_class(
         (LF)(new LF(this.id_package / 2 - 40, this.id_int - 52, 80, 20, new rgn_3("stat.itemsButton"), var1x -> this.id_class(this.id_private)))
      );
      LF var2 = this.id_class(
         (LF)(new LF(this.id_package / 2 + 40, this.id_int - 52, 80, 20, new rgn_3("stat.mobsButton"), var1x -> this.id_class(this.id_implements)))
      );
      this.id_class((LF)(new LF(this.id_package / 2 - 100, this.id_int - 28, 200, 20, cN_2.id_byte, var1x -> this.id_volatile.id_break(this.id_throws))));
      if (this.id_private.x_().isEmpty()) {
         var1.id_int = false;
      }

      if (this.id_implements.x_().isEmpty()) {
         var2.id_int = false;
      }
   }

   @Override
   protected void v_() {
      this.id_synchronized = true;
      this.id_volatile.id_void().id_class(new rmI_2(rmf_3.REQUEST_STATS));
   }

   @Override
   public boolean z_() {
      return !this.id_synchronized;
   }
}
