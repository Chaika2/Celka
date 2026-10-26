package celestial;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class vv_3 extends vm_3 {
   private static final rgP_2 class_ = new rgn_3("addServer.enterIp");
   private LF throws_;
   private final Ak_1 case_;
   private Lu_1 catch_;
   private final BooleanConsumer private_;
   private final vm_3 implements_;

   public vv_3(vm_3 var1, BooleanConsumer var2, Ak_1 var3) {
      super(new rgn_3("selectServer.direct"));
      this.implements_ = var1;
      this.case_ = var3;
      this.private_ = var2;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 20, 16777215);
      break_(var1, this.super_, class_, this.package_ / 2 - 100, 100, 10526880);
      this.catch_.class_(var1, var2, var3, var4);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (this.catch_() == this.catch_ && (var1 == 257 || var1 == 335)) {
         this.finally_();
         return true;
      } else {
         return super.class_(var1, var2, var3);
      }
   }

   @Override
   public void class_(QY var1, int var2, int var3) {
      String var4 = this.catch_.private_();
      this.break_(var1, var2, var3);
      this.catch_.class_(var4);
   }

   private void finally_() {
      this.case_.break_ = this.catch_.private_();
      this.private_.accept(true);
   }

   @Override
   public void private_() {
      this.catch_.catch_();
   }

   @Override
   public void volatile_() {
      this.volatile_.break_(this.implements_);
   }

   private void native_() {
      String var1 = this.catch_.private_();
      this.throws_.int_ = !var1.isEmpty() && var1.split(":").length > 0 && var1.indexOf(32) == -1;
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      this.throws_ = this.class_(
         (LF)(new LF(this.package_ / 2 - 100, this.int_ / 4 + 96 + 12, 200, 20, new rgn_3("selectServer.select"), var1 -> this.finally_()))
      );
      this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ / 4 + 120 + 12, 200, 20, cN_2.protected_, var1 -> this.private_.accept(false))));
      this.catch_ = new Lu_1(this.super_, this.package_ / 2 - 100, 116, 200, 20, new rgn_3("addServer.enterIp"));
      this.catch_.implements_(128);
      this.catch_.byte_(true);
      this.catch_.class_(((Qw_1)this.volatile_.class_[20]).K);
      this.catch_.class_(var1 -> this.native_());
      this.native_.add(this.catch_);
      this.break_(this.catch_);
      this.native_();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
      ((Qw_1)this.volatile_.class_[20]).K = this.catch_.private_();
      ((Qw_1)this.volatile_.class_[20]).break_();
   }
}
