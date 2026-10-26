package celestial;

import java.util.List;
import java.util.function.Consumer;

public class mg_3 extends vm_3 {
   protected final mo_3 class_;
   private final Consumer<rKQ> throws_;
   rKQ case_;
   private rgP_2 catch_;
   private rgP_2 private_;
   private mR_2 implements_;
   private LF finally_;

   public mg_3(mo_3 var1, Consumer<rKQ> var2, rKQ var3) {
      super(new rgn_3("createWorld.customize.flat.title"));
      this.class_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      this.implements_.class_(var1, var2, var3, var4);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 8, 16777215);
      int var5 = this.package_ / 2 - 92 - 16;
      break_(var1, this.super_, this.catch_, var5, 32, 16777215);
      break_(var1, this.super_, this.private_, var5 + 2 + 213 - this.super_.class_(this.private_), 32, 16777215);
      super.class_(var1, var2, var3, var4);
   }

   public void class_(rKQ var1) {
      this.case_ = var1;
   }

   public rKQ finally_() {
      return this.case_;
   }

   private boolean final_() {
      return this.implements_.finally_() != null;
   }

   @Override
   public void volatile_() {
      this.volatile_.break_(this.class_);
   }

   void native_() {
      this.finally_.int_ = this.final_();
   }

   @Override
   protected void v_() {
      this.catch_ = new rgn_3("createWorld.customize.flat.tile");
      this.private_ = new rgn_3("createWorld.customize.flat.height");
      this.implements_ = new mR_2(this);
      this.native_.add(this.implements_);
      this.finally_ = this.class_((LF)(new LF(this.package_ / 2 - 155, this.int_ - 52, 150, 20, new rgn_3("createWorld.customize.flat.removeLayer"), var1 -> {
         if (this.final_()) {
            List var2 = this.case_.case_();
            int var3 = this.implements_.x_().indexOf(this.implements_.finally_());
            int var4 = var2.size() - var3 - 1;
            var2.remove(var4);
            this.implements_.class_(var2.isEmpty() ? null : this.implements_.x_().get(Math.min(var3, var2.size() - 1)));
            this.case_.private_();
            this.implements_.throws_();
            this.native_();
         }
      })));
      this.class_((LF)(new LF(this.package_ / 2 + 5, this.int_ - 52, 150, 20, new rgn_3("createWorld.customize.presets"), var1 -> {
         this.volatile_.break_(new Zl_1(this));
         this.case_.private_();
         this.native_();
      })));
      this.class_((LF)(new LF(this.package_ / 2 - 155, this.int_ - 28, 150, 20, cN_2.byte_, var1 -> {
         this.throws_.accept(this.case_);
         this.volatile_.break_(this.class_);
         this.case_.private_();
      })));
      this.class_((LF)(new LF(this.package_ / 2 + 5, this.int_ - 28, 150, 20, cN_2.protected_, var1 -> {
         this.volatile_.break_(this.class_);
         this.case_.private_();
      })));
      this.case_.private_();
      this.native_();
   }
}
