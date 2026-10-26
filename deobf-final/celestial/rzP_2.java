package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import java.util.Map;
import java.util.Random;

public class rzP_2 {
   private final rrEm_1 class_;
   private final Map<rzd_3<?>, Object> break_ = Maps.newIdentityHashMap();
   private final Map<rqO_2, rzs_3> byte_ = Maps.newHashMap();
   private Random protected_;
   private float throws_;

   public rzP_2(rrEm_1 var1) {
      this.class_ = var1;
   }

   public <T> T class_(rzd_3<T> var1) {
      Object var2 = this.break_.get(var1);
      if (var2 == null) {
         throw new IllegalArgumentException("No parameter " + var1);
      } else {
         return (T)var2;
      }
   }

   public rrEm_1 class_() {
      return this.class_;
   }

   public rzP_2 class_(rqO_2 var1, rzs_3 var2) {
      rzs_3 var3 = this.byte_.put(var1, var2);
      if (var3 != null) {
         throw new IllegalStateException("Duplicated dynamic drop '" + this.byte_ + "'");
      } else {
         return this;
      }
   }

   public rzr_3 class_(rzk_3 var1) {
      SetView var2 = Sets.difference(this.break_.keySet(), var1.break_());
      if (!var2.isEmpty()) {
         throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + var2);
      } else {
         SetView var3 = Sets.difference(var1.class_(), this.break_.keySet());
         if (!var3.isEmpty()) {
            throw new IllegalArgumentException("Missing required parameters: " + var3);
         } else {
            Random var4 = this.protected_;
            if (var4 == null) {
               var4 = new Random();
            }

            rnW_2 var5 = this.class_(this.class_);
            rzC_2 var6 = this.class_(var5);
            rzZ_2 var7 = this.break_(var5);
            return new rzr_3(var4, this.throws_, this.class_, var6::class_, var7::class_, this.break_, this.byte_);
         }
      }
   }

   private rnW_2 class_(rrEm_1 var1) {
      return var1 == null ? null : var1.const_();
   }

   private rzC_2 class_(rnW_2 var1) {
      return var1 == null ? re_3.byte_() : var1.o();
   }

   public rzP_2 class_(Random var1) {
      this.protected_ = var1;
      return this;
   }

   public rzP_2 class_(long var1) {
      if (var1 != 0L) {
         this.protected_ = new Random(var1);
      }

      return this;
   }

   public rzP_2 class_(float var1) {
      this.throws_ = var1;
      return this;
   }

   public <T> rzP_2 class_(rzd_3<T> var1, T var2) {
      this.break_.put(var1, var2);
      return this;
   }

   public rzP_2 class_(long var1, Random var3) {
      if (var1 == 0L) {
         this.protected_ = var3;
      } else {
         this.protected_ = new Random(var1);
      }

      return this;
   }

   private rzZ_2 break_(rnW_2 var1) {
      return var1 == null ? re_3.class_() : var1.K();
   }

   public <T> rzP_2 break_(rzd_3<T> var1, T var2) {
      if (var2 == null) {
         this.break_.remove(var1);
      } else {
         this.break_.put(var1, var2);
      }

      return this;
   }

   public <T> T break_(rzd_3<T> var1) {
      return (T)this.break_.get(var1);
   }
}
