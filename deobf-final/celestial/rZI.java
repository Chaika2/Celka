package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class rZI implements ruS_2<At_1> {
   private boolean class_;
   private Map<rqO_2, Ot_1> break_;
   private Set<rqO_2> byte_;
   private Map<rqO_2, Oj_1> protected_;

   public Set<rqO_2> byte_() {
      return this.byte_;
   }

   public rZI() {
   }

   public rZI(boolean var1, Collection<OT> var2, Set<rqO_2> var3, Map<rqO_2, Oj_1> var4) {
      this.class_ = var1;
      this.break_ = Maps.newHashMap();

      for (OT var6 : var2) {
         this.break_.put(var6.private_(), var6.class_());
      }

      this.byte_ = var3;
      this.protected_ = Maps.newHashMap(var4);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readBoolean();
      this.break_ = Maps.newHashMap();
      this.byte_ = Sets.newLinkedHashSet();
      this.protected_ = Maps.newHashMap();
      int var2 = var1.case_();

      for (int var3 = 0; var3 < var2; var3++) {
         rqO_2 var4 = var1.volatile_();
         Ot_1 var5 = Ot_1.break_(var1);
         this.break_.put(var4, var5);
      }

      var2 = var1.case_();

      for (int var8 = 0; var8 < var2; var8++) {
         rqO_2 var10 = var1.volatile_();
         this.byte_.add(var10);
      }

      var2 = var1.case_();

      for (int var9 = 0; var9 < var2; var9++) {
         rqO_2 var11 = var1.volatile_();
         this.protected_.put(var11, Oj_1.break_(var1));
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   public Map<rqO_2, Ot_1> break_() {
      return this.break_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeBoolean(this.class_);
      var1.protected_(this.break_.size());

      for (Entry var3 : this.break_.entrySet()) {
         rqO_2 var4 = (rqO_2)var3.getKey();
         Ot_1 var5 = (Ot_1)var3.getValue();
         var1.class_(var4);
         var5.class_(var1);
      }

      var1.protected_(this.byte_.size());

      for (rqO_2 var8 : this.byte_) {
         var1.class_(var8);
      }

      var1.protected_(this.protected_.size());

      for (Entry var9 : this.protected_.entrySet()) {
         var1.class_((rqO_2)var9.getKey());
         ((Oj_1)var9.getValue()).class_(var1);
      }
   }

   public boolean throws_() {
      return this.class_;
   }

   public Map<rqO_2, Oj_1> protected_() {
      return this.protected_;
   }
}
