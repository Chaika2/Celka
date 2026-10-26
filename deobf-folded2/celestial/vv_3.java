package celestial;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class vv_3 extends vm_3 {
   private static final rgP_2 id_class = new rgn_3("addServer.enterIp");
   private LF id_throws;
   private final Ak_1 id_case;
   private Lu_1 id_catch;
   private final BooleanConsumer id_private;
   private final vm_3 id_implements;

   public vv_3(vm_3 var1, BooleanConsumer var2, Ak_1 var3) {
      super(new rgn_3("selectServer.direct"));
      this.id_implements = var1;
      this.id_case = var3;
      this.id_private = var2;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 20, 16777215);
      id_break(var1, this.id_super, id_class, this.id_package / 2 - 100, 100, 10526880);
      this.id_catch.id_class(var1, var2, var3, var4);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (this.id_catch() == this.id_catch && (var1 == 257 || var1 == 335)) {
         this.id_finally();
         return true;
      } else {
         return super.id_class(var1, var2, var3);
      }
   }

   @Override
   public void id_class(QY var1, int var2, int var3) {
      String var4 = this.id_catch.id_private();
      this.id_break(var1, var2, var3);
      this.id_catch.id_class(var4);
   }

   private void id_finally() {
      this.id_case.id_break = this.id_catch.id_private();
      this.id_private.accept(true);
   }

   @Override
   public void id_private() {
      this.id_catch.id_catch();
   }

   @Override
   public void id_volatile() {
      this.id_volatile.id_break(this.id_implements);
   }

   private void id_native() {
      String var1 = this.id_catch.id_private();
      this.id_throws.id_int = !var1.isEmpty() && var1.split(":").length > 0 && var1.indexOf(32) == -1;
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      this.id_throws = this.id_class(
         (LF)(new LF(this.id_package / 2 - 100, this.id_int / 4 + 96 + 12, 200, 20, new rgn_3("selectServer.select"), var1 -> this.id_finally()))
      );
      this.id_class((LF)(new LF(this.id_package / 2 - 100, this.id_int / 4 + 120 + 12, 200, 20, cN_2.id_protected, var1 -> this.id_private.accept(false))));
      this.id_catch = new Lu_1(this.id_super, this.id_package / 2 - 100, 116, 200, 20, new rgn_3("addServer.enterIp"));
      this.id_catch.id_implements(128);
      this.id_catch.id_byte(true);
      this.id_catch.id_class(((Qw_1)this.id_volatile.id_class[20]).K);
      this.id_catch.id_class(var1 -> this.id_native());
      this.id_native.add(this.id_catch);
      this.id_break(this.id_catch);
      this.id_native();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
      ((Qw_1)this.id_volatile.id_class[20]).K = this.id_catch.id_private();
      ((Qw_1)this.id_volatile.id_class[20]).id_break();
   }
}
