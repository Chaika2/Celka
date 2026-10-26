package celestial;

import java.util.Objects;
import java.util.function.Consumer;

public class mf_3 extends vm_3 {
   private static final rgP_2 id_class = new rgn_3("createWorld.customize.buffet.biome");
   private final vm_3 id_throws;
   private final Consumer<rYG> id_case;
   final rVF<rYG> id_catch;
   private mj_3 id_private;
   rYG id_implements;
   private LF id_finally;

   public mf_3(vm_3 var1, rVm_1 var2, Consumer<rYG> var3, rYG var4) {
      super(new rgn_3("createWorld.customize.buffet.title"));
      this.id_throws = var1;
      this.id_case = var3;
      this.id_implements = var4;
      this.id_catch = var2.id_break(rVL.n);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_protected(0);
      this.id_private.id_class(var1, var2, var3, var4);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 8, 16777215);
      id_class(var1, this.id_super, id_class, this.id_package / 2, 28, 10526880);
      super.id_class(var1, var2, var3, var4);
   }

   void id_finally() {
      this.id_finally.id_int = this.id_private.id_finally() != null;
   }

   @Override
   public void id_volatile() {
      this.id_volatile.id_break(this.id_throws);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      this.id_private = new mj_3(this);
      this.id_native.add(this.id_private);
      this.id_finally = this.id_class((LF)(new LF(this.id_package / 2 - 155, this.id_int - 28, 150, 20, cN_2.id_byte, var1 -> {
         this.id_case.accept(this.id_implements);
         this.id_volatile.id_break(this.id_throws);
      })));
      this.id_class((LF)(new LF(this.id_package / 2 + 5, this.id_int - 28, 150, 20, cN_2.id_protected, var1 -> this.id_volatile.id_break(this.id_throws))));
      this.id_private.id_class(this.id_private.x_().stream().filter(var1 -> Objects.equals(var1.id_break, this.id_implements)).findFirst().orElse((mV_2)null));
   }
}
