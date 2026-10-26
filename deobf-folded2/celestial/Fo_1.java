package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class Fo_1 extends Lj_1<Fo_1> {
   private final QY id_case;
   private final List<cC_2> id_catch;
   private final UUID id_private;
   private final String id_implements;
   private final Supplier<rqO_2> id_finally;
   private boolean id_extends;
   private LF id_native;
   private LF id_volatile;
   private final List<rpl_3> id_final;
   private final List<rpl_3> id_package;
   private float id_int;
   private static final rgP_2 id_new = new rgn_3("gui.socialInteractions.status_hidden").id_class(rgF_2.ITALIC);
   private static final rgP_2 id_continue = new rgn_3("gui.socialInteractions.status_blocked").id_class(rgF_2.ITALIC);
   private static final rgP_2 id_super = new rgn_3("gui.socialInteractions.status_offline").id_class(rgF_2.ITALIC);
   private static final rgP_2 id_this = new rgn_3("gui.socialInteractions.status_hidden_offline").id_class(rgF_2.ITALIC);
   private static final rgP_2 id_else = new rgn_3("gui.socialInteractions.status_blocked_offline").id_class(rgF_2.ITALIC);
   public static final int id_class = ryj_3.id_class(190, 0, 0, 0);
   public static final int id_break = ryj_3.id_class(255, 74, 74, 74);
   public static final int id_byte = ryj_3.id_class(255, 48, 48, 48);
   public static final int id_protected = ryj_3.id_class(255, 255, 255, 255);
   public static final int id_throws = ryj_3.id_class(140, 255, 255, 255);

   public void id_byte(boolean var1) {
      this.id_extends = var1;
   }

   public Fo_1(QY var1, Fe_1 var2, UUID var3, String var4, Supplier<rqO_2> var5) {
      this.id_case = var1;
      this.id_private = var3;
      this.id_implements = var4;
      this.id_finally = var5;
      this.id_final = ((cm_3)var1.id_class[15]).id_break(new rgn_3("gui.socialInteractions.tooltip.hide", var4), 150);
      this.id_package = ((cm_3)var1.id_class[15]).id_break(new rgn_3("gui.socialInteractions.tooltip.show", var4), 150);
      FU var6 = var1.id_volatile();
      if (!((cb_3)var1.id_class[57]).sv().getId().equals(var3) && !var6.id_throws(var3)) {
         this.id_native = new FK(this, 0, 0, 20, 20, 0, 38, 20, Fe_1.id_class, 256, 256, var4x -> {
            var6.id_class(var3);
            this.id_class(true, new rgn_3("gui.socialInteractions.hidden_in_chat", var4));
         }, (var3x, var4x, var5x, var6x) -> {
            this.id_int = this.id_int + var1.id_default();
            if (this.id_int >= 10.0F) {
               var2.id_class(() -> id_class(var2, var4x, this.id_final, var5x, var6x));
            }
         }, new rgn_3("gui.socialInteractions.hide"));
         this.id_volatile = new FD(this, 0, 0, 20, 20, 20, 38, 20, Fe_1.id_class, 256, 256, var4x -> {
            var6.id_break(var3);
            this.id_class(false, new rgn_3("gui.socialInteractions.shown_in_chat", var4));
         }, (var3x, var4x, var5x, var6x) -> {
            this.id_int = this.id_int + var1.id_default();
            if (this.id_int >= 10.0F) {
               var2.id_class(() -> id_class(var2, var4x, this.id_package, var5x, var6x));
            }
         }, new rgn_3("gui.socialInteractions.show"));
         this.id_volatile.id_new = var6.id_protected(var3);
         this.id_native.id_new = !this.id_volatile.id_new;
         this.id_catch = ImmutableList.of(this.id_native, this.id_volatile);
      } else {
         this.id_catch = ImmutableList.of();
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      int var11 = var4 + 4;
      int var12 = var3 + (var6 - 24) / 2;
      int var13 = var11 + 24 + 4;
      rgP_2 var14 = this.id_protected();
      int var15;
      if (var14 == rgN_2.id_byte) {
         ch_3.id_class(var1, var4, var3, var4 + var5, var3 + var6, id_break);
         var15 = var3 + (var6 - 9) / 2;
      } else {
         ch_3.id_class(var1, var4, var3, var4 + var5, var3 + var6, id_byte);
         var15 = var3 + (var6 - 18) / 2;
         ((cm_3)this.id_case.id_class[15]).id_byte(var1, var14, (float)var13, (float)(var15 + 12), id_throws);
      }

      this.id_case.A().id_class(this.id_finally.get());
      ch_3.id_class(var1, var11, var12, 24, 24, 8.0F, 8.0F, 8, 8, 64, 64);
      RenderSystem.enableBlend();
      ch_3.id_class(var1, var11, var12, 24, 24, 40.0F, 8.0F, 8, 8, 64, 64);
      RenderSystem.disableBlend();
      ((cm_3)this.id_case.id_class[15]).id_break(var1, this.id_implements, (float)var13, (float)var15, id_protected);
      if (this.id_extends) {
         ch_3.id_class(var1, var11, var12, var11 + 24, var12 + 24, id_class);
      }

      if (this.id_native != null && this.id_volatile != null) {
         float var16 = this.id_int;
         this.id_native.id_volatile = var4 + (var5 - this.id_native.id_case() - 4);
         this.id_native.id_final = var3 + (var6 - this.id_native.id_else()) / 2;
         this.id_native.id_class(var1, var7, var8, var10);
         this.id_volatile.id_volatile = var4 + (var5 - this.id_volatile.id_case() - 4);
         this.id_volatile.id_final = var3 + (var6 - this.id_volatile.id_else()) / 2;
         this.id_volatile.id_class(var1, var7, var8, var10);
         if (var16 == this.id_int) {
            this.id_int = 0.0F;
         }
      }
   }

   private static void id_class(Fe_1 var0, Ml_1 var1, List<rpl_3> var2, int var3, int var4) {
      var0.id_break(var1, var2, var3, var4);
      var0.id_class(null);
   }

   public String id_class() {
      return this.id_implements;
   }

   private void id_class(boolean var1, rgP_2 var2) {
      this.id_volatile.id_new = var1;
      this.id_native.id_new = !var1;
      ((cq_3)this.id_case.id_class[19]).id_throws().id_class(var2);
   }

   rVi_1 id_class(rVi_1 var1) {
      rgP_2 var2 = this.id_protected();
      return var2 == rgN_2.id_byte
         ? new rgN_2(this.id_implements).id_break(", ").id_class(var1)
         : new rgN_2(this.id_implements).id_break(", ").id_class(var2).id_break(", ").id_class(var1);
   }

   public UUID id_break() {
      return this.id_private;
   }

   private rgP_2 id_protected() {
      boolean var1 = this.id_case.id_volatile().id_protected(this.id_private);
      boolean var2 = this.id_case.id_volatile().id_throws(this.id_private);
      if (var2 && this.id_extends) {
         return id_else;
      } else if (var1 && this.id_extends) {
         return id_this;
      } else if (var2) {
         return id_continue;
      } else if (var1) {
         return id_new;
      } else {
         return this.id_extends ? id_super : rgN_2.id_byte;
      }
   }

   @Override
   public List<? extends cC_2> x_() {
      return this.id_catch;
   }
}
