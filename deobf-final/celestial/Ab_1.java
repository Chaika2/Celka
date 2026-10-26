package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ab_1 {
   private static final Logger class_ = LogManager.getLogger();
   private final QY break_;
   private final Ow_1 byte_ = new Ow_1();
   private final Map<OT, Oj_1> protected_ = Maps.newHashMap();
   private AM throws_;
   private OT case_;

   public Ab_1(QY var1) {
      this.break_ = var1;
   }

   public void class_(OT var1, boolean var2) {
      Aq_1 var3 = this.break_.void_();
      if (var3 != null && var1 != null && var2) {
         var3.class_(rZc_1.class_(var1));
      }

      if (this.case_ != var1) {
         this.case_ = var1;
         if (this.throws_ != null) {
            this.throws_.throws_(var1);
         }
      }
   }

   public void class_(AM var1) {
      this.throws_ = var1;
      this.byte_.class_(var1);
      if (var1 != null) {
         for (Entry var3 : this.protected_.entrySet()) {
            var1.class_((OT)var3.getKey(), (Oj_1)var3.getValue());
         }

         var1.throws_(this.case_);
      }
   }

   public void class_(rZI var1) {
      if (var1.throws_()) {
         this.byte_.class_();
         this.protected_.clear();
      }

      this.byte_.class_(var1.byte_());
      this.byte_.class_(var1.break_());

      for (Entry var3 : var1.protected_().entrySet()) {
         OT var4 = this.byte_.class_((rqO_2)var3.getKey());
         if (var4 != null) {
            Oj_1 var5 = (Oj_1)var3.getValue();
            var5.class_(var4.case_(), var4.implements_());
            this.protected_.put(var4, var5);
            if (this.throws_ != null) {
               this.throws_.class_(var4, var5);
            }
         } else {
            class_.warn("Server informed client about progress for unknown advancement {}", var3.getKey());
         }
      }
   }

   public Ow_1 class_() {
      return this.byte_;
   }
}
