package celestial;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Ak_1 {
   @SerializedName("serverName")
   public String class_;
   @SerializedName("serverIP")
   public String break_;
   @SerializedName("populationInfo")
   public rgP_2 byte_;
   @SerializedName("serverMOTD")
   public rgP_2 protected_;
   @SerializedName("pingToServer")
   public long throws_;
   @SerializedName("version")
   public int case_ = rqu_3.class_().getProtocolVersion();
   @SerializedName("gameVersion")
   public rgP_2 catch_ = new rgN_2(rqu_3.class_().getName());
   @SerializedName("pinged")
   public boolean private_;
   @SerializedName("playerList")
   public List<rgP_2> implements_ = Collections.emptyList();
   @SerializedName("resourceMode")
   private Az_1 extends_ = Az_1.PROMPT;
   @SerializedName("categoryType")
   public AW finally_;
   @SerializedName("serverIcon")
   private String native_;
   @SerializedName("lanServer")
   private boolean volatile_;

   public String byte_() {
      return this.native_;
   }

   public Ak_1(String var1, String var2, boolean var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.volatile_ = var3;
      this.finally_ = AW.DEFAULT;
   }

   public Ak_1(String var1, String var2, boolean var3, AW var4) {
      this(var1, var2, var3);
      this.finally_ = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof Ak_1 var2 ? Objects.equals(this.break_, var2.break_) : false;
      }
   }

   @Override
   public String toString() {
      return "ServerData{serverName='"
         + this.class_
         + "', serverIP='"
         + this.break_
         + "', populationInfo="
         + this.byte_
         + ", serverMOTD="
         + this.protected_
         + ", pingToServer="
         + this.throws_
         + ", version="
         + this.case_
         + ", gameVersion="
         + this.catch_
         + ", pinged="
         + this.private_
         + ", playerList="
         + this.implements_
         + ", resourceMode="
         + this.extends_
         + ", categoryType="
         + this.finally_
         + ", serverIcon='"
         + this.native_
         + "', lanServer="
         + this.volatile_
         + "}";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.break_);
   }

   public void class_(Ak_1 var1) {
      this.break_ = var1.break_;
      this.class_ = var1.class_;
      this.finally_ = var1.finally_;
      this.class_(var1.break_());
      this.native_ = var1.native_;
      this.volatile_ = var1.volatile_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.catch_ = var1.catch_;
      this.case_ = var1.case_;
      this.throws_ = var1.throws_;
      this.implements_ = var1.implements_;
      this.finally_ = var1.finally_;
      this.extends_ = var1.extends_;
   }

   public rcd_3 class_() {
      rcd_3 var1 = new rcd_3();
      var1.class_("name", this.class_);
      var1.class_("ip", this.break_);
      if (this.native_ != null) {
         var1.class_("icon", this.native_);
      }

      if (this.extends_ == Az_1.ENABLED) {
         var1.class_("acceptTextures", true);
      } else if (this.extends_ == Az_1.DISABLED) {
         var1.class_("acceptTextures", false);
      }

      return var1;
   }

   public void class_(String var1) {
      this.native_ = var1;
   }

   public static Ak_1 class_(rcd_3 var0) {
      Ak_1 var1 = new Ak_1(var0.native_("name"), var0.native_("ip"), false);
      if (var0.byte_("icon", 8)) {
         var1.class_(var0.native_("icon"));
      }

      if (var0.byte_("acceptTextures", 1)) {
         if (var0.new_("acceptTextures")) {
            var1.class_(Az_1.ENABLED);
         } else {
            var1.class_(Az_1.DISABLED);
         }
      } else {
         var1.class_(Az_1.PROMPT);
      }

      return var1;
   }

   public void class_(Az_1 var1) {
      this.extends_ = var1;
   }

   public Az_1 break_() {
      return this.extends_;
   }

   public AW throws_() {
      return this.finally_;
   }

   public boolean protected_() {
      return this.volatile_;
   }
}
