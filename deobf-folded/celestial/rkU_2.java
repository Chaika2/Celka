package celestial;

import com.google.common.collect.Sets;
import java.util.Set;

public class rkU_2 {
   protected final Set<rqO_2> id_class = Sets.newHashSet();
   protected final Set<rqO_2> id_break = Sets.newHashSet();
   private final rka_3 id_byte = new rka_3();

   protected void id_byte(rqO_2 var1) {
      this.id_class.remove(var1);
      this.id_break.remove(var1);
   }

   public void id_byte(rkw_3<?> var1) {
      this.id_byte(var1.id_case());
   }

   public boolean id_class(rke_3 var1) {
      return this.id_byte.id_class(var1);
   }

   public void id_class(rka_3 var1) {
      this.id_byte.id_class(var1);
   }

   public void id_class(rke_3 var1, boolean var2, boolean var3) {
      this.id_byte.id_class(var1, var2);
      this.id_byte.id_break(var1, var3);
   }

   public boolean id_class(rJI<?> var1) {
      return this.id_break(var1.id_implements());
   }

   public void id_class(rke_3 var1, boolean var2) {
      this.id_byte.id_class(var1, var2);
   }

   public void id_class(rkU_2 var1) {
      this.id_class.clear();
      this.id_break.clear();
      this.id_byte.id_class(var1.id_byte);
      this.id_class.addAll(var1.id_class);
      this.id_break.addAll(var1.id_break);
   }

   protected void id_class(rqO_2 var1) {
      this.id_class.add(var1);
   }

   public void id_class(rkw_3<?> var1) {
      if (!var1.id_implements()) {
         this.id_class(var1.id_case());
      }
   }

   public void id_break(rke_3 var1, boolean var2) {
      this.id_byte.id_break(var1, var2);
   }

   public boolean id_break(rke_3 var1) {
      return this.id_byte.id_break(var1);
   }

   public boolean id_break(rqO_2 var1) {
      return this.id_class.contains(var1);
   }

   public rka_3 id_break() {
      return this.id_byte.id_class();
   }

   public boolean id_break(rkw_3<?> var1) {
      return var1 == null ? false : this.id_class.contains(var1.id_case());
   }

   public void id_throws(rkw_3<?> var1) {
      this.id_break.remove(var1.id_case());
   }

   public void id_case(rkw_3<?> var1) {
      this.id_protected(var1.id_case());
   }

   protected void id_protected(rqO_2 var1) {
      this.id_break.add(var1);
   }

   public boolean id_protected(rkw_3<?> var1) {
      return this.id_break.contains(var1.id_case());
   }
}
