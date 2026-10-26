package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Optional;

public class Zt_1 extends vm_3 {
   static final rqO_2 id_class = new rqO_2("textures/gui/container/gamemode_switcher.png");
   private static final int id_throws = ZI.values().length * 30 - 5;
   private static final rgP_2 id_case = new rgn_3("debug.gamemodes.select_next", new rgn_3("debug.gamemodes.press_f4").id_class(rgF_2.AQUA));
   private final Optional<ZI> id_catch;
   private Optional<ZI> id_private = Optional.empty();
   private int id_implements;
   private int id_finally;
   private boolean id_else;
   private final List<Zf_1> id_synchronized = Lists.newArrayList();

   public Zt_1() {
      super(rgN_2.id_byte);
      this.id_catch = ZI.id_class(this.id_finally());
   }

   private static void id_class(QY var0, Optional<ZI> var1) {
      if ((Ax_1)var0.id_class[55] != null && (cb_3)var0.id_class[57] != null && var1.isPresent()) {
         Optional var2 = ZI.id_class(((Ax_1)var0.id_class[55]).id_native());
         ZI var3 = (ZI)var1.get();
         if (var2.isPresent() && ((cb_3)var0.id_class[57]).id_catch(2) && var3 != var2.get()) {
            ((cb_3)var0.id_class[57]).id_protected(var3.id_break());
         }
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      if (!this.id_final()) {
         var1.id_class();
         RenderSystem.enableBlend();
         this.id_volatile.A().id_class(id_class);
         int var5 = this.id_package / 2 - 62;
         int var6 = this.id_int / 2 - 30 - 27;
         id_class(var1, var5, var6, 0.0F, 0.0F, 125, 75, 128, 128);
         var1.id_break();
         super.id_class(var1, var2, var3, var4);
         this.id_private.ifPresent(var2x -> id_class(var1, this.id_super, var2x.id_class(), this.id_package / 2, this.id_int / 2 - 30 - 20, -1));
         id_class(var1, this.id_super, id_case, this.id_package / 2, this.id_int / 2 + 5, 16777215);
         if (!this.id_else) {
            this.id_implements = var2;
            this.id_finally = var3;
            this.id_else = true;
         }

         boolean var7 = this.id_implements == var2 && this.id_finally == var3;

         for (Zf_1 var9 : this.id_synchronized) {
            var9.id_class(var1, var2, var3, var4);
            this.id_private.ifPresent(var1x -> var9.id_class(var1x == var9.id_throws));
            if (!var7 && var9.B_()) {
               this.id_private = Optional.of(var9.id_throws);
            }
         }
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (var1 == 293 && this.id_private.isPresent()) {
         this.id_else = false;
         this.id_private = this.id_private.get().id_byte();
         return true;
      } else {
         return super.id_class(var1, var2, var3);
      }
   }

   private rRl_1 id_finally() {
      rRl_1 var1 = ((Ax_1)QY.id_instanceof().id_class[55]).id_native();
      rRl_1 var2 = ((Ax_1)QY.id_instanceof().id_class[55]).id_extends();
      if (var2 == rRl_1.NOT_SET) {
         if (var1 == rRl_1.CREATIVE) {
            var2 = rRl_1.SURVIVAL;
         } else {
            var2 = rRl_1.CREATIVE;
         }
      }

      return var2;
   }

   private boolean id_final() {
      if (!Ve_1.id_class(this.id_volatile.id_else().id_implements(), 292)) {
         this.id_native();
         this.id_volatile.id_break((vm_3)null);
         return true;
      } else {
         return false;
      }
   }

   private void id_native() {
      id_class(this.id_volatile, this.id_private);
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_private = this.id_catch.isPresent() ? this.id_catch : ZI.id_class(((Ax_1)this.id_volatile.id_class[55]).id_native());

      for (int var1 = 0; var1 < ZI.field_238721_e_.length; var1++) {
         ZI var2 = ZI.field_238721_e_[var1];
         this.id_synchronized.add(new Zf_1(this, var2, this.id_package / 2 - id_throws / 2 + var1 * 30, this.id_int / 2 - 30));
      }
   }

   @Override
   public boolean z_() {
      return false;
   }
}
