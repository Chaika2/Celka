package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class rva_3 implements ruS_2<At_1> {
   private rvi_3 class_;
   private List<rqO_2> break_;
   private List<rqO_2> byte_;
   private rka_3 protected_;

   public List<rqO_2> byte_() {
      return this.byte_;
   }

   public rva_3(rvi_3 var1, Collection<rqO_2> var2, Collection<rqO_2> var3, rka_3 var4) {
      this.class_ = var1;
      this.break_ = ImmutableList.copyOf(var2);
      this.byte_ = ImmutableList.copyOf(var3);
      this.protected_ = var4;
   }

   public rva_3() {
   }

   @Override
   public String toString() {
      return "SRecipeBookPacket(state="
         + this.throws_()
         + ", recipes="
         + this.break_()
         + ", displayedRecipes="
         + this.byte_()
         + ", field_244301_d="
         + this.protected_
         + ")";
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.class_(rvi_3.class);
      this.protected_ = rka_3.class_(var1);
      int var2 = var1.case_();
      this.break_ = Lists.newArrayList();

      for (int var3 = 0; var3 < var2; var3++) {
         this.break_.add(var1.volatile_());
      }

      if (this.class_ == rvi_3.INIT) {
         var2 = var1.case_();
         this.byte_ = Lists.newArrayList();

         for (int var5 = 0; var5 < var2; var5++) {
            this.byte_.add(var1.volatile_());
         }
      }
   }

   public List<rqO_2> break_() {
      return this.break_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      this.protected_.break_(var1);
      var1.protected_(this.break_.size());

      for (rqO_2 var3 : this.break_) {
         var1.class_(var3);
      }

      if (this.class_ == rvi_3.INIT) {
         var1.protected_(this.byte_.size());

         for (rqO_2 var5 : this.byte_) {
            var1.class_(var5);
         }
      }
   }

   public rvi_3 throws_() {
      return this.class_;
   }

   public rka_3 protected_() {
      return this.protected_;
   }
}
