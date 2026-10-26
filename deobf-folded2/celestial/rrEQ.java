package celestial;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class rrEQ extends rRG {
   private final Set<rhN_2> id_class = Sets.newHashSet();
   private final Set<rhN_2> id_break = Collections.unmodifiableSet(this.id_class);
   private boolean id_finally = true;

   @Override
   public rRG id_byte(boolean var1) {
      if (var1 != this.id_implements) {
         super.id_byte(var1);
         this.id_class(rFL.UPDATE_PROPERTIES);
      }

      return this;
   }

   public void id_byte() {
      if (!this.id_class.isEmpty()) {
         for (rhN_2 var2 : Lists.newArrayList(this.id_class)) {
            this.id_break(var2);
         }
      }
   }

   public Collection<rhN_2> id_int() {
      return this.id_break;
   }

   public rrEQ(rgP_2 var1, rRb_1 var2, rRM var3) {
      super(rfU_2.id_class(), var1, var2, var3);
   }

   private void id_class(rFL var1) {
      if (this.id_finally) {
         rFv_1 var2 = new rFv_1(var1, this);

         for (rhN_2 var4 : this.id_class) {
            var4.id_class.id_class(var2);
         }
      }
   }

   public void id_class(rhN_2 var1) {
      if (this.id_class.add(var1) && this.id_finally) {
         var1.id_class.id_class(new rFv_1(rFL.ADD, this));
      }
   }

   @Override
   public void id_class(float var1) {
      if (var1 != this.id_protected) {
         super.id_class(var1);
         this.id_class(rFL.UPDATE_PCT);
      }
   }

   @Override
   public void id_class(rgP_2 var1) {
      if (!Objects.equal(var1, this.id_byte)) {
         super.id_class(var1);
         this.id_class(rFL.UPDATE_NAME);
      }
   }

   @Override
   public rRG id_class(boolean var1) {
      if (var1 != this.id_catch) {
         super.id_class(var1);
         this.id_class(rFL.UPDATE_PROPERTIES);
      }

      return this;
   }

   @Override
   public void id_class(rRM var1) {
      if (var1 != this.id_case) {
         super.id_class(var1);
         this.id_class(rFL.UPDATE_STYLE);
      }
   }

   @Override
   public void id_class(rRb_1 var1) {
      if (var1 != this.id_throws) {
         super.id_class(var1);
         this.id_class(rFL.UPDATE_STYLE);
      }
   }

   @Override
   public rRG id_break(boolean var1) {
      if (var1 != this.id_private) {
         super.id_break(var1);
         this.id_class(rFL.UPDATE_PROPERTIES);
      }

      return this;
   }

   public void id_break(rhN_2 var1) {
      if (this.id_class.remove(var1) && this.id_finally) {
         var1.id_class.id_class(new rFv_1(rFL.REMOVE, this));
      }
   }

   public boolean id_package() {
      return this.id_finally;
   }

   public void id_protected(boolean var1) {
      if (var1 != this.id_finally) {
         this.id_finally = var1;

         for (rhN_2 var3 : this.id_class) {
            var3.id_class.id_class(new rFv_1(var1 ? rFL.ADD : rFL.REMOVE, this));
         }
      }
   }
}
