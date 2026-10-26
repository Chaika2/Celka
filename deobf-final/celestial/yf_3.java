package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class yf_3 {
   public final UUID class_;
   public final int break_;
   public final eX_2 byte_;
   public final rLC protected_;
   public final rfH_2 throws_;
   public final rfH_2 case_;
   public final int catch_;
   public final List<String> private_ = Lists.newArrayList();
   public final Set<rfH_2> implements_ = Sets.newHashSet();

   public boolean byte_() {
      return this.case_ != null;
   }

   public yf_3(UUID var1, int var2, eX_2 var3, rLC var4, rfH_2 var5, rfH_2 var6, int var7) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
   }

   @Override
   public String toString() {
      return this.break_();
   }

   public UUID class_() {
      return this.class_;
   }

   public boolean class_(rfH_2 var1) {
      return this.throws_ != null && this.throws_.equals(var1);
   }

   public String break_() {
      return rqG_2.class_(this.class_);
   }
}
