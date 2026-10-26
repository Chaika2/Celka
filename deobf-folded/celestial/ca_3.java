package celestial;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class ca_3 extends vm_3 implements AM {
   private static final rqO_2 id_class = new rqO_2("textures/gui/advancements/window.png");
   private static final rqO_2 id_throws = new rqO_2("textures/gui/advancements/tabs.png");
   private static final rgP_2 id_case = new rgn_3("advancements.sad_label");
   private static final rgP_2 id_catch = new rgn_3("advancements.empty");
   private static final rgP_2 id_private = new rgn_3("gui.advancements");
   private final Ab_1 id_implements;
   private final Map<OT, cD_2> id_finally = Maps.newLinkedHashMap();
   private cD_2 id_else;
   private boolean id_synchronized;

   private void id_byte(Ml_1 var1, int var2, int var3, int var4, int var5) {
      cD_2 var6 = this.id_else;
      if (var6 == null) {
         id_class(var1, var4 + 9, var5 + 18, var4 + 9 + 234, var5 + 18 + 113, -16777216);
         int var7 = var4 + 9 + 117;
         id_class(var1, this.id_super, id_catch, var7, var5 + 18 + 56 - 4, -1);
         id_class(var1, this.id_super, id_case, var7, var5 + 18 + 113 - 9, -1);
      } else {
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)(var4 + 9), (float)(var5 + 18), 0.0F);
         var6.id_class(var1);
         RenderSystem.popMatrix();
         RenderSystem.depthFunc(515);
         RenderSystem.disableDepthTest();
      }
   }

   @Override
   public void id_byte(OT var1) {
      cD_2 var2 = this.id_catch(var1);
      if (var2 != null) {
         var2.id_class(var1);
      }
   }

   public ca_3(Ab_1 var1) {
      super(rgN_2.id_byte);
      this.id_implements = var1;
   }

   public void id_class(Ml_1 var1, int var2, int var3) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableBlend();
      this.id_volatile.A().id_class(id_class);
      this.id_break(var1, var2, var3, 0, 0, 252, 140);
      if (this.id_finally.size() > 1) {
         this.id_volatile.A().id_class(id_throws);

         for (cD_2 var5 : this.id_finally.values()) {
            var5.id_class(var1, var2, var3, var5 == this.id_else);
         }

         RenderSystem.enableRescaleNormal();
         RenderSystem.defaultBlendFunc();

         for (cD_2 var7 : this.id_finally.values()) {
            var7.id_class(var2, var3, this.id_final);
         }

         RenderSystem.disableBlend();
      }

      this.id_super.id_byte(var1, id_private, (float)(var2 + 8), (float)(var3 + 6), 4210752);
   }

   @Override
   public void id_class(OT var1) {
      cD_2 var2 = cD_2.id_class(this.id_volatile, this, this.id_finally.size(), var1);
      if (var2 != null) {
         this.id_finally.put(var1, var2);
      }
   }

   @Override
   public void id_class(OT var1, Oj_1 var2) {
      co_3 var3 = this.id_case(var1);
      if (var3 != null) {
         var3.id_class(var2);
      }
   }

   @Override
   public void id_class() {
      this.id_finally.clear();
      this.id_else = null;
   }

   @Override
   public boolean id_class(double var1, double var3, int var5, double var6, double var8) {
      if (var5 != 0) {
         this.id_synchronized = false;
         return false;
      } else {
         if (!this.id_synchronized) {
            this.id_synchronized = true;
         } else if (this.id_else != null) {
            this.id_else.id_class(var6, var8);
         }

         return true;
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (((Qw_1)this.id_volatile.id_class[20]).q.id_class(var1, var2)) {
         this.id_volatile.id_break((vm_3)null);
         ((Qi_1)this.id_volatile.id_class[22]).id_catch();
         return true;
      } else {
         return super.id_class(var1, var2, var3);
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      int var5 = (this.id_package - 252) / 2;
      int var6 = (this.id_int - 140) / 2;
      this.id_class(var1);
      this.id_byte(var1, var2, var3, var5, var6);
      this.id_class(var1, var5, var6);
      this.id_protected(var1, var2, var3, var5, var6);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (var5 == 0) {
         int var6 = (this.id_package - 252) / 2;
         int var7 = (this.id_int - 140) / 2;

         for (cD_2 var9 : this.id_finally.values()) {
            if (var9.id_class(var6, var7, var1, var3)) {
               this.id_implements.id_class(var9.id_class(), true);
               break;
            }
         }
      }

      return super.id_break(var1, var3, var5);
   }

   @Override
   public void id_break(OT var1) {
   }

   @Override
   public void id_throws(OT var1) {
      this.id_else = this.id_finally.get(var1);
   }

   private cD_2 id_catch(OT var1) {
      while (var1.id_break() != null) {
         var1 = var1.id_break();
      }

      return this.id_finally.get(var1);
   }

   public co_3 id_case(OT var1) {
      cD_2 var2 = this.id_catch(var1);
      return var2 == null ? null : var2.id_break(var1);
   }

   private void id_protected(Ml_1 var1, int var2, int var3, int var4, int var5) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.id_else != null) {
         RenderSystem.pushMatrix();
         RenderSystem.enableDepthTest();
         RenderSystem.translatef((float)(var4 + 9), (float)(var5 + 18), 400.0F);
         this.id_else.id_byte(var1, var2 - var4 - 9, var3 - var5 - 18, var4, var5);
         RenderSystem.disableDepthTest();
         RenderSystem.popMatrix();
      }

      if (this.id_finally.size() > 1) {
         for (cD_2 var7 : this.id_finally.values()) {
            if (var7.id_class(var4, var5, (double)var2, (double)var3)) {
               this.id_class(var1, var7.id_protected(), var2, var3);
            }
         }
      }
   }

   @Override
   public void id_protected(OT var1) {
   }

   @Override
   protected void v_() {
      this.id_finally.clear();
      this.id_else = null;
      this.id_implements.id_class(this);
      if (this.id_else == null && !this.id_finally.isEmpty()) {
         this.id_implements.id_class(this.id_finally.values().iterator().next().id_class(), true);
      } else {
         this.id_implements.id_class(this.id_else == null ? null : this.id_else.id_class(), true);
      }
   }

   @Override
   public void w_() {
      super.w_();
      this.id_implements.id_class((AM)null);
      Aq_1 var1 = this.id_volatile.id_void();
      if (var1 != null) {
         var1.id_class(rZc_1.id_break());
      }
   }
}
