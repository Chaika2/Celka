package celestial;

public class Zo_1 extends vm_3 {
   private static final rgP_2 class_ = new rgn_3("jigsaw_block.joint_label");
   private static final rgP_2 throws_ = new rgn_3("jigsaw_block.pool");
   private static final rgP_2 case_ = new rgn_3("jigsaw_block.name");
   private static final rgP_2 catch_ = new rgn_3("jigsaw_block.target");
   private static final rgP_2 private_ = new rgn_3("jigsaw_block.final_state");
   private final rHj_1 implements_;
   private Lu_1 finally_;
   private Lu_1 else_;
   private Lu_1 synchronized_;
   private Lu_1 return_;
   int public_;
   boolean goto_ = true;
   private LF while_;
   private LF try_;
   private rHV instanceof_;

   private void int_() {
      this.try_.int_ = rqO_2.byte_(this.finally_.private_()) && rqO_2.byte_(this.else_.private_()) && rqO_2.byte_(this.synchronized_.private_());
   }

   public Zo_1(rHj_1 var1) {
      super(rgN_2.byte_);
      this.implements_ = var1;
   }

   private rgP_2 interface_() {
      return new rgn_3("jigsaw_block.joint." + this.instanceof_.class_());
   }

   @Override
   public void class_(QY var1, int var2, int var3) {
      String var4 = this.finally_.private_();
      String var5 = this.else_.private_();
      String var6 = this.synchronized_.private_();
      String var7 = this.return_.private_();
      int var8 = this.public_;
      rHV var9 = this.instanceof_;
      this.break_(var1, var2, var3);
      this.finally_.class_(var4);
      this.else_.class_(var5);
      this.synchronized_.class_(var6);
      this.return_.class_(var7);
      this.public_ = var8;
      this.instanceof_ = var9;
      this.while_.break_(this.interface_());
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (super.class_(var1, var2, var3)) {
         return true;
      } else if (this.try_.int_ && (var1 == 257 || var1 == 335)) {
         this.finally_();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      break_(var1, this.super_, throws_, this.package_ / 2 - 153, 10, 10526880);
      this.synchronized_.class_(var1, var2, var3, var4);
      break_(var1, this.super_, case_, this.package_ / 2 - 153, 45, 10526880);
      this.finally_.class_(var1, var2, var3, var4);
      break_(var1, this.super_, catch_, this.package_ / 2 - 153, 80, 10526880);
      this.else_.class_(var1, var2, var3, var4);
      break_(var1, this.super_, private_, this.package_ / 2 - 153, 115, 10526880);
      this.return_.class_(var1, var2, var3, var4);
      if (kW_2.private_(this.implements_.abstract_()).final_().byte_()) {
         break_(var1, this.super_, class_, this.package_ / 2 - 153, 156, 16777215);
      }

      super.class_(var1, var2, var3, var4);
   }

   private void finally_() {
      this.final_();
      this.volatile_.break_(null);
   }

   private void package_() {
      this.volatile_.void_().class_(new rmi_3(this.implements_.char_(), this.public_, this.goto_));
   }

   @Override
   public void private_() {
      this.finally_.catch_();
      this.else_.catch_();
      this.synchronized_.catch_();
      this.return_.catch_();
   }

   private void final_() {
      this.volatile_
         .void_()
         .class_(
            new rZC(
               this.implements_.char_(),
               new rqO_2(this.finally_.private_()),
               new rqO_2(this.else_.private_()),
               new rqO_2(this.synchronized_.private_()),
               this.return_.private_(),
               this.instanceof_
            )
         );
   }

   @Override
   public void volatile_() {
      this.native_();
   }

   private void native_() {
      this.volatile_.break_(null);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      this.synchronized_ = new Lu_1(this.super_, this.package_ / 2 - 152, 20, 300, 20, new rgn_3("jigsaw_block.pool"));
      this.synchronized_.implements_(128);
      this.synchronized_.class_(this.implements_.private_().toString());
      this.synchronized_.class_(var1x -> this.int_());
      this.native_.add(this.synchronized_);
      this.finally_ = new Lu_1(this.super_, this.package_ / 2 - 152, 55, 300, 20, new rgn_3("jigsaw_block.name"));
      this.finally_.implements_(128);
      this.finally_.class_(this.implements_.throws_().toString());
      this.finally_.class_(var1x -> this.int_());
      this.native_.add(this.finally_);
      this.else_ = new Lu_1(this.super_, this.package_ / 2 - 152, 90, 300, 20, new rgn_3("jigsaw_block.target"));
      this.else_.implements_(128);
      this.else_.class_(this.implements_.catch_().toString());
      this.else_.class_(var1x -> this.int_());
      this.native_.add(this.else_);
      this.return_ = new Lu_1(this.super_, this.package_ / 2 - 152, 125, 300, 20, new rgn_3("jigsaw_block.final_state"));
      this.return_.implements_(256);
      this.return_.class_(this.implements_.finally_());
      this.native_.add(this.return_);
      this.instanceof_ = this.implements_.extends_();
      int var1 = this.super_.class_(class_) + 10;
      this.while_ = this.class_((LF)(new LF(this.package_ / 2 - 152 + var1, 150, 300 - var1, 20, this.interface_(), var1x -> {
         rHV[] var2x = rHV.values();
         int var3 = (this.instanceof_.ordinal() + 1) % var2x.length;
         this.instanceof_ = var2x[var3];
         var1x.break_(this.interface_());
      })));
      boolean var2 = kW_2.private_(this.implements_.abstract_()).final_().byte_();
      this.while_.int_ = var2;
      this.while_.new_ = var2;
      this.class_(new ZK(this, this.package_ / 2 - 154, 180, 100, 20, rgN_2.byte_, 0.0));
      this.class_(new ZD(this, this.package_ / 2 - 50, 180, 100, 20, new rgn_3("jigsaw_block.keep_jigsaws"), var1x -> this.goto_ = !this.goto_));
      this.class_((LF)(new LF(this.package_ / 2 + 54, 180, 100, 20, new rgn_3("jigsaw_block.generate"), var1x -> {
         this.finally_();
         this.package_();
      })));
      this.try_ = this.class_((LF)(new LF(this.package_ / 2 - 4 - 150, 210, 150, 20, cN_2.byte_, var1x -> this.finally_())));
      this.class_((LF)(new LF(this.package_ / 2 + 4, 210, 150, 20, cN_2.protected_, var1x -> this.native_())));
      this.break_(this.synchronized_);
      this.int_();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
