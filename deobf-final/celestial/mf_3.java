package celestial;

import java.util.Objects;
import java.util.function.Consumer;

public class mf_3 extends vm_3 {
   private static final rgP_2 class_ = new rgn_3("createWorld.customize.buffet.biome");
   private final vm_3 throws_;
   private final Consumer<rYG> case_;
   final rVF<rYG> catch_;
   private mj_3 private_;
   rYG implements_;
   private LF finally_;

   public mf_3(vm_3 var1, rVm_1 var2, Consumer<rYG> var3, rYG var4) {
      super(new rgn_3("createWorld.customize.buffet.title"));
      this.throws_ = var1;
      this.case_ = var3;
      this.implements_ = var4;
      this.catch_ = var2.break_(rVL.n);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.protected_(0);
      this.private_.class_(var1, var2, var3, var4);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 8, 16777215);
      class_(var1, this.super_, class_, this.package_ / 2, 28, 10526880);
      super.class_(var1, var2, var3, var4);
   }

   void finally_() {
      this.finally_.int_ = this.private_.finally_() != null;
   }

   @Override
   public void volatile_() {
      this.volatile_.break_(this.throws_);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      this.private_ = new mj_3(this);
      this.native_.add(this.private_);
      this.finally_ = this.class_((LF)(new LF(this.package_ / 2 - 155, this.int_ - 28, 150, 20, cN_2.byte_, var1 -> {
         this.case_.accept(this.implements_);
         this.volatile_.break_(this.throws_);
      })));
      this.class_((LF)(new LF(this.package_ / 2 + 5, this.int_ - 28, 150, 20, cN_2.protected_, var1 -> this.volatile_.break_(this.throws_))));
      this.private_.class_(this.private_.x_().stream().filter(var1 -> Objects.equals(var1.break_, this.implements_)).findFirst().orElse((mV_2)null));
   }
}
