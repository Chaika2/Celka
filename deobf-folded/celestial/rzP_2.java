package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import java.util.Map;
import java.util.Random;

public class rzP_2 {
   private final rrEm_1 id_class;
   private final Map<rzd_3<?>, Object> id_break = Maps.newIdentityHashMap();
   private final Map<rqO_2, rzs_3> id_byte = Maps.newHashMap();
   private Random id_protected;
   private float id_throws;

   public rzP_2(rrEm_1 var1) {
      this.id_class = var1;
   }

   public <T> T id_class(rzd_3<T> var1) {
      Object var2 = this.id_break.get(var1);
      if (var2 == null) {
         throw new IllegalArgumentException("No parameter " + var1);
      } else {
         return (T)var2;
      }
   }

   public rrEm_1 id_class() {
      return this.id_class;
   }

   public rzP_2 id_class(rqO_2 var1, rzs_3 var2) {
      rzs_3 var3 = this.id_byte.put(var1, var2);
      if (var3 != null) {
         throw new IllegalStateException("Duplicated dynamic drop '" + this.id_byte + "'");
      } else {
         return this;
      }
   }

   public rzr_3 id_class(rzk_3 var1) {
      SetView var2 = Sets.difference(this.id_break.keySet(), var1.id_break());
      if (!var2.isEmpty()) {
         throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + var2);
      } else {
         SetView var3 = Sets.difference(var1.id_class(), this.id_break.keySet());
         if (!var3.isEmpty()) {
            throw new IllegalArgumentException("Missing required parameters: " + var3);
         } else {
            Random var4 = this.id_protected;
            if (var4 == null) {
               var4 = new Random();
            }

            rnW_2 var5 = this.id_class(this.id_class);
            rzC_2 var6 = this.id_class(var5);
            rzZ_2 var7 = this.id_break(var5);
            return new rzr_3(var4, this.id_throws, this.id_class, var6::id_class, var7::id_class, this.id_break, this.id_byte);
         }
      }
   }

   private rnW_2 id_class(rrEm_1 var1) {
      return var1 == null ? null : var1.id_const();
   }

   private rzC_2 id_class(rnW_2 var1) {
      return var1 == null ? re_3.id_byte() : var1.o();
   }

   public rzP_2 id_class(Random var1) {
      this.id_protected = var1;
      return this;
   }

   public rzP_2 id_class(long var1) {
      if (var1 != 0L) {
         this.id_protected = new Random(var1);
      }

      return this;
   }

   public rzP_2 id_class(float var1) {
      this.id_throws = var1;
      return this;
   }

   public <T> rzP_2 id_class(rzd_3<T> var1, T var2) {
      this.id_break.put(var1, var2);
      return this;
   }

   public rzP_2 id_class(long var1, Random var3) {
      if (var1 == 0L) {
         this.id_protected = var3;
      } else {
         this.id_protected = new Random(var1);
      }

      return this;
   }

   private rzZ_2 id_break(rnW_2 var1) {
      return var1 == null ? re_3.id_class() : var1.K();
   }

   public <T> rzP_2 id_break(rzd_3<T> var1, T var2) {
      if (var2 == null) {
         this.id_break.remove(var1);
      } else {
         this.id_break.put(var1, var2);
      }

      return this;
   }

   public <T> T id_break(rzd_3<T> var1) {
      return (T)this.id_break.get(var1);
   }
}
