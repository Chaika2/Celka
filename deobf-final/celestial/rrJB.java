package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rrJB extends rrJM {
   private final vm_3 private_;
   private rgP_2 implements_;
   private rgP_2 finally_;
   private final List<rpl_3> else_ = Lists.newArrayList();
   protected String class_;
   private int synchronized_;

   public rrJB(vm_3 var1, String var2, String var3) {
      super(new rgn_3("of.options.detailsTitle"));
      this.private_ = var1;
      this.implements_ = new rgN_2(var2);
      this.finally_ = new rgN_2(var3);
      this.class_ = jI_2.class_("gui.done");
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.case_, this.implements_, this.package_ / 2, 70, 16777215);
      byte var5 = 90;

      for (rpl_3 var7 : this.else_) {
         class_(var1, this.case_, var7, this.package_ / 2, var5, 16777215);
         var5 += 9;
      }

      super.class_(var1, var2, var3, var4);
   }

   public void break_(int var1) {
      this.synchronized_ = var1;

      for (LZ var3 : this.throws_) {
         var3.int_ = false;
      }
   }

   @Override
   protected void break_(LZ var1) {
      rrbb_3.X().break_(this.private_);
   }

   @Override
   public void private_() {
      super.private_();
      if (--this.synchronized_ == 0) {
         for (LZ var2 : this.throws_) {
            var2.int_ = true;
         }
      }
   }

   @Override
   public void v_() {
      this.class_(new rrXi_1(0, this.package_ / 2 - 100, this.int_ / 6 + 96, this.class_));
      this.else_.clear();
      this.else_.addAll(((cm_3)this.volatile_.class_[15]).break_(this.finally_, this.package_ - 50));
   }
}
