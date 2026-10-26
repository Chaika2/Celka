package celestial;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ow_1 {
   private static final Logger class_ = LogManager.getLogger();
   private final Map<rqO_2, OT> break_ = Maps.newHashMap();
   private final Set<OT> byte_ = Sets.newLinkedHashSet();
   private final Set<OT> protected_ = Sets.newLinkedHashSet();
   private OI throws_;

   public Collection<OT> byte_() {
      return this.break_.values();
   }

   public void class_(OI var1) {
      this.throws_ = var1;
      if (var1 != null) {
         for (OT var3 : this.byte_) {
            var1.class_(var3);
         }

         for (OT var5 : this.protected_) {
            var1.byte_(var5);
         }
      }
   }

   public OT class_(rqO_2 var1) {
      return this.break_.get(var1);
   }

   private void class_(OT var1) {
      for (OT var3 : var1.throws_()) {
         this.class_(var3);
      }

      class_.info("Forgot about advancement {}", var1.private_());
      this.break_.remove(var1.private_());
      if (var1.break_() == null) {
         this.byte_.remove(var1);
         if (this.throws_ != null) {
            this.throws_.break_(var1);
         }
      } else {
         this.protected_.remove(var1);
         if (this.throws_ != null) {
            this.throws_.protected_(var1);
         }
      }
   }

   public void class_(Map<rqO_2, Ot_1> var1) {
      Function var2 = Functions.forMap(this.break_, (OT)null);

      while (!var1.isEmpty()) {
         boolean var3 = false;
         Iterator var4 = var1.entrySet().iterator();

         while (var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            rqO_2 var6 = (rqO_2)var5.getKey();
            Ot_1 var7 = (Ot_1)var5.getValue();
            if (var7.class_(var2)) {
               OT var8 = var7.break_(var6);
               this.break_.put(var6, var8);
               var3 = true;
               var4.remove();
               if (var8.break_() == null) {
                  this.byte_.add(var8);
                  if (this.throws_ != null) {
                     this.throws_.class_(var8);
                  }
               } else {
                  this.protected_.add(var8);
                  if (this.throws_ != null) {
                     this.throws_.byte_(var8);
                  }
               }
            }
         }

         if (!var3) {
            for (Entry var10 : var1.entrySet()) {
               class_.error("Couldn't load advancement {}: {}", var10.getKey(), var10.getValue());
            }
            break;
         }
      }

      class_.info("Loaded {} advancements", this.break_.size());
   }

   public void class_() {
      this.break_.clear();
      this.byte_.clear();
      this.protected_.clear();
      if (this.throws_ != null) {
         this.throws_.class_();
      }
   }

   public void class_(Set<rqO_2> var1) {
      for (rqO_2 var3 : var1) {
         OT var4 = this.break_.get(var3);
         if (var4 == null) {
            class_.warn("Told to remove advancement {} but I don't know what that is", var3);
         } else {
            this.class_(var4);
         }
      }
   }

   public Iterable<OT> break_() {
      return this.byte_;
   }
}
