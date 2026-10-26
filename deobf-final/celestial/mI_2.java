package celestial;

import java.util.HashSet;
import java.util.Set;

public class mI_2 extends vl_3 {
   public Vu_1 class_;
   public long throws_;
   private LR private_;
   private LF implements_;
   private final Set<Va_1> finally_ = new HashSet<>();

   public mI_2(vm_3 var1, Qw_1 var2) {
      super(var1, var2, new rgn_3("controls.title"));
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      if (this.class_ != null && !this.finally_.isEmpty()) {
         this.catch_.class_(this.class_, Vi_1.MOUSE.class_(var5), this.finally_);
         this.finally_.clear();
         this.class_ = null;
         this.throws_ = rqR_2.break_();
         Vu_1.byte_();
         return true;
      } else {
         return super.class_(var1, var3, var5);
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (this.class_ != null) {
         if (var1 != 256) {
            this.finally_.add(Ve_1.class_(var1, var2));
         }

         return true;
      } else {
         return super.class_(var1, var2, var3);
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      this.private_.class_(var1, var2, var3, var4);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 8, 16777215);
      boolean var5 = false;

      for (Vu_1 var9 : this.catch_.f) {
         if (!var9.volatile_()) {
            var5 = true;
            break;
         }
      }

      this.implements_.int_ = var5;
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      if (this.class_ != null) {
         if (var1 == 256) {
            this.catch_.class_(this.class_, Ve_1.class_);
         } else {
            this.catch_.class_(this.class_, Ve_1.class_(var1, var2), this.finally_);
         }

         this.finally_.clear();
         this.class_ = null;
         this.throws_ = rqR_2.break_();
         Vu_1.byte_();
         return true;
      } else {
         return super.break_(var1, var2, var3);
      }
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (this.class_ != null) {
         this.finally_.add(Vi_1.MOUSE.class_(var5));
         return true;
      } else {
         return super.break_(var1, var3, var5);
      }
   }

   @Override
   protected void v_() {
      this.class_(new LF(this.package_ / 2 - 155, 18, 150, 20, new rgn_3("options.mouse_settings"), var1 -> this.volatile_.break_(new vE_2(this, this.catch_))));
      this.class_(QF.throw_.class_(this.catch_, this.package_ / 2 - 155 + 160, 18, 150));
      this.private_ = new LR(this, this.volatile_);
      this.native_.add(this.private_);
      this.implements_ = this.class_(new LF(this.package_ / 2 - 155, this.int_ - 29, 150, 20, new rgn_3("controls.resetAll"), var1 -> {
         for (Vu_1 var5 : this.catch_.f) {
            var5.class_(var5.private_(), var5.finally_());
         }

         Vu_1.byte_();
      }));
      this.class_(new LF(this.package_ / 2 - 155 + 160, this.int_ - 29, 150, 20, cN_2.byte_, var1 -> this.volatile_.break_(this.case_)));
   }
}
