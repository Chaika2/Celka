package celestial;

import com.google.common.collect.Sets;
import java.util.Set;

public class rkU_2 {
   protected final Set<rqO_2> class_ = Sets.newHashSet();
   protected final Set<rqO_2> break_ = Sets.newHashSet();
   private final rka_3 byte_ = new rka_3();

   protected void byte_(rqO_2 var1) {
      this.class_.remove(var1);
      this.break_.remove(var1);
   }

   public void byte_(rkw_3<?> var1) {
      this.byte_(var1.case_());
   }

   public boolean class_(rke_3 var1) {
      return this.byte_.class_(var1);
   }

   public void class_(rka_3 var1) {
      this.byte_.class_(var1);
   }

   public void class_(rke_3 var1, boolean var2, boolean var3) {
      this.byte_.class_(var1, var2);
      this.byte_.break_(var1, var3);
   }

   public boolean class_(rJI<?> var1) {
      return this.break_(var1.implements_());
   }

   public void class_(rke_3 var1, boolean var2) {
      this.byte_.class_(var1, var2);
   }

   public void class_(rkU_2 var1) {
      this.class_.clear();
      this.break_.clear();
      this.byte_.class_(var1.byte_);
      this.class_.addAll(var1.class_);
      this.break_.addAll(var1.break_);
   }

   protected void class_(rqO_2 var1) {
      this.class_.add(var1);
   }

   public void class_(rkw_3<?> var1) {
      if (!var1.implements_()) {
         this.class_(var1.case_());
      }
   }

   public void break_(rke_3 var1, boolean var2) {
      this.byte_.break_(var1, var2);
   }

   public boolean break_(rke_3 var1) {
      return this.byte_.break_(var1);
   }

   public boolean break_(rqO_2 var1) {
      return this.class_.contains(var1);
   }

   public rka_3 break_() {
      return this.byte_.class_();
   }

   public boolean break_(rkw_3<?> var1) {
      return var1 == null ? false : this.class_.contains(var1.case_());
   }

   public void throws_(rkw_3<?> var1) {
      this.break_.remove(var1.case_());
   }

   public void case_(rkw_3<?> var1) {
      this.protected_(var1.case_());
   }

   protected void protected_(rqO_2 var1) {
      this.break_.add(var1);
   }

   public boolean protected_(rkw_3<?> var1) {
      return this.break_.contains(var1.case_());
   }
}
