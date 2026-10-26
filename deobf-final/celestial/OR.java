package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class OR {
   private int class_;
   private final List<rqO_2> break_ = Lists.newArrayList();
   private final List<rqO_2> byte_ = Lists.newArrayList();
   private rqO_2 protected_;

   public Og_1 class_() {
      return new Og_1(
         this.class_, this.break_.toArray(new rqO_2[0]), this.byte_.toArray(new rqO_2[0]), this.protected_ == null ? gw_3.class_ : new gw_3(this.protected_)
      );
   }

   public static OR class_(rqO_2 var0) {
      return new OR().break_(var0);
   }

   public static OR class_(int var0) {
      return new OR().break_(var0);
   }

   public OR break_(rqO_2 var1) {
      this.byte_.add(var1);
      return this;
   }

   public OR break_(int var1) {
      this.class_ += var1;
      return this;
   }
}
