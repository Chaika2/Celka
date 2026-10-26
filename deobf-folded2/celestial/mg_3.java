package celestial;

import java.util.List;
import java.util.function.Consumer;

public class mg_3 extends vm_3 {
   protected final mo_3 id_class;
   private final Consumer<rKQ> id_throws;
   rKQ id_case;
   private rgP_2 id_catch;
   private rgP_2 id_private;
   private mR_2 id_implements;
   private LF id_finally;

   public mg_3(mo_3 var1, Consumer<rKQ> var2, rKQ var3) {
      super(new rgn_3("createWorld.customize.flat.title"));
      this.id_class = var1;
      this.id_throws = var2;
      this.id_case = var3;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      this.id_implements.id_class(var1, var2, var3, var4);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 8, 16777215);
      int var5 = this.id_package / 2 - 92 - 16;
      id_break(var1, this.id_super, this.id_catch, var5, 32, 16777215);
      id_break(var1, this.id_super, this.id_private, var5 + 2 + 213 - this.id_super.id_class(this.id_private), 32, 16777215);
      super.id_class(var1, var2, var3, var4);
   }

   public void id_class(rKQ var1) {
      this.id_case = var1;
   }

   public rKQ id_finally() {
      return this.id_case;
   }

   private boolean id_final() {
      return this.id_implements.id_finally() != null;
   }

   @Override
   public void id_volatile() {
      this.id_volatile.id_break(this.id_class);
   }

   void id_native() {
      this.id_finally.id_int = this.id_final();
   }

   @Override
   protected void v_() {
      this.id_catch = new rgn_3("createWorld.customize.flat.tile");
      this.id_private = new rgn_3("createWorld.customize.flat.height");
      this.id_implements = new mR_2(this);
      this.id_native.add(this.id_implements);
      this.id_finally = this.id_class(
         (LF)(new LF(this.id_package / 2 - 155, this.id_int - 52, 150, 20, new rgn_3("createWorld.customize.flat.removeLayer"), var1 -> {
            if (this.id_final()) {
               List var2 = this.id_case.id_case();
               int var3 = this.id_implements.x_().indexOf(this.id_implements.id_finally());
               int var4 = var2.size() - var3 - 1;
               var2.remove(var4);
               this.id_implements.id_class(var2.isEmpty() ? null : this.id_implements.x_().get(Math.min(var3, var2.size() - 1)));
               this.id_case.id_private();
               this.id_implements.id_throws();
               this.id_native();
            }
         }))
      );
      this.id_class((LF)(new LF(this.id_package / 2 + 5, this.id_int - 52, 150, 20, new rgn_3("createWorld.customize.presets"), var1 -> {
         this.id_volatile.id_break(new Zl_1(this));
         this.id_case.id_private();
         this.id_native();
      })));
      this.id_class((LF)(new LF(this.id_package / 2 - 155, this.id_int - 28, 150, 20, cN_2.id_byte, var1 -> {
         this.id_throws.accept(this.id_case);
         this.id_volatile.id_break(this.id_class);
         this.id_case.id_private();
      })));
      this.id_class((LF)(new LF(this.id_package / 2 + 5, this.id_int - 28, 150, 20, cN_2.id_protected, var1 -> {
         this.id_volatile.id_break(this.id_class);
         this.id_case.id_private();
      })));
      this.id_case.id_private();
      this.id_native();
   }
}
