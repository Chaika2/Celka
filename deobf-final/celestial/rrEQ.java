package celestial;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class rrEQ extends rRG {
   private final Set<rhN_2> class_ = Sets.newHashSet();
   private final Set<rhN_2> break_ = Collections.unmodifiableSet(this.class_);
   private boolean finally_ = true;

   @Override
   public rRG byte_(boolean var1) {
      if (var1 != this.implements_) {
         super.byte_(var1);
         this.class_(rFL.UPDATE_PROPERTIES);
      }

      return this;
   }

   public void byte_() {
      if (!this.class_.isEmpty()) {
         for (rhN_2 var2 : Lists.newArrayList(this.class_)) {
            this.break_(var2);
         }
      }
   }

   public Collection<rhN_2> int_() {
      return this.break_;
   }

   public rrEQ(rgP_2 var1, rRb_1 var2, rRM var3) {
      super(rfU_2.class_(), var1, var2, var3);
   }

   private void class_(rFL var1) {
      if (this.finally_) {
         rFv_1 var2 = new rFv_1(var1, this);

         for (rhN_2 var4 : this.class_) {
            var4.class_.class_(var2);
         }
      }
   }

   public void class_(rhN_2 var1) {
      if (this.class_.add(var1) && this.finally_) {
         var1.class_.class_(new rFv_1(rFL.ADD, this));
      }
   }

   @Override
   public void class_(float var1) {
      if (var1 != this.protected_) {
         super.class_(var1);
         this.class_(rFL.UPDATE_PCT);
      }
   }

   @Override
   public void class_(rgP_2 var1) {
      if (!Objects.equal(var1, this.byte_)) {
         super.class_(var1);
         this.class_(rFL.UPDATE_NAME);
      }
   }

   @Override
   public rRG class_(boolean var1) {
      if (var1 != this.catch_) {
         super.class_(var1);
         this.class_(rFL.UPDATE_PROPERTIES);
      }

      return this;
   }

   @Override
   public void class_(rRM var1) {
      if (var1 != this.case_) {
         super.class_(var1);
         this.class_(rFL.UPDATE_STYLE);
      }
   }

   @Override
   public void class_(rRb_1 var1) {
      if (var1 != this.throws_) {
         super.class_(var1);
         this.class_(rFL.UPDATE_STYLE);
      }
   }

   @Override
   public rRG break_(boolean var1) {
      if (var1 != this.private_) {
         super.break_(var1);
         this.class_(rFL.UPDATE_PROPERTIES);
      }

      return this;
   }

   public void break_(rhN_2 var1) {
      if (this.class_.remove(var1) && this.finally_) {
         var1.class_.class_(new rFv_1(rFL.REMOVE, this));
      }
   }

   public boolean package_() {
      return this.finally_;
   }

   public void protected_(boolean var1) {
      if (var1 != this.finally_) {
         this.finally_ = var1;

         for (rhN_2 var3 : this.class_) {
            var3.class_.class_(new rFv_1(var1 ? rFL.ADD : rFL.REMOVE, this));
         }
      }
   }
}
