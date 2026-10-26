package celestial;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;

public class rFc_1 implements ruS_2<At_1> {
   private String class_ = "";
   private rgP_2 break_;
   private rgP_2 byte_;
   private rgP_2 protected_;
   private String throws_;
   private String case_;
   private rgF_2 catch_;
   private final Collection<String> private_;
   private int implements_;
   private int finally_;

   public rgP_2 byte_() {
      return this.break_;
   }

   public rFc_1() {
      this.break_ = rgN_2.byte_;
      this.byte_ = rgN_2.byte_;
      this.protected_ = rgN_2.byte_;
      this.throws_ = rnX_2.ALWAYS.internalName;
      this.case_ = rnh_3.ALWAYS.name;
      this.catch_ = rgF_2.RESET;
      this.private_ = Lists.newArrayList();
   }

   public rFc_1(rnB_2 var1, Collection<String> var2, int var3) {
      this.break_ = rgN_2.byte_;
      this.byte_ = rgN_2.byte_;
      this.protected_ = rgN_2.byte_;
      this.throws_ = rnX_2.ALWAYS.internalName;
      this.case_ = rnh_3.ALWAYS.name;
      this.catch_ = rgF_2.RESET;
      this.private_ = Lists.newArrayList();
      if (var3 != 3 && var3 != 4) {
         throw new IllegalArgumentException("Method must be join or leave for player constructor");
      } else if (var2 != null && !var2.isEmpty()) {
         this.implements_ = var3;
         this.class_ = var1.class_();
         this.private_.addAll(var2);
      } else {
         throw new IllegalArgumentException("Players cannot be null/empty");
      }
   }

   public rFc_1(rnB_2 var1, int var2) {
      this.break_ = rgN_2.byte_;
      this.byte_ = rgN_2.byte_;
      this.protected_ = rgN_2.byte_;
      this.throws_ = rnX_2.ALWAYS.internalName;
      this.case_ = rnh_3.ALWAYS.name;
      this.catch_ = rgF_2.RESET;
      this.private_ = Lists.newArrayList();
      this.class_ = var1.class_();
      this.implements_ = var2;
      if (var2 == 0 || var2 == 2) {
         this.break_ = var1.break_();
         this.finally_ = var1.native_();
         this.throws_ = var1.implements_().internalName;
         this.case_ = var1.extends_().name;
         this.catch_ = var1.volatile_();
         this.byte_ = var1.protected_();
         this.protected_ = var1.throws_();
      }

      if (var2 == 0) {
         this.private_.addAll(var1.case_());
      }
   }

   @Override
   public String toString() {
      return "STeamsPacket(name="
         + this.break_()
         + ", displayName="
         + this.byte_()
         + ", prefix="
         + this.finally_()
         + ", suffix="
         + this.extends_()
         + ", nameTagVisibility="
         + this.private_()
         + ", collisionRule="
         + this.implements_()
         + ", color="
         + this.catch_()
         + ", players="
         + this.protected_()
         + ", action="
         + this.throws_()
         + ", friendlyFlags="
         + this.case_()
         + ")";
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.throws_(16);
      this.implements_ = var1.readByte();
      if (this.implements_ == 0 || this.implements_ == 2) {
         this.break_ = var1.throws_();
         this.finally_ = var1.readByte();
         this.throws_ = var1.throws_(40);
         this.case_ = var1.throws_(40);
         this.catch_ = var1.class_(rgF_2.class);
         this.byte_ = var1.throws_();
         this.protected_ = var1.throws_();
      }

      if (this.implements_ == 0 || this.implements_ == 3 || this.implements_ == 4) {
         int var2 = var1.case_();

         for (int var3 = 0; var3 < var2; var3++) {
            this.private_.add(var1.throws_(40));
         }
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.writeByte(this.implements_);
      if (this.implements_ == 0 || this.implements_ == 2) {
         var1.class_(this.break_);
         var1.writeByte(this.finally_);
         var1.class_(this.throws_);
         var1.class_(this.case_);
         var1.class_(this.catch_);
         var1.class_(this.byte_);
         var1.class_(this.protected_);
      }

      if (this.implements_ == 0 || this.implements_ == 3 || this.implements_ == 4) {
         var1.protected_(this.private_.size());

         for (String var3 : this.private_) {
            var1.class_(var3);
         }
      }
   }

   public String break_() {
      return this.class_;
   }

   public int throws_() {
      return this.implements_;
   }

   public rgP_2 finally_() {
      return this.byte_;
   }

   public rgF_2 catch_() {
      return this.catch_;
   }

   public rgP_2 extends_() {
      return this.protected_;
   }

   public int case_() {
      return this.finally_;
   }

   public String implements_() {
      return this.case_;
   }

   public Collection<String> protected_() {
      return this.private_;
   }

   public String private_() {
      return this.throws_;
   }
}
