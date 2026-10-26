package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Optional;

public class Zt_1 extends vm_3 {
   static final rqO_2 class_ = new rqO_2("textures/gui/container/gamemode_switcher.png");
   private static final int throws_ = ZI.values().length * 30 - 5;
   private static final rgP_2 case_ = new rgn_3("debug.gamemodes.select_next", new rgn_3("debug.gamemodes.press_f4").class_(rgF_2.AQUA));
   private final Optional<ZI> catch_;
   private Optional<ZI> private_ = Optional.empty();
   private int implements_;
   private int finally_;
   private boolean else_;
   private final List<Zf_1> synchronized_ = Lists.newArrayList();

   public Zt_1() {
      super(rgN_2.byte_);
      this.catch_ = ZI.class_(this.finally_());
   }

   private static void class_(QY var0, Optional<ZI> var1) {
      if ((Ax_1)var0.class_[55] != null && (cb_3)var0.class_[57] != null && var1.isPresent()) {
         Optional var2 = ZI.class_(((Ax_1)var0.class_[55]).native_());
         ZI var3 = (ZI)var1.get();
         if (var2.isPresent() && ((cb_3)var0.class_[57]).catch_(2) && var3 != var2.get()) {
            ((cb_3)var0.class_[57]).protected_(var3.break_());
         }
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      if (!this.final_()) {
         var1.class_();
         RenderSystem.enableBlend();
         this.volatile_.A().class_(class_);
         int var5 = this.package_ / 2 - 62;
         int var6 = this.int_ / 2 - 30 - 27;
         class_(var1, var5, var6, 0.0F, 0.0F, 125, 75, 128, 128);
         var1.break_();
         super.class_(var1, var2, var3, var4);
         this.private_.ifPresent(var2x -> class_(var1, this.super_, var2x.class_(), this.package_ / 2, this.int_ / 2 - 30 - 20, -1));
         class_(var1, this.super_, case_, this.package_ / 2, this.int_ / 2 + 5, 16777215);
         if (!this.else_) {
            this.implements_ = var2;
            this.finally_ = var3;
            this.else_ = true;
         }

         boolean var7 = this.implements_ == var2 && this.finally_ == var3;

         for (Zf_1 var9 : this.synchronized_) {
            var9.class_(var1, var2, var3, var4);
            this.private_.ifPresent(var1x -> var9.class_(var1x == var9.throws_));
            if (!var7 && var9.B_()) {
               this.private_ = Optional.of(var9.throws_);
            }
         }
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (var1 == 293 && this.private_.isPresent()) {
         this.else_ = false;
         this.private_ = this.private_.get().byte_();
         return true;
      } else {
         return super.class_(var1, var2, var3);
      }
   }

   private rRl_1 finally_() {
      rRl_1 var1 = ((Ax_1)QY.instanceof_().class_[55]).native_();
      rRl_1 var2 = ((Ax_1)QY.instanceof_().class_[55]).extends_();
      if (var2 == rRl_1.NOT_SET) {
         if (var1 == rRl_1.CREATIVE) {
            var2 = rRl_1.SURVIVAL;
         } else {
            var2 = rRl_1.CREATIVE;
         }
      }

      return var2;
   }

   private boolean final_() {
      if (!Ve_1.class_(this.volatile_.else_().implements_(), 292)) {
         this.native_();
         this.volatile_.break_((vm_3)null);
         return true;
      } else {
         return false;
      }
   }

   private void native_() {
      class_(this.volatile_, this.private_);
   }

   @Override
   protected void v_() {
      super.v_();
      this.private_ = this.catch_.isPresent() ? this.catch_ : ZI.class_(((Ax_1)this.volatile_.class_[55]).native_());

      for (int var1 = 0; var1 < ZI.field_238721_e_.length; var1++) {
         ZI var2 = ZI.field_238721_e_[var1];
         this.synchronized_.add(new Zf_1(this, var2, this.package_ / 2 - throws_ / 2 + var1 * 30, this.int_ / 2 - 30));
      }
   }

   @Override
   public boolean z_() {
      return false;
   }
}
