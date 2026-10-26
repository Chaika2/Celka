package celestial;

public class ml_3 extends mk_3 {
   private final rHZ finally_;
   private LF else_;
   private LF synchronized_;
   private LF return_;
   private rHF public_ = rHF.REDSTONE;
   private boolean goto_;
   private boolean while_;

   private void char_() {
      if (this.while_) {
         this.return_.break_(new rgn_3("advMode.mode.autoexec.bat"));
      } else {
         this.return_.break_(new rgn_3("advMode.mode.redstoneTriggered"));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void int_() {
      switch (this.public_) {
         case SEQUENCE:
            this.public_ = rHF.AUTO;
            break;
         case AUTO:
            this.public_ = rHF.REDSTONE;
            break;
         case REDSTONE:
            this.public_ = rHF.SEQUENCE;
      }
   }

   public ml_3(rHZ var1) {
      this.finally_ = var1;
   }

   private void interface_() {
      if (this.goto_) {
         this.synchronized_.break_(new rgn_3("advMode.mode.conditional"));
      } else {
         this.synchronized_.break_(new rgn_3("advMode.mode.unconditional"));
      }
   }

   @Override
   protected void class_(rHm_1 var1) {
      this.volatile_.void_().class_(new rZn_1(new rfH_2(var1.byte_()), this.class_.private_(), this.public_, var1.finally_(), this.goto_, this.while_));
   }

   @Override
   public void class_(QY var1, int var2, int var3) {
      super.class_(var1, var2, var3);
      this.extends_();
      this.package_();
      this.interface_();
      this.char_();
      this.case_.int_ = true;
      this.private_.int_ = true;
      this.else_.int_ = true;
      this.synchronized_.int_ = true;
      this.return_.int_ = true;
   }

   @Override
   int finally_() {
      return 135;
   }

   @Override
   rHm_1 implements_() {
      return this.finally_.throws_();
   }

   private void package_() {
      switch (this.public_) {
         case SEQUENCE:
            this.else_.break_(new rgn_3("advMode.mode.sequence"));
            break;
         case AUTO:
            this.else_.break_(new rgn_3("advMode.mode.auto"));
            break;
         case REDSTONE:
            this.else_.break_(new rgn_3("advMode.mode.redstone"));
      }
   }

   public void final_() {
      rHm_1 var1 = this.finally_.throws_();
      this.class_.class_(var1.private_());
      this.implements_ = var1.finally_();
      this.public_ = this.finally_.final_();
      this.goto_ = this.finally_.package_();
      this.while_ = this.finally_.private_();
      this.extends_();
      this.package_();
      this.interface_();
      this.char_();
      this.case_.int_ = true;
      this.private_.int_ = true;
      this.else_.int_ = true;
      this.synchronized_.int_ = true;
      this.return_.int_ = true;
   }

   @Override
   protected void v_() {
      super.v_();
      this.else_ = this.class_((LF)(new LF(this.package_ / 2 - 50 - 100 - 4, 165, 100, 20, new rgn_3("advMode.mode.sequence"), var1 -> {
         this.int_();
         this.package_();
      })));
      this.synchronized_ = this.class_((LF)(new LF(this.package_ / 2 - 50, 165, 100, 20, new rgn_3("advMode.mode.unconditional"), var1 -> {
         this.goto_ = !this.goto_;
         this.interface_();
      })));
      this.return_ = this.class_((LF)(new LF(this.package_ / 2 + 50 + 4, 165, 100, 20, new rgn_3("advMode.mode.redstoneTriggered"), var1 -> {
         this.while_ = !this.while_;
         this.char_();
      })));
      this.case_.int_ = false;
      this.private_.int_ = false;
      this.else_.int_ = false;
      this.synchronized_.int_ = false;
      this.return_.int_ = false;
   }
}
