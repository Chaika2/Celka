package celestial;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;

public class rFc_1 implements ruS_2<At_1> {
   private String id_class = "";
   private rgP_2 id_break;
   private rgP_2 id_byte;
   private rgP_2 id_protected;
   private String id_throws;
   private String id_case;
   private rgF_2 id_catch;
   private final Collection<String> id_private;
   private int id_implements;
   private int id_finally;

   public rgP_2 id_byte() {
      return this.id_break;
   }

   public rFc_1() {
      this.id_break = rgN_2.id_byte;
      this.id_byte = rgN_2.id_byte;
      this.id_protected = rgN_2.id_byte;
      this.id_throws = rnX_2.ALWAYS.internalName;
      this.id_case = rnh_3.ALWAYS.name;
      this.id_catch = rgF_2.RESET;
      this.id_private = Lists.newArrayList();
   }

   public rFc_1(rnB_2 var1, Collection<String> var2, int var3) {
      this.id_break = rgN_2.id_byte;
      this.id_byte = rgN_2.id_byte;
      this.id_protected = rgN_2.id_byte;
      this.id_throws = rnX_2.ALWAYS.internalName;
      this.id_case = rnh_3.ALWAYS.name;
      this.id_catch = rgF_2.RESET;
      this.id_private = Lists.newArrayList();
      if (var3 != 3 && var3 != 4) {
         throw new IllegalArgumentException("Method must be join or leave for player constructor");
      } else if (var2 != null && !var2.isEmpty()) {
         this.id_implements = var3;
         this.id_class = var1.id_class();
         this.id_private.addAll(var2);
      } else {
         throw new IllegalArgumentException("Players cannot be null/empty");
      }
   }

   public rFc_1(rnB_2 var1, int var2) {
      this.id_break = rgN_2.id_byte;
      this.id_byte = rgN_2.id_byte;
      this.id_protected = rgN_2.id_byte;
      this.id_throws = rnX_2.ALWAYS.internalName;
      this.id_case = rnh_3.ALWAYS.name;
      this.id_catch = rgF_2.RESET;
      this.id_private = Lists.newArrayList();
      this.id_class = var1.id_class();
      this.id_implements = var2;
      if (var2 == 0 || var2 == 2) {
         this.id_break = var1.id_break();
         this.id_finally = var1.id_native();
         this.id_throws = var1.id_implements().internalName;
         this.id_case = var1.id_extends().name;
         this.id_catch = var1.id_volatile();
         this.id_byte = var1.id_protected();
         this.id_protected = var1.id_throws();
      }

      if (var2 == 0) {
         this.id_private.addAll(var1.id_case());
      }
   }

   @Override
   public String toString() {
      return "STeamsPacket(name="
         + this.id_break()
         + ", displayName="
         + this.id_byte()
         + ", prefix="
         + this.id_finally()
         + ", suffix="
         + this.id_extends()
         + ", nameTagVisibility="
         + this.id_private()
         + ", collisionRule="
         + this.id_implements()
         + ", color="
         + this.id_catch()
         + ", players="
         + this.id_protected()
         + ", action="
         + this.id_throws()
         + ", friendlyFlags="
         + this.id_case()
         + ")";
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_throws(16);
      this.id_implements = var1.readByte();
      if (this.id_implements == 0 || this.id_implements == 2) {
         this.id_break = var1.id_throws();
         this.id_finally = var1.readByte();
         this.id_throws = var1.id_throws(40);
         this.id_case = var1.id_throws(40);
         this.id_catch = var1.id_class(rgF_2.class);
         this.id_byte = var1.id_throws();
         this.id_protected = var1.id_throws();
      }

      if (this.id_implements == 0 || this.id_implements == 3 || this.id_implements == 4) {
         int var2 = var1.id_case();

         for (int var3 = 0; var3 < var2; var3++) {
            this.id_private.add(var1.id_throws(40));
         }
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.writeByte(this.id_implements);
      if (this.id_implements == 0 || this.id_implements == 2) {
         var1.id_class(this.id_break);
         var1.writeByte(this.id_finally);
         var1.id_class(this.id_throws);
         var1.id_class(this.id_case);
         var1.id_class(this.id_catch);
         var1.id_class(this.id_byte);
         var1.id_class(this.id_protected);
      }

      if (this.id_implements == 0 || this.id_implements == 3 || this.id_implements == 4) {
         var1.id_protected(this.id_private.size());

         for (String var3 : this.id_private) {
            var1.id_class(var3);
         }
      }
   }

   public String id_break() {
      return this.id_class;
   }

   public int id_throws() {
      return this.id_implements;
   }

   public rgP_2 id_finally() {
      return this.id_byte;
   }

   public rgF_2 id_catch() {
      return this.id_catch;
   }

   public rgP_2 id_extends() {
      return this.id_protected;
   }

   public int id_case() {
      return this.id_finally;
   }

   public String id_implements() {
      return this.id_case;
   }

   public Collection<String> id_protected() {
      return this.id_private;
   }

   public String id_private() {
      return this.id_throws;
   }
}
