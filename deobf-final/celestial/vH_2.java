package celestial;

public class vH_2 extends vm_3 {
   private static final rgP_2 class_ = new rgn_3("selectWorld.allowCommands");
   private static final rgP_2 throws_ = new rgn_3("selectWorld.gameMode");
   private static final rgP_2 case_ = new rgn_3("lanServer.otherPlayers");
   private final vm_3 catch_;
   private LF private_;
   private LF implements_;
   private String finally_ = "survival";
   private boolean else_;

   public vH_2(vm_3 var1) {
      super(new rgn_3("lanServer.title"));
      this.catch_ = var1;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 50, 16777215);
      class_(var1, this.super_, case_, this.package_ / 2, 82, 16777215);
      super.class_(var1, var2, var3, var4);
   }

   private void finally_() {
      this.implements_.break_(new rgn_3("options.generic_value", throws_, new rgn_3("selectWorld.gameMode." + this.finally_)));
      this.private_.break_(cN_2.class_(class_, this.else_));
   }

   @Override
   protected void v_() {
      this.class_(new LF(this.package_ / 2 - 155, this.int_ - 28, 150, 20, new rgn_3("lanServer.start"), var1 -> {
         this.volatile_.break_((vm_3)null);
         int var2 = rpu_3.class_();
         rgn_3 var3;
         if (this.volatile_.this_().class_(rRl_1.class_(this.finally_), this.else_, var2)) {
            var3 = new rgn_3("commands.publish.started", var2);
         } else {
            var3 = new rgn_3("commands.publish.failed");
         }

         ((cq_3)this.volatile_.class_[19]).throws_().class_(var3);
         this.volatile_.implements_();
      }));
      this.class_(new LF(this.package_ / 2 + 5, this.int_ - 28, 150, 20, cN_2.protected_, var1 -> this.volatile_.break_(this.catch_)));
      this.implements_ = this.class_(new LF(this.package_ / 2 - 155, 100, 150, 20, rgN_2.byte_, var1 -> {
         if ("spectator".equals(this.finally_)) {
            this.finally_ = "creative";
         } else if ("creative".equals(this.finally_)) {
            this.finally_ = "adventure";
         } else if ("adventure".equals(this.finally_)) {
            this.finally_ = "survival";
         } else {
            this.finally_ = "spectator";
         }

         this.finally_();
      }));
      this.private_ = this.class_(new LF(this.package_ / 2 + 5, 100, 150, 20, class_, var1 -> {
         this.else_ = !this.else_;
         this.finally_();
      }));
      this.finally_();
   }
}
