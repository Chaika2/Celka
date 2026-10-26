package celestial;

public class ZY extends vm_3 {
   private final boolean id_class;

   public ZY(boolean var1) {
      super(var1 ? new rgn_3("menu.game") : new rgn_3("menu.paused"));
      this.id_class = var1;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      if (this.id_class) {
         this.id_class(var1);
         id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 40, 16777215);
      } else {
         id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 10, 16777215);
      }

      super.id_class(var1, var2, var3, var4);
   }

   private void id_finally() {
      this.id_class(new LF(this.id_package / 2 - 102, this.id_int / 4 + 44 - 16, 204, 20, new rgn_3("menu.returnToGame"), var1x -> {
         this.id_volatile.id_break(null);
         ((Qi_1)this.id_volatile.id_class[22]).id_catch();
      }));
      this.id_class(
         new LF(
            this.id_package / 2 - 102,
            this.id_int / 4 + 69 - 16,
            98,
            20,
            new rgn_3("gui.advancements"),
            var1x -> this.id_volatile.id_break(new ca_3(((Aq_1)((cb_3)this.id_volatile.id_class[57]).id_break[0]).id_private()))
         )
      );
      this.id_class(
         new LF(
            this.id_package / 2 + 4,
            this.id_int / 4 + 69 - 16,
            98,
            20,
            new rgn_3("gui.stats"),
            var1x -> this.id_volatile.id_break(new vp_3(this, ((cb_3)this.id_volatile.id_class[57]).id_abstract()))
         )
      );
      this.id_class(
         new LF(
            this.id_package / 2 - 102,
            this.id_int / 4 + 94 - 16,
            98,
            20,
            new rgn_3("menu.options"),
            var1x -> this.id_volatile.id_break(new vM_2(this, (Qw_1)this.id_volatile.id_class[20]))
         )
      );
      LF var1 = this.id_class(
         new LF(this.id_package / 2 + 4, this.id_int / 4 + 94 - 16, 98, 20, new rgn_3("menu.shareToLan"), var1x -> this.id_volatile.id_break(new vH_2(this)))
      );
      var1.id_int = this.id_volatile.id_finally() && !this.id_volatile.id_this().d();
      LF var2 = this.id_class(new LF(this.id_package / 2 - 102, this.id_int / 4 + 119 - 16, 204, 20, new rgn_3("menu.returnToMenu"), var1x -> {
         if (rrfZ_2.id_byte()) {
            id_import.id_break(new mT_2(var2x -> {
               if (var2x) {
                  var1x.id_int = false;
                  rrfo_3.id_case();
               } else {
                  id_import.id_break(this);
               }
            }, new rgn_3("quit.confirm.title"), new rgn_3("quit.inpvp.confirm")));
         } else {
            var1x.id_int = false;
            rrfo_3.id_case();
         }
      }));
      if (!this.id_volatile.id_switch()) {
         var2.id_break(new rgn_3("menu.disconnect"));
         this.id_class(new LF(this.id_package / 2 - 102, this.id_int / 4 + 144 - 16, 204, 20, new rgn_3("menu.reconnect"), var1x -> {
            if (rrfZ_2.id_byte()) {
               id_import.id_break(new mT_2(var2x -> {
                  if (var2x) {
                     var1x.id_int = false;
                     rrfo_3.id_break();
                  } else {
                     id_import.id_break(this);
                  }
               }, new rgn_3("reconnect.confirm.title"), new rgn_3("reconnect.inpvp.confirm")));
            } else {
               rrfo_3.id_break();
            }
         }));
      }
   }

   @Override
   protected void v_() {
      if (this.id_class) {
         this.id_finally();
      }
   }
}
