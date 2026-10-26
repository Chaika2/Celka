package celestial;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class ZJ extends vm_3 {
   private final Consumer<Optional<rRu_1>> id_class;
   private ZW id_throws;
   private final Set<Zk_1> id_case = Sets.newHashSet();
   private LF id_catch;
   private List<rpl_3> id_private;
   private final rRu_1 id_implements;

   public ZJ(rRu_1 var1, Consumer<Optional<rRu_1>> var2) {
      super(new rgn_3("editGamerule.title"));
      this.id_implements = var1;
      this.id_class = var2;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_private = null;
      this.id_throws.id_class(var1, var2, var3, var4);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 20, 16777215);
      super.id_class(var1, var2, var3, var4);
      if (this.id_private != null) {
         this.id_break(var1, this.id_private, var2, var3);
      }
   }

   void id_class(Zk_1 var1) {
      this.id_case.add(var1);
      this.id_finally();
   }

   void id_break(Zk_1 var1) {
      this.id_case.remove(var1);
      this.id_finally();
   }

   void id_break(List<rpl_3> var1) {
      this.id_private = var1;
   }

   private void id_finally() {
      this.id_catch.id_int = this.id_case.isEmpty();
   }

   @Override
   public void id_volatile() {
      this.id_class.accept(Optional.empty());
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      super.v_();
      this.id_throws = new ZW(this, this.id_implements);
      this.id_native.add(this.id_throws);
      this.id_class((LF)(new LF(this.id_package / 2 - 155 + 160, this.id_int - 29, 150, 20, cN_2.id_protected, var1 -> this.id_class.accept(Optional.empty()))));
      this.id_catch = this.id_class(
         (LF)(new LF(this.id_package / 2 - 155, this.id_int - 29, 150, 20, cN_2.id_byte, var1 -> this.id_class.accept(Optional.of(this.id_implements))))
      );
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
