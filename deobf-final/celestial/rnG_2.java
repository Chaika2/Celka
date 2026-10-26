package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class rnG_2 extends rns_3 {
   private final rnW_2 class_;
   private final Set<rnP_2> break_ = Sets.newHashSet();
   private Runnable[] byte_ = new Runnable[0];

   @Override
   public void byte_(rnB_2 var1) {
      super.byte_(var1);
      this.class_.x().class_(new rFc_1(var1, 2));
      this.implements_();
   }

   public rnG_2(rnW_2 var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_(String var1, rnB_2 var2) {
      if (super.class_(var1, var2)) {
         this.class_.x().class_(new rFc_1(var2, Arrays.asList(var1), 3));
         this.implements_();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void class_(int var1, rnP_2 var2) {
      rnP_2 var3 = this.class_(var1);
      super.class_(var1, var2);
      if (var3 != var2 && var3 != null) {
         if (this.extends_(var3) > 0) {
            this.class_.x().class_(new rvM_2(var1, var2));
         } else {
            this.finally_(var3);
         }
      }

      if (var2 != null) {
         if (this.break_.contains(var2)) {
            this.class_.x().class_(new rvM_2(var1, var2));
         } else {
            this.private_(var2);
         }
      }

      this.implements_();
   }

   @Override
   public void class_(rAa_1 var1) {
      super.class_(var1);
      if (this.break_.contains(var1.protected_())) {
         this.class_.x().class_(new rFH(rnb_3.CHANGE, var1.protected_().break_(), var1.throws_(), var1.break_()));
      }

      this.implements_();
   }

   public void class_(Runnable var1) {
      this.byte_ = Arrays.copyOf(this.byte_, this.byte_.length + 1);
      this.byte_[this.byte_.length - 1] = var1;
   }

   @Override
   public void break_(rnB_2 var1) {
      super.break_(var1);
      this.class_.x().class_(new rFc_1(var1, 0));
      this.implements_();
   }

   @Override
   public void break_(String var1, rnB_2 var2) {
      super.break_(var1, var2);
      this.class_.x().class_(new rFc_1(var2, Arrays.asList(var1), 4));
      this.implements_();
   }

   @Override
   public void throws_(rnP_2 var1) {
      super.throws_(var1);
      if (this.break_.contains(var1)) {
         this.class_.x().class_(new rFB(var1, 2));
      }

      this.implements_();
   }

   public void finally_(rnP_2 var1) {
      List var2 = this.implements_(var1);

      for (rhN_2 var4 : this.class_.x().super_()) {
         for (ruS_2 var6 : var2) {
            var4.class_.class_(var6);
         }
      }

      this.break_.remove(var1);
   }

   public List<ruS_2<?>> catch_(rnP_2 var1) {
      ArrayList var2 = Lists.newArrayList();
      var2.add(new rFB(var1, 0));

      for (int var3 = 0; var3 < 19; var3++) {
         if (this.class_(var3) == var1) {
            var2.add(new rvM_2(var3, var1));
         }
      }

      for (rAa_1 var4 : this.class_(var1)) {
         var2.add(new rFH(rnb_3.CHANGE, var4.protected_().break_(), var4.throws_(), var4.break_()));
      }

      return var2;
   }

   public int extends_(rnP_2 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 19; var3++) {
         if (this.class_(var3) == var1) {
            var2++;
         }
      }

      return var2;
   }

   @Override
   public void case_(rnP_2 var1) {
      super.case_(var1);
      if (this.break_.contains(var1)) {
         this.finally_(var1);
      }

      this.implements_();
   }

   public List<ruS_2<?>> implements_(rnP_2 var1) {
      ArrayList var2 = Lists.newArrayList();
      var2.add(new rFB(var1, 1));

      for (int var3 = 0; var3 < 19; var3++) {
         if (this.class_(var3) == var1) {
            var2.add(new rvM_2(var3, var1));
         }
      }

      return var2;
   }

   protected void implements_() {
      for (Runnable var4 : this.byte_) {
         var4.run();
      }
   }

   @Override
   public void implements_(String var1) {
      super.implements_(var1);
      this.class_.x().class_(new rFH(rnb_3.REMOVE, (String)null, var1, 0));
      this.implements_();
   }

   @Override
   public void protected_(rnP_2 var1) {
      super.protected_(var1);
      this.implements_();
   }

   @Override
   public void protected_(String var1, rnP_2 var2) {
      super.protected_(var1, var2);
      if (this.break_.contains(var2)) {
         this.class_.x().class_(new rFH(rnb_3.REMOVE, var2.break_(), var1, 0));
      }

      this.implements_();
   }

   @Override
   public void protected_(rnB_2 var1) {
      super.protected_(var1);
      this.class_.x().class_(new rFc_1(var1, 1));
      this.implements_();
   }

   public void private_(rnP_2 var1) {
      List var2 = this.catch_(var1);

      for (rhN_2 var4 : this.class_.x().super_()) {
         for (ruS_2 var6 : var2) {
            var4.class_.class_(var6);
         }
      }

      this.break_.add(var1);
   }
}
