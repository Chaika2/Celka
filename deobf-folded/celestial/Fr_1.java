package celestial;

import java.util.List;

public class Fr_1 extends vm_3 {
   protected final vm_3 id_class;
   private List<rpl_3> id_case;
   private LF id_catch;
   private LF id_private;
   private LF id_implements;
   private LF id_finally;
   protected Lu_1 id_throws;
   private va_3 id_else;

   @Override
   public void id_byte(boolean var1) {
      this.id_private.id_int = var1;
      this.id_catch.id_int = var1;
      this.id_implements.id_int = var1;
      this.id_finally.id_int = var1;
   }

   public Fr_1(vm_3 var1) {
      super(new rgn_3("selectWorld.title"));
      this.id_class = var1;
   }

   @Override
   public boolean id_class(double var1, double var3, double var5) {
      return super.id_class(var1, var3, var5);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_case = null;
      this.id_else.id_class(var1, var2, var3, var4);
      this.id_throws.id_class(var1, var2, var3, var4);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 8, 16777215);
      super.id_class(var1, var2, var3, var4);
      if (this.id_case != null) {
         this.id_break(var1, this.id_case, var2, var3);
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      return super.id_class(var1, var2, var3) ? true : this.id_throws.id_class(var1, var2, var3);
   }

   @Override
   public boolean id_class(char var1, int var2) {
      return this.id_throws.id_class(var1, var2);
   }

   public void id_break(List<rpl_3> var1) {
      this.id_case = var1;
   }

   @Override
   public void id_private() {
      this.id_throws.id_catch();
   }

   @Override
   public void id_volatile() {
      this.id_volatile.id_break(this.id_class);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      this.id_throws = new Lu_1(this.id_super, this.id_package / 2 - 100, 22, 200, 20, this.id_throws, new rgn_3("selectWorld.search"), true);
      this.id_throws.id_class(var1 -> this.id_else.id_class(() -> var1, false));
      this.id_else = new va_3(this, this.id_volatile, this.id_package, this.id_int, 48, this.id_int - 64, 36, () -> this.id_throws.id_private(), this.id_else);
      this.id_native.add(this.id_throws);
      this.id_native.add(this.id_else);
      this.id_private = this.id_class(
         (LF)(new LF(
            this.id_package / 2 - 154, this.id_int - 52, 150, 20, new rgn_3("selectWorld.select"), var1 -> this.id_else.id_private().ifPresent(vi_3::id_class)
         ))
      );
      this.id_class(
         (LF)(new LF(
            this.id_package / 2 + 4, this.id_int - 52, 150, 20, new rgn_3("selectWorld.create"), var1 -> this.id_volatile.id_break(mo_3.id_class(this))
         ))
      );
      this.id_implements = this.id_class(
         (LF)(new LF(
            this.id_package / 2 - 154, this.id_int - 28, 72, 20, new rgn_3("selectWorld.edit"), var1 -> this.id_else.id_private().ifPresent(vi_3::id_byte)
         ))
      );
      this.id_catch = this.id_class(
         (LF)(new LF(
            this.id_package / 2 - 76, this.id_int - 28, 72, 20, new rgn_3("selectWorld.delete"), var1 -> this.id_else.id_private().ifPresent(vi_3::id_break)
         ))
      );
      this.id_finally = this.id_class(
         (LF)(new LF(
            this.id_package / 2 + 4,
            this.id_int - 28,
            72,
            20,
            new rgn_3("selectWorld.recreate"),
            var1 -> this.id_else.id_private().ifPresent(vi_3::id_protected)
         ))
      );
      this.id_class((LF)(new LF(this.id_package / 2 + 82, this.id_int - 28, 72, 20, cN_2.id_protected, var1 -> this.id_volatile.id_break(this.id_class))));
      this.id_byte(false);
      this.id_break(this.id_throws);
   }

   @Override
   public void w_() {
      super.w_();
      if (this.id_else != null) {
         this.id_else.x_().forEach(vi_3::close);
      }
   }
}
