package celestial;

public class ml_3 extends mk_3 {
   private final rHZ id_finally;
   private LF id_else;
   private LF id_synchronized;
   private LF id_return;
   private rHF id_public = rHF.REDSTONE;
   private boolean id_goto;
   private boolean id_while;

   private void id_char() {
      if (this.id_while) {
         this.id_return.id_break(new rgn_3("advMode.mode.autoexec.bat"));
      } else {
         this.id_return.id_break(new rgn_3("advMode.mode.redstoneTriggered"));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void id_int() {
      switch (this.id_public) {
         case SEQUENCE:
            this.id_public = rHF.AUTO;
            break;
         case AUTO:
            this.id_public = rHF.REDSTONE;
            break;
         case REDSTONE:
            this.id_public = rHF.SEQUENCE;
      }
   }

   public ml_3(rHZ var1) {
      this.id_finally = var1;
   }

   private void id_interface() {
      if (this.id_goto) {
         this.id_synchronized.id_break(new rgn_3("advMode.mode.conditional"));
      } else {
         this.id_synchronized.id_break(new rgn_3("advMode.mode.unconditional"));
      }
   }

   @Override
   protected void id_class(rHm_1 var1) {
      this.id_volatile
         .id_void()
         .id_class(new rZn_1(new rfH_2(var1.id_byte()), this.id_class.id_private(), this.id_public, var1.id_finally(), this.id_goto, this.id_while));
   }

   @Override
   public void id_class(QY var1, int var2, int var3) {
      super.id_class(var1, var2, var3);
      this.id_extends();
      this.id_package();
      this.id_interface();
      this.id_char();
      this.id_case.id_int = true;
      this.id_private.id_int = true;
      this.id_else.id_int = true;
      this.id_synchronized.id_int = true;
      this.id_return.id_int = true;
   }

   @Override
   int id_finally() {
      return 135;
   }

   @Override
   rHm_1 id_implements() {
      return this.id_finally.id_throws();
   }

   private void id_package() {
      switch (this.id_public) {
         case SEQUENCE:
            this.id_else.id_break(new rgn_3("advMode.mode.sequence"));
            break;
         case AUTO:
            this.id_else.id_break(new rgn_3("advMode.mode.auto"));
            break;
         case REDSTONE:
            this.id_else.id_break(new rgn_3("advMode.mode.redstone"));
      }
   }

   public void id_final() {
      rHm_1 var1 = this.id_finally.id_throws();
      this.id_class.id_class(var1.id_private());
      this.id_implements = var1.id_finally();
      this.id_public = this.id_finally.id_final();
      this.id_goto = this.id_finally.id_package();
      this.id_while = this.id_finally.id_private();
      this.id_extends();
      this.id_package();
      this.id_interface();
      this.id_char();
      this.id_case.id_int = true;
      this.id_private.id_int = true;
      this.id_else.id_int = true;
      this.id_synchronized.id_int = true;
      this.id_return.id_int = true;
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_else = this.id_class((LF)(new LF(this.id_package / 2 - 50 - 100 - 4, 165, 100, 20, new rgn_3("advMode.mode.sequence"), var1 -> {
         this.id_int();
         this.id_package();
      })));
      this.id_synchronized = this.id_class((LF)(new LF(this.id_package / 2 - 50, 165, 100, 20, new rgn_3("advMode.mode.unconditional"), var1 -> {
         this.id_goto = !this.id_goto;
         this.id_interface();
      })));
      this.id_return = this.id_class((LF)(new LF(this.id_package / 2 + 50 + 4, 165, 100, 20, new rgn_3("advMode.mode.redstoneTriggered"), var1 -> {
         this.id_while = !this.id_while;
         this.id_char();
      })));
      this.id_case.id_int = false;
      this.id_private.id_int = false;
      this.id_else.id_int = false;
      this.id_synchronized.id_int = false;
      this.id_return.id_int = false;
   }
}
