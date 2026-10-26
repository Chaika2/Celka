package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class vp_3 extends vm_3 implements cy_3 {
   private static final rgP_2 case_ = new rgn_3("multiplayer.downloadingStats");
   protected final vm_3 throws_;
   private vq_3 catch_;
   vI_2 private_;
   private vt_3 implements_;
   final rlP_2 finally_;
   private LV<?> else_;
   private boolean synchronized_ = true;

   void byte_(Ml_1 var1, int var2, int var3, int var4, int var5) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(byte_);
      class_(var1, var2, var3, this.h_(), (float)var4, (float)var5, 18, 18, 128, 128);
   }

   public vp_3(vm_3 var1, rlP_2 var2) {
      super(new rgn_3("gui.stats"));
      this.throws_ = var1;
      this.finally_ = var2;
   }

   public void class_(LV<?> var1) {
      this.native_.remove(this.catch_);
      this.native_.remove(this.private_);
      this.native_.remove(this.implements_);
      if (var1 != null) {
         this.native_.add(0, var1);
         this.else_ = var1;
      }
   }

   void class_(Ml_1 var1, int var2, int var3, rdb_3 var4) {
      this.byte_(var1, var2 + 1, var3 + 1, 0, 0);
      RenderSystem.enableRescaleNormal();
      this.final_.class_(var4.continue_(), (float)(var2 + 2), (float)(var3 + 2));
      RenderSystem.disableRescaleNormal();
   }

   static String class_(rCi_1<rqO_2> var0) {
      return "stat." + ((rqO_2)var0.throws_()).toString().replace(':', '.');
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      if (this.synchronized_) {
         this.class_(var1);
         class_(var1, this.super_, case_, this.package_ / 2, this.int_ / 2, 16777215);
         class_(var1, this.super_, class_[(int)(rqR_2.break_() / 150L % (long)class_.length)], this.package_ / 2, this.int_ / 2 + 18, 16777215);
      } else {
         this.final_().class_(var1, var2, var3, var4);
         class_(var1, this.super_, this.extends_, this.package_ / 2, 20, 16777215);
         super.class_(var1, var2, var3, var4);
      }
   }

   @Override
   public void break_() {
      if (this.synchronized_) {
         this.finally_();
         this.native_();
         this.class_(this.catch_);
         this.synchronized_ = false;
      }
   }

   int break_(int var1) {
      return 115 + 40 * var1;
   }

   public void finally_() {
      this.catch_ = new vq_3(this, this.volatile_);
      this.private_ = new vI_2(this, this.volatile_);
      this.implements_ = new vt_3(this, this.volatile_);
   }

   public LV<?> final_() {
      return this.else_;
   }

   public void native_() {
      this.class_((LF)(new LF(this.package_ / 2 - 120, this.int_ - 52, 80, 20, new rgn_3("stat.generalButton"), var1x -> this.class_(this.catch_))));
      LF var1 = this.class_((LF)(new LF(this.package_ / 2 - 40, this.int_ - 52, 80, 20, new rgn_3("stat.itemsButton"), var1x -> this.class_(this.private_))));
      LF var2 = this.class_((LF)(new LF(this.package_ / 2 + 40, this.int_ - 52, 80, 20, new rgn_3("stat.mobsButton"), var1x -> this.class_(this.implements_))));
      this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ - 28, 200, 20, cN_2.byte_, var1x -> this.volatile_.break_(this.throws_))));
      if (this.private_.x_().isEmpty()) {
         var1.int_ = false;
      }

      if (this.implements_.x_().isEmpty()) {
         var2.int_ = false;
      }
   }

   @Override
   protected void v_() {
      this.synchronized_ = true;
      this.volatile_.void_().class_(new rmI_2(rmf_3.REQUEST_STATS));
   }

   @Override
   public boolean z_() {
      return !this.synchronized_;
   }
}
