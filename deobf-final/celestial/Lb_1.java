package celestial;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class Lb_1 {
   private static final LS break_ = new LO();
   private static final LS byte_ = new Lh_1(-1, true);
   private static final LS protected_ = new Lh_1(1, true);
   private static final LS throws_ = new Lh_1(1, false);
   static final rgP_2 case_ = new rgn_3("spectatorMenu.close");
   static final rgP_2 catch_ = new rgn_3("spectatorMenu.previous_page");
   static final rgP_2 private_ = new rgn_3("spectatorMenu.next_page");
   public static final LS class_ = new LM();
   private final Ls_1 implements_;
   private LE finally_;
   private int extends_ = -1;
   int native_;

   public LE byte_() {
      return this.finally_;
   }

   public Lb_1(Ls_1 var1) {
      this.finally_ = new LB();
      this.implements_ = var1;
   }

   public LS class_(int var1) {
      int var2 = var1 + this.native_ * 6;
      if (this.native_ > 0 && var1 == 0) {
         return byte_;
      } else if (var1 == 7) {
         return var2 < this.finally_.class_().size() ? protected_ : throws_;
      } else if (var1 == 8) {
         return break_;
      } else {
         return var2 >= 0 && var2 < this.finally_.class_().size() ? (LS)MoreObjects.firstNonNull(this.finally_.class_().get(var2), class_) : class_;
      }
   }

   public List<LS> class_() {
      ArrayList var1 = Lists.newArrayList();

      for (int var2 = 0; var2 <= 8; var2++) {
         var1.add(this.class_(var2));
      }

      return var1;
   }

   public void class_(LE var1) {
      this.finally_ = var1;
      this.extends_ = -1;
      this.native_ = 0;
   }

   public void break_(int var1) {
      LS var2 = this.class_(var1);
      if (var2 != class_) {
         if (this.extends_ == var1 && var2.protected_()) {
            var2.class_(this);
         } else {
            this.extends_ = var1;
         }
      }
   }

   public LS break_() {
      return this.class_(this.extends_);
   }

   public int throws_() {
      return this.extends_;
   }

   public LX case_() {
      return new LX(this.finally_, this.class_(), this.extends_);
   }

   public void protected_() {
      this.implements_.class_(this);
   }
}
