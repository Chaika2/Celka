package celestial;

public abstract class mk_3 extends vm_3 {
   private static final rgP_2 id_finally = new rgn_3("advMode.setCommand");
   private static final rgP_2 id_else = new rgn_3("advMode.command");
   private static final rgP_2 id_synchronized = new rgn_3("advMode.previousOutput");
   protected Lu_1 id_class;
   protected Lu_1 id_throws;
   protected LF id_case;
   protected LF id_catch;
   protected LF id_private;
   protected boolean id_implements;
   cW_2 id_return;

   public mk_3() {
      super(rgN_2.id_byte);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, id_finally, this.id_package / 2, 20, 16777215);
      id_break(var1, this.id_super, id_else, this.id_package / 2 - 150, 40, 10526880);
      this.id_class.id_class(var1, var2, var3, var4);
      int var5 = 75;
      if (!this.id_throws.id_private().isEmpty()) {
         var5 += 46 + this.id_finally() - 135;
         id_break(var1, this.id_super, id_synchronized, this.id_package / 2 - 150, var5 + 4, 10526880);
         this.id_throws.id_class(var1, var2, var3, var4);
      }

      super.id_class(var1, var2, var3, var4);
      this.id_return.id_class(var1, var2, var3);
   }

   protected abstract void id_class(rHm_1 var1);

   @Override
   public boolean id_class(double var1, double var3, double var5) {
      return this.id_return.id_class(var5) ? true : super.id_class(var1, var3, var5);
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (this.id_return.id_class(var1, var2, var3)) {
         return true;
      } else if (super.id_class(var1, var2, var3)) {
         return true;
      } else if (var1 != 257 && var1 != 335) {
         return false;
      } else {
         this.id_native();
         return true;
      }
   }

   private void id_class(String var1) {
      this.id_return.id_class();
   }

   @Override
   public void id_class(QY var1, int var2, int var3) {
      String var4 = this.id_class.id_private();
      this.id_break(var1, var2, var3);
      this.id_class.id_class(var4);
      this.id_return.id_class();
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      return this.id_return.id_class(var1, var3, var5) ? true : super.id_break(var1, var3, var5);
   }

   abstract int id_finally();

   protected void id_extends() {
      if (this.id_implements().id_finally()) {
         this.id_private.id_break(new rgN_2("O"));
         this.id_throws.id_class(this.id_implements().id_catch().getString());
      } else {
         this.id_private.id_break(new rgN_2("X"));
         this.id_throws.id_class("-");
      }
   }

   abstract rHm_1 id_implements();

   @Override
   public void id_private() {
      this.id_class.id_catch();
   }

   @Override
   public void id_volatile() {
      this.id_implements().id_class(this.id_implements);
      this.id_volatile.id_break((vm_3)null);
   }

   protected void id_native() {
      rHm_1 var1 = this.id_implements();
      this.id_class(var1);
      if (!var1.id_finally()) {
         var1.id_break((rgP_2)null);
      }

      this.id_volatile.id_break((vm_3)null);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      this.id_case = this.id_class((LF)(new LF(this.id_package / 2 - 4 - 150, this.id_int / 4 + 120 + 12, 150, 20, cN_2.id_byte, var1 -> this.id_native())));
      this.id_catch = this.id_class((LF)(new LF(this.id_package / 2 + 4, this.id_int / 4 + 120 + 12, 150, 20, cN_2.id_protected, var1 -> this.id_volatile())));
      this.id_private = this.id_class((LF)(new LF(this.id_package / 2 + 150 - 20, this.id_finally(), 20, 20, new rgN_2("O"), var1 -> {
         rHm_1 var2 = this.id_implements();
         var2.id_class(!var2.id_finally());
         this.id_extends();
      })));
      this.id_class = new mW_2(this, this.id_super, this.id_package / 2 - 150, 50, 300, 20, new rgn_3("advMode.command"));
      this.id_class.id_implements(32500);
      this.id_class.id_class(this::id_class);
      this.id_native.add(this.id_class);
      this.id_throws = new Lu_1(this.id_super, this.id_package / 2 - 150, this.id_finally(), 276, 20, new rgn_3("advMode.previousOutput"));
      this.id_throws.id_implements(32500);
      this.id_throws.id_case(false);
      this.id_throws.id_class("-");
      this.id_native.add(this.id_throws);
      this.id_break(this.id_class);
      this.id_class.id_byte(true);
      this.id_return = new cW_2(this.id_volatile, this, this.id_class, this.id_super, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.id_return.id_class(true);
      this.id_return.id_class();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
