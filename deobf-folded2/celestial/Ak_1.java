package celestial;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Ak_1 {
   @SerializedName("serverName")
   public String id_class;
   @SerializedName("serverIP")
   public String id_break;
   @SerializedName("populationInfo")
   public rgP_2 id_byte;
   @SerializedName("serverMOTD")
   public rgP_2 id_protected;
   @SerializedName("pingToServer")
   public long id_throws;
   @SerializedName("version")
   public int id_case = rqu_3.id_class().getProtocolVersion();
   @SerializedName("gameVersion")
   public rgP_2 id_catch = new rgN_2(rqu_3.id_class().getName());
   @SerializedName("pinged")
   public boolean id_private;
   @SerializedName("playerList")
   public List<rgP_2> id_implements = Collections.emptyList();
   @SerializedName("resourceMode")
   private Az_1 id_extends = Az_1.PROMPT;
   @SerializedName("categoryType")
   public AW id_finally;
   @SerializedName("serverIcon")
   private String id_native;
   @SerializedName("lanServer")
   private boolean id_volatile;

   public String id_byte() {
      return this.id_native;
   }

   public Ak_1(String var1, String var2, boolean var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_volatile = var3;
      this.id_finally = AW.DEFAULT;
   }

   public Ak_1(String var1, String var2, boolean var3, AW var4) {
      this(var1, var2, var3);
      this.id_finally = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof Ak_1 var2 ? Objects.equals(this.id_break, var2.id_break) : false;
      }
   }

   @Override
   public String toString() {
      return "ServerData{serverName='"
         + this.id_class
         + "', serverIP='"
         + this.id_break
         + "', populationInfo="
         + this.id_byte
         + ", serverMOTD="
         + this.id_protected
         + ", pingToServer="
         + this.id_throws
         + ", version="
         + this.id_case
         + ", gameVersion="
         + this.id_catch
         + ", pinged="
         + this.id_private
         + ", playerList="
         + this.id_implements
         + ", resourceMode="
         + this.id_extends
         + ", categoryType="
         + this.id_finally
         + ", serverIcon='"
         + this.id_native
         + "', lanServer="
         + this.id_volatile
         + "}";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id_break);
   }

   public void id_class(Ak_1 var1) {
      this.id_break = var1.id_break;
      this.id_class = var1.id_class;
      this.id_finally = var1.id_finally;
      this.id_class(var1.id_break());
      this.id_native = var1.id_native;
      this.id_volatile = var1.id_volatile;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_catch = var1.id_catch;
      this.id_case = var1.id_case;
      this.id_throws = var1.id_throws;
      this.id_implements = var1.id_implements;
      this.id_finally = var1.id_finally;
      this.id_extends = var1.id_extends;
   }

   public rcd_3 id_class() {
      rcd_3 var1 = new rcd_3();
      var1.id_class("name", this.id_class);
      var1.id_class("ip", this.id_break);
      if (this.id_native != null) {
         var1.id_class("icon", this.id_native);
      }

      if (this.id_extends == Az_1.ENABLED) {
         var1.id_class("acceptTextures", true);
      } else if (this.id_extends == Az_1.DISABLED) {
         var1.id_class("acceptTextures", false);
      }

      return var1;
   }

   public void id_class(String var1) {
      this.id_native = var1;
   }

   public static Ak_1 id_class(rcd_3 var0) {
      Ak_1 var1 = new Ak_1(var0.id_native("name"), var0.id_native("ip"), false);
      if (var0.id_byte("icon", 8)) {
         var1.id_class(var0.id_native("icon"));
      }

      if (var0.id_byte("acceptTextures", 1)) {
         if (var0.id_new("acceptTextures")) {
            var1.id_class(Az_1.ENABLED);
         } else {
            var1.id_class(Az_1.DISABLED);
         }
      } else {
         var1.id_class(Az_1.PROMPT);
      }

      return var1;
   }

   public void id_class(Az_1 var1) {
      this.id_extends = var1;
   }

   public Az_1 id_break() {
      return this.id_extends;
   }

   public AW id_throws() {
      return this.id_finally;
   }

   public boolean id_protected() {
      return this.id_volatile;
   }
}
