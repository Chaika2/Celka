package celestial;

public class Zo_1 extends vm_3 {
   private static final rgP_2 id_class = new rgn_3("jigsaw_block.joint_label");
   private static final rgP_2 id_throws = new rgn_3("jigsaw_block.pool");
   private static final rgP_2 id_case = new rgn_3("jigsaw_block.name");
   private static final rgP_2 id_catch = new rgn_3("jigsaw_block.target");
   private static final rgP_2 id_private = new rgn_3("jigsaw_block.final_state");
   private final rHj_1 id_implements;
   private Lu_1 id_finally;
   private Lu_1 id_else;
   private Lu_1 id_synchronized;
   private Lu_1 id_return;
   int id_public;
   boolean id_goto = true;
   private LF id_while;
   private LF id_try;
   private rHV id_instanceof;

   private void id_int() {
      this.id_try.id_int = rqO_2.id_byte(this.id_finally.id_private())
         && rqO_2.id_byte(this.id_else.id_private())
         && rqO_2.id_byte(this.id_synchronized.id_private());
   }

   public Zo_1(rHj_1 var1) {
      super(rgN_2.id_byte);
      this.id_implements = var1;
   }

   private rgP_2 id_interface() {
      return new rgn_3("jigsaw_block.joint." + this.id_instanceof.id_class());
   }

   @Override
   public void id_class(QY var1, int var2, int var3) {
      String var4 = this.id_finally.id_private();
      String var5 = this.id_else.id_private();
      String var6 = this.id_synchronized.id_private();
      String var7 = this.id_return.id_private();
      int var8 = this.id_public;
      rHV var9 = this.id_instanceof;
      this.id_break(var1, var2, var3);
      this.id_finally.id_class(var4);
      this.id_else.id_class(var5);
      this.id_synchronized.id_class(var6);
      this.id_return.id_class(var7);
      this.id_public = var8;
      this.id_instanceof = var9;
      this.id_while.id_break(this.id_interface());
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (super.id_class(var1, var2, var3)) {
         return true;
      } else if (this.id_try.id_int && (var1 == 257 || var1 == 335)) {
         this.id_finally();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_break(var1, this.id_super, id_throws, this.id_package / 2 - 153, 10, 10526880);
      this.id_synchronized.id_class(var1, var2, var3, var4);
      id_break(var1, this.id_super, id_case, this.id_package / 2 - 153, 45, 10526880);
      this.id_finally.id_class(var1, var2, var3, var4);
      id_break(var1, this.id_super, id_catch, this.id_package / 2 - 153, 80, 10526880);
      this.id_else.id_class(var1, var2, var3, var4);
      id_break(var1, this.id_super, id_private, this.id_package / 2 - 153, 115, 10526880);
      this.id_return.id_class(var1, var2, var3, var4);
      if (kW_2.id_private(this.id_implements.id_abstract()).id_final().id_byte()) {
         id_break(var1, this.id_super, id_class, this.id_package / 2 - 153, 156, 16777215);
      }

      super.id_class(var1, var2, var3, var4);
   }

   private void id_finally() {
      this.id_final();
      this.id_volatile.id_break(null);
   }

   private void id_package() {
      this.id_volatile.id_void().id_class(new rmi_3(this.id_implements.id_char(), this.id_public, this.id_goto));
   }

   @Override
   public void id_private() {
      this.id_finally.id_catch();
      this.id_else.id_catch();
      this.id_synchronized.id_catch();
      this.id_return.id_catch();
   }

   private void id_final() {
      this.id_volatile
         .id_void()
         .id_class(
            new rZC(
               this.id_implements.id_char(),
               new rqO_2(this.id_finally.id_private()),
               new rqO_2(this.id_else.id_private()),
               new rqO_2(this.id_synchronized.id_private()),
               this.id_return.id_private(),
               this.id_instanceof
            )
         );
   }

   @Override
   public void id_volatile() {
      this.id_native();
   }

   private void id_native() {
      this.id_volatile.id_break(null);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      this.id_synchronized = new Lu_1(this.id_super, this.id_package / 2 - 152, 20, 300, 20, new rgn_3("jigsaw_block.pool"));
      this.id_synchronized.id_implements(128);
      this.id_synchronized.id_class(this.id_implements.id_private().toString());
      this.id_synchronized.id_class(var1x -> this.id_int());
      this.id_native.add(this.id_synchronized);
      this.id_finally = new Lu_1(this.id_super, this.id_package / 2 - 152, 55, 300, 20, new rgn_3("jigsaw_block.name"));
      this.id_finally.id_implements(128);
      this.id_finally.id_class(this.id_implements.id_throws().toString());
      this.id_finally.id_class(var1x -> this.id_int());
      this.id_native.add(this.id_finally);
      this.id_else = new Lu_1(this.id_super, this.id_package / 2 - 152, 90, 300, 20, new rgn_3("jigsaw_block.target"));
      this.id_else.id_implements(128);
      this.id_else.id_class(this.id_implements.id_catch().toString());
      this.id_else.id_class(var1x -> this.id_int());
      this.id_native.add(this.id_else);
      this.id_return = new Lu_1(this.id_super, this.id_package / 2 - 152, 125, 300, 20, new rgn_3("jigsaw_block.final_state"));
      this.id_return.id_implements(256);
      this.id_return.id_class(this.id_implements.id_finally());
      this.id_native.add(this.id_return);
      this.id_instanceof = this.id_implements.id_extends();
      int var1 = this.id_super.id_class(id_class) + 10;
      this.id_while = this.id_class((LF)(new LF(this.id_package / 2 - 152 + var1, 150, 300 - var1, 20, this.id_interface(), var1x -> {
         rHV[] var2x = rHV.values();
         int var3 = (this.id_instanceof.ordinal() + 1) % var2x.length;
         this.id_instanceof = var2x[var3];
         var1x.id_break(this.id_interface());
      })));
      boolean var2 = kW_2.id_private(this.id_implements.id_abstract()).id_final().id_byte();
      this.id_while.id_int = var2;
      this.id_while.id_new = var2;
      this.id_class(new ZK(this, this.id_package / 2 - 154, 180, 100, 20, rgN_2.id_byte, 0.0));
      this.id_class(new ZD(this, this.id_package / 2 - 50, 180, 100, 20, new rgn_3("jigsaw_block.keep_jigsaws"), var1x -> this.id_goto = !this.id_goto));
      this.id_class((LF)(new LF(this.id_package / 2 + 54, 180, 100, 20, new rgn_3("jigsaw_block.generate"), var1x -> {
         this.id_finally();
         this.id_package();
      })));
      this.id_try = this.id_class((LF)(new LF(this.id_package / 2 - 4 - 150, 210, 150, 20, cN_2.id_byte, var1x -> this.id_finally())));
      this.id_class((LF)(new LF(this.id_package / 2 + 4, 210, 150, 20, cN_2.id_protected, var1x -> this.id_native())));
      this.id_break(this.id_synchronized);
      this.id_int();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
