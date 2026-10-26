package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class rnG_2 extends rns_3 {
   private final rnW_2 id_class;
   private final Set<rnP_2> id_break = Sets.newHashSet();
   private Runnable[] id_byte = new Runnable[0];

   @Override
   public void id_byte(rnB_2 var1) {
      super.id_byte(var1);
      this.id_class.x().id_class(new rFc_1(var1, 2));
      this.id_implements();
   }

   public rnG_2(rnW_2 var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_class(String var1, rnB_2 var2) {
      if (super.id_class(var1, var2)) {
         this.id_class.x().id_class(new rFc_1(var2, Arrays.asList(var1), 3));
         this.id_implements();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void id_class(int var1, rnP_2 var2) {
      rnP_2 var3 = this.id_class(var1);
      super.id_class(var1, var2);
      if (var3 != var2 && var3 != null) {
         if (this.id_extends(var3) > 0) {
            this.id_class.x().id_class(new rvM_2(var1, var2));
         } else {
            this.id_finally(var3);
         }
      }

      if (var2 != null) {
         if (this.id_break.contains(var2)) {
            this.id_class.x().id_class(new rvM_2(var1, var2));
         } else {
            this.id_private(var2);
         }
      }

      this.id_implements();
   }

   @Override
   public void id_class(rAa_1 var1) {
      super.id_class(var1);
      if (this.id_break.contains(var1.id_protected())) {
         this.id_class.x().id_class(new rFH(rnb_3.CHANGE, var1.id_protected().id_break(), var1.id_throws(), var1.id_break()));
      }

      this.id_implements();
   }

   public void id_class(Runnable var1) {
      this.id_byte = Arrays.copyOf(this.id_byte, this.id_byte.length + 1);
      this.id_byte[this.id_byte.length - 1] = var1;
   }

   @Override
   public void id_break(rnB_2 var1) {
      super.id_break(var1);
      this.id_class.x().id_class(new rFc_1(var1, 0));
      this.id_implements();
   }

   @Override
   public void id_break(String var1, rnB_2 var2) {
      super.id_break(var1, var2);
      this.id_class.x().id_class(new rFc_1(var2, Arrays.asList(var1), 4));
      this.id_implements();
   }

   @Override
   public void id_throws(rnP_2 var1) {
      super.id_throws(var1);
      if (this.id_break.contains(var1)) {
         this.id_class.x().id_class(new rFB(var1, 2));
      }

      this.id_implements();
   }

   public void id_finally(rnP_2 var1) {
      List var2 = this.id_implements(var1);

      for (rhN_2 var4 : this.id_class.x().id_super()) {
         for (ruS_2 var6 : var2) {
            var4.id_class.id_class(var6);
         }
      }

      this.id_break.remove(var1);
   }

   public List<ruS_2<?>> id_catch(rnP_2 var1) {
      ArrayList var2 = Lists.newArrayList();
      var2.add(new rFB(var1, 0));

      for (int var3 = 0; var3 < 19; var3++) {
         if (this.id_class(var3) == var1) {
            var2.add(new rvM_2(var3, var1));
         }
      }

      for (rAa_1 var4 : this.id_class(var1)) {
         var2.add(new rFH(rnb_3.CHANGE, var4.id_protected().id_break(), var4.id_throws(), var4.id_break()));
      }

      return var2;
   }

   public int id_extends(rnP_2 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 19; var3++) {
         if (this.id_class(var3) == var1) {
            var2++;
         }
      }

      return var2;
   }

   @Override
   public void id_case(rnP_2 var1) {
      super.id_case(var1);
      if (this.id_break.contains(var1)) {
         this.id_finally(var1);
      }

      this.id_implements();
   }

   public List<ruS_2<?>> id_implements(rnP_2 var1) {
      ArrayList var2 = Lists.newArrayList();
      var2.add(new rFB(var1, 1));

      for (int var3 = 0; var3 < 19; var3++) {
         if (this.id_class(var3) == var1) {
            var2.add(new rvM_2(var3, var1));
         }
      }

      return var2;
   }

   protected void id_implements() {
      for (Runnable var4 : this.id_byte) {
         var4.run();
      }
   }

   @Override
   public void id_implements(String var1) {
      super.id_implements(var1);
      this.id_class.x().id_class(new rFH(rnb_3.REMOVE, (String)null, var1, 0));
      this.id_implements();
   }

   @Override
   public void id_protected(rnP_2 var1) {
      super.id_protected(var1);
      this.id_implements();
   }

   @Override
   public void id_protected(String var1, rnP_2 var2) {
      super.id_protected(var1, var2);
      if (this.id_break.contains(var2)) {
         this.id_class.x().id_class(new rFH(rnb_3.REMOVE, var2.id_break(), var1, 0));
      }

      this.id_implements();
   }

   @Override
   public void id_protected(rnB_2 var1) {
      super.id_protected(var1);
      this.id_class.x().id_class(new rFc_1(var1, 1));
      this.id_implements();
   }

   public void id_private(rnP_2 var1) {
      List var2 = this.id_catch(var1);

      for (rhN_2 var4 : this.id_class.x().id_super()) {
         for (ruS_2 var6 : var2) {
            var4.id_class.id_class(var6);
         }
      }

      this.id_break.add(var1);
   }
}
