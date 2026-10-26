package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Oa_1 {
   private static final rqO_2 id_class = new rqO_2("tick");
   private static final rqO_2 id_break = new rqO_2("load");
   private final rnW_2 id_byte;
   private boolean id_protected;
   private final ArrayDeque<Oi_1> id_throws = new ArrayDeque<>();
   private final List<Oi_1> id_case = Lists.newArrayList();
   private final List<gt_3> id_catch = Lists.newArrayList();
   private boolean id_private;
   private rAQ id_implements;

   public void id_byte() {
      this.id_class(this.id_catch, id_class);
      if (this.id_private) {
         this.id_private = false;
         List var1 = this.id_implements.id_byte().id_break(id_break).id_class();
         this.id_class(var1, id_break);
      }
   }

   public Oa_1(rnW_2 var1, rAQ var2) {
      this.id_byte = var1;
      this.id_implements = var2;
      this.id_break(var2);
   }

   public int id_class() {
      return this.id_byte.D().id_byte(rRu_1.id_synchronized);
   }

   public Optional<gt_3> id_class(rqO_2 var1) {
      return this.id_implements.id_class(var1);
   }

   public int id_class(gt_3 var1, gy_3 var2) {
      int var3 = this.id_class();
      if (this.id_protected) {
         if (this.id_throws.size() + this.id_case.size() < var3) {
            this.id_case.add(new Oi_1(this, var2, new gf_3(var1)));
         }

         return 0;
      } else {
         int var7;
         try {
            this.id_protected = true;
            int var4 = 0;
            gj_3[] var5 = var1.id_break();

            for (int var6 = var5.length - 1; var6 >= 0; var6--) {
               this.id_throws.push(new Oi_1(this, var2, var5[var6]));
            }

            do {
               if (this.id_throws.isEmpty()) {
                  return var4;
               }

               Oi_1 var11 = this.id_throws.removeFirst();
               var11.id_class(this.id_throws, var3);
               if (!this.id_case.isEmpty()) {
                  Lists.reverse(this.id_case).forEach(this.id_throws::addFirst);
                  this.id_case.clear();
               }
            } while (++var4 < var3);

            var7 = var4;
         } finally {
            this.id_throws.clear();
            this.id_case.clear();
            this.id_protected = false;
         }

         return var7;
      }
   }

   private void id_class(Collection<gt_3> var1, rqO_2 var2) {
      for (gt_3 var4 : var1) {
         this.id_class(var4, this.id_protected());
      }
   }

   public void id_class(rAQ var1) {
      this.id_implements = var1;
      this.id_break(var1);
   }

   public rlb_3<gt_3> id_break(rqO_2 var1) {
      return this.id_implements.id_break(var1);
   }

   private void id_break(rAQ var1) {
      this.id_catch.clear();
      this.id_catch.addAll(var1.id_byte().id_break(id_class).id_class());
      this.id_private = true;
   }

   public CommandDispatcher<gy_3> id_break() {
      return this.id_byte.f().id_class();
   }

   public Iterable<rqO_2> id_throws() {
      return this.id_implements.id_break().keySet();
   }

   public Iterable<rqO_2> id_case() {
      return this.id_implements.id_byte().id_break();
   }

   public gy_3 id_protected() {
      return this.id_byte.j().id_break(2).id_finally();
   }
}
