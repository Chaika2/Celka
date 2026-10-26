package celestial;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class Lb_1 {
   private static final LS id_break = new LO();
   private static final LS id_byte = new Lh_1(-1, true);
   private static final LS id_protected = new Lh_1(1, true);
   private static final LS id_throws = new Lh_1(1, false);
   static final rgP_2 id_case = new rgn_3("spectatorMenu.close");
   static final rgP_2 id_catch = new rgn_3("spectatorMenu.previous_page");
   static final rgP_2 id_private = new rgn_3("spectatorMenu.next_page");
   public static final LS id_class = new LM();
   private final Ls_1 id_implements;
   private LE id_finally;
   private int id_extends = -1;
   int id_native;

   public LE id_byte() {
      return this.id_finally;
   }

   public Lb_1(Ls_1 var1) {
      this.id_finally = new LB();
      this.id_implements = var1;
   }

   public LS id_class(int var1) {
      int var2 = var1 + this.id_native * 6;
      if (this.id_native > 0 && var1 == 0) {
         return id_byte;
      } else if (var1 == 7) {
         return var2 < this.id_finally.id_class().size() ? id_protected : id_throws;
      } else if (var1 == 8) {
         return id_break;
      } else {
         return var2 >= 0 && var2 < this.id_finally.id_class().size() ? (LS)MoreObjects.firstNonNull(this.id_finally.id_class().get(var2), id_class) : id_class;
      }
   }

   public List<LS> id_class() {
      ArrayList var1 = Lists.newArrayList();

      for (int var2 = 0; var2 <= 8; var2++) {
         var1.add(this.id_class(var2));
      }

      return var1;
   }

   public void id_class(LE var1) {
      this.id_finally = var1;
      this.id_extends = -1;
      this.id_native = 0;
   }

   public void id_break(int var1) {
      LS var2 = this.id_class(var1);
      if (var2 != id_class) {
         if (this.id_extends == var1 && var2.id_protected()) {
            var2.id_class(this);
         } else {
            this.id_extends = var1;
         }
      }
   }

   public LS id_break() {
      return this.id_class(this.id_extends);
   }

   public int id_throws() {
      return this.id_extends;
   }

   public LX id_case() {
      return new LX(this.id_finally, this.id_class(), this.id_extends);
   }

   public void id_protected() {
      this.id_implements.id_class(this);
   }
}
