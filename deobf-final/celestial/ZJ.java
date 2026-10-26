package celestial;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class ZJ extends vm_3 {
   private final Consumer<Optional<rRu_1>> class_;
   private ZW throws_;
   private final Set<Zk_1> case_ = Sets.newHashSet();
   private LF catch_;
   private List<rpl_3> private_;
   private final rRu_1 implements_;

   public ZJ(rRu_1 var1, Consumer<Optional<rRu_1>> var2) {
      super(new rgn_3("editGamerule.title"));
      this.implements_ = var1;
      this.class_ = var2;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.private_ = null;
      this.throws_.class_(var1, var2, var3, var4);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 20, 16777215);
      super.class_(var1, var2, var3, var4);
      if (this.private_ != null) {
         this.break_(var1, this.private_, var2, var3);
      }
   }

   void class_(Zk_1 var1) {
      this.case_.add(var1);
      this.finally_();
   }

   void break_(Zk_1 var1) {
      this.case_.remove(var1);
      this.finally_();
   }

   void break_(List<rpl_3> var1) {
      this.private_ = var1;
   }

   private void finally_() {
      this.catch_.int_ = this.case_.isEmpty();
   }

   @Override
   public void volatile_() {
      this.class_.accept(Optional.empty());
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      super.v_();
      this.throws_ = new ZW(this, this.implements_);
      this.native_.add(this.throws_);
      this.class_((LF)(new LF(this.package_ / 2 - 155 + 160, this.int_ - 29, 150, 20, cN_2.protected_, var1 -> this.class_.accept(Optional.empty()))));
      this.catch_ = this.class_(
         (LF)(new LF(this.package_ / 2 - 155, this.int_ - 29, 150, 20, cN_2.byte_, var1 -> this.class_.accept(Optional.of(this.implements_))))
      );
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
