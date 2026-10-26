package celestial;

public class ZY extends vm_3 {
   private final boolean class_;

   public ZY(boolean var1) {
      super(var1 ? new rgn_3("menu.game") : new rgn_3("menu.paused"));
      this.class_ = var1;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      if (this.class_) {
         this.class_(var1);
         class_(var1, this.super_, this.extends_, this.package_ / 2, 40, 16777215);
      } else {
         class_(var1, this.super_, this.extends_, this.package_ / 2, 10, 16777215);
      }

      super.class_(var1, var2, var3, var4);
   }

   private void finally_() {
      this.class_(new LF(this.package_ / 2 - 102, this.int_ / 4 + 44 - 16, 204, 20, new rgn_3("menu.returnToGame"), var1x -> {
         this.volatile_.break_(null);
         ((Qi_1)this.volatile_.class_[22]).catch_();
      }));
      this.class_(
         new LF(
            this.package_ / 2 - 102,
            this.int_ / 4 + 69 - 16,
            98,
            20,
            new rgn_3("gui.advancements"),
            var1x -> this.volatile_.break_(new ca_3(((Aq_1)((cb_3)this.volatile_.class_[57]).break_[0]).private_()))
         )
      );
      this.class_(
         new LF(
            this.package_ / 2 + 4,
            this.int_ / 4 + 69 - 16,
            98,
            20,
            new rgn_3("gui.stats"),
            var1x -> this.volatile_.break_(new vp_3(this, ((cb_3)this.volatile_.class_[57]).abstract_()))
         )
      );
      this.class_(
         new LF(
            this.package_ / 2 - 102,
            this.int_ / 4 + 94 - 16,
            98,
            20,
            new rgn_3("menu.options"),
            var1x -> this.volatile_.break_(new vM_2(this, (Qw_1)this.volatile_.class_[20]))
         )
      );
      LF var1 = this.class_(
         new LF(this.package_ / 2 + 4, this.int_ / 4 + 94 - 16, 98, 20, new rgn_3("menu.shareToLan"), var1x -> this.volatile_.break_(new vH_2(this)))
      );
      var1.int_ = this.volatile_.finally_() && !this.volatile_.this_().d();
      LF var2 = this.class_(new LF(this.package_ / 2 - 102, this.int_ / 4 + 119 - 16, 204, 20, new rgn_3("menu.returnToMenu"), var1x -> {
         if (rrfZ_2.byte_()) {
            import_.break_(new mT_2(var2x -> {
               if (var2x) {
                  var1x.int_ = false;
                  rrfo_3.case_();
               } else {
                  import_.break_(this);
               }
            }, new rgn_3("quit.confirm.title"), new rgn_3("quit.inpvp.confirm")));
         } else {
            var1x.int_ = false;
            rrfo_3.case_();
         }
      }));
      if (!this.volatile_.switch_()) {
         var2.break_(new rgn_3("menu.disconnect"));
         this.class_(new LF(this.package_ / 2 - 102, this.int_ / 4 + 144 - 16, 204, 20, new rgn_3("menu.reconnect"), var1x -> {
            if (rrfZ_2.byte_()) {
               import_.break_(new mT_2(var2x -> {
                  if (var2x) {
                     var1x.int_ = false;
                     rrfo_3.break_();
                  } else {
                     import_.break_(this);
                  }
               }, new rgn_3("reconnect.confirm.title"), new rgn_3("reconnect.inpvp.confirm")));
            } else {
               rrfo_3.break_();
            }
         }));
      }
   }

   @Override
   protected void v_() {
      if (this.class_) {
         this.finally_();
      }
   }
}
